package mx.com.mtlsa.billing.service.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.mtlsa.billing.dto.request.txt.ComplementoPagoRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtServiceComPago;
import mx.com.mtlsa.billing.utils.txt.GeneraStringComplemento;
import mx.com.mtlsa.billing.utils.txt.GeneraStringFacturas;
import mx.com.mtlsa.billing.utils.txt.GenerarStringAuxComplePago;
import mx.com.mtsla.billing.dao.GetInfoComplePagosTxtDao;


@Stateless
public class GeneraTxtComplementoPagosImpl implements GeneraTxtServiceComPago, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8369544792300547885L;

	@Inject
	GetInfoComplePagosTxtDao getInfoComplePagosTxtDao;

	@Override
	public EspecMsFacturaTxtDTO getComplementoPago(ComplementoPagoRequest request)  {
		EspecMsFacturaTxtDTO especMsFacPagos = new EspecMsFacturaTxtDTO();
		
		  
		  FileWriter flwriter = null;
			try {
				
				StringBuilder getFacturaPagosFinal = new StringBuilder("");
				
				System.out.println("ENTRO  getFacturaPagosTxt ..");
				System.out.println("1-  Llama   ecabezado Pagos (EspecOrdEncaFacElecTxtDTO) ..");
				
				List<EspecOrdEncaFacElecTxtDTO> listaEcabezado = new ArrayList<EspecOrdEncaFacElecTxtDTO>();
				
				listaEcabezado.addAll(getInfoComplePagosTxtDao.getInfoComplementoPagosEncabezado(request));
				
				if(listaEcabezado.size()== 0) {
					return especMsFacPagos;
					
				}
			
				especMsFacPagos.setCabecera(listaEcabezado.get(0));
				getFacturaPagosFinal.append(GeneraStringFacturas.facturaCabecera(listaEcabezado.get(0)).toString());
				
				
				System.out.println("2-  Llama   Detalle (EspecOrdLineDetCfdTxtDTO) ..");
				List<EspecOrdLineDetCfdTxtDTO> especOrdLineDet = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
				especOrdLineDet = getInfoComplePagosTxtDao.getInfoComplementoPagosCompleDetalle(request);
				especMsFacPagos.setComplemento(especOrdLineDet);
				getFacturaPagosFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDet));
				
				
				
				System.out.println("3-  Llama   comercio exterior (ListaAuxComplePagoTxtDTO)  ..");
				List<EstrucSecAuxComplePagoTxtDTO> listaAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
				listaAuxComplePago = getInfoComplePagosTxtDao.getListaAuxPagosComplePago(request);
				especMsFacPagos.setAuxComplePago(listaAuxComplePago);
				getFacturaPagosFinal.append(GenerarStringAuxComplePago.facturaAuxPagosComplePago(listaAuxComplePago));
				
				
			
				
				//crea el flujo para escribir en el archivo
				flwriter = new FileWriter("C:\\Users\\Usuario\\Documents\\Test_TXT\\ComplementoPagos.txt");
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
