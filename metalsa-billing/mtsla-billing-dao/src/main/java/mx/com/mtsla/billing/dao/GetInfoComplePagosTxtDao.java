package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;

public interface GetInfoComplePagosTxtDao {
	
	List<EspecOrdEncaFacElecTxtDTO> getInfoComplementoPagosEncabezado(FacturaRequest request);
	
	List<EspecOrdLineDetCfdTxtDTO> getInfoComplementoPagosCompleDetalle(FacturaRequest request);
	
	List<EstrucSecAuxComplePagoTxtDTO> getListaAuxPagosComplePago(FacturaRequest request);
	

}
