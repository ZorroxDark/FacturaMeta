package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;

public interface GeneraTxtService {
	
	EspecMsFacturaTxtDTO  getFacturaTxt(FacElectronicaRequest request);
	
}
