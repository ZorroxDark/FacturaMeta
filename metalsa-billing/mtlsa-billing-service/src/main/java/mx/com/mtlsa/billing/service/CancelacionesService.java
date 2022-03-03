package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.AceptarRechazarRecSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConRelacionadoRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultaCancelacionRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultarCancelaReceptorSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.SolicitudCancelacionRequest;
import mx.com.mtlsa.billing.dto.request.txt.ValidarUUIDSRequest;
import mx.com.mtlsa.billing.dto.response.txt.AceptarRechazarRecSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConRelacionadoResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultaCancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.SolicitarCancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ValidarUUID40Response;

public interface CancelacionesService {
	
	GuardarCertificadoSucResponse getGuardarCertificadoSUC (GuardarCertificadoSucRequest  request);
	
	GenerarTokenSUCResponse getGenerarTokenSUC(GenerarTokenSucRequest request);
	
	ConsultarCancelaReceptorSucResponse getConsultarCancelacionesReceptorSUC(ConsultarCancelaReceptorSucRequest request);
	
	AceptarRechazarRecSucResponse getAceptarRechazarRecSuc(AceptarRechazarRecSucRequest request);
	
	
	ValidarUUID40Response getValidarUUIDSUC(ValidarUUIDSRequest request);
	
	
	ConRelacionadoResponse getConsultaRelacionado(ConRelacionadoRequest request);
	
	
	SolicitarCancelacionResponse getSolicitaCancelacionV40(SolicitudCancelacionRequest request);
	
	
	ConsultaCancelacionResponse getConsultarCancelacionesAcuse(ConsultaCancelacionRequest request);

}
