package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.ComplementoPagoRequest;
import mx.com.mtlsa.billing.dto.request.txt.NominaPagoRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsNominaTxtDTO;

public interface GeneraTxtServiceComPago {
	
	EspecMsFacturaTxtDTO getComplementoPago(ComplementoPagoRequest request);
	
	
	EspecMsNominaTxtDTO getNominaPago(NominaPagoRequest request);
	
	
	
	
}
