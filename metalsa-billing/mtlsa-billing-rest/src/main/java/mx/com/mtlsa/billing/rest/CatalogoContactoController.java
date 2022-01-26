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
import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.service.CatalogoService;


@Path("/")
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
	


	@POST
    @Path("/insertContactos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response insertContactos(CatContactoRequest request) throws Exception {
    	
		MensajeDTO  mensajeRespuesta = new MensajeDTO();
 		
        try {
        	
        	mensajeRespuesta = getCatalogoService.insertCatContacto(request);
        	
        } catch (Exception e) {
        	throw new Exception(e.getMessage());
        }
        return Response.ok(mensajeRespuesta).build();
    }
	

	@PUT
    @Path("/updateContactos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateContactos(CatContactoRequest request) throws Exception {
    	
		MensajeDTO  mensajeRespuesta = new MensajeDTO();
 		
        try {
        	
        	mensajeRespuesta = getCatalogoService.putCatContacto(request);
        	
        } catch (Exception e) {
        	throw new Exception(e.getMessage());
        }
        return Response.ok(mensajeRespuesta).build();
    }
	
	
	@DELETE
    @Path("/deleteContactos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteContactos(CatContactoRequest request) throws Exception {
    	
		MensajeDTO  mensajeRespuesta = new MensajeDTO();
 		
        try {
        	
        	mensajeRespuesta = getCatalogoService.deleteCatContacto(request);
        	
        } catch (Exception e) {
        	throw new Exception(e.getMessage());
        }
        return Response.ok(mensajeRespuesta).build();
    }
	

}
