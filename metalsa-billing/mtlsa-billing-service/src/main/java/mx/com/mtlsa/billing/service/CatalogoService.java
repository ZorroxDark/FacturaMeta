package mx.com.mtlsa.billing.service;

import java.util.List;

import mx.com.mtlsa.billing.dto.MensajeDTO;
import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;

public interface CatalogoService {

	List<CatContactoRequest> getCatContacto(CatContactoRequest request);
	MensajeDTO insertCatContacto(CatContactoRequest request);
	MensajeDTO putCatContacto(CatContactoRequest request);
	MensajeDTO deleteCatContacto(CatContactoRequest request);
	
	List<CatSocioComercialRequest> getCatSocioComercial(CatSocioComercialRequest request);
	MensajeDTO insertCatSocioComercial(CatSocioComercialRequest request);
	MensajeDTO putCatSocioComercial(CatSocioComercialRequest request);
	MensajeDTO deleteCatSocioComercial(CatSocioComercialRequest request);
	
}
