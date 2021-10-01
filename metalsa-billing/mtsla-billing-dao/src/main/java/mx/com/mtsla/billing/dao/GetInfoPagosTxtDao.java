package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;




public interface GetInfoPagosTxtDao {
	
	List<EspecOrdEncaFacElecTxtDTO> getInfoFacPagosEncabezado(FacElectronicaRequest request);
	
	List<EspecOrdLineDetCfdTxtDTO> getInfoFacPagosCompleDetalle(FacElectronicaRequest request);
	
	List<EstrucSecAuxComplePagoTxtDTO> getListaAuxPagosComplePago(FacElectronicaRequest request);
	
}
