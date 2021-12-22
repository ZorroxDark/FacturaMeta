package mx.com.mtsla.billing.dao;

import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;

public interface GetCancelacionesDao {

	ArrayOfCancelacionDTO getListaFacturasCancelar(ArrayOfCancelacionDTO listaArrayOfCancelacion);
	
}
