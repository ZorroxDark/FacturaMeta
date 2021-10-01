package mx.com.mtlsa.billing.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;

@WebService
public interface GeneraTxtServiceWS {
	 
	@WebMethod
	public List<EspecOrdEncaFacElecTxtDTO> facturas(FacElectronicaRequest request) throws Exception ;
}