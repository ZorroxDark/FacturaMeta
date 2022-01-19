package mx.com.mtlsa.billing.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.service.CatalogoService;

public class CatalogoContactoController {
	
	
	@Inject
    CatalogoService getCatalogoService;
	
	
	@POST
    @Path("/getContactos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getContactos(CatContactoRequest request) throws Exception {
    	
 		List<CatContactoRequest>  listcatContacto = new ArrayList<CatContactoRequest>();
 		
        try {
        	
        	listcatContacto = getCatalogoService.getCatContacto(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(listcatContacto).build();
    }
	

	/*
	@POST
    @Path("/insertContactos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response insertContactos(CatContactoRequest request) throws Exception {
    	
 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
 		
        try {
        	
        	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(guaCerSucResponse).build();
    }
	

	@POST
    @Path("/updateContactos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateContactos(CatContactoRequest request) throws Exception {
    	
 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
 		
        try {
        	
        	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(guaCerSucResponse).build();
    }
	
	
	@POST
    @Path("/deleteContactos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteContactos(CatContactoRequest request) throws Exception {
    	
 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
 		
        try {
        	
        	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(guaCerSucResponse).build();
    }*/
	

}
