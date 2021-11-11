package mx.com.mtlsa.billing.service.impl; 
 
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.Serializable; 
import java.util.ArrayList; 
import java.util.List; 
 
import javax.ejb.Stateless; 
import javax.inject.Inject; 
 
import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest; 
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaPagosTxtDTO; 
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO; 
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO; 
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtPagos;
import mx.com.mtlsa.billing.utils.txt.GeneraStringComplemento; 
import mx.com.mtlsa.billing.utils.txt.GeneraStringFacturas; 
import mx.com.mtlsa.billing.utils.txt.GenerarStringAuxComplePago; 
import mx.com.mtsla.billing.dao.GetInfoPagosTxtDao; 
 
 
 
@Stateless 
public class GeneraTxtPagosImpl implements GeneraTxtPagos , Serializable{ 
	 
	 
	/** 
	 *  
	 */ 
	private static final long serialVersionUID = 8369544792300547885L; 
	 
	 
	@Inject 
	GetInfoPagosTxtDao getInfoPagosTxtDao; 
	 
 
	@Override 
	public EspecMsFacturaPagosTxtDTO getFacturaPagosTxt(FacElectronicaRequest request) { 
	 
	 
		EspecMsFacturaPagosTxtDTO especMsFacPagos = new EspecMsFacturaPagosTxtDTO(); 
		 
		   
		  FileWriter flwriter = null; 
			try { 
				 
				StringBuilder getFacturaPagosFinal = new StringBuilder(""); 
				 
				System.out.println("ENTRO  getFacturaPagosTxt .."); 
				System.out.println("1-  Llama   ecabezado Pagos (EspecOrdEncaFacElecTxtDTO) .."); 
				 
				List<EspecOrdEncaFacElecTxtDTO> listaEcabezado = new ArrayList<EspecOrdEncaFacElecTxtDTO>(); 
				 
				listaEcabezado.addAll(getInfoPagosTxtDao.getInfoFacPagosEncabezado(request)); 
				 
				if(listaEcabezado.size()== 0) { 
					return especMsFacPagos; 
					 
				} 
			 
				especMsFacPagos.setCabecera(listaEcabezado.get(0)); 
				getFacturaPagosFinal.append(GeneraStringFacturas.facturaCabecera(listaEcabezado.get(0)).toString()); 
				 
				 
				System.out.println("2-  Llama   Detalle (EspecOrdLineDetCfdTxtDTO) .."); 
				List<EspecOrdLineDetCfdTxtDTO> especOrdLineDet = new ArrayList<EspecOrdLineDetCfdTxtDTO>(); 
				especOrdLineDet = getInfoPagosTxtDao.getInfoFacPagosCompleDetalle(request); 
				especMsFacPagos.setComplemento(especOrdLineDet); 
				getFacturaPagosFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDet)); 
				 
				 
				 
				System.out.println("3-  Llama   comercio exterior (ListaAuxComplePagoTxtDTO)  .."); 
				List<EstrucSecAuxComplePagoTxtDTO> listaAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>(); 
				listaAuxComplePago = getInfoPagosTxtDao.getListaAuxPagosComplePago(request); 
				especMsFacPagos.setAuxComplePago(listaAuxComplePago); 
				getFacturaPagosFinal.append(GenerarStringAuxComplePago.facturaAuxPagosComplePago(listaAuxComplePago)); 
				 
				 
			 
				 
				//crea el flujo para escribir en el archivo 
				flwriter = new FileWriter("C:\\Users\\miguel.velazquez\\Documents\\ArchivosTxt\\FacturaPagos.txt"); 
				//crea un buffer o flujo intermedio antes de escribir directamente en el archivo 
				BufferedWriter bfwriter = new BufferedWriter(flwriter); 
				 
				 
				bfwriter.write(getFacturaPagosFinal.toString()); 
				 
				 
				//cierra el buffer intermedio 
				bfwriter.close(); 
				System.out.println("Archivo creado satisfactoriamente.."); 
		 
	  
			} catch (Exception e) { 
				System.out.println( "Error Service  "+e); 
				 
			}  
			finally { 
				if (flwriter != null) { 
					try {//cierra el flujo principal 
						flwriter.close(); 
					} catch (IOException e) { 
						e.printStackTrace(); 
					} 
				} 
			} 
			 
			 
			return especMsFacPagos; 
	} 
 
} 
