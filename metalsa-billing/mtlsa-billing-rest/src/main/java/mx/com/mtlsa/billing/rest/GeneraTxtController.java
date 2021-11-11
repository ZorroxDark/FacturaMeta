package mx.com.mtlsa.billing.rest;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.request.txt.ComplementoPagoRequest;
import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.request.txt.NominaPagoRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaPagosTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsNominaTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtPagos;
import mx.com.mtlsa.billing.service.GeneraTxtService;
import mx.com.mtlsa.billing.service.GeneraTxtServiceComPago;

/**
 * <<Poner la descripcion del servicio.>>
 *
 * @author <<Miguel Angel Velazquez Escalante>>
 * @version <<1.0.0>>
 * @since <<13-nov-2020>>
 */
@Path("/")
public class GeneraTxtController {
    @Inject
    GeneraTxtService generaTxtService;
    
    @Inject
    GeneraTxtPagos generaTxtPagos;

    
    @Inject
    GeneraTxtServiceComPago generaTxtServiceComPago;


  
    @POST
    @Path("/by/facturas")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response facturas(FacElectronicaRequest request) throws Exception {
    	
    	EspecMsFacturaTxtDTO  espeFacElecTxtDTO = new EspecMsFacturaTxtDTO();
        try {
        	
        	espeFacElecTxtDTO = generaTxtService.getFacturaTxt(request);
        	
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Response.ok(espeFacElecTxtDTO).build();
    }
    
    
    
    @POST
    @Path("/by/facturaPagos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response facturaPagos(FacElectronicaRequest request) throws Exception {
    	
    	EspecMsFacturaPagosTxtDTO  especMsFacturaPagos = new EspecMsFacturaPagosTxtDTO();
        try {
        
        	
        	especMsFacturaPagos = generaTxtPagos.getFacturaPagosTxt(request);
        	
        	
        	
        } catch (Exception e) {
        	
            throw new Exception(e.getMessage());
        }
        return Response.ok(especMsFacturaPagos).build();
    }
    
    
    @POST
    @Path("/by/ComplementoPago")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response ComplementoPago(ComplementoPagoRequest request) throws Exception {
    	
    	EspecMsFacturaTxtDTO  espeComplePagoTxtDTO = new EspecMsFacturaTxtDTO();
        try {

        	espeComplePagoTxtDTO = generaTxtServiceComPago.getComplementoPago(request);
        	

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Response.ok(espeComplePagoTxtDTO).build();
    }
    
    
    
    @POST
    @Path("/by/NominaPagos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response nominaPago(NominaPagoRequest request) throws Exception {
    	
    	EspecMsNominaTxtDTO  espeNominaPagoTxtDTO = new EspecMsNominaTxtDTO();
    	
        try {

        	espeNominaPagoTxtDTO = generaTxtServiceComPago.getNominaPago(request);
        	

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Response.ok(espeNominaPagoTxtDTO).build();
    }
   
}
