package mx.com.mtsla.billing.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.mtlsa.billing.client.cancelaciones.ArrayOfCancelacionDTO;
import mx.com.mtlsa.billing.client.cancelaciones.CancelacionDTO;
import mx.com.mtsla.billing.dao.GetCancelacionesDao;

@Stateless
public class GetCancelacionImpl implements GetCancelacionesDao {
	
	@PersistenceContext(unitName = "jdbc/mtlsa_cuscofidi2")
	private EntityManager em;
	private Query query;
	
	
	@SuppressWarnings("finally")
	@Override
	public ArrayOfCancelacionDTO getListaFacturasCancelar(ArrayOfCancelacionDTO listaArrayOfCancelacion) {
		
		System.out.println("CREA OBJETO getListaFacturasCancelar  ..");
		
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
			
			
			StringBuilder qlStringC1 = new StringBuilder();
			qlStringC1.append(" select DISTINCT(facturas) from ( "); 
			qlStringC1.append(" select  upper(uuid) as facturas from ft_facturas_sup where upper(uuid)in (  ");
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(" ) union all ");
			qlStringC1.append(" select upper(attribute14) as facturas from ap_invoices_all where upper(attribute14) in( ");
			qlStringC1.append(qlStringvalores.toString());
			qlStringC1.append(") )");
			
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

	
	
}
