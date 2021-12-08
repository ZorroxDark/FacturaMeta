package mx.com.mtlsa.billing.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.request.txt.FacturaPagoRequest;
import mx.com.mtlsa.billing.dto.request.txt.GenerarTokenSucRequest;
import mx.com.mtlsa.billing.dto.request.txt.GuardarCertificadoSucRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaPagosTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.GenerarTokenSUCResponse;
import mx.com.mtlsa.billing.dto.response.txt.GuardarCertificadoSucResponse;

public class CancelacionController {
	
	
	
	 	@POST
	    @Path("/GuardarCertificadoSUC")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response guardarCertificadoSUC(GuardarCertificadoSucRequest request) throws Exception {
	    	
	 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
	 		
	        try {
	        	
	        	//especMsFacturaPagos = generaTxtPagos.getFacturaPagosTxt(request);
	        	
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
	        	
	        	//especMsFacturaPagos = generaTxtPagos.getFacturaPagosTxt(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(generarTokenSUCResponse).build();
	    }
	 	
	 	
	 	@POST
	    @Path("/ConsultarCancelacionesReceptorSUC")
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response consultarCancelacionesReceptorSUC(FacturaPagoRequest request) throws Exception {
	    	
	    	EspecMsFacturaPagosTxtDTO  especMsFacturaPagos = new EspecMsFacturaPagosTxtDTO();
	        try {
	        	
	        	//especMsFacturaPagos = generaTxtPagos.getFacturaPagosTxt(request);
	        	
	        } catch (Exception e) {
	        	
	            throw new Exception(e.getMessage());
	        }
	        return Response.ok(especMsFacturaPagos).build();
	    }
	 	
	 	

}
