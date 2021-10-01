package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;

public interface GeneraTxtService {
	
	
	
	EspecOrdEncaFacElecTxtDTO getFactura(FacElectronicaRequest request);
	
	EspecMsFacturaTxtDTO  getFacturaTxt(FacElectronicaRequest request);
	
	
	

}
