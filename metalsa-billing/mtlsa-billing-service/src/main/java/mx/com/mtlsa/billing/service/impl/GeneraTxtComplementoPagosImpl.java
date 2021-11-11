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

import mx.com.mtlsa.billing.dto.request.txt.ComplementoPagoRequest;
import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.request.txt.NominaPagoRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsNominaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtServiceComPago;
import mx.com.mtlsa.billing.utils.SFTPSend;
import mx.com.mtlsa.billing.utils.Utils;
import mx.com.mtlsa.billing.utils.txt.GeneraStringComplemento;
import mx.com.mtlsa.billing.utils.txt.GeneraStringFacturas;
import mx.com.mtlsa.billing.utils.txt.GenerarStringAuxComplePago;
import mx.com.mtsla.billing.dao.GetInfoComplePagosTxtDao;
import mx.com.mtsla.billing.dao.GetInfoNominaPagosTxtDao;


@Stateless
public class GeneraTxtComplementoPagosImpl implements GeneraTxtServiceComPago, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8369544792300547885L;

	@Inject
	GetInfoComplePagosTxtDao getInfoComplePagosTxtDao;

	@Inject
	GetInfoNominaPagosTxtDao getInfoNominaPagosTxtDao;
	
	
	@Override
	public EspecMsFacturaTxtDTO getComplementoPago(ComplementoPagoRequest request)  {
		EspecMsFacturaTxtDTO especMsFacPagos = new EspecMsFacturaTxtDTO();
		
		  
		  FileWriter flwriter = null;
		  StringBuilder getFacturaPagosFinal = new StringBuilder("");
		  String nomArchivo = Utils.generaIdTxt(); 
		 
		  
			try {
				
			
				
				
				if(request.getFactura().size()==0) {
					return especMsFacPagos;
				}
				
			
				Integer count =1;
				
				for(FacturaRequest fac : request.getFactura()) {
					
					
					System.out.println("ENTRO  getFacturaPagosTxt ..");
					System.out.println("1-  Llama ecabezado Pagos (EspecOrdEncaFacElecTxtDTO) ..");
					
					List<EspecOrdEncaFacElecTxtDTO> listaEcabezado = new ArrayList<EspecOrdEncaFacElecTxtDTO>();
					listaEcabezado.addAll(getInfoComplePagosTxtDao.getInfoComplementoPagosEncabezado(fac));
					
					if(listaEcabezado.size()== 0) {
						return especMsFacPagos;
					}
					
					
					System.out.println("2-  Genera el IDs () ..");
					String nomIdFolio= Utils.generaIdTxt()+count.toString();
					listaEcabezado.get(0).setFolio(nomIdFolio);
					
				
					especMsFacPagos.setCabecera(listaEcabezado.get(0));
					getFacturaPagosFinal.append(GeneraStringFacturas.facturaCabecera(listaEcabezado.get(0)).toString());
					
					
					System.out.println("3-  Llama   Detalle (EspecOrdLineDetCfdTxtDTO) ..");
					List<EspecOrdLineDetCfdTxtDTO> especOrdLineDet = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
					especOrdLineDet = getInfoComplePagosTxtDao.getInfoComplementoPagosCompleDetalle(fac);
					especMsFacPagos.setComplemento(especOrdLineDet);
					getFacturaPagosFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDet));
					
					
					System.out.println("4-  Llama   comercio exterior (ListaAuxComplePagoTxtDTO)  ..");
					List<EstrucSecAuxComplePagoTxtDTO> listaAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
					listaAuxComplePago = getInfoComplePagosTxtDao.getListaAuxPagosComplePago(fac);
					especMsFacPagos.setAuxComplePago(listaAuxComplePago);
					getFacturaPagosFinal.append(GenerarStringAuxComplePago.facturaAuxPagosComplePago(listaAuxComplePago));
					
					count++;
					
				
				}
				
			
				
				
				 File file = new File(nomArchivo+".txt");
				  flwriter = new FileWriter(file);
				  BufferedWriter bfwriter = new BufferedWriter(flwriter);
				  bfwriter = new BufferedWriter(flwriter);
				  bfwriter.write(getFacturaPagosFinal.toString());
				  
				  bfwriter.close();
				  
				  FileInputStream test = new FileInputStream(file);
				
				
				  System.out.println("Archivo creado satisfactoriamente..");
				
				
				
				// Se envia archivo al SFTP
				
				SFTPSend.SFTPSendTXT_2(nomArchivo+".txt",test);
				
				System.out.println("Se ha enviado satisfactoriamente..");
				
		
	 
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

	@Override
	public EspecMsNominaTxtDTO getNominaPago(NominaPagoRequest request) {
		EspecMsNominaTxtDTO especMsFacNomPagos = new EspecMsNominaTxtDTO();
		
		  
		  FileWriter flwriter = null;
		  StringBuilder getFacturaPagosFinal = new StringBuilder("");
		  String nomArchivo = Utils.generaIdTxt(); 
		 
		  
			try {
				
			
				
				
				if(request.getFactura().size()==0) {
					return especMsFacNomPagos;
				}
				
			
				Integer count =1;
				
				for(FacturaRequest fac : request.getFactura()) {
					
					
					System.out.println("ENTRO  getNominaFacturaPagosTxt ..");
					System.out.println("1-  Llama ecabezado Pagos (EspecOrdEncaFacElecTxtDTO) ..");
					
					List<EspecOrdEncaFacElecTxtDTO> listaEcabezado = new ArrayList<EspecOrdEncaFacElecTxtDTO>();
					listaEcabezado.addAll(getInfoNominaPagosTxtDao.getInfoNominaPagosEncabezado(fac));
					
					if(listaEcabezado.size()== 0) {
						return especMsFacNomPagos;
					}
					
					
					System.out.println("2-  Genera el IDs () ..");
					String nomIdFolio= Utils.generaIdTxt()+count.toString();
					listaEcabezado.get(0).setFolio(nomIdFolio);
					
				
					especMsFacNomPagos.setCabecera(listaEcabezado.get(0));
					getFacturaPagosFinal.append(GeneraStringFacturas.facturaCabecera(listaEcabezado.get(0)).toString());
					
					
					System.out.println("3-  Llama   Detalle (EspecOrdLineDetCfdTxtDTO) ..");
					List<EspecOrdLineDetCfdTxtDTO> especOrdLineDet = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
					especOrdLineDet = getInfoNominaPagosTxtDao.getInfoNominaPagosCompleDetalle(fac);
					especMsFacNomPagos.setComplemento(especOrdLineDet);
					getFacturaPagosFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDet));
					
					
					System.out.println("4-  Llama   comercio exterior (ListaAuxComplePagoTxtDTO)  ..");
					List<EstrucSecAuxComplePagoTxtDTO> listaAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
					listaAuxComplePago = getInfoNominaPagosTxtDao.getListaAuxPagosNominaPago(fac);
					especMsFacNomPagos.setAuxComplePago(listaAuxComplePago);
					getFacturaPagosFinal.append(GenerarStringAuxComplePago.facturaAuxPagosComplePago(listaAuxComplePago));
					
					count++;
					
				
				}
				
			
				
				
				 File file = new File(nomArchivo+".txt");
				  flwriter = new FileWriter(file);
				  BufferedWriter bfwriter = new BufferedWriter(flwriter);
				  bfwriter = new BufferedWriter(flwriter);
				  bfwriter.write(getFacturaPagosFinal.toString());
				  
				  bfwriter.close();
				  
				  FileInputStream test = new FileInputStream(file);
				
				
				  System.out.println("Archivo creado satisfactoriamente..");
				
				
				
				
				SFTPSend.SFTPSendTXTNomina(nomArchivo+".txt",test);
				SFTPSend.SFTPSendTXTNomina2(nomArchivo+".txt",test);
				
				System.out.println("Se ha enviado satisfactoriamente..");
				
		
	 
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
			
			
			return especMsFacNomPagos;
	}

}
