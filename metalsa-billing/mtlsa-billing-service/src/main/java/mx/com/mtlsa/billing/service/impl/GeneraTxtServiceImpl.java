package mx.com.mtlsa.billing.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.request.txt.FacturaPagoRequest;
import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.ListaAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtService;
import mx.com.mtlsa.billing.utils.SFTPSend;
import mx.com.mtlsa.billing.utils.Utils;
import mx.com.mtlsa.billing.utils.txt.GeneraStringComplemento;
import mx.com.mtlsa.billing.utils.txt.GeneraStringFacturas;
import mx.com.mtlsa.billing.utils.txt.GenerarStringAuxComplePago;
import mx.com.mtlsa.billing.utils.txt.GenerarStringImpuesto;
import mx.com.mtsla.billing.dao.GetInfoTxtDao;

@Stateless
public class GeneraTxtServiceImpl implements GeneraTxtService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1711012441244749597L;

	@Inject
	GetInfoTxtDao getInfoTxtDao;

	@Override
	public EspecMsFacturaTxtDTO getFacturaTxt(FacturaPagoRequest request) {

		EspecMsFacturaTxtDTO especMsFactura = new EspecMsFacturaTxtDTO();

		FileWriter flwriter = null;
		StringBuilder getFacturaFinal = new StringBuilder("");
		String nomArchivo = Utils.generaIdTxt();

		try {

			if (request.getFactura().size() == 0) {
				return especMsFactura;
			}
			Integer count = 1;
			for (FacturaRequest fac : request.getFactura()) {
				System.out.println("ENTRO  getFacturaTxt ..");
				System.out.println("1-  Llama   ecabezado (EspecOrdEncaFacElecTxtDTO) ..");

				List<EspecOrdEncaFacElecTxtDTO> listaEcabezado = new ArrayList<EspecOrdEncaFacElecTxtDTO>();
				listaEcabezado.addAll(getInfoTxtDao.getInfoFacEncabezado(fac));

				if (listaEcabezado.size() != 0) {
				
					System.out.println("2-  Genera el IDs () ..");
					String nomIdFolio = Utils.generaIdTxt() + count.toString();
					listaEcabezado.get(0).setFolio(nomIdFolio);
	
					especMsFactura.setCabecera(listaEcabezado.get(0));
					getFacturaFinal.append(GeneraStringFacturas.facturaCabecera(listaEcabezado.get(0)).toString());
	
					System.out.println("3-  Llama   Detalle (EspecOrdLineDetCfdTxtDTO) ..");
					List<EspecOrdLineDetCfdTxtDTO> especOrdLineDet = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
					especOrdLineDet = getInfoTxtDao.getInfoFacCompleDetalle(fac);
					especMsFactura.setComplemento(especOrdLineDet);
					getFacturaFinal.append(GeneraStringComplemento.facturaComplementoFacturas(especOrdLineDet));
	
					System.out.println("3-  Llama   impuestos   (EspecOrdLineImpuestoCfdTxtDTO) ..");
					List<EspecOrdLineImpuestoCfdTxtDTO> lineImpuesto = new ArrayList<EspecOrdLineImpuestoCfdTxtDTO>();
					lineImpuesto = getInfoTxtDao.getInfoFacImpuetos(fac);
					especMsFactura.setImpuestos(lineImpuesto);
					getFacturaFinal.append(GenerarStringImpuesto.facturaImpuesto(lineImpuesto));
	
					System.out.println("4-  Llama   comercio exterior (ListaAuxComplePagoTxtDTO)  ..");
					List<EstrucSecAuxComplePagoTxtDTO> listaEstrucSecAux = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
					ListaAuxComplePagoTxtDTO listaAuxComplePago = new ListaAuxComplePagoTxtDTO();
					listaAuxComplePago = getInfoTxtDao.getListaAuxComplePago(fac);
	
					// Agrega a Listas
					if (listaAuxComplePago.getEncabezado() != null) {
						listaEstrucSecAux.add(listaAuxComplePago.getEncabezado());
					}
	
					if (listaAuxComplePago.getDestinatario() != null) {
						listaEstrucSecAux.add(listaAuxComplePago.getDestinatario());
					}
	
					if (listaAuxComplePago.getDomEmisor() != null) {
						listaEstrucSecAux.add(listaAuxComplePago.getDomEmisor());
					}
	
					if (listaAuxComplePago.getDomReceptor() != null) {
						listaEstrucSecAux.add(listaAuxComplePago.getDomReceptor());
					}
	
					if (listaAuxComplePago.getTxtLeyeda() != null) {
						listaEstrucSecAux.add(listaAuxComplePago.getTxtLeyeda());
					}
	
					// valido que tenga datos y agrego TXT y Response
	
					if (listaEstrucSecAux.size() > 0) {
						especMsFactura.setAuxComplePago(listaEstrucSecAux);
						getFacturaFinal.append(GenerarStringAuxComplePago.facturaAuxPagosComplePago(listaEstrucSecAux));
					}
					
				

				}

				count++;
			}

			
			//valido que se haya generado txt
			if(getFacturaFinal.length() !=0 ) { 
				File file = new File(nomArchivo + ".txt");
				flwriter = new FileWriter(file);
				BufferedWriter bfwriter = new BufferedWriter(flwriter);
				bfwriter = new BufferedWriter(flwriter);
				bfwriter.write(getFacturaFinal.toString());
	
				bfwriter.close();
	
				FileInputStream test = new FileInputStream(file);
				SFTPSend.SFTPSendTXT_2(nomArchivo + ".txt", test);
				System.out.println("Se ha enviado satisfactoriamente..");
			
			}else {
				  System.out.println("La consulta no trajo resultados no genera txt..");
			}

		} catch (Exception e) {
			System.out.println("Error Service  " + e);

		} finally {
			if (flwriter != null) {
				try {// cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return especMsFactura;

	}

}
