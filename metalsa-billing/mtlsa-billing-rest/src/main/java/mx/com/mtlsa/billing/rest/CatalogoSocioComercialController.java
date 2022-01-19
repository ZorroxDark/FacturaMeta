package mx.com.mtlsa.billing.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;
import mx.com.mtlsa.billing.service.CatalogoService;

public class CatalogoSocioComercialController {
	
	@Inject
    CatalogoService getCatalogoService;
	
	@POST
    @Path("/getSocioComercial")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getSocioComercial(CatSocioComercialRequest request) throws Exception {
    	
 		List<CatSocioComercialRequest>  listcatContacto = new ArrayList<CatSocioComercialRequest>();
 		
        try {
        	
        	listcatContacto = getCatalogoService.getCatSocioComercial(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(listcatContacto).build();
    }

	
	/*
	@POST
    @Path("/insertSocioComercial")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response insertSocioComercial(GuardarCertificadoSucRequest request) throws Exception {
    	
 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
 		
        try {
        	
        	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(guaCerSucResponse).build();
    }
	
	
	@POST
    @Path("/deleteSocioComercial")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteSocioComercial(GuardarCertificadoSucRequest request) throws Exception {
    	
 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
 		
        try {
        	
        	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(guaCerSucResponse).build();
    }
	
	@POST
    @Path("/updateSocioComercial")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateSocioComercial(GuardarCertificadoSucRequest request) throws Exception {
    	
 		GuardarCertificadoSucResponse  guaCerSucResponse = new GuardarCertificadoSucResponse();
 		
        try {
        	
        	guaCerSucResponse = cancelacionesService.getGuardarCertificadoSUC(request);
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(guaCerSucResponse).build();
    }
 	*/
	
	
 	
	
	
}
