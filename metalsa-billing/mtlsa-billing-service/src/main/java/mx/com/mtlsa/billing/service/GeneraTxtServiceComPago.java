package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.ComplementoPagoRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;

public interface GeneraTxtServiceComPago {
	
	EspecMsFacturaTxtDTO getComplementoPago(ComplementoPagoRequest request);
	
}
