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
import mx.com.mtlsa.billing.dto.response.txt.CancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaDatos;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;
import mx.com.mtlsa.billing.service.CancelacionesService;
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
			
			ConsultarCancelaDatos consultarCancelaDatos = new ConsultarCancelaDatos();
			ConsultarCancelaDatos consultarRechazadosDatos = new ConsultarCancelaDatos();
			List<CancelacionResponse> listCancelacionDTO = new ArrayList<CancelacionResponse>();
			List<CancelacionResponse> listRechazadosDTO = new ArrayList<CancelacionResponse>();
			
			
			
			if(respuestaListCancelaDTO != null ) {
				
				responseCancelaRec.setEstado(respuestaListCancelaDTO.isEstado());
				
				ArrayOfCancelacionDTO listaArrayOfCancelacion = new ArrayOfCancelacionDTO();
				listaArrayOfCancelacion = respuestaListCancelaDTO.getDatos();
				
				
				if(listaArrayOfCancelacion.getCancelacionDTO()!= null ||
						!listaArrayOfCancelacion.getCancelacionDTO().isEmpty()) {
					
					
					//Se realiza consulta
					ArrayOfCancelacionDTO validaFacturasCancela = getCancelacionesDao.getListaFacturasCancelar(listaArrayOfCancelacion);
					
					//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
					//-Si se encuentra en alguna de las tablas se rechaza cancelación.
					
					
					for(CancelacionDTO tempCanela:validaFacturasCancela.getCancelacionDTO()) {
						CancelacionResponse cancelacionDTO = new CancelacionResponse();
						cancelacionDTO.setCfdiUuid(tempCanela.getCFDIUUID());	
						listRechazadosDTO.add(cancelacionDTO);
						
									
					}
					
					for(CancelacionDTO tempGeneral:listaArrayOfCancelacion.getCancelacionDTO()) {
						CancelacionResponse validaRegistro = new CancelacionResponse();
						boolean existe = false;
						
						for(CancelacionDTO tempCanela:validaFacturasCancela.getCancelacionDTO()) {
							
							if(tempCanela.getCFDIUUID().equals(tempGeneral.getCFDIUUID())) {
								existe = true;
								break;
							}
						}
						
						
						if(!existe) {
							validaRegistro.setCfdiUuid(tempGeneral.getCFDIUUID());	
							listCancelacionDTO.add(validaRegistro);
						}
						
											
						
						
						
					}
					
					consultarCancelaDatos.setCancelacionDTO(listCancelacionDTO);
					consultarRechazadosDatos.setCancelacionDTO(listRechazadosDTO);
					
				}
				
				responseCancelaRec.setListaCancelacion(consultarCancelaDatos);
				responseCancelaRec.setListaRechazados(consultarRechazadosDatos);
			}
			
			

		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
		return responseCancelaRec;

	}

}


//if(temp.isAutorizoCliente()!= null){
//	cancelacionDTO.setAutorizoCliente(temp.isAutorizoCliente());
//}
//cancelacionDTO.setCfdiUuid(temp.getCFDIUUID());
//cancelacionDTO.setEstadoCancelacion(temp.getEstadoCancelacion());
//cancelacionDTO.setEstadoDocumento(temp.getEstadoDocumento());
//cancelacionDTO.setFechaEstatus(temp.getFechaEstatus());
//cancelacionDTO.setFechaSolicitud(temp.getFechaSolicitud());

//if(temp.getMontoTotal() != null ){
//	cancelacionDTO.setMontoTotal(temp.getMontoTotal());
//}
//cancelacionDTO.setRfcEmisor(temp.getRFCEmisor());
//cancelacionDTO.setRfcReceptor(temp.getRFCReceptor());
//cancelacionDTO.setCorreo(temp.getCorreo());
//cancelacionDTO.setObservaciones(temp.getObservaciones());
//cancelacionDTO.setXmlAcuseB64(temp.getXMLAcuseB64());
