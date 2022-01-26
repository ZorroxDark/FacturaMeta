package mx.com.mtlsa.billing.sftps;

import java.util.Date;

import javax.inject.Inject;

import mx.com.mtlsa.billing.sftps.dto.GuardadoDTO;
import mx.com.mtlsa.billing.sftps.services.ProcesosImpl;
import mx.com.mtlsa.billing.sftps.services.ProcesosService;

public class EjecutaProceso {
	
	@Inject
	static
	ProcesosService proService ;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// tipo ( factura, nomina)
		try {
			
		GuardadoDTO respuesta = new GuardadoDTO();
		msjInicio(args);
		ProcesosService proService = new  ProcesosImpl();
		
		
		respuesta = proService.guardarSftpToRutaFacturas();
		
		
		}catch(Exception e ) {
			System.out.println("Error -> "+e);
		}
		
	}
	
	public static void msjInicio (String[] param) {
		System.out.println("Incia :  mtlsa-billing-sftps ");
		System.out.println("Fecha ejecucion :  "+ new Date());
		
		System.out.println("Imprimo parametros enviados ");
		
		int vParam=1;
		for(String tmp:param) {
			System.out.println("Parametro ["+vParam+"] : "+tmp);
			vParam++;
		}
		
		
		System.out.println("Total : "+param.length);
		
		
		
	}
	

}
