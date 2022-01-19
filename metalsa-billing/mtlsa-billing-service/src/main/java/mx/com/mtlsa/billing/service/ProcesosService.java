package mx.com.mtlsa.billing.service;

import mx.com.mtlsa.billing.dto.response.txt.ProcesoGuardadoDTO;

public interface ProcesosService {

	
	ProcesoGuardadoDTO guardarSftpToRutaFacturas();
	ProcesoGuardadoDTO guardarSftpToRutaNomina();
	ProcesoGuardadoDTO guardarSftpToRutaFacturasError();
	ProcesoGuardadoDTO guardarSftpToRutaNominaError();
	
	
}
