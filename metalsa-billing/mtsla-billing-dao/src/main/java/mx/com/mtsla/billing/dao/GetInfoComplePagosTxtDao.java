package mx.com.mtsla.billing.dao;

import java.util.List;

//import org.eclipse.persistence.internal.oxm.schema.model.List;

import mx.com.mtlsa.billing.dto.request.txt.ComplementoPagoRequest;
import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;

public interface GetInfoComplePagosTxtDao {
	
	List<EspecOrdEncaFacElecTxtDTO> getInfoComplementoPagosEncabezado(ComplementoPagoRequest request);
	
	List<EspecOrdLineDetCfdTxtDTO> getInfoComplementoPagosCompleDetalle(ComplementoPagoRequest request);
	
	List<EstrucSecAuxComplePagoTxtDTO> getListaAuxPagosComplePago(ComplementoPagoRequest request);
	

}
