package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;




public interface GetInfoPagosTxtDao {
	
	List<EspecOrdEncaFacElecTxtDTO> getInfoFacPagosEncabezado(FacturaRequest request);
	
	List<EspecOrdLineDetCfdTxtDTO> getInfoFacPagosCompleDetalle(FacturaRequest request);
	
	List<EstrucSecAuxComplePagoTxtDTO> getListaAuxPagosComplePago(FacturaRequest request);
	
}
