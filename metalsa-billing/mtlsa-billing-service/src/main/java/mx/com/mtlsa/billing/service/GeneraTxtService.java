package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.FacturaPagoRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;

public interface GeneraTxtService {
	
	EspecMsFacturaTxtDTO  getFacturaTxt(FacturaPagoRequest request);
	
}
