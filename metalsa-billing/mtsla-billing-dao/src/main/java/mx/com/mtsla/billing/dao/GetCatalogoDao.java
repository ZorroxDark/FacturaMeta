package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;

public interface GetCatalogoDao {
	
	//CatContacto
	List<CatContactoRequest> getCatContacto(String cliente , String empresa);
	
	
	//CatSocioComercialRequest
	List<CatSocioComercialRequest> getSocioComercial(String cliente , String empresa);

}
