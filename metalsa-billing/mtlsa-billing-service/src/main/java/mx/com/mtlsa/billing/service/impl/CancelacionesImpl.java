package mx.com.mtlsa.billing.service.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarResult;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfAceptarRechazarResult;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfRequestAceptarRechazarReceptorSUC;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfSolicitudCancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfString;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfValidarUUIDSV40;
import mx.com.mtlsa.billing.client.cancelaciones.CancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.CancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.Relacionados;
import mx.com.mtlsa.billing.client.cancelaciones.RequestAceptarRechazarReceptorSUC;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfCancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfContenidoDato;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRelacionados;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfContenidoDato;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString;
import mx.com.mtlsa.billing.client.cancelaciones.SolicitudCancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSUCV40Response;
import mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSV40;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacion;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacionSoap;
import mx.com.mtlsa.billing.dto.request.txt.AceptarRechazarRecSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.AceptarRechazarRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConRelacionadoRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultaCancelacion;
import mx.com.mtlsa.billing.dto.request.txt.ConsultaCancelacionRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultarCancelaReceptorSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.SolicitudCancelacion;
import mx.com.mtlsa.billing.dto.request.txt.SolicitudCancelacionRequest;
import mx.com.mtlsa.billing.dto.request.txt.ValidarDatosRequest;
import mx.com.mtlsa.billing.dto.request.txt.ValidarUUIDSRequest;
import mx.com.mtlsa.billing.dto.response.txt.AceptarRechazarRecSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.AceptarRechazarResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionInfoAddResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionV40;
import mx.com.mtlsa.billing.dto.response.txt.ConRelacionado;
import mx.com.mtlsa.billing.dto.response.txt.ConRelacionadoDatos;
import mx.com.mtlsa.billing.dto.response.txt.ConRelacionadoResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultaCancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaDatos;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.DatosValidarUUIDSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.RespuestaCancelacionV40;
import mx.com.mtlsa.billing.dto.response.txt.SolicitarCancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ValidarUUID40Response;
import mx.com.mtlsa.billing.dto.response.txt.ValidarUUIDSUCResultResponse;
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
		StringBuilder error = new StringBuilder();
		responseCancelaRec.setCodigo("0");
		responseCancelaRec.setCodigo("Exitoso");

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
					ArrayOfCancelacionDTO validaFacturasCancela = new ArrayOfCancelacionDTO();
					
					if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
						 validaFacturasCancela = getCancelacionesDao.getListFacCancelarMetalsa(listaArrayOfCancelacion);
					}else if(request.getcRFCEmisor().equals(Constantes.RFC_PROEZA)) {
						 validaFacturasCancela = getCancelacionesDao.getListFacCancelarProeza(listaArrayOfCancelacion);
						
					}
					//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
					//-Si se encuentra en alguna de las tablas se rechaza cancelación.
					
					
					for(CancelacionDTO tempCanela:validaFacturasCancela.getCancelacionDTO()) {
						CancelacionResponse rechazosEnBase = new CancelacionResponse();
						rechazosEnBase.setCfdiUuid(tempCanela.getCFDIUUID());	
						//rechazosEnBase.setAutorizoCliente(tempCanela.isAutorizoCliente());
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
							rechazoSinRelacionBD.setAutorizoCliente(true);//No tienen realcion en BD se pone como true en autoriza cliente
							listCancelacionDTO.add(rechazoSinRelacionBD);
						}
						
					}
					
					consultarSinRelacion.setCancelacionDTO(listCancelacionDTO);//RECHAZADAS
					
				}
				
				responseCancelaRec.setListAceptaCancelacion(consultarSinRelacion);//ACEPTA CANCELACION
				responseCancelaRec.setListRechazoCancelacion(consultarRelacionBase);// trae las que vienen en las tablas Rechzo cancelacion
				//Tine relacion en BD -- Rechazo Aceptado
				
				
				//Obtengo Correos de AP
				ArrayList<String> correosAP = new ArrayList<String>();
				
				if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
					String[] listCorreoApp = Constantes.CORREO_AP_METALSA.split(",");
					for(String temp:listCorreoApp) {
						correosAP.add(temp.trim());
					}
				}else if(request.getcRFCEmisor().equals(Constantes.RFC_PROEZA)) {
					String[] listCorreoApp = Constantes.CORREO_AP_PROEZA.split(",");
					for(String temp:listCorreoApp) {
						correosAP.add(temp.trim());
					}
				}
				 
				ArrayList<String> test = new ArrayList<String>();
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
					boolean enviado =false;
					
					if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
						enviado = mailer.send(
										"Solicitud de Cancelación Aceptada ",
										planAceptado.plantillaAceptadoMetalsa(listaUidAceptados), 
										test,//correosAP,//test,//va aqui lo de APP sino genera error //correosAP
										null,
										null,
										"platilla1-", //se envia plantilla en el metodo otra opcion
										"proveedores@metalsa.com", 
										"proveedores@metalsa.com",
										null);
						
					}else if(request.getcRFCEmisor().equals(Constantes.RFC_PROEZA)) {
						enviado= mailer.send(
										"Solicitud de Cancelación Aceptada ",
										planAceptado.plantillaAceptadoProeza(listaUidAceptados), 
										test,//correosAP,//va aqui lo de APP sino genera error //correosAP
										null,
										null,
										"platilla1-", //se envia plantilla en el metodo otra opcion
										"proveedores@metalsa.com", 
										"proveedores@metalsa.com",
										//"info.proveedores@proeza.com.mx", 
										//"info.proveedores@proeza.com.mx",
										null);
					}
					
					System.out.println("Status envio Aceptada solo correos  APP : "+enviado +"/n "+correosAP.toString()+ " uid "+listaUidAceptados.toString());

				}catch (Exception e) {
					System.out.println("Error :" + e);
					
					error.append("ERROR -- Solicitud de Cancelación ACEPTADA Message : ");
					error.append(e.getMessage());
					error.append("\n");
					error.append("ERROR -- Solicitud de Cancelación ACEPTADA Cause : ");
					error.append(e.getCause());
					error.append("\n");
					error.append("ERROR -- Solicitud de Cancelación ACEPTADA ERROR :");
					error.append(e);
					
					responseCancelaRec.setCodigo("-1");
					responseCancelaRec.setCodigo("ERROR --> "+error.toString());
				}
				
				
				
				// Manda Correos a Cancelacion RECHAZADOS se va a (AP)
				List<CancelacionInfoAddResponse> listRechazados = new ArrayList<CancelacionInfoAddResponse>();
				List<CancelacionInfoAddResponse> listCancelaInfo = new ArrayList<CancelacionInfoAddResponse>();
				
				if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
					if(!responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO().isEmpty()) {
						listRechazados  = getCancelacionesDao.getListCorreoProvedorMetalsa(responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO());
					}else if(!responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO().isEmpty()) {
						listRechazados  = getCancelacionesDao.getListCorreoCompradorMetalsa(responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO());
					}
				}else if(request.getcRFCEmisor().equals(Constantes.RFC_PROEZA)) {
					if(!responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO().isEmpty()) {
						listRechazados  = getCancelacionesDao.getListCorreoProvedorProeza(responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO());
					}else if(!responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO().isEmpty()) {	
						listRechazados  = getCancelacionesDao.getListCorreoCompradorProeza(responseCancelaRec.getListRechazoCancelacion().getCancelacionDTO());
					}
				}
				
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
								//correosOracle.add("roberto.castillo.conde@metalsa.com");
								
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
								boolean enviado =false;
								
								if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
								
									enviado = mailer.send(
												"Solicitud de Cancelación Rechazada "+temp.getUuid(),
												planRechazoOracle.plantillaRechazoOracleMetalsa(temp.getRazonSocial(), temp.getUuid(),correos), 
												test,//test,//correosOracle,
												null, 
												null,
												"comservesp-", //se envia plantilla en el metodo otra opcion
												"proveedores@metalsa.com", 
												"proveedores@metalsa.com",
												//correosAP);
												null);
								 
								}else if(request.getcRFCEmisor().equals(Constantes.RFC_PROEZA)) {
								 
									enviado = mailer.send(
											"Solicitud de Cancelación Rechazada "+temp.getUuid(),
											planRechazoOracle.plantillaRechazoOracleProeza(temp.getRazonSocial(), temp.getUuid(),correos), 
											test,//test,//correosOracle,
											null, 
											null,
											"comservesp-", //se envia plantilla en el metodo otra opcion
											"proveedores@metalsa.com", 
											"proveedores@metalsa.com",
											//"info.proveedores@proeza.com.mx", 
											//"info.proveedores@proeza.com.mx",
											//correosAP);
											null);
									
								}
								
								System.out.println("Status envio oracle: "+enviado +"/n "+temp.getEmailProveedor().toString());
							
								
							}catch (Exception e) {
								error.append("ERROR -- Solicitud de Cancelación ACEPTADA Envio Message : ");
								error.append(e.getMessage());
								error.append("\n");
								error.append("ERROR -- Solicitud de Cancelación ACEPTADA Envio Cause : ");
								error.append(e.getCause());
								error.append("\n");
								error.append("ERROR -- Solicitud de Cancelación ACEPTADA Envio ERROR :");
								error.append(e);
								
								responseCancelaRec.setCodigo("-2");
								responseCancelaRec.setCodigo("ERROR --> "+error.toString());
							}
						
							
							
							
							
						// BUZON
						}else if( temp.getStatus().trim().equals("0")||
								  temp.getStatus().trim().equals("1") ||
								  temp.getStatus().trim().equals("4") ||
								  temp.getStatus().trim().equals("3")) {
							//Envia Correo ()
							
														
							ArrayList<String> correosBuzon = new ArrayList<String>();
							//correosBuzon.add("roberto.castillo.conde@metalsa.com");
							
							for(String e:temp.getEmailProveedor()) {
								correosBuzon.add(e);
							}
							
							
							try {
								Mailer mailer = new Mailer("MX");
								boolean enviado =false;
								
								if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
									enviado = mailer.send(
													"Solicitud de Cancelación Rechazada "+temp.getUuid(),
													planRechazoBuzon.plantillaRechazoBuzonMetalsa(temp.getRazonSocial(), temp.getUuid()), 
													test,//correosBuzon,//test,//correosBuzon,
													null, 
													null,
													"comservesp-", //se envia plantilla en el metodo otra opcion
													"proveedores@metalsa.com", 
													"proveedores@metalsa.com",
													//correosAP);
													null);
									
								}else if(request.getcRFCEmisor().equals(Constantes.RFC_PROEZA)) {
									enviado = mailer.send(
											"Solicitud de Cancelación Rechazada "+temp.getUuid(),
											planRechazoBuzon.plantillaRechazoBuzonProeza(temp.getRazonSocial(), temp.getUuid()), 
											test,//correosBuzon,//test,//correosBuzon,
											null, 
											null,
											"comservesp-", //se envia plantilla en el metodo otra opcion
											"proveedores@metalsa.com", 
											"proveedores@metalsa.com",
											//"info.proveedores@proeza.com.mx", 
											//"info.proveedores@proeza.com.mx",
											//correosAP);
											null);
									
								}
								
								
								System.out.println("Status envio BUZON: "+enviado +"/n "+temp.getEmailProveedor().toString());
							
							}catch (Exception e) {
								System.out.println("Error :" + e);
								error.append("ERROR -- Solicitud de Cancelación OralceBuzon Message : ");
								error.append(e.getMessage());
								error.append("\n");
								error.append("ERROR -- Solicitud de Cancelación OralceBuzon Cause : ");
								error.append(e.getCause());
								error.append("\n");
								error.append("ERROR -- Solicitud de Cancelación OralceBuzon ERROR :");
								error.append(e);
								responseCancelaRec.setCodigo("-2");
								responseCancelaRec.setCodigo("ERROR --> "+error.toString());
							}
						}
						
					}
					
				
				}catch (Exception e) {
					System.out.println("Error :" + e);
					error.append("ERROR -- Solicitud de Cancelación OralceBuzon Message : ");
					error.append(e.getMessage());
					error.append("\n");
					error.append("ERROR -- Solicitud de Cancelación OralceBuzon Cause : ");
					error.append(e.getCause());
					error.append("\n");
					error.append("ERROR -- Solicitud de Cancelación OralceBuzon ERROR :");
					error.append(e);
					responseCancelaRec.setCodigo("-3");
					responseCancelaRec.setCodigo("ERROR --> "+error.toString());
				}
				
			}
			

		} catch (Exception e) {
			System.out.println("Error :" + e);
			error.append("ERROR -- getConsultarCancelacionesReceptorSUC  Message : ");
			error.append(e.getMessage());
			error.append("\n");
			error.append("ERROR -- getConsultarCancelacionesReceptorSUC Cause : ");
			error.append(e.getCause());
			error.append("\n");
			error.append("ERROR -- getConsultarCancelacionesReceptorSUC ERROR :");
			error.append(e);
			responseCancelaRec.setCodigo("-1");
			responseCancelaRec.setCodigo("ERROR --> "+error.toString());
		}
		return responseCancelaRec;

	}
	
	
	
	public AceptarRechazarRecSucResponse getAceptarRechazarRecSuc(AceptarRechazarRecSucRequest request) {
		
		AceptarRechazarRecSucResponse respuesta = new AceptarRechazarRecSucResponse();
		
		
		try {
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			
			ArrayOfAceptarRechazarResult arrayOfAceptarRechazarResult = new ArrayOfAceptarRechazarResult();
			ArrayOfRequestAceptarRechazarReceptorSUC arrayOfRequestAceptarRechazarReceptorSUC = new ArrayOfRequestAceptarRechazarReceptorSUC();
			
			for(AceptarRechazarRequest tempReq:request.getListUuids()) {
				RequestAceptarRechazarReceptorSUC requestAcepRecObj= new RequestAceptarRechazarReceptorSUC();
				requestAcepRecObj.setAutorizoCliente(tempReq.getbAutorizoCliente());
				requestAcepRecObj.setCFDIUUID(tempReq.getcCfdiUuid());
				
				arrayOfRequestAceptarRechazarReceptorSUC.getRequestAceptarRechazarReceptorSUC().add(requestAcepRecObj);
				
			}
				
			arrayOfAceptarRechazarResult = wSCFDBuilderPlusSoap.aceptarRechazarReceptorSUC(arrayOfRequestAceptarRechazarReceptorSUC, request.getcToken());
			
				
			List<AceptarRechazarResponse> listaAceRecFinal= new ArrayList<AceptarRechazarResponse>();
				
			for(AceptarRechazarResult tempAcepta: arrayOfAceptarRechazarResult.getAceptarRechazarResult()) {
					
				AceptarRechazarResponse acepRechaObj = new AceptarRechazarResponse();
				acepRechaObj.setbEstado(tempAcepta.isEstado());
				acepRechaObj.setcCfdiUuid(tempAcepta.getCFDIUUID());
				acepRechaObj.setcMensaje(tempAcepta.getMensaje());
					
				listaAceRecFinal.add(acepRechaObj);
					
			}
				
			respuesta.getListUuids().addAll(listaAceRecFinal);
				
			
			
			
			
		}catch (Exception e) {
			System.out.println("Error"+ e);
		}
		
		
		return respuesta;
		
	}
	
	
	
	public ValidarUUID40Response getValidarUUIDSUC(ValidarUUIDSRequest request){
		
		ValidarUUID40Response respuestaService = new ValidarUUID40Response();
		
		try {
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			ValidarUUIDSUCV40Response respuesta = new ValidarUUIDSUCV40Response();	
			List<ValidarUUIDSV40> validarUUIDSV40 = new ArrayList<ValidarUUIDSV40>();
			
			//llena lista para enviar peticion
			for(ValidarDatosRequest temp:request.getListUUID()) {
		
				ValidarUUIDSV40 validarV40 = new ValidarUUIDSV40();
				validarV40.setCFDIUUID(temp.getCfdiUuid());
				validarV40.setMontoTotal(temp.getMontoTotal());
				validarV40.setRFCEmisor(temp.getRfcEmisor());
				validarV40.setRFCReceptor(temp.getRfcReceptor());
				validarV40.setTipoDoc(temp.getTipoDoc());
				validarUUIDSV40.add(validarV40);
				
			}
			
			
			
			ArrayOfValidarUUIDSV40 arrayOfCancelacionDTOV40 = new ArrayOfValidarUUIDSV40();
			arrayOfCancelacionDTOV40.getValidarUUIDSV40().addAll(validarUUIDSV40);
			
			//Envia peticion
			RespuestaDTOOfListOfRespuestaDTOOfContenidoDato res = new  RespuestaDTOOfListOfRespuestaDTOOfContenidoDato();
			res=wSCFDBuilderPlusSoap.validarUUIDSUCV40(arrayOfCancelacionDTOV40,request.getcToken());
			respuesta.setValidarUUIDSUCV40Result(res);
			
			//Setea resultados
			List<DatosValidarUUIDSUCResponse> listDatos = new ArrayList<DatosValidarUUIDSUCResponse>();
			
			respuestaService.setMensaje(respuesta.getValidarUUIDSUCV40Result().getMensaje()!=null ?respuesta.getValidarUUIDSUCV40Result().getMensaje():"");
			respuestaService.setEstado(respuesta.getValidarUUIDSUCV40Result().isEstado());	
			
			for(RespuestaDTOOfContenidoDato contenido: respuesta.getValidarUUIDSUCV40Result().getDatos().getRespuestaDTOOfContenidoDato()) {
				
				ValidarUUIDSUCResultResponse validar = new ValidarUUIDSUCResultResponse();
				DatosValidarUUIDSUCResponse datos = new DatosValidarUUIDSUCResponse();
				
				validar.setEstado(contenido.isEstado());
				validar.setMensaje(contenido.getMensaje());
				
				datos.setCfdiuuid(contenido.getDatos().getCFDIUUID());
				datos.setEsCancelable(contenido.getDatos().getEsCancelable());
				datos.setEstado(contenido.getDatos().getEstado());
				datos.setEstatusCancelacion(contenido.getDatos().getEstatusCancelacion());
				datos.setValidacionEFOS(contenido.getDatos().getValidacionEFOS());
				listDatos.add(datos);
				
				validar.setDatos(listDatos);
				
				respuestaService.setValidarUUIDSUCV(validar);
			}
				
		
			
		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
		return respuestaService;
	}
	
	
	public ConRelacionadoResponse getConsultaRelacionado(ConRelacionadoRequest request) {
		
		ConRelacionadoResponse respuestaService = new ConRelacionadoResponse();
		
		try {
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			
			//Envia peticion
			RespuestaDTOOfListOfRelacionados res = new RespuestaDTOOfListOfRelacionados();
			res=wSCFDBuilderPlusSoap.consultarRelacionadosSUC(request.getcCfdiUuid(), request.getcToken());
			
			//Setea resultados
			respuestaService.setEstado(res.isEstado());
			respuestaService.setMensaje(res.getMensaje());
			
			List<ConRelacionado> relacionados = new ArrayList<ConRelacionado>();
			
			
			if(!res.getDatos().getRelacionados().isEmpty()){
				
				
				for(Relacionados temp: res.getDatos().getRelacionados()) {
					ConRelacionado conRela = new ConRelacionado();
					
					conRela.setCfdiuuid(temp.getCFDIUUID());
					conRela.setEstado(temp.isEstado());
					conRela.setMensaje(temp.getMensaje());
					conRela.setRfcEmisor(temp.getRFCEmisor());
					conRela.setRfcReceptor(temp.getRFCReceptor());
					conRela.setTipoRelacion(temp.getTipoRelacion());
					conRela.setUuidRelacionado(temp.getUUIDRelacionado());
					
					relacionados.add(conRela);
					
				}
			}
			
			ConRelacionadoDatos datos = new ConRelacionadoDatos();
			datos.setRelacionados(relacionados);
			
			respuestaService.setDatos(datos);
		
			
		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
		return respuestaService;
	}
	
	
	public SolicitarCancelacionResponse getSolicitaCancelacionV40(SolicitudCancelacionRequest request) {
		
		SolicitarCancelacionResponse respuestaService = new SolicitarCancelacionResponse();

		try {
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			ArrayOfSolicitudCancelacionDTOV40 listSolCancelacionV40 = new ArrayOfSolicitudCancelacionDTOV40();
			RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 resCancelacion40 = new RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40();
			
			
			//1 Crea request llena informacion 
			
			for(SolicitudCancelacion temp : request.getSolicitudCancelacion()) {
				
				SolicitudCancelacionDTOV40 solCan40 = new SolicitudCancelacionDTOV40();
				
				solCan40.setCFDIUUID(temp.getCfdiuuid());
				solCan40.setFolioSustitucion(temp.getFolioSustitucion());
				solCan40.setMontoTotal(temp.getMontoTotal());
				solCan40.setMotivo(temp.getMotivo());
				solCan40.setRFCEmisor(temp.getRfcEmisor());
				solCan40.setRFCReceptor(temp.getRfcReceptor());
				solCan40.setTipoDoc(temp.getTipoDoc());
				
				listSolCancelacionV40.getSolicitudCancelacionDTOV40().add(solCan40);
				
			}
			
			resCancelacion40 = wSCFDBuilderPlusSoap.solicitarCancelacionSUCV40(listSolCancelacionV40, request.getcToken());
			
			
			//2 Setea la respuesta  
			
			//parte 1 Seteo
			respuestaService.setEstado(resCancelacion40.isEstado());
			respuestaService.setMensaje(resCancelacion40.getMensaje()!= null ? resCancelacion40.getMensaje() :"");
			
			//parte 2 Seteo
			
			if(resCancelacion40.getDatos().getRespuestaDTOOfCancelacionDTOV40() != null 
					|| !resCancelacion40.getDatos().getRespuestaDTOOfCancelacionDTOV40().isEmpty() ) { 
			
				for(RespuestaDTOOfCancelacionDTOV40 tempRes: resCancelacion40.getDatos().getRespuestaDTOOfCancelacionDTOV40()) {
					
					RespuestaCancelacionV40 respuestaCancelacionV40 = new RespuestaCancelacionV40();
					respuestaCancelacionV40.setEstado(tempRes.isEstado());
					respuestaCancelacionV40.setMensaje(tempRes.getMensaje());
					
					
					CancelacionV40 cancelaV40 = new CancelacionV40();
					
					cancelaV40.setAutorizoCliente(tempRes.getDatos().isAutorizoCliente());
					cancelaV40.setCfdiuuid(tempRes.getDatos().getCFDIUUID()!=null ? tempRes.getDatos().getCFDIUUID():"");
					cancelaV40.setCorreo(tempRes.getDatos().getCorreo()!=null ? tempRes.getDatos().getCorreo() :"");
					cancelaV40.setEfos(tempRes.getDatos().getEFOS()!=null ? tempRes.getDatos().getEFOS():"");
					cancelaV40.setEstadoCancelacion(tempRes.getDatos().getEstadoCancelacion() !=null ? tempRes.getDatos().getEstadoCancelacion():"");
					cancelaV40.setEstadoDocumento(tempRes.getDatos().getEstadoDocumento() !=null ? tempRes.getDatos().getEstadoDocumento() :"" );
					cancelaV40.setFechaEstatus(tempRes.getDatos().getFechaEstatus() != null ? tempRes.getDatos().getFechaEstatus().toString() :"");
					cancelaV40.setFechaSolicitud(tempRes.getDatos().getFechaSolicitud() != null ? tempRes.getDatos().getFechaSolicitud().toString():"");
					cancelaV40.setFolioSustitucion(tempRes.getDatos().getFolioSustitucion() != null ?  tempRes.getDatos().getFolioSustitucion() :"");
					cancelaV40.setMontoTotal(tempRes.getDatos().getMontoTotal() != null ? tempRes.getDatos().getMontoTotal(): new BigDecimal(0.0));
					cancelaV40.setMotivo(tempRes.getDatos().getMotivo() != null ? tempRes.getDatos().getMotivo():"");
					cancelaV40.setObservaciones(tempRes.getDatos().getObservaciones()  != null ? tempRes.getDatos().getObservaciones():"");
					cancelaV40.setRfcEmisor(tempRes.getDatos().getRFCEmisor() !=null ? tempRes.getDatos().getRFCEmisor() : "");
					cancelaV40.setRfcReceptor(tempRes.getDatos().getRFCReceptor() !=null ? tempRes.getDatos().getRFCReceptor() :"");
					cancelaV40.setTipoDoc(tempRes.getDatos().getTipoDoc() != null ? tempRes.getDatos().getTipoDoc():"");
					cancelaV40.setXmlAcuseB64(tempRes.getDatos().getXMLAcuseB64() != null ? tempRes.getDatos().getXMLAcuseB64():"");
					
					
					respuestaCancelacionV40.setDatos(cancelaV40);
					respuestaService.getDatos().add(respuestaCancelacionV40);
					
				}
			}
			
			
		}catch (Exception e) {
			
			System.out.println("Error :" + e);
		}
		return respuestaService;
	}
	
	
	
	public ConsultaCancelacionResponse getConsultarCancelacionesAcuse(ConsultaCancelacionRequest request) {
		
		ConsultaCancelacionResponse  respuestaService = new ConsultaCancelacionResponse();

		try {
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();
			RespuestaDTOOfListOfCancelacionDTOV40 resCancelacion40 = new RespuestaDTOOfListOfCancelacionDTOV40();
			ArrayOfString lista = new ArrayOfString();
			
			//1 Crea request llena informacion 
			
			//for(request.getoListUUID())
			for(ConsultaCancelacion valor:request.getoListUUID()) {
				lista.getString().add(valor.getUid());
			}
			
			
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date dateInicio = format.parse(request.getdFechaInicio());
			Date dateFin = format.parse(request.getdFechaFin());

			GregorianCalendar calInicio = new GregorianCalendar();
			calInicio.setTime(dateInicio);
			
			GregorianCalendar calFin = new GregorianCalendar();
			calFin.setTime(dateFin);

			XMLGregorianCalendar xmlGregCalInicio =  DatatypeFactory.newInstance().newXMLGregorianCalendar(calInicio);
			XMLGregorianCalendar xmlGregCalFin    =  DatatypeFactory.newInstance().newXMLGregorianCalendar(calFin);

						
			resCancelacion40 = wSCFDBuilderPlusSoap.consultaCancelacionSUCV40(lista, xmlGregCalInicio, 
					xmlGregCalFin, request.getcToken());
			
			
			//2 Setea la respuesta  
			
			respuestaService.setEstado(resCancelacion40.isEstado());
			respuestaService.setMensaje(resCancelacion40.getMensaje() != null ? resCancelacion40.getMensaje() :"");
			
			
			
			
			if(resCancelacion40.getDatos() != null 
					|| !resCancelacion40.getDatos().getCancelacionDTOV40().isEmpty() ) { 
			
				for(CancelacionDTOV40 tempRes: resCancelacion40.getDatos().getCancelacionDTOV40()) {
					
					
					CancelacionV40 cancelaV40 = new CancelacionV40();
					
					cancelaV40.setAutorizoCliente(tempRes.isAutorizoCliente());
					cancelaV40.setCfdiuuid(tempRes.getCFDIUUID()!=null ? tempRes.getCFDIUUID():"");
					cancelaV40.setCorreo(tempRes.getCorreo()!=null ? tempRes.getCorreo() :"");
					cancelaV40.setEfos(tempRes.getEFOS()!=null ? tempRes.getEFOS():"");
					cancelaV40.setEstadoCancelacion(tempRes.getEstadoCancelacion() !=null ? tempRes.getEstadoCancelacion():"");
					cancelaV40.setEstadoDocumento(tempRes.getEstadoDocumento() !=null ? tempRes.getEstadoDocumento() :"" );
					cancelaV40.setFechaEstatus(tempRes.getFechaEstatus() != null ? tempRes.getFechaEstatus().toString() :"");
					cancelaV40.setFechaSolicitud(tempRes.getFechaSolicitud() != null ? tempRes.getFechaSolicitud().toString():"");
					cancelaV40.setFolioSustitucion(tempRes.getFolioSustitucion() != null ?  tempRes.getFolioSustitucion() :"");
					cancelaV40.setMontoTotal(tempRes.getMontoTotal() != null ? tempRes.getMontoTotal(): new BigDecimal(0.0));
					cancelaV40.setMotivo(tempRes.getMotivo() != null ? tempRes.getMotivo():"");
					cancelaV40.setObservaciones(tempRes.getObservaciones()  != null ? tempRes.getObservaciones():"");
					cancelaV40.setRfcEmisor(tempRes.getRFCEmisor() !=null ? tempRes.getRFCEmisor() : "");
					cancelaV40.setRfcReceptor(tempRes.getRFCReceptor() !=null ? tempRes.getRFCReceptor() :"");
					cancelaV40.setTipoDoc(tempRes.getTipoDoc() != null ? tempRes.getTipoDoc():"");
					cancelaV40.setXmlAcuseB64(tempRes.getXMLAcuseB64() != null ? tempRes.getXMLAcuseB64():"");
					
					respuestaService.getDatos().add(cancelaV40);
					
				}
			}
			
			
		}catch (Exception e) {
			
			System.out.println("Error :" + e);
		}
		return respuestaService;
		
		
		
	}
	
	
	

}




