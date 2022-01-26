package mx.com.mtsla.billing.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.mtlsa.billing.dto.MensajeDTO;
import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;
import mx.com.mtsla.billing.dao.GetCatalogoDao;
import mx.com.mtsla.billing.dao.map.MapCatalogosDTO;

@Stateless
public class GetCatalogoImpl implements GetCatalogoDao {

	
	@PersistenceContext(unitName = "jdbc/mtlsa_COFIDI_SSQL")
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
	public MensajeDTO insertCatContacto(CatContactoRequest request) {
		// TODO Auto-generated method stub
				System.out.println("CREA OBJETO insertCatContacto  ..");
				
				MensajeDTO msjDTO = new MensajeDTO();
				
				try {
					StringBuilder qlStringC1 = new StringBuilder();
					
					qlStringC1.append("  INSERT INTO CLI_ATEBCOFIDI.DBO.contactos (Empresa,Cliente,Contacto,Nombre,ApellidoPaterno,ApellidoMaterno "); 
					qlStringC1.append("  ,email,Area,Comentarios)  VALUES (");
					qlStringC1.append(request.getEmpresa() != null ? "'"+request.getEmpresa().trim()+"'": "null" );
					qlStringC1.append(",");
					qlStringC1.append(request.getCliente() != null ? "'"+request.getCliente().trim()+"'": "null");
					qlStringC1.append(",");
					qlStringC1.append(request.getContacto() != null ? "'"+request.getContacto().trim()+"'": "null");
					qlStringC1.append(",");
					qlStringC1.append(request.getNombre() != null ? "'"+request.getNombre().trim()+"'": "null");
					qlStringC1.append(",");
					qlStringC1.append(request.getApPaterno()  != null ? "'"+request.getApPaterno().trim()+"'": "null");
					qlStringC1.append(",");
					qlStringC1.append(request.getApMaterno() != null ? "'"+request.getApMaterno().trim()+"'": "null");
					qlStringC1.append(",");
					qlStringC1.append(request.getEmail() != null ? "'"+request.getEmail().trim()+"'": "null");
					qlStringC1.append(",");
					qlStringC1.append(request.getArea() != null ? "'"+request.getArea().trim()+"'": "null");
					qlStringC1.append(",");
					qlStringC1.append(request.getComentarios() != null ? "'"+request.getComentarios().trim()+"'": "null");
					qlStringC1.append(")");
					
					
					// Ejemplo 
					/* INSERT INTO CLI_ATEBCOFIDI.DBO.contactos (Empresa,Cliente,Contacto,Nombre,ApellidoPaterno,ApellidoMaterno,email,Area,Comentarios)
					 * VALUES ('0000000001','008','_3IY011111','Miguel','Vela','Esca','soylaLey@telodije.com','VW','')*/
					
					query = em.createNativeQuery(qlStringC1.toString());
					
					
					int objectLista = query.executeUpdate();
					
					
					if(objectLista == 1) {
						msjDTO.setCode("0");
						msjDTO.setDescripcion("Se agrego Exitosamente/nObjeto: "+ request.toString());
						
						
					}else {
						msjDTO.setCode("-2");
						msjDTO.setDescripcion("Error insertCatContacto No se pudo insertar , favor de volver a intentar/nObjeto: "+ request.toString());
					}
				
					
				}catch (Exception e) {
					System.out.println("Error - "+e);
					msjDTO.setCode("-1");
					msjDTO.setDescripcion("Error insertCatContacto -"+e +"/nObjeto: "+ request.toString());
				}
				
				
				return msjDTO;
	}


	@Override
	public MensajeDTO putCatContacto(CatContactoRequest request) {
		// TODO Auto-generated method stub
		System.out.println("CREA OBJETO putCatContacto  ..");
		
		MensajeDTO msjDTO = new MensajeDTO();
		
		try {
			StringBuilder qlStringC1 = new StringBuilder();
			
			
			qlStringC1.append(" UPDATE CLI_ATEBCOFIDI.DBO.contactos ");
			qlStringC1.append(" SET Nombre = ");
			qlStringC1.append(request.getNombre() != null ? "'"+request.getNombre().trim()+"'": "null");
			qlStringC1.append(" ,  ApellidoPaterno = ");
			qlStringC1.append(request.getApPaterno() != null ? "'"+request.getApPaterno().trim()+"'": "null");
			qlStringC1.append(" , ApellidoMaterno = ");
			qlStringC1.append(request.getApMaterno() != null ? "'"+request.getApMaterno().trim()+"'": "null");
			qlStringC1.append(" , email = ");
			qlStringC1.append(request.getEmail() != null ? "'"+request.getEmail().trim()+"'": "null");
			qlStringC1.append(" , Area = ");
			qlStringC1.append(request.getArea() != null ? "'"+request.getArea().trim()+"'": "null");
			qlStringC1.append(" , Comentarios = ");
			qlStringC1.append(request.getComentarios() != null ? "'"+request.getComentarios().trim()+"'": "null");
			qlStringC1.append(" WHERE Empresa = '");
			qlStringC1.append(request.getEmpresa().trim());
			qlStringC1.append("' AND   Cliente = '");
			qlStringC1.append(request.getCliente().trim());
			qlStringC1.append("' AND Contacto = '");
			qlStringC1.append(request.getContacto().trim());
			qlStringC1.append("'");
			
			// Ejemplo 
			/* UPDATE CLI_ATEBCOFIDI.DBO.contactos  SET Nombre = 'Miguel_2', ApellidoPaterno = 'Vela_2', ApellidoMaterno = 'Esca_2', email = 'lalala@gmail.com', Area = 'VV', Comentarios = 'TEE'
 			   WHERE Empresa = '0000000001' AND   Cliente = '008' AND    Contacto = '_3IY011111';*/
			
			query = em.createNativeQuery(qlStringC1.toString());
			
			
			int objectLista = query.executeUpdate();
			
			
			if(objectLista == 1) {
				msjDTO.setCode("0");
				msjDTO.setDescripcion("Se actualizo Exitosamente/nObjeto: "+ request.toString());
				
				
			}else {
				msjDTO.setCode("-2");
				msjDTO.setDescripcion("Error putCatContacto No se pudo actualizar , favor de volver a intentar/nObjeto: "+ request.toString());
			}
		
			
		}catch (Exception e) {
			System.out.println("Error - "+e);
			msjDTO.setCode("-1");
			msjDTO.setDescripcion("Error putCatContacto -"+e +"/nObjeto: "+ request.toString());
		}
		
		
		return msjDTO;
	}


	@Override
	public MensajeDTO deleteCatContacto(CatContactoRequest request) {
		// TODO Auto-generated method stub
				System.out.println("CREA OBJETO deleteCatContacto  ..");
				
				MensajeDTO msjDTO = new MensajeDTO();
				
				try {
					StringBuilder qlStringC1 = new StringBuilder();
					
					
					qlStringC1.append(" DELETE FROM  CLI_ATEBCOFIDI.DBO.contactos ");
					qlStringC1.append(" WHERE Empresa = '");
					qlStringC1.append(request.getEmpresa().trim());
					qlStringC1.append("' AND   Cliente = '");
					qlStringC1.append(request.getCliente().trim());
					qlStringC1.append("' AND Contacto = '");
					qlStringC1.append(request.getContacto().trim());
					qlStringC1.append("'");
					
					// Ejemplo 
					/* DELETE FROM  CLI_ATEBCOFIDI.DBO.contactos WHERE Empresa = '0000000001' AND   Cliente = '008' AND
      					Contacto = '_3IY011111';*/
					
					query = em.createNativeQuery(qlStringC1.toString());
					
					
					int objectLista = query.executeUpdate();
					
					
					if(objectLista == 1) {
						msjDTO.setCode("0");
						msjDTO.setDescripcion("Se borro Exitosamente/nObjeto: "+ request.toString());
						
						
					}else {
						msjDTO.setCode("-2");
						msjDTO.setDescripcion("Error deleteCatContacto No se pudo eliminar , favor de volver a intentar/nObjeto: "+ request.toString());
					}
				
					
				}catch (Exception e) {
					System.out.println("Error - "+e);
					msjDTO.setCode("-1");
					msjDTO.setDescripcion("Error deleteCatContacto -"+e +"/nObjeto: "+ request.toString());
				}
				
				
				return msjDTO;
	}

	
	
	@Override
	public List<CatSocioComercialRequest> getSocioComercial(String cliente, String empresa) {
				// TODO Auto-generated method stub
				System.out.println("CREA OBJETO getSocioComercial  ..");
				
				List<CatSocioComercialRequest> resultado = new ArrayList<CatSocioComercialRequest>();
				
				try {
					
					// Solo se deja busqueda por empresa
					
					StringBuilder qlStringC1 = new StringBuilder();
					qlStringC1.append(" select LTRIM(RTRIM(Cliente)) as cliente,LTRIM(RTRIM(Empresa)) as empresa,RazonSocial,RFC,Giro,CuentaContable,Activo, ");
					qlStringC1.append(" Linea1,	Linea2	,Linea3,	Linea4,	Linea5,	Linea6,	Rol,DirImpFE,DirExpFE,	NombreCertificado,Certificado,Formato1,	Formato2, ");	
					qlStringC1.append(" Formato3,	Formato4,	Formato5,	Formato6,	Formato7,	Formato8,Formato9,	Formato10,	Formato11,	Formato12,	Formato13, ");	
					qlStringC1.append(" Formato14,	Formato15, Adenda,	Transporte,	Login,	Usuario,NoProveedor,GLN,SCnCF01,SCnCF02, ");
					qlStringC1.append(" SCnCF03,SCnCF04,SCnCF05,E_FA,E_NC,E_ND,	E_OT,FormaPago,	NumCtaPago,	Consolida,tin,	curp	,usoCFDI,MetodoPago ");
					qlStringC1.append(" from CLI_ATEBCOFIDI.DBO.sociocomercial where empresa ='");
					qlStringC1.append(empresa.trim());
					//qlStringC1.append("' and cliente = '");
					//qlStringC1.append(cliente.trim());
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


	@Override
	public MensajeDTO insertSocioComercial(CatSocioComercialRequest request) {
		// TODO Auto-generated method stub
		System.out.println("CREA OBJETO insertCatContacto  ..");
		
		MensajeDTO msjDTO = new MensajeDTO();
		
		try {
			StringBuilder qlStringC1 = new StringBuilder();
			
			qlStringC1.append("  INSERT INTO CLI_ATEBCOFIDI.DBO.sociocomercial "); 
			qlStringC1.append("  (Cliente,Empresa,RazonSocial,RFC,Giro,CuentaContable,Activo,Linea1,Linea2,Linea3,Linea4,Linea5,Linea6 "); 
			qlStringC1.append("  ,Rol,DirImpFE,DirExpFE,NombreCertificado,Certificado,Formato1,Formato2,Formato3,Formato4,Formato5 ");
			qlStringC1.append("  ,Formato6,Formato7,Formato8,Formato9,Formato10,Formato11,Formato12,Formato13,Formato14,Formato15 "); 
			qlStringC1.append("  ,Adenda,Transporte,Login,Usuario,NoProveedor,GLN,SCnCF01,SCnCF02,SCnCF03,SCnCF04 "); 
			qlStringC1.append("  ,SCnCF05,E_FA,E_NC,E_ND,E_OT,FormaPago,NumCtaPago,Consolida,tin,curp,usoCFDI,MetodoPago) "); 
			qlStringC1.append("  VALUES ( ");
			qlStringC1.append("'"+request.getCliente().trim()+"'");
			qlStringC1.append(",");
			qlStringC1.append("'"+request.getEmpresa().trim()+"'" );
			qlStringC1.append(",");
			qlStringC1.append(request.getRazonSocial() != null ? "'"+request.getRazonSocial().trim()+"'": "null" );
			qlStringC1.append(",");
			qlStringC1.append(request.getRfc() != null ? "'"+request.getRfc().trim()+"'": "null" );
			qlStringC1.append(",");
			qlStringC1.append(request.getGiro() != null ? "'"+request.getGiro().trim()+"'": "null" );
			qlStringC1.append(",");
			qlStringC1.append(request.getCuentaContable() != null ? "'"+request.getCuentaContable().trim()+"'": "null" );
			qlStringC1.append(",");
			qlStringC1.append(request.getActivo()!= null ? +request.getActivo(): "null" );
			qlStringC1.append(",");
			qlStringC1.append("'"+request.getLinea1().trim()+"'");
			qlStringC1.append(",");
			qlStringC1.append("'"+request.getLinea2().trim()+"'");
			qlStringC1.append(",");
			qlStringC1.append( "'"+request.getLinea3().trim()+"'");
			qlStringC1.append(",");
			qlStringC1.append( "'"+request.getLinea4().trim()+"'");
			qlStringC1.append(",");
			qlStringC1.append( "'"+request.getLinea5().trim()+"'");
			qlStringC1.append(",");
			qlStringC1.append( "'"+request.getLinea6().trim()+"'");
			qlStringC1.append(",");
			qlStringC1.append( request.getRol()!= null ? "'"+request.getRol().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getDirImpFe()!= null ? "'"+request.getDirImpFe().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getDirExpFe()!= null ? "'"+request.getDirExpFe().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getNombreCertificado()!= null ? "'"+request.getNombreCertificado().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getCertificado()!= null ? "'"+request.getCertificado().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato1()!= null ? request.getFormato1(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato2()!= null ? request.getFormato2(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato3()!= null ? request.getFormato3(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato4()!= null ? request.getFormato4(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato5()!= null ? request.getFormato5(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato6()!= null ? request.getFormato6(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato7()!= null ? request.getFormato7(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato8()!= null ? request.getFormato8(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato9()!= null ? request.getFormato9(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato10()!= null ? request.getFormato10(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato11()!= null ? request.getFormato11(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato12()!= null ? request.getFormato12(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato13()!= null ? request.getFormato13(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato14()!= null ? request.getFormato14(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormato15()!= null ? request.getFormato15(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getAdenda()!= null ? "'"+request.getAdenda().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getTransporte()!= null ? "'"+request.getTransporte().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getLogin()!= null ? "'"+request.getLogin().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getUsuario()!= null ? "'"+request.getUsuario().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getNoProveedor()!= null ? "'"+request.getNoProveedor().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getGln()!= null ? "'"+request.getGln().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getsCnCF01()!= null ? vacioToNull(request.getsCnCF01().trim()): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getsCnCF02()!= null ? vacioToNull(request.getsCnCF02().trim()): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getsCnCF03()!= null ? vacioToNull(request.getsCnCF03().trim()): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getsCnCF04()!= null ? vacioToNull(request.getsCnCF04().trim()): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getsCnCF05()!= null ? vacioToNull(request.getsCnCF05().trim()): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getE_fa()!= null ? +request.getE_fa(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getE_nc()!= null ? +request.getE_nc(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getE_nd()!= null ? +request.getE_nd(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getE_ot()!= null ? +request.getE_ot(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getFormaPago()!= null ? "'"+request.getFormaPago().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getNumCtaPago()!= null ? "'"+request.getNumCtaPago().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getConsolida()!= null ? request.getConsolida(): "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getTin()!= null ? "'"+request.getTin().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getCurp()!= null ? "'"+request.getCurp().trim()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getUsoCFDI()!= null ? "'"+request.getUsoCFDI()+"'": "null");
			qlStringC1.append(",");
			qlStringC1.append( request.getMetodoPago()!= null ? "'"+request.getMetodoPago()+"'": "null");
			qlStringC1.append(")");
			
			
			
			
			// Ejemplo 
			/* INSERT INTO CLI_ATEBCOFIDI.DBO.contactos (Empresa,Cliente,Contacto,Nombre,ApellidoPaterno,ApellidoMaterno,email,Area,Comentarios)
			 * VALUES ('0000000001','008','_3IY011111','Miguel','Vela','Esca','soylaLey@telodije.com','VW','')*/
			
			query = em.createNativeQuery(qlStringC1.toString());
			
			
			int objectLista = query.executeUpdate();
			
			
			if(objectLista == 1) {
				msjDTO.setCode("0");
				msjDTO.setDescripcion("Se agrego Exitosamente/nObjeto: "+ request.toString());
				
				
			}else {
				msjDTO.setCode("-2");
				msjDTO.setDescripcion("Error insertCatContacto No se pudo insertar , favor de volver a intentar/nObjeto: "+ request.toString());
			}
		
			
		}catch (Exception e) {
			System.out.println("Error - "+e);
			msjDTO.setCode("-1");
			msjDTO.setDescripcion("Error insertCatContacto -"+e +"/nObjeto: "+ request.toString());
		}
		
		
		return msjDTO;
		
		
		
	}


	@Override
	public MensajeDTO putSocioComercial(CatSocioComercialRequest request) {
		// TODO Auto-generated method stub
				System.out.println("CREA OBJETO insertCatContacto  ..");
				
				MensajeDTO msjDTO = new MensajeDTO();
				
				try {
					StringBuilder qlStringC1 = new StringBuilder();
					
					//qlStringC1.append(" SET Nombre = ");
					//qlStringC1.append(request.getNombre() != null ? "'"+request.getNombre().trim()+"'": "null");
					
					qlStringC1.append("  UPDATE CLI_ATEBCOFIDI.DBO.sociocomercial "); 
					qlStringC1.append("  SET  RazonSocial = ");
					qlStringC1.append(request.getRazonSocial() != null ? "'"+request.getRazonSocial().trim()+"'": "null" );
					qlStringC1.append(" , RFC = ");
					qlStringC1.append(request.getRfc() != null ? "'"+request.getRfc().trim()+"'": "null" );
					qlStringC1.append(" , Giro = ");
					qlStringC1.append(request.getGiro() != null ? "'"+request.getGiro().trim()+"'": "null" );
					qlStringC1.append(" , CuentaContable = ");
					qlStringC1.append(request.getCuentaContable() != null ? "'"+request.getCuentaContable().trim()+"'": "null" );
					qlStringC1.append(" , Activo = ");
					qlStringC1.append(request.getActivo()!= null ? request.getActivo(): "null" );
					qlStringC1.append(" , Linea1 = ");
					qlStringC1.append( "'"+request.getLinea1().trim()+"'");
					qlStringC1.append(" , Linea2 = ");
					qlStringC1.append( "'"+request.getLinea2().trim()+"'");
					qlStringC1.append(" , Linea3 = ");
					qlStringC1.append( "'"+request.getLinea3().trim()+"'");
					qlStringC1.append(" , Linea4 = ");
					qlStringC1.append( "'"+request.getLinea4().trim()+"'");
					qlStringC1.append(" , Linea5 = ");
					qlStringC1.append( "'"+request.getLinea5().trim()+"'");
					qlStringC1.append(" , Linea6 = "); 
					qlStringC1.append( "'"+request.getLinea6().trim()+"'");
					qlStringC1.append(" , Rol = ");
					qlStringC1.append( request.getRol()!= null ? "'"+request.getRol().trim()+"'": "null");
					qlStringC1.append(" , DirImpFE = ");
					qlStringC1.append( request.getDirImpFe()!= null ? "'"+request.getDirImpFe().trim()+"'": "null");
					qlStringC1.append(" , DirExpFE = ");
					qlStringC1.append( request.getDirExpFe()!= null ? "'"+request.getDirExpFe().trim()+"'": "null");
					qlStringC1.append(" , NombreCertificado = ");
					qlStringC1.append( request.getNombreCertificado()!= null ? "'"+request.getNombreCertificado().trim()+"'": "null");
					qlStringC1.append(" , Certificado = ");
					qlStringC1.append( request.getCertificado()!= null ? "'"+request.getCertificado().trim()+"'": "null");
					qlStringC1.append(" , Formato1 = ");
					qlStringC1.append( request.getFormato1()!= null ? request.getFormato1(): "null");
					qlStringC1.append(" , Formato2 = ");
					qlStringC1.append( request.getFormato2()!= null ? request.getFormato2(): "null");
					qlStringC1.append(" , Formato3 = ");
					qlStringC1.append( request.getFormato3()!= null ? request.getFormato3(): "null");
					qlStringC1.append(" , Formato4 = ");
					qlStringC1.append( request.getFormato4()!= null ? request.getFormato4(): "null");
					qlStringC1.append(" , Formato5 = ");
					qlStringC1.append( request.getFormato5()!= null ? request.getFormato5(): "null");
					qlStringC1.append(" , Formato6 = ");
					qlStringC1.append( request.getFormato6()!= null ? request.getFormato6(): "null");
					qlStringC1.append(" , Formato7 = ");
					qlStringC1.append( request.getFormato7()!= null ? request.getFormato7(): "null");
					qlStringC1.append(" , Formato8 = ");
					qlStringC1.append( request.getFormato8()!= null ? request.getFormato8(): "null");
					qlStringC1.append(" , Formato9 = ");
					qlStringC1.append( request.getFormato9()!= null ? request.getFormato9(): "null");
					qlStringC1.append(" , Formato10 =");
					qlStringC1.append( request.getFormato10()!= null ? request.getFormato10(): "null");
					qlStringC1.append(" , Formato11 = ");
					qlStringC1.append( request.getFormato11()!= null ? request.getFormato11(): "null");
					qlStringC1.append(" , Formato12 = ");
					qlStringC1.append( request.getFormato12()!= null ? request.getFormato12(): "null");
					qlStringC1.append(" , Formato13 = ");
					qlStringC1.append( request.getFormato13()!= null ? request.getFormato13(): "null");
					qlStringC1.append(" , Formato14 = ");
					qlStringC1.append( request.getFormato14()!= null ? request.getFormato14(): "null");
					qlStringC1.append(" , Formato15 = ");
					qlStringC1.append( request.getFormato15()!= null ? request.getFormato15(): "null");
					qlStringC1.append(" , Adenda = ");
					qlStringC1.append( request.getAdenda()!= null ? "'"+request.getAdenda().trim()+"'": "null");
					qlStringC1.append(" , Transporte = ");
					qlStringC1.append( request.getTransporte()!= null ? "'"+request.getTransporte().trim()+"'": "null");
					qlStringC1.append(" , Login = ");
					qlStringC1.append( request.getLogin()!= null ? "'"+request.getLogin().trim()+"'": "null");
					qlStringC1.append(" , Usuario = ");
					qlStringC1.append( request.getUsuario()!= null ? "'"+request.getUsuario().trim()+"'": "null");
					qlStringC1.append(" , NoProveedor = ");
					qlStringC1.append( request.getNoProveedor()!= null ? "'"+request.getNoProveedor().trim()+"'": "null");
					qlStringC1.append(" , GLN = ");
					qlStringC1.append( request.getGln()!= null ? "'"+request.getGln().trim()+"'": "null");
					qlStringC1.append(" , SCnCF01 = ");
					qlStringC1.append( request.getsCnCF01()!= null ? vacioToNull(request.getsCnCF01().trim()): "null");
					qlStringC1.append(" , SCnCF02 = ");
					qlStringC1.append( request.getsCnCF02()!= null ? vacioToNull(request.getsCnCF02().trim()): "null");
					qlStringC1.append(" , SCnCF03 = ");
					qlStringC1.append( request.getsCnCF03()!= null ? vacioToNull(request.getsCnCF03().trim()): "null");
					qlStringC1.append(" , SCnCF04 = ");
					qlStringC1.append( request.getsCnCF04()!= null ? vacioToNull(request.getsCnCF04().trim()): "null");
					qlStringC1.append(" , SCnCF05 = ");
					qlStringC1.append( request.getsCnCF05()!= null ? vacioToNull(request.getsCnCF05().trim()): "null");
					qlStringC1.append(" , E_FA = ");
					qlStringC1.append( request.getE_fa()!= null ? request.getE_fa(): "null");
					qlStringC1.append(" , E_NC = ");
					qlStringC1.append( request.getE_nc()!= null ? request.getE_nc(): "null");
					qlStringC1.append(" , E_ND = ");
					qlStringC1.append( request.getE_nd()!= null ? request.getE_nd(): "null");
					qlStringC1.append(" , E_OT = ");
					qlStringC1.append( request.getE_ot()!= null ? request.getE_ot(): "null");
					qlStringC1.append(" , FormaPago = ");
					qlStringC1.append( request.getFormaPago()!= null ? "'"+request.getFormaPago().trim()+"'": "null");
					qlStringC1.append(" , NumCtaPago = ");
					qlStringC1.append( request.getNumCtaPago()!= null ? "'"+request.getNumCtaPago().trim()+"'": "null");
			    	qlStringC1.append(" , Consolida = ");
			    	qlStringC1.append( request.getConsolida()!= null ? "'"+request.getConsolida()+"'": "null");
				 	qlStringC1.append(" , tin = ");
				 	qlStringC1.append( request.getTin()!= null ? "'"+request.getTin().trim()+"'": "null");
				    qlStringC1.append(" , curp = ");
				    qlStringC1.append( request.getCurp()!= null ? "'"+request.getCurp().trim()+"'": "null");
					qlStringC1.append(" , usoCFDI = ");
					qlStringC1.append( request.getUsoCFDI()!= null ? "'"+request.getUsoCFDI()+"'": "null");
					qlStringC1.append(" , MetodoPago = ");
					qlStringC1.append( request.getMetodoPago()!= null ? "'"+request.getMetodoPago()+"'": "null");
					qlStringC1.append(" WHERE Empresa = '");
					qlStringC1.append(request.getEmpresa().trim());
					qlStringC1.append("' AND   Cliente = '");
					qlStringC1.append(request.getCliente().trim());
					qlStringC1.append("'");
					
					
					
					
					// Ejemplo 
					/* INSERT INTO CLI_ATEBCOFIDI.DBO.contactos (Empresa,Cliente,Contacto,Nombre,ApellidoPaterno,ApellidoMaterno,email,Area,Comentarios)
					 * VALUES ('0000000001','008','_3IY011111','Miguel','Vela','Esca','soylaLey@telodije.com','VW','')*/
					
					query = em.createNativeQuery(qlStringC1.toString());
					
					
					int objectLista = query.executeUpdate();
					
					
					if(objectLista == 1) {
						msjDTO.setCode("0");
						msjDTO.setDescripcion("Se agrego Exitosamente/nObjeto: "+ request.toString());
						
						
					}else {
						msjDTO.setCode("-2");
						msjDTO.setDescripcion("Error insertCatContacto No se pudo insertar , favor de volver a intentar/nObjeto: "+ request.toString());
					}
				
					
				}catch (Exception e) {
					System.out.println("Error - "+e);
					msjDTO.setCode("-1");
					msjDTO.setDescripcion("Error insertCatContacto -"+e +"/nObjeto: "+ request.toString());
				}
				
				
				return msjDTO;
	}


	@Override
	public MensajeDTO deleteSocioComercial(CatSocioComercialRequest request) {
		// TODO Auto-generated method stub
		System.out.println("CREA OBJETO deleteCatContacto  ..");
		
		MensajeDTO msjDTO = new MensajeDTO();
		
		try {
			StringBuilder qlStringC1 = new StringBuilder();
			
			
			qlStringC1.append(" DELETE FROM  CLI_ATEBCOFIDI.DBO.sociocomercial WHERE Empresa = ");
			qlStringC1.append(" WHERE Empresa = '");
			qlStringC1.append(request.getEmpresa().trim());
			qlStringC1.append("' AND   Cliente = '");
			qlStringC1.append(request.getCliente().trim());
			
			
			// Ejemplo 
			/* DELETE FROM CLI_ATEBCOFIDI.DBO.sociocomercial WHERE Empresa = '0000000001' AND   Cliente = '008' ;*/
			
			query = em.createNativeQuery(qlStringC1.toString());
			
			
			int objectLista = query.executeUpdate();
			
			
			if(objectLista == 1) {
				msjDTO.setCode("0");
				msjDTO.setDescripcion("Se borro Exitosamente/nObjeto: "+ request.toString());
				
				
			}else {
				msjDTO.setCode("-2");
				msjDTO.setDescripcion("Error deleteSocioComercial No se pudo eliminar , favor de volver a intentar/nObjeto: "+ request.toString());
			}
		
			
		}catch (Exception e) {
			System.out.println("Error - "+e);
			msjDTO.setCode("-1");
			msjDTO.setDescripcion("Error deleteSocioComercial -"+e +"/nObjeto: "+ request.toString());
		}
		
		
		return msjDTO;
	}
	
	
	
	public static String vacioToNull(String valor) {
		String respuesta = " null ";
		
			if(valor.isEmpty()) {
				return respuesta;
			}else {
				return  valor;
			}
		
		
		
	}


}
