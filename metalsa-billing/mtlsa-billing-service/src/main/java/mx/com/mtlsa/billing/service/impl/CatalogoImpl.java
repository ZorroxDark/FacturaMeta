package mx.com.mtlsa.billing.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;
import mx.com.mtlsa.billing.service.CatalogoService;
import mx.com.mtsla.billing.dao.GetCatalogoDao;
import mx.com.mtsla.billing.dao.GetInfoPagosTxtDao;


@Stateless
public class CatalogoImpl implements CatalogoService , Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6714942047472680122L;
	
	
	
	@Inject
	GetCatalogoDao getCatalogoDao;

	@Override
	public List<CatContactoRequest> getCatContacto(CatContactoRequest request) {
		
		
		List<CatContactoRequest> listCatContacto = new ArrayList<CatContactoRequest>();
		
		try {
			listCatContacto = getCatalogoDao.getCatContacto(request.getCliente(), request.getEmpresa());
			
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return listCatContacto;
		
	}

	@Override
	public List<CatSocioComercialRequest> getCatSocioComercial(CatSocioComercialRequest request) {
		List<CatSocioComercialRequest> listCatSocioComercial = new ArrayList<CatSocioComercialRequest>();
		
		try {
			

			listCatSocioComercial = getCatalogoDao.getSocioComercial(request.getCliente(), request.getEmpresa());
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return listCatSocioComercial;
	}
	
	
	

}
