package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.ConsultarCancelaReceptorSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;

public interface CancelacionesService {
	
	GuardarCertificadoSucResponse getGuardarCertificadoSUC (GuardarCertificadoSucRequest  request);
	
	GenerarTokenSUCResponse getGenerarTokenSUC(GenerarTokenSucRequest request);
	
	ConsultarCancelaReceptorSucResponse getConsultarCancelacionesReceptorSUC(ConsultarCancelaReceptorSucRequest request);

}
