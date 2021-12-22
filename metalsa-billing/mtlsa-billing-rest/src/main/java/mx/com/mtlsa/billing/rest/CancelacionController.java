package mx.com.mtlsa.billing.rest;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.request.txt.AceptarRechazarRecSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultarCancelaReceptorSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;
import mx.com.mtlsa.billing.service.CancelacionesService;


@Path("/")
public class CancelacionController {
	
	 @Inject
	 CancelacionesService cancelacionesService;
	
	
	 	@POST
	    @Path("/GuardarCertificadoSUC")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response guardarCertificadoSUC(GuardarCertificadoSucRequest request) throws Exception {
	    	
	 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
	 		
	        try {
	        	
	        	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(guaCerSucResponse).build();
	    }
	 	
	 	
	 	@POST
	    @Path("/GenerarTokenSUC")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response generarTokenSUC(GenerarTokenSucRequest request) throws Exception {
	    	
	 		GenerarTokenSUCResponse  generarTokenSUCResponse = new GenerarTokenSUCResponse();
	 		
	 	    try {
	        	
	        	generarTokenSUCResponse =  cancelacionesService.getGenerarTokenSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(generarTokenSUCResponse).build();
	    }
	 	
	 	
	 	@POST
	    @Path("/ConsultarCancelacionesReceptorSUC")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response consultarCancelacionesReceptorSUC(ConsultarCancelaReceptorSucRequest request) throws Exception {
	    	
	 		ConsultarCancelaReceptorSucResponse  consultaCancRecSucRes = new ConsultarCancelaReceptorSucResponse();
	 		
		       
	        try {
	        	
	        	consultaCancRecSucRes = cancelacionesService.getConsultarCancelacionesReceptorSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(consultaCancRecSucRes).build();
	    }
	 	
	 	
		@POST
	    @Path("/AceptarRechazarReceptorSUC")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response aceptarRechazarReceptorSUC(AceptarRechazarRecSucRequest request) throws Exception {
	    	
	 		ConsultarCancelaReceptorSucResponse  consultaCancRecSucRes = new ConsultarCancelaReceptorSucResponse();
	 		
		       
	        try {
	        	
	        	//consultaCancRecSucRes = cancelacionesService.getConsultarCancelacionesReceptorSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(consultaCancRecSucRes).build();
	    }
	 	
	 	
	 	

}
