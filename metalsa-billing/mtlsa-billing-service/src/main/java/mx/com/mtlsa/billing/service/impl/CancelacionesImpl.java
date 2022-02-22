package mx.com.mtlsa.billing.service.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.bind.annotation.XmlElement;

import mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarResult;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfAceptarRechazarResult;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfRequestAceptarRechazarReceptorSUC;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfRespuestaDTOOfContenidoDato;
import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfValidarUUIDSV40;
import mx.com.mtlsa.billing.client.cancelaciones.CancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.CancelacionDTOV40;
import mx.com.mtlsa.billing.client.cancelaciones.RequestAceptarRechazarReceptorSUC;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfContenidoDato;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfContenidoDato;
import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString;
import mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSUCResponse;
import mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSUCV40Response;
import mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSV40;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacion;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacionSoap;
import mx.com.mtlsa.billing.dto.request.txt.AceptarRechazarRecSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.AceptarRechazarRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultarCancelaReceptorSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.ValidarDatosRequest;
import mx.com.mtlsa.billing.dto.request.txt.ValidarUUIDSRequest;
import mx.com.mtlsa.billing.dto.response.txt.AceptarRechazarRecSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.AceptarRechazarResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionInfoAddResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaDatos;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.DatosValidarUUIDSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;
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
					boolean enviado =false;
					
					if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
						enviado = mailer.send(
										"Solicitud de Cancelación Aceptada ",
										planAceptado.plantillaAceptadoMetalsa(listaUidAceptados), 
										test,//va aqui lo de APP sino genera error //correosAP
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
										test,//va aqui lo de APP sino genera error //correosAP
										null,
										null,
										"platilla1-", //se envia plantilla en el metodo otra opcion
										"proveedores@metalsa.com", 
										"proveedores@metalsa.com",
										//"info.proveedores@proeza.com.mx", 
										//"info.proveedores@proeza.com.mx",
										null);
					}
					
					System.out.println("Status envio Aceptada solo correos  APP : "+enviado +"/n "+test.toString()+ " uid "+listaUidAceptados.toString());

				}catch (Exception e) {
					System.out.println("Error :" + e);
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
								boolean enviado =false;
								
								if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
								
									enviado = mailer.send(
												"Solicitud de Cancelación Rechazada "+temp.getUuid(),
												planRechazoOracle.plantillaRechazoOracleMetalsa(temp.getRazonSocial(), temp.getUuid(),correos), 
												test,//correosOracle,
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
											test,//correosOracle,
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
								boolean enviado =false;
								
								if(request.getcRFCEmisor().equals(Constantes.RFC_METALSA)) {
									enviado = mailer.send(
													"Solicitud de Cancelación Rechazada "+temp.getUuid(),
													planRechazoBuzon.plantillaRechazoBuzonMetalsa(temp.getRazonSocial(), temp.getUuid()), 
													test,//correosBuzon,
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
											test,//correosBuzon,
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
							}
						}
						
					}
					
				
				}catch (Exception e) {
					System.out.println("Error :" + e);
				}
				
			}
			

		} catch (Exception e) {
			System.out.println("Error :" + e);
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

}




