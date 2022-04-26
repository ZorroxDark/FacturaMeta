package mx.com.mtlsa.billing.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import mx.com.mtlsa.billing.dto.request.txt.AceptarRechazarRecSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConRelacionadoRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultaCancelacionRequest;
import mx.com.mtlsa.billing.dto.request.txt.ConsultarCancelaReceptorSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.SolicitudCancelacionRequest;
import mx.com.mtlsa.billing.dto.request.txt.ValidarUUIDSRequest;
import mx.com.mtlsa.billing.dto.response.txt.AceptarRechazarRecSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConRelacionadoResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultaCancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaReceptorSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;
import mx.com.mtlsa.billing.dto.response.txt.RespuestaCancelacionV40;
import mx.com.mtlsa.billing.dto.response.txt.SolicitarCancelacionResponse;
import mx.com.mtlsa.billing.dto.response.txt.ValidarUUID40Response;
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
	    	
			AceptarRechazarRecSucResponse  aceptarRecSucResponse = new AceptarRechazarRecSucResponse();

	        try {
	        	
	        	aceptarRecSucResponse = cancelacionesService.getAceptarRechazarRecSuc(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(aceptarRecSucResponse).build();
	    }
		
		
		//Clientes
		@POST
	    @Path("/ValidarUUID")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response validarUUID(ValidarUUIDSRequest request) throws Exception {
	    	
			ValidarUUID40Response  validarUUIDSUCV40Res = new ValidarUUID40Response();
	 		
	        try {
	        	
	        	validarUUIDSUCV40Res = cancelacionesService.getValidarUUIDSUC(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(validarUUIDSUCV40Res).build();
	    }
	 	
		//Clientes
		@POST
	    @Path("/ConsultarUUIDRelacionadosSUC")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response consultaRelacionados(ConRelacionadoRequest request) throws Exception {
	    	
			ConRelacionadoResponse  conRelacionadoResponse = new ConRelacionadoResponse();
	 		
		       
	        try {
	        	
	        	conRelacionadoResponse = cancelacionesService.getConsultaRelacionado(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(conRelacionadoResponse).build();
	    }
		
		
		//Clientes
		@POST
	    @Path("/CancelarDocumentos")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response cancelarDocumentosXML(SolicitudCancelacionRequest request) throws Exception {
	    	
			SolicitarCancelacionResponse  solCancelacionResponse = new SolicitarCancelacionResponse();
	 		
	 		
	        try {
	        	
	        	solCancelacionResponse = cancelacionesService.getSolicitaCancelacionV40(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(solCancelacionResponse).build();
	    }
		
				
		 @GET
		 @Path(value = "/CancelarDocumentosSenchaGet")
		 @Produces({MediaType.APPLICATION_OCTET_STREAM,MediaType.APPLICATION_JSON})
		 public void getCancelarDocumentosSencha(
				 @QueryParam(value = "callback1")  String callback, 
				 @QueryParam(value = "request")  String  request) {
		               try {
		            	   JSONObject jsonObj = new JSONObject(); 
		                   
		            	    System.out.println("Entra a -----------");
		                    
		                    
		                    System.out.println("Inicio ");
		                    System.out.println(callback );
		                    System.out.println("Request ");
		                    System.out.println(request );
		                    
		                    callback=request;
		                    
		                    String  resJ = callback +  "(" + jsonObj.toString() + ")";
		                    
		                    Response res = Response.ok(resJ, MediaType.APPLICATION_JSON).status(Response.Status.ACCEPTED).build();
		                } catch (Exception ex) {
		                    try {
		                        JSONObject jsonObj = new JSONObject(); 
		                        jsonObj.put("success", false);
		                       
		                        String  resJ = callback +  "(" + jsonObj.toString() + ")";
		                        Response res = Response.ok(resJ, MediaType.APPLICATION_JSON).status(Response.Status.ACCEPTED).build();
		                       
		                    } catch (Exception e){
		                        e.printStackTrace();
		                    }
		                }
		            }
		    
		    
		
		@POST
	    @Path("/ConsultarEstatusAcuse")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response consultarEstatusAcuse(ConsultaCancelacionRequest request) throws Exception {
	    	
			ConsultaCancelacionResponse cancelacionesAcuse = new ConsultaCancelacionResponse();
	 																							
	        try {
	        	
	        	cancelacionesAcuse = cancelacionesService.getConsultarCancelacionesAcuse(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(cancelacionesAcuse).build();
	    }
	 	
	 	

}
