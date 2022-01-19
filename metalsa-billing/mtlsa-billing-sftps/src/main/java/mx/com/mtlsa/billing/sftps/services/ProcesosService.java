package mx.com.mtlsa.billing.sftps.services;

import mx.com.mtlsa.billing.sftps.dto.GuardadoDTO;

public interface ProcesosService {

	
	GuardadoDTO guardarSftpToRutaFacturas();
	GuardadoDTO guardarSftpToRutaNomina();
	GuardadoDTO guardarSftpToRutaFacturasError();
	GuardadoDTO guardarSftpToRutaNominaError();
	
	
}
