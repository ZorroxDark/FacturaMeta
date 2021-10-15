//package mx.com.mtlsa.billing.service.impl;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//
//import mx.com.mtlsa.billing.dto.request.txt.ComplementoPagoRequest;
//import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.EspecOrdVarLineAduanaCfdTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.ListaAuxComplePagoTxtDTO;
//import mx.com.mtlsa.billing.service.GeneraTxtServiceComPago;
//import mx.com.mtlsa.billing.utils.Constantes;
//import mx.com.mtlsa.billing.utils.txt.GeneraStringComplemento;
//import mx.com.mtlsa.billing.utils.txt.GeneraStringFacturas;
//import mx.com.mtlsa.billing.utils.txt.GenerarStringAuxComplePago;
//import mx.com.mtlsa.billing.utils.txt.GenerarStringImpuesto;
//import mx.com.mtsla.billing.dao.GetInfoComplePagosTxtDao;
//
//public class GeneraTxtServiceComPagoImpl implements GeneraTxtServiceComPago {
//
//	@Override
//	public EspecOrdEncaFacElecTxtDTO getComplementoPago(ComplementoPagoRequest request) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public EspecMsFacturaTxtDTO getComplePagoTxt(ComplementoPagoRequest request) {
//
//		EspecMsFacturaTxtDTO especMsFactura = new EspecMsFacturaTxtDTO();
//		
//		  
//		  FileWriter flwriter = null;
//		  try {
//				
//				StringBuilder getFacturaFinal = new StringBuilder("");
//				
//				System.out.println("ENTRO  getFacturaTxt ..");
//				System.out.println("1-  Llama   ecabezado (EspecOrdEncaFacElecTxtDTO) ..");
//				
//				List<EspecOrdEncaFacElecTxtDTO> listaEcabezado = new ArrayList<EspecOrdEncaFacElecTxtDTO>();
//				listaEcabezado.addAll(GetInfoComplePagosTxtDao.getInfoComplementoPagosEncabezado(request));
//				
//				if(listaEcabezado.size()== 0) {
//					return especMsFactura;
//					
//				}
//			
//				especMsFactura.setCabecera(listaEcabezado.get(0));
//				getFacturaFinal.append(GeneraStringFacturas.facturaCabecera(listaEcabezado.get(0)).toString());
//				
//				
//				System.out.println("2-  Llama   Detalle (EspecOrdLineDetCfdTxtDTO) ..");
//				List<EspecOrdLineDetCfdTxtDTO> especOrdLineDet = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
//				//especOrdLineDet = GetInfoComplePagosTxtDao.getInfoComplementoPagosCompleDetalle(request);
//				especMsFactura.setComplemento(especOrdLineDet);
//				getFacturaFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDet));
//				
//				
//				System.out.println("3-  Llama   impuestos   (EspecOrdLineImpuestoCfdTxtDTO) ..");
//				List<EspecOrdLineImpuestoCfdTxtDTO> lineImpuesto = new ArrayList<EspecOrdLineImpuestoCfdTxtDTO>();
//				//lineImpuesto= GetInfoComplePagosTxtDao.getInfoFacImpuetos(request);
//				especMsFactura.setImpuestos(lineImpuesto);
//				getFacturaFinal.append(GenerarStringImpuesto.facturaImpuesto(lineImpuesto));
//				
//				
//				System.out.println("4-  Llama   comercio exterior (ListaAuxComplePagoTxtDTO)  ..");
//				List<EstrucSecAuxComplePagoTxtDTO>  listaEstrucSecAux = new ArrayList<EstrucSecAuxComplePagoTxtDTO>(); 
//				ListaAuxComplePagoTxtDTO listaAuxComplePago = new ListaAuxComplePagoTxtDTO();
//				//listaAuxComplePago = GetInfoComplePagosTxtDao.getListaAuxComplePago(request);
//				
//				
//				//Agrega a Listas 
//				if(listaAuxComplePago.getEncabezado()!=null) {
//					listaEstrucSecAux.add(listaAuxComplePago.getEncabezado());
//				}
//				
//				if(listaAuxComplePago.getDestinatario()!=null) {
//					listaEstrucSecAux.add(listaAuxComplePago.getDestinatario());
//				}
//				
//				if(listaAuxComplePago.getDomEmisor()!=null) {
//					listaEstrucSecAux.add(listaAuxComplePago.getDomEmisor());
//				}
//				
//				if(listaAuxComplePago.getDomReceptor()!=null) {
//					listaEstrucSecAux.add(listaAuxComplePago.getDomReceptor());
//				}
//				
//				if(listaAuxComplePago.getTxtLeyeda()!=null) {
//					listaEstrucSecAux.add(listaAuxComplePago.getTxtLeyeda());
//				}
//				
//				//valido que tenga datos y agrego TXT y Response
//				
//				
//				if(listaEstrucSecAux.size() > 0){
//					especMsFactura.setAuxComplePago(listaEstrucSecAux);
//					getFacturaFinal.append(GenerarStringAuxComplePago.facturaAuxPagosComplePago(listaEstrucSecAux));
//				}
//				
//				
//				
//				
//			
//				
//				//crea el flujo para escribir en el archivo
//				flwriter = new FileWriter("C:\\Users\\miguel.velazquez\\Documents\\ArchivosTxt\\Factura.txt");
//				//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
//				BufferedWriter bfwriter = new BufferedWriter(flwriter);
//				
//				
//				bfwriter.write(getFacturaFinal.toString());
//				
//				
//				//cierra el buffer intermedio
//				bfwriter.close();
//				System.out.println("Archivo creado satisfactoriamente..");
//				
//	 
//			} catch (Exception e) {
//				System.out.println( "Error Service  "+e);
//				
//			} 
//			finally {
//				if (flwriter != null) {
//					try {//cierra el flujo principal
//						flwriter.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//			
//			return especMsFactura;
//	}
//	
//	
//	
//
//}
