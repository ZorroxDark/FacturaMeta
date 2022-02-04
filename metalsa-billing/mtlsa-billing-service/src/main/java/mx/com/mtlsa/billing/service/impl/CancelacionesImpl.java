package mx.com.mtlsa.billing.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.CancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacion;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacionSoap;
import mx.com.mtlsa.billing.dto.request.txt.ConsultarCancelaReceptorSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionInfoAddResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaDatos;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;
import mx.com.mtlsa.billing.service.CancelacionesService;
import mx.com.mtlsa.billing.utils.Constantes;
import mx.com.mtlsa.billing.utils.Mailer;
import mx.com.mtlsa.billing.utils.plantillas.CancelaAceptado;
import mx.com.mtlsa.billing.utils.plantillas.CancelaRechazoBuzon;
import mx.com.mtlsa.billing.utils.plantillas.CancelaRechazoOracle;
import mx.com.mtsla.billing.dao.GetCancelacionesDao;


@Stateless
public class CancelacionesImpl implements CancelacionesService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -675875790345886884L;
	
	@Inject
	GetCancelacionesDao getCancelacionesDao;

	@Override
	public GuardarCertificadoSucResponse getGuardarCertificadoSUC(GuardarCertificadoSucRequest request) {

		GuardarCertificadoSucResponse responseGuardaCer = new GuardarCertificadoSucResponse();

		try {

			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			RespuestaDTOOfString respuesta = new RespuestaDTOOfString();	
			
			respuesta = wSCFDBuilderPlusSoap.guardarCertificadoSUC(
					request.getcUsuario(),request.getcPasswordUsuario(),request.getcRFCEmisor(),
					request.getcCertificado(),request.getcLLave(),request.getcPasswordCertificado());
			/*respuesta =wSCFDBuilderPlusSoap.guardarCertificadoSUC("SUCMET0621", "SUCMET0621*21","MET920131CN5", 
					encodeFileToBase64BinaryCER(), encodeFileToBase64BinaryKEY(), "met.9201");*/
		
			System.out.println("--> "+respuesta.getMensaje());
			System.out.println("--> "+respuesta.getDatos());
			System.out.println("--> "+respuesta.toString());
			
			responseGuardaCer.setDatos(respuesta.getDatos());
			responseGuardaCer.setEstado(respuesta.isEstado());
			responseGuardaCer.setMensaje(respuesta.getMensaje());
			
			
			
		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
		return responseGuardaCer;

	}

	@Override
	public GenerarTokenSUCResponse getGenerarTokenSUC(GenerarTokenSucRequest request) {

		GenerarTokenSUCResponse responseToken = new GenerarTokenSUCResponse();

		try {
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			
			RespuestaDTOOfString respuesta = new RespuestaDTOOfString();	
			
			respuesta = wSCFDBuilderPlusSoap.generarTokenSUC(
					request.getcUsuario(), request.getcPasswordUsuario(), request.getcRFCEmisor() ,request.getcAlias());
			
			
			responseToken.setDatos(respuesta.getDatos());
			responseToken.setEstado(respuesta.isEstado());
			responseToken.setMensaje(respuesta.getMensaje());
			
			

		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
		return responseToken;

	}

	@Override
	public ConsultarCancelaReceptorSucResponse getConsultarCancelacionesReceptorSUC(
			ConsultarCancelaReceptorSucRequest request) {
		
		
		ConsultarCancelaReceptorSucResponse responseCancelaRec = new ConsultarCancelaReceptorSucResponse();

		try {
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			RespuestaDTOOfListOfCancelacionDTO respuestaListCancelaDTO= new RespuestaDTOOfListOfCancelacionDTO();
			
			respuestaListCancelaDTO = wSCFDBuilderPlusSoap.consultarCancelacionesReceptorSUC(request.getcToken());
			
			ConsultarCancelaDatos consultarSinRelacion = new ConsultarCancelaDatos();
			ConsultarCancelaDatos consultarRelacionBase = new ConsultarCancelaDatos();
			List<CancelacionResponse> listCancelacionDTO = new ArrayList<CancelacionResponse>();
			List<CancelacionResponse> listRechazadosEnBaseDTO = new ArrayList<CancelacionResponse>();
			
			
			
			if(respuestaListCancelaDTO != null ) {
				
				responseCancelaRec.setEstado(respuestaListCancelaDTO.isEstado());
				
				ArrayOfCancelacionDTO listaArrayOfCancelacion = new ArrayOfCancelacionDTO();
				listaArrayOfCancelacion = respuestaListCancelaDTO.getDatos();
				
				
				if(listaArrayOfCancelacion.getCancelacionDTO()!= null ||
						!listaArrayOfCancelacion.getCancelacionDTO().isEmpty()) {
					
					
					//Se realiza consulta trae las que vienen en las tablas
					ArrayOfCancelacionDTO validaFacturasCancela = getCancelacionesDao.getListaFacturasCancelar(listaArrayOfCancelacion);
					
					//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
					//-Si se encuentra en alguna de las tablas se rechaza cancelación.
					
					
					for(CancelacionDTO tempCanela:validaFacturasCancela.getCancelacionDTO()) {
						CancelacionResponse rechazosEnBase = new CancelacionResponse();
						rechazosEnBase.setCfdiUuid(tempCanela.getCFDIUUID());	
						listRechazadosEnBaseDTO.add(rechazosEnBase);// trae las que vienen en las tablas
					}
					
					consultarRelacionBase.setCancelacionDTO(listRechazadosEnBaseDTO);// trae las que vienen en las tablas
					
					
					for(CancelacionDTO tempGeneral:listaArrayOfCancelacion.getCancelacionDTO()) {
						CancelacionResponse rechazoSinRelacionBD = new CancelacionResponse();
						boolean existe = false;
						
						for(CancelacionResponse tempCanela:listRechazadosEnBaseDTO) {
							if(tempCanela.getCfdiUuid().equals(tempGeneral.getCFDIUUID())) {
								existe = true;
								break;
							}
						}
						
						if(!existe) {
							rechazoSinRelacionBD.setCfdiUuid(tempGeneral.getCFDIUUID());	
							listCancelacionDTO.add(rechazoSinRelacionBD);
						}
						
					}
					
					consultarSinRelacion.setCancelacionDTO(listCancelacionDTO);//RECHAZADAS
					
				}
				
				responseCancelaRec.setListAceptaCancelacion(consultarSinRelacion);//ACEPTA CANCELACION
				responseCancelaRec.setListRechazoCancelacion(consultarRelacionBase);// trae las que vienen en las tablas Rechzo cancelacion
				//Tine relacion en BD -- Rechazo Aceptado
			}
			
			
			
			//Obtengo Correos de AP
			ArrayList<String> correosAP = new ArrayList<String>();
			String[] listCorreoApp= Constantes.CORREO_AP.split(",");
			for(String temp:listCorreoApp) {
				correosAP.add(temp.trim());
			}
			
			ArrayList<String> test = new ArrayList<String>();
			//test.add("miguel.velazquez@contractor.metalsa.com");
			test.add("roberto.castillo.conde@metalsa.com");
			
			// Manda Correos a Cancelacion se va a (AP)
			// Obtengo los correos 
			// Solo se consulta query
			
			
			
			CancelaAceptado planAceptado = new CancelaAceptado();
			
			try {
				//Envia Correo() Solicitud de Cancelación ACEPTADA, Solicitud de Cancelación RECHAZADA // CORRECION
				// solo se manda  a APP debido aque no se tiene correo comprador y vendedor
				
				//1 Obtiene en una lista los uid
				
				List<String> listaUidAceptados = new ArrayList<String>();
				for(CancelacionResponse v: responseCancelaRec.getListAceptaCancelacion().getCancelacionDTO()) {
					listaUidAceptados.add(v.getCfdiUuid());
				}
				
				
				Mailer mailer = new Mailer("MX");
				
				boolean valor =
						mailer.send(
								"Solicitud de Cancelación Aceptada ",
								planAceptado.plantillaAceptado(listaUidAceptados), 
								test,//va aqui lo de APP sino genera error //correosAP
								null,
								null,
								"platilla1-", //se envia plantilla en el metodo otra opcion
								"proveedores@metalsa.com", 
								"proveedores@metalsa.com",
								null);
				
				System.out.println("Status envio Aceptada solo correos  APP : "+valor +"/n "+test.toString()+ " uid "+listaUidAceptados.toString());

			
				
			}catch (Exception e) {
				System.out.println("Error :" + e);
			}
			
			
			
			// Manda Correos a Cancelacion RECHAZADOS se va a (AP)
			List<CancelacionInfoAddResponse> listRechazados = new ArrayList<CancelacionInfoAddResponse>();
			List<CancelacionInfoAddResponse> listCancelaInfo = new ArrayList<CancelacionInfoAddResponse>();
			listRechazados  = getCancelacionesDao.getListaCorreoProvedor(responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO());
			listCancelaInfo = getCancelacionesDao.getListaCorreoComprador(responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO());
			CancelaRechazoBuzon planRechazoBuzon = new CancelaRechazoBuzon();
			CancelaRechazoOracle planRechazoOracle = new CancelaRechazoOracle();
		
			try {
			
				for(CancelacionInfoAddResponse temp :listRechazados) {
					
					//ORACLE
					if(temp.getStatus().trim().equals("5")||
					    temp.getStatus().trim().equals("6")	) {
						//Envia Correo ()
						// Se busca el email comprador y poveder y app se envian
						
						
						
						try {
							
							ArrayList<String> correosOracle = new ArrayList<String>();
							correosOracle.add("roberto.castillo.conde@metalsa.com");
							
							//1 Obtengo Correo Provedor 
							
							for(String e:temp.getEmailProveedor()) {
								correosOracle.add(e);
							}
							
							//2 Obtengo Correo Comprador 
							
							for(CancelacionInfoAddResponse tCompra:listCancelaInfo) {
								if(tCompra.getUuid().equals(temp.getUuid())) {
									for(String eC:temp.getEmailComprador()) {
										correosOracle.add(eC);
									}
									break;
								}
							}
							
							//3 Imprimo en string la lista de corroes se envia como parametro
							
							String correos ="";
							
							for(String v:correosOracle) {
								correos += correos + " "+ v;
							}
							
							
							Mailer mailer = new Mailer("MX");
							boolean valor =
									mailer.send(
											"Solicitud de Cancelación Rechazada "+temp.getUuid(),
											planRechazoOracle.plantillaRechazoOracle(temp.getRazonSocial(), temp.getUuid(),correos), 
											test,//correosOracle,
											null, 
											null,
											"comservesp-", //se envia plantilla en el metodo otra opcion
											"proveedores@metalsa.com", 
											"proveedores@metalsa.com",
											//correosAP);
											null);
							
							System.out.println("Status envio oracle: "+valor +"/n "+temp.getEmailProveedor().toString());
						
							
						}catch (Exception e) {
							System.out.println("Error :" + e);
						}
					
						
						
						
						
					// BUZON
					}else if( temp.getStatus().trim().equals("0")||
							  temp.getStatus().trim().equals("1") ||
							  temp.getStatus().trim().equals("4") ||
							  temp.getStatus().trim().equals("3")) {
						//Envia Correo ()
						
						
						ArrayList<String> correosBuzon = new ArrayList<String>();
						correosBuzon.add("roberto.castillo.conde@metalsa.com");
						
						for(String e:temp.getEmailProveedor()) {
							correosBuzon.add(e);
						}
						
						
						try {
							Mailer mailer = new Mailer("MX");
							boolean valor =
									mailer.send(
											"Solicitud de Cancelación Rechazada "+temp.getUuid(),
											planRechazoBuzon.plantillaRechazoBuzon(temp.getRazonSocial(), temp.getUuid()), 
											test,//correosBuzon,
											null, 
											null,
											"comservesp-", //se envia plantilla en el metodo otra opcion
											"proveedores@metalsa.com", 
											"proveedores@metalsa.com",
											//correosAP);
											null);
							
							System.out.println("Status envio BUZON: "+valor +"/n "+temp.getEmailProveedor().toString());
						
						}catch (Exception e) {
							System.out.println("Error :" + e);
						}
					
						
						
						
					}
					
				}
				
				
				
			
			}catch (Exception e) {
				System.out.println("Error :" + e);
			}
			
			
			
			
			

		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
		return responseCancelaRec;

	}

}




