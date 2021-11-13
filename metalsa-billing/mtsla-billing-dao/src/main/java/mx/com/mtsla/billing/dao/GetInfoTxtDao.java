package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.ListaAuxComplePagoTxtDTO;



public interface GetInfoTxtDao {
	
	List<EspecOrdEncaFacElecTxtDTO> getInfoFacEncabezado(FacturaRequest request);
	
	List<EspecOrdLineDetCfdTxtDTO> getInfoFacCompleDetalle(FacturaRequest request);
	
	List<EspecOrdLineImpuestoCfdTxtDTO> getInfoFacImpuetos(FacturaRequest request);

	ListaAuxComplePagoTxtDTO getListaAuxComplePago(FacturaRequest request);
	
}
