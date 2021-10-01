package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.ReceiveCFDRequest;
import mx.com.mtlsa.billing.dto.ReceiveCFDResponse;

public interface WSCFDIBuilderPlusService {
	
	ReceiveCFDResponse getReceiveCFD(ReceiveCFDRequest request);
	
	

}
