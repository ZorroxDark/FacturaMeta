package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.ListaAuxComplePagoTxtDTO;



public interface GetInfoTxtDao {
	
	List<EspecOrdEncaFacElecTxtDTO> getInfoFacEncabezado(FacElectronicaRequest request);
	
	List<EspecOrdLineDetCfdTxtDTO> getInfoFacCompleDetalle(FacElectronicaRequest request);
	
	List<EspecOrdLineImpuestoCfdTxtDTO> getInfoFacImpuetos(FacElectronicaRequest request);

	ListaAuxComplePagoTxtDTO getListaAuxComplePago(FacElectronicaRequest request);
	
}
