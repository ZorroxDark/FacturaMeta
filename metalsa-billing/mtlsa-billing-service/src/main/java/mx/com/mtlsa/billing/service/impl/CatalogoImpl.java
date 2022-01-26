package mx.com.mtlsa.billing.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.mtlsa.billing.dto.MensajeDTO;
import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;
import mx.com.mtlsa.billing.service.CatalogoService;
import mx.com.mtsla.billing.dao.GetCatalogoDao;


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
	public MensajeDTO insertCatContacto(CatContactoRequest request) {

		MensajeDTO msj = new MensajeDTO();
		try {
			msj = getCatalogoDao.insertCatContacto(request);
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return msj;
	}
	
	
	@Override
	public MensajeDTO putCatContacto(CatContactoRequest request) {
		MensajeDTO msj = new MensajeDTO();
		try {
			msj = getCatalogoDao.putCatContacto(request);
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return msj;
	}
	
	
	@Override
	public MensajeDTO deleteCatContacto(CatContactoRequest request) {
		MensajeDTO msj = new MensajeDTO();
		try {
			msj = getCatalogoDao.deleteCatContacto(request);
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return msj;
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

	

	

	@Override
	public MensajeDTO insertCatSocioComercial(CatSocioComercialRequest request) {
		MensajeDTO msj = new MensajeDTO();
		try {
			msj = getCatalogoDao.insertSocioComercial(request);
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return msj;
	}

	@Override
	public MensajeDTO putCatSocioComercial(CatSocioComercialRequest request) {
		MensajeDTO msj = new MensajeDTO();
		try {
			msj = getCatalogoDao.putSocioComercial(request);
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return msj;
	}

	@Override
	public MensajeDTO deleteCatSocioComercial(CatSocioComercialRequest request) {
		MensajeDTO msj = new MensajeDTO();
		try {
			msj = getCatalogoDao.deleteSocioComercial(request);
			
		}catch (Exception e) {
			System.out.println("ERROR "+e);
		}
		
		
		return msj;
	}

	

	
	
	

}
