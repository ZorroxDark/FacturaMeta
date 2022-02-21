package mx.com.mtsla.billing.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.CancelacionDTO;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionInfoAddResponse;
import mx.com.mtlsa.billing.dto.response.txt.CancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaDatos;
import mx.com.mtsla.billing.dao.GetCancelacionesDao;

@Stateless
public class GetCancelacionImpl implements GetCancelacionesDao {
	
	@PersistenceContext(unitName = "jdbc/mtlsa_cuscofidi2")
	private EntityManager em;
	private Query query;
	
	
	@SuppressWarnings("finally")
	@Override
	public ArrayOfCancelacionDTO getListFacCancelarMetalsa(ArrayOfCancelacionDTO listaArrayOfCancelacion) {
		
		System.out.println("CREA OBJETO getListFacCancelarMetalsa  ..");
		
		ArrayOfCancelacionDTO listaFacturasCancelar = new ArrayOfCancelacionDTO();
		List<CancelacionDTO> listaCancelacionDTO = new ArrayList<CancelacionDTO>();
		
		
		try {
			
			//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
			//-Si se encuentra en alguna de las tablas se rechaza cancelación.

			
			//1 valida que no venga nulo
			if(listaArrayOfCancelacion == null) {
				return listaFacturasCancelar;
			}
			
			// 2 Agrega los Datos del UID un String para realizar la consulta 
			StringBuilder qlStringvalores = new StringBuilder();
			
			int cont=1;
			for(CancelacionDTO tempCancela:listaArrayOfCancelacion.getCancelacionDTO()) {
				
				qlStringvalores.append("'"+tempCancela.getCFDIUUID().trim()+"'");
				
				if(cont == listaArrayOfCancelacion.getCancelacionDTO().size()) {
					
					qlStringvalores.append("");
				}else {
					
					qlStringvalores.append(",");
				}
				
				cont++;
			}

			System.out.println("RECHAZADOS QUE ARROJA EL SEVICIO Y ESTAN EN BASE DE DATOS");
			
			StringBuilder qlStringC1 = new StringBuilder();
			qlStringC1.append(" select DISTINCT(facturas) from ( "); 
			qlStringC1.append(" select  upper(uuid) as facturas from ft_facturas_sup where upper(uuid)in (  ");//cambia tabla
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(" ) union all ");
			qlStringC1.append(" select upper(attribute14) as facturas from ap_invoices_all where upper(attribute14) in( ");
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(") )");
			
			System.out.println(qlStringC1);
			
			query = em.createNativeQuery(qlStringC1.toString());
			List<String> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				
				
				for(CancelacionDTO tempTotal : listaArrayOfCancelacion.getCancelacionDTO()) {
					for(String tempUid : objectLista) {
						
						if(tempUid.equals(tempTotal.getCFDIUUID())) {
							listaCancelacionDTO.add(tempTotal);
						}
					}
					
				}
				
				//Trae las que vienen en las tablas
				listaFacturasCancelar.getCancelacionDTO().addAll(listaCancelacionDTO);
				
			}
			
				
		}catch (Exception e) {
			System.out.println("Error Encabezado " + e);
			
		}finally {
			return listaFacturasCancelar;

		}
		
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public ArrayOfCancelacionDTO getListFacCancelarProeza(ArrayOfCancelacionDTO listaArrayOfCancelacion) {
		
		System.out.println("CREA OBJETO getListFacCancelarProeza  ..");
		
		ArrayOfCancelacionDTO listaFacturasCancelar = new ArrayOfCancelacionDTO();
		List<CancelacionDTO> listaCancelacionDTO = new ArrayList<CancelacionDTO>();
		
		
		try {
			
			//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
			//-Si se encuentra en alguna de las tablas se rechaza cancelación.

			
			//1 valida que no venga nulo
			if(listaArrayOfCancelacion == null) {
				return listaFacturasCancelar;
			}
			
			// 2 Agrega los Datos del UID un String para realizar la consulta 
			StringBuilder qlStringvalores = new StringBuilder();
			
			int cont=1;
			for(CancelacionDTO tempCancela:listaArrayOfCancelacion.getCancelacionDTO()) {
				
				qlStringvalores.append("'"+tempCancela.getCFDIUUID().trim()+"'");
				
				if(cont == listaArrayOfCancelacion.getCancelacionDTO().size()) {
					
					qlStringvalores.append("");
				}else {
					
					qlStringvalores.append(",");
				}
				
				cont++;
			}

			System.out.println("RECHAZADOS QUE ARROJA EL SEVICIO Y ESTAN EN BASE DE DATOS");
			
			StringBuilder qlStringC1 = new StringBuilder();
			qlStringC1.append(" select DISTINCT(facturas) from ( "); 
			qlStringC1.append(" select  upper(uuid) as facturas from ft_bzfacturas_sup where upper(uuid)in (  ");//cambia tabla
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(" ) union all ");
			qlStringC1.append(" select upper(attribute14) as facturas from ap_invoices_all where upper(attribute14) in( ");
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(") )");
			
			System.out.println(qlStringC1);
			
			query = em.createNativeQuery(qlStringC1.toString());
			List<String> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				
				
				for(CancelacionDTO tempTotal : listaArrayOfCancelacion.getCancelacionDTO()) {
					for(String tempUid : objectLista) {
						
						if(tempUid.equals(tempTotal.getCFDIUUID())) {
							listaCancelacionDTO.add(tempTotal);
						}
					}
					
				}
				
				//Trae las que vienen en las tablas
				listaFacturasCancelar.getCancelacionDTO().addAll(listaCancelacionDTO);
				
			}
			
				
		}catch (Exception e) {
			System.out.println("Error Encabezado " + e);
			
		}finally {
			return listaFacturasCancelar;

		}
		
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public List<CancelacionInfoAddResponse> getListCorreoProvedorMetalsa(List<CancelacionResponse> listaCancelacion) {
		
		System.out.println("CREA OBJETO getListCorreoProvedorMetalsa  ..");
		
		List<CancelacionInfoAddResponse> respuesta = new ArrayList<CancelacionInfoAddResponse>();
		
		try {
			
			//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
			//-Si se encuentra en alguna de las tablas se rechaza cancelación.

			
			//1 valida que no venga nulo
			if(listaCancelacion == null) {
				return respuesta;
			}
			
			// 2 Agrega los Datos del UID un String para realizar la consulta 
			StringBuilder qlStringvalores = new StringBuilder();
			
			int cont=1;
			for(CancelacionResponse tempCancela:listaCancelacion) {
				
				qlStringvalores.append("'"+tempCancela.getCfdiUuid().trim()+"'");
				
				if(cont == listaCancelacion.size()) {
					
					qlStringvalores.append("");
				}else {
					
					qlStringvalores.append(",");
				}
				
				cont++;
			}
			
			System.out.println("CORREOS CANCELADOS ACEPTADOS -CorreoProvedor");
			
			StringBuilder qlStringC1 = new StringBuilder();
			qlStringC1.append(" select upper(uuid) UUID, razonsocial, uploadedby email_proveedor, status ");
			qlStringC1.append(" from ft_facturas_sup  where upper(uuid) in (");//Cambia tabla
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(") ");
			
			System.out.println(qlStringC1);
			
			query = em.createNativeQuery(qlStringC1.toString());
			List<Object[]> objectLista = query.getResultList();
			
			if(objectLista != null && !objectLista.isEmpty()) {
				
				
				for(Object[] temp : objectLista) {
					CancelacionInfoAddResponse canInfoAdd = new CancelacionInfoAddResponse();
					canInfoAdd.setUuid(null != temp[0] ? temp[0].toString().trim() : ""   );
					canInfoAdd.setRazonSocial(null != temp[1] ? temp[1].toString().trim() : ""  );
					//canInfoAdd.setEmailProveedor(null != temp[2] ? temp[2].toString().trim() : "" );
					canInfoAdd.setStatus(null != temp[3] ? temp[3].toString().trim() : "" );
					
					
					if(null != temp[2] ) {
						String arrayCorreos[] = temp[2].toString().split(",");
						
						for(String v:arrayCorreos) {
							canInfoAdd.getEmailProveedor().add(v);
						}
					}
					
					respuesta.add(canInfoAdd);
				}
				
			}
			
				
		}catch (Exception e) {
			System.out.println("Error Encabezado " + e);
			
		}finally {
			return respuesta;

		}
		
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public List<CancelacionInfoAddResponse> getListCorreoProvedorProeza(List<CancelacionResponse> listaCancelacion) {
		
		System.out.println("CREA OBJETO getListCorreoProvedorProeza  ..");
		
		List<CancelacionInfoAddResponse> respuesta = new ArrayList<CancelacionInfoAddResponse>();
		
		try {
			
			//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
			//-Si se encuentra en alguna de las tablas se rechaza cancelación.

			
			//1 valida que no venga nulo
			if(listaCancelacion == null) {
				return respuesta;
			}
			
			// 2 Agrega los Datos del UID un String para realizar la consulta 
			StringBuilder qlStringvalores = new StringBuilder();
			
			int cont=1;
			for(CancelacionResponse tempCancela:listaCancelacion) {
				
				qlStringvalores.append("'"+tempCancela.getCfdiUuid().trim()+"'");
				
				if(cont == listaCancelacion.size()) {
					
					qlStringvalores.append("");
				}else {
					
					qlStringvalores.append(",");
				}
				
				cont++;
			}
			
			System.out.println("CORREOS CANCELADOS ACEPTADOS -CorreoProvedor");
			
			StringBuilder qlStringC1 = new StringBuilder();
			qlStringC1.append(" select upper(uuid) UUID, razonsocial, uploadedby email_proveedor, status ");
			qlStringC1.append(" from ft_bzfacturas_sup  where upper(uuid) in (");//Cambia tabla
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(") ");
			
			System.out.println(qlStringC1);
			
			query = em.createNativeQuery(qlStringC1.toString());
			List<Object[]> objectLista = query.getResultList();
			
			if(objectLista != null && !objectLista.isEmpty()) {
				
				
				for(Object[] temp : objectLista) {
					CancelacionInfoAddResponse canInfoAdd = new CancelacionInfoAddResponse();
					canInfoAdd.setUuid(null != temp[0] ? temp[0].toString().trim() : ""   );
					canInfoAdd.setRazonSocial(null != temp[1] ? temp[1].toString().trim() : ""  );
					//canInfoAdd.setEmailProveedor(null != temp[2] ? temp[2].toString().trim() : "" );
					canInfoAdd.setStatus(null != temp[3] ? temp[3].toString().trim() : "" );
					
					
					if(null != temp[2] ) {
						String arrayCorreos[] = temp[2].toString().split(",");
						
						for(String v:arrayCorreos) {
							canInfoAdd.getEmailProveedor().add(v);
						}
					}
					respuesta.add(canInfoAdd);
				}
				
			}
			
				
		}catch (Exception e) {
			System.out.println("Error Encabezado " + e);
			
		}finally {
			return respuesta;

		}
		
	}
	
	

	@SuppressWarnings("finally")
	@Override
	public List<CancelacionInfoAddResponse> getListCorreoCompradorMetalsa(List<CancelacionResponse> listaCancelacion) {
		
		System.out.println("CREA OBJETO getListCorreoCompradorMetalsa  ..");
		
		List<CancelacionInfoAddResponse> respuesta = new ArrayList<CancelacionInfoAddResponse>(); 
		
		
		try {
			
			//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
			//-Si se encuentra en alguna de las tablas se rechaza cancelación.

			
			//1 valida que no venga nulo
			if(listaCancelacion == null) {
				return respuesta;
			}
			
			// 2 Agrega los Datos del UID un String para realizar la consulta 
			StringBuilder qlStringvalores = new StringBuilder();
			
			int cont=1;
			for(CancelacionResponse tempCancela:listaCancelacion) {
				
				qlStringvalores.append("'"+tempCancela.getCfdiUuid().trim()+"'");
				
				if(cont == listaCancelacion.size()) {
					
					qlStringvalores.append("");
				}else {
					
					qlStringvalores.append(",");
				}
				
				cont++;
			}
			
			System.out.println("CORREOS CANCELADOS ACEPTADOS -CorreoComprador");
			
			StringBuilder qlStringC1 = new StringBuilder();
			qlStringC1.append(" select distinct  c.email_address email_comprador  , header_attribute14 "); 
			qlStringC1.append(" from po_headers_all a "); 
			qlStringC1.append(" inner join po_action_history b on a.po_header_id=b.object_id and B.action_code='APPROVE'  "); 
			qlStringC1.append(" inner join per_all_people_f C on b.employee_id=c.person_id and sysdate "); 
			qlStringC1.append(" between effective_start_date and effective_end_date and C.current_employee_flag='Y' "); 
			qlStringC1.append(" inner join ctm_ap_invoices_interface d on d.header_attribute1=a.segment1 and a.org_id=d.org_id "); //cambia CTM_AP_INV_PRINTERFACE
			qlStringC1.append(" where upper(header_attribute14) in (");
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(")  "); 
			
			System.out.println(qlStringC1);
			
			
			
			query = em.createNativeQuery(qlStringC1.toString());
			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null && !objectLista.isEmpty()) {
				
				
				for(Object[] tempUid : objectLista) {
						CancelacionInfoAddResponse cancelaInfoAdd = new CancelacionInfoAddResponse();
						cancelaInfoAdd.setUuid(tempUid[1].toString());
						String arrayCorreos[] = tempUid[0].toString().split(",");
						
						for(String v:arrayCorreos) {
							cancelaInfoAdd.getEmailComprador().add(v);
						}
						
						respuesta.add(cancelaInfoAdd);
				}
					
			
				
			}
			
				
		}catch (Exception e) {
			System.out.println("Error Encabezado " + e);
			
		}finally {
			return respuesta;

		}
		
	}


	@SuppressWarnings("finally")
	@Override
	public List<CancelacionInfoAddResponse> getListCorreoCompradorProeza(List<CancelacionResponse> listaCancelacion) {
		
		System.out.println("CREA OBJETO getListCorreoCompradorProeza  ..");
		
		List<CancelacionInfoAddResponse> respuesta = new ArrayList<CancelacionInfoAddResponse>(); 
		
		
		try {
			
			//-Si no se encuentra en ninguna de las tablas se Acepta Cancelación.
			//-Si se encuentra en alguna de las tablas se rechaza cancelación.

			
			//1 valida que no venga nulo
			if(listaCancelacion == null) {
				return respuesta;
			}
			
			// 2 Agrega los Datos del UID un String para realizar la consulta 
			StringBuilder qlStringvalores = new StringBuilder();
			
			int cont=1;
			for(CancelacionResponse tempCancela:listaCancelacion) {
				
				qlStringvalores.append("'"+tempCancela.getCfdiUuid().trim()+"'");
				
				if(cont == listaCancelacion.size()) {
					
					qlStringvalores.append("");
				}else {
					
					qlStringvalores.append(",");
				}
				
				cont++;
			}
			
			System.out.println("CORREOS CANCELADOS ACEPTADOS -CorreoComprador");
			
			StringBuilder qlStringC1 = new StringBuilder();
			qlStringC1.append(" select distinct  c.email_address email_comprador  , header_attribute14 "); 
			qlStringC1.append(" from po_headers_all a "); 
			qlStringC1.append(" inner join po_action_history b on a.po_header_id=b.object_id and B.action_code='APPROVE'  "); 
			qlStringC1.append(" inner join per_all_people_f C on b.employee_id=c.person_id and sysdate "); 
			qlStringC1.append(" between effective_start_date and effective_end_date and C.current_employee_flag='Y' "); 
			qlStringC1.append(" inner join CTM_AP_INV_PRINTERFACE d on d.header_attribute1=a.segment1 and a.org_id=d.org_id "); //cambia CTM_AP_INV_PRINTERFACE
			qlStringC1.append(" where upper(header_attribute14) in (");
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(")  "); 
			
			System.out.println(qlStringC1);
			
			
			
			query = em.createNativeQuery(qlStringC1.toString());
			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null && !objectLista.isEmpty()) {
				for(Object[] tempUid : objectLista) {
						CancelacionInfoAddResponse cancelaInfoAdd = new CancelacionInfoAddResponse();
						cancelaInfoAdd.setUuid(tempUid[1].toString());
						String arrayCorreos[] = tempUid[0].toString().split(",");
						
						for(String v:arrayCorreos) {
							cancelaInfoAdd.getEmailComprador().add(v);
						}
						
						respuesta.add(cancelaInfoAdd);
				}
			}
			
				
		}catch (Exception e) {
			System.out.println("Error Encabezado " + e);
			
		}finally {
			return respuesta;

		}
		
	}


	
}
