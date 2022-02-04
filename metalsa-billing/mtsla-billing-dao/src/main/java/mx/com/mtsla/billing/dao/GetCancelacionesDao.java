package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionInfoAddResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionResponse;


public interface GetCancelacionesDao {

	 ArrayOfCancelacionDTO getListaFacturasCancelar(ArrayOfCancelacionDTO listaArrayOfCancelacion);
	
	 List<CancelacionInfoAddResponse> getListaCorreoProvedor(List<CancelacionResponse> listaCancelacion);
	
	 List<CancelacionInfoAddResponse> getListaCorreoComprador(List<CancelacionResponse> listaCancelacion);
	 
}
