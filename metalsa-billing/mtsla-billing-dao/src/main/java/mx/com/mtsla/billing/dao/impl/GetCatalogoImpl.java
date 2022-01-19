package mx.com.mtsla.billing.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;
import mx.com.mtsla.billing.dao.GetCatalogoDao;
import mx.com.mtsla.billing.dao.map.MapCatalogosDTO;

@Stateless
public class GetCatalogoImpl implements GetCatalogoDao {

	
	@PersistenceContext(unitName = "jdbc/mtlsa_cuscofidi2")
	private EntityManager em;
	private Query query;
	
	
	@SuppressWarnings("finally")
	
	
	
	@Override
	public List<CatContactoRequest> getCatContacto(String cliente, String empresa) {
		// TODO Auto-generated method stub
		System.out.println("CREA OBJETO getCatContacto  ..");
		
		List<CatContactoRequest> resultado = new ArrayList<CatContactoRequest>();
		
		try {
			
			
			StringBuilder qlStringC1 = new StringBuilder();
			
			qlStringC1.append(" select LTRIM(RTRIM(Empresa)) as empresa, LTRIM(RTRIM(Cliente)) as cliente,  contacto , nombre, apellidoPaterno, apellidoMaterno , email , area , comentarios "); 
			qlStringC1.append(" from CLI_ATEBCOFIDI.DBO.contactos where empresa ='");
			qlStringC1.append(empresa.trim());
			qlStringC1.append("' and cliente = '");
			qlStringC1.append(cliente.trim());
			qlStringC1.append("' ");
			query = em.createNativeQuery(qlStringC1.toString());
			
			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				resultado = MapCatalogosDTO.mapCatalogoContacto(objectLista);
			}
		
			
		}catch (Exception e) {
			System.out.println("Error - "+e);
		}
		
		
		return resultado;
	}


	@Override
	public List<CatSocioComercialRequest> getSocioComercial(String cliente, String empresa) {
		// TODO Auto-generated method stub
				System.out.println("CREA OBJETO getSocioComercial  ..");
				
				List<CatSocioComercialRequest> resultado = new ArrayList<CatSocioComercialRequest>();
				
				try {
					
					
					StringBuilder qlStringC1 = new StringBuilder();
					qlStringC1.append(" select LTRIM(RTRIM(Cliente)) as cliente,LTRIM(RTRIM(Empresa)) as empresa,RazonSocial,RFC,Giro,CuentaContable,Activo, ");
					qlStringC1.append(" Linea1,	Linea2	,Linea3,	Linea4,	Linea5,	Linea6,	Rol,DirImpFE,DirExpFE,	NombreCertificado,Certificado,Formato1,	Formato2, ");	
					qlStringC1.append(" Formato3,	Formato4,	Formato5,	Formato6,	Formato7,	Formato8,Formato9,	Formato10,	Formato11,	Formato12,	Formato13, ");	
					qlStringC1.append(" Formato14,	Formato15, Adenda,	Transporte,	Login,	Usuario,NoProveedor,GLN,SCnCF01,SCnCF02, ");
					qlStringC1.append(" SCnCF03,SCnCF04,SCnCF05,E_FA,E_NC,E_ND,	E_OT,FormaPago,	NumCtaPago,	Consolida,tin,	curp	,usoCFDI,MetodoPago ");
					qlStringC1.append(" from CLI_ATEBCOFIDI.DBO.sociocomercial where empresa ='");
					qlStringC1.append(empresa.trim());
					qlStringC1.append("' and cliente = '");
					qlStringC1.append(cliente.trim());
					qlStringC1.append("' ");
					
					query = em.createNativeQuery(qlStringC1.toString());
					
					List<Object[]> objectLista = query.getResultList();
					
					
					if(objectLista != null) {
						resultado = MapCatalogosDTO.mapCatalogoSocioComercial(objectLista);
					}
				
					
				}catch (Exception e) {
					System.out.println("Error - "+e);
				}
				
				
				return resultado;
	}
	


	
	

}
