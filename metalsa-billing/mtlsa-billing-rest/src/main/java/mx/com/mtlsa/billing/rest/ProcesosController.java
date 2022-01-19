package mx.com.mtlsa.billing.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.response.txt.ProcesoGuardadoDTO;
import mx.com.mtlsa.billing.service.ProcesosService;

@Path("/")
public class ProcesosController {
	
		@Inject
		ProcesosService procService;
	
		@Path("/saveSftpToRutaFacturas")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response saveSftpToRutaFacturas() throws Exception {
	    	
			ProcesoGuardadoDTO  getProGuardadoDTO = new ProcesoGuardadoDTO();
	 		
	        try {
	        	
	        	getProGuardadoDTO = procService.guardarSftpToRutaFacturas();
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(getProGuardadoDTO).build();
	    }

		@Path("/saveSftpToRutaNomina")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response saveSftpToRutaNomina() throws Exception {
	    	
			ProcesoGuardadoDTO  getProGuardadoDTO = new ProcesoGuardadoDTO();
	 		
	        try {
	        	
	        //	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(getProGuardadoDTO).build();
	    }
		
		
		
		@Path("/saveSftpToRutaFacturasError")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response saveSftpToRutaFacturasError() throws Exception {
	    	
			ProcesoGuardadoDTO  getProGuardadoDTO = new ProcesoGuardadoDTO();
	 		
	        try {
	        	
	        //	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(getProGuardadoDTO).build();
	    }
		
		
		@Path("/saveSftpToRutaNominaError")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response saveSftpToRutaNominaError() throws Exception {
	    	
			ProcesoGuardadoDTO  getProGuardadoDTO = new ProcesoGuardadoDTO();
	 		
	        try {
	        	
	        //	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(getProGuardadoDTO).build();
	    }
		
		
}
