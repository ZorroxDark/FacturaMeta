package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaPagosTxtDTO;

public interface GeneraTxtPagos {
	

	EspecMsFacturaPagosTxtDTO  getFacturaPagosTxt(FacElectronicaRequest request);
	
	

}
