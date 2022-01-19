package mx.com.mtlsa.billing.service;

import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;

public interface CatalogoService {

	List<CatContactoRequest> getCatContacto(CatContactoRequest request);
	
	List<CatSocioComercialRequest> getCatSocioComercial(CatSocioComercialRequest request);
	
}
