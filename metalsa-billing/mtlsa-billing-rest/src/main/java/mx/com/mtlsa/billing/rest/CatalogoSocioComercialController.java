package mx.com.mtlsa.billing.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.MensajeDTO;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;
import mx.com.mtlsa.billing.service.CatalogoService;

@Path("/")
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

	
	
	@POST
    @Path("/insertSocioComercial")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response insertSocioComercial(CatSocioComercialRequest request) throws Exception {
    	
		MensajeDTO  mensajeRespuesta = new MensajeDTO();
 		
        try {
        	
        	mensajeRespuesta = getCatalogoService.insertCatSocioComercial(request);
        	
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Response.ok(mensajeRespuesta).build();
    }
	
	
	@PUT
    @Path("/updateSocioComercial")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateSocioComercial(CatSocioComercialRequest request) throws Exception {
    	
		MensajeDTO  mensajeRespuesta = new MensajeDTO();
 		
        try {
        	
        	mensajeRespuesta = getCatalogoService.putCatSocioComercial(request);
        	
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Response.ok(mensajeRespuesta).build();
    }
 	
	
	
	@DELETE
    @Path("/deleteSocioComercial")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteSocioComercial(CatSocioComercialRequest request) throws Exception {
    	
		MensajeDTO  mensajeRespuesta = new MensajeDTO();
 		
        try {
        	
        	mensajeRespuesta = getCatalogoService.deleteCatSocioComercial(request);
        	
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Response.ok(mensajeRespuesta).build();
    }
	
	
	
 	
	
	
}
