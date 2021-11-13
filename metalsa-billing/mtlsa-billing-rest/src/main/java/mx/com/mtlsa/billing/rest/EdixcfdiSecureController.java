package mx.com.mtlsa.billing.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.ReceiveCFDRequest;
import mx.com.mtlsa.billing.dto.ReceiveCFDResponse;
import mx.com.mtlsa.billing.service.impl.WSCFDIBuilderPlusImpl;

/**
 * <<Poner la descripcion del servicio.>>
 *
 * @author <<Miguel Angel Velazquez Escalante>>
 * @version <<1.0.0>>
 * @since <<13-nov-2020>>
 */
@Path("/edixc")
public class EdixcfdiSecureController {
	
	@POST
    @Path("/getReceiveCFD")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getReceiveCFD(ReceiveCFDRequest request) throws Exception {
    	//LOGGER.debug(yarDto.toString());
		ReceiveCFDResponse respuesta = new ReceiveCFDResponse();
		
	    try {
        	//trackService.saveYard(yarDto);
	    	
	    	WSCFDIBuilderPlusImpl wSCFDIBuilder = new WSCFDIBuilderPlusImpl();
	    	respuesta= wSCFDIBuilder.getReceiveCFD(request);
        	
           
        //} catch (ServiceException e) {
        } catch (Exception e) {
        	//LOGGER.debug(e.getMessage());
            throw new Exception(e.getMessage());
        }
        return Response.ok(respuesta).build();
    }

}
