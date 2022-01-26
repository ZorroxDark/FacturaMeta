package mx.com.mtsla.billing.dao;

import java.util.List;

import mx.com.mtlsa.billing.dto.MensajeDTO;
import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;

public interface GetCatalogoDao {
	
	//CatContacto
	List<CatContactoRequest> getCatContacto(String cliente , String empresa);
	//CatContacto insert
	MensajeDTO insertCatContacto(CatContactoRequest request);
	//CatContacto update
	MensajeDTO putCatContacto(CatContactoRequest request);
	//CatContacto update
	MensajeDTO deleteCatContacto(CatContactoRequest request);
	
	
	//CatSocioComercialRequest
	List<CatSocioComercialRequest> getSocioComercial(String cliente , String empresa);
	//CatSocioComercialRequest insert
	MensajeDTO insertSocioComercial(CatSocioComercialRequest request);
	//CatSocioComercialRequest update
	MensajeDTO putSocioComercial(CatSocioComercialRequest request);
	//CatSocioComercialRequest update
	MensajeDTO deleteSocioComercial(CatSocioComercialRequest request);

}
