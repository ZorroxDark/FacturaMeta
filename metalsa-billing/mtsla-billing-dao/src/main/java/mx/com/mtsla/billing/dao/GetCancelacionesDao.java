package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionInfoAddResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionResponse;


public interface GetCancelacionesDao {

	 ArrayOfCancelacionDTO getListFacCancelarMetalsa(ArrayOfCancelacionDTO listaArrayOfCancelacion);
	 ArrayOfCancelacionDTO getListFacCancelarProeza(ArrayOfCancelacionDTO listaArrayOfCancelacion);
	 
	 List<CancelacionInfoAddResponse> getListCorreoProvedorMetalsa(List<CancelacionResponse> listaCancelacion);
	 List<CancelacionInfoAddResponse> getListCorreoProvedorProeza(List<CancelacionResponse> listaCancelacion);
		
	 
	 List<CancelacionInfoAddResponse> getListCorreoCompradorMetalsa(List<CancelacionResponse> listaCancelacion);
	 List<CancelacionInfoAddResponse> getListCorreoCompradorProeza(List<CancelacionResponse> listaCancelacion);
	 
}
