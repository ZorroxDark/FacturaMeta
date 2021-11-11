package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;

public interface GetInfoNominaPagosTxtDao {
	
	List<EspecOrdEncaFacElecTxtDTO> getInfoNominaPagosEncabezado(FacturaRequest request);
	
	List<EspecOrdLineDetCfdTxtDTO> getInfoNominaPagosCompleDetalle(FacturaRequest request);
	
	List<EstrucSecAuxComplePagoTxtDTO> getListaAuxPagosNominaPago(FacturaRequest request);

}
