package mx.com.mtlsa.billing.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;

@Path("/")
public class ProcesosController {
	
		@Path("/GuardarSftpToRutaFacturas")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response guardarSftpToRutaFacturas(GuardarCertificadoSucRequest request) throws Exception {
	    	
	 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
	 		
	        try {
	        	
	        //	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(guaCerSucResponse).build();
	    }

		@Path("/GuardarSftpToRutaNomina")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response guardarSftpToRutaNomina(GuardarCertificadoSucRequest request) throws Exception {
	    	
	 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
	 		
	        try {
	        	
	        //	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(guaCerSucResponse).build();
	    }
}
