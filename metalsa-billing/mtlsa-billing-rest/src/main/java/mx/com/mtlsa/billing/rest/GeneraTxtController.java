
package mx.com.mtlsa.billing.rest;

//import mx.com.ferromex.PropertiesReader;
//import mx.com.ferromex.dto.ErrorDTO;
//import mx.com.ferromex.dto.TrackDTO;
//import mx.com.ferromex.dto.YardDTO;
//import mx.com.ferromex.dto.reponse.TrackResponse;
//import mx.com.ferromex.dto.reponse.ZoneResponse;
//import mx.com.ferromex.exceptions.ServiceException;
//import mx.com.ferromex.service.TrackService;
//import mx.com.ferromex.util.parse.JsonParse;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.config.Configurator;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaPagosTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtPagos;
import mx.com.mtlsa.billing.service.GeneraTxtService;

import java.util.ArrayList;
import java.util.List;

/**
 * <<Poner la descripcion del servicio.>>
 *
 * @author <<Miguel Angel Velazquez Escalante>>
 * @version <<1.0.0>>
 * @since <<13-nov-2020>>
 */
@Path("/")
//@Secured
public class GeneraTxtController {
    //private static final Logger LOGGER = LogManager.getLogger(GeneraTxtController.class.getName());
    @Inject
     GeneraTxtService generaTxtService;
    
    @Inject
    GeneraTxtPagos generaTxtPagos;
//    private TrackService service;

    /*
     * Estos campos comentados son para enlazar los recursos administrados por
     * Weblogic, descomentar lo que se vayan a usar y editar su JNDI. En el caso de
     * los objeto de JMS son para enviar notificaciones de eventos de forma
     * asincrona.
     */
    // @Resource(mappedName="JDBC/DATASOURCE")
    // private DataSource datasource;

    /**
     * Lee las propiedades para ver el nivel de logeo que tiene el servicio.
     * Adicional se pueden agregar mas procesos que tienen que ejecutarse antes de
     * llamar a un endpoint.
     */
//    @PostConstruct
//    private void init() {
//        try {
//         //   PropertiesReader properties = new PropertiesReader();
//         //   Configurator.setRootLevel(properties.getLevel());
//         //   LOGGER.info("Se cargan las propiedades del componente.");
//        } catch (Exception e) {
//          //  LOGGER.error("No se pudo cargar las configuraciones iniciales.");
//        }
//    }

  
    @POST
    @Path("/by/facturas")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response facturas(FacElectronicaRequest request) throws Exception {
    	//LOGGER.debug(yarDto.toString());
    	EspecMsFacturaTxtDTO  espeFacElecTxtDTO = new EspecMsFacturaTxtDTO();
        try {
        	//trackService.saveYard(yarDto);
        	
        	
        	//EspecOrdEncaFacElecTxtDTO temp = new EspecOrdEncaFacElecTxtDTO();
        	//temp.setAlternateIdentificationGln("X");
        	//temp.setAnoAprobacion9("X");
        	//temp.setCalifTradingPartnerProv("X");
        	
        	espeFacElecTxtDTO = generaTxtService.getFacturaTxt(request);
        	
        	//espeFacElecTxtDTO.add(temp);
        	
           
        //} catch (ServiceException e) {
        } catch (Exception e) {
        	//LOGGER.debug(e.getMessage());
            throw new Exception(e.getMessage());
        }
        return Response.ok(espeFacElecTxtDTO).build();
    }
    
    
    
    @POST
    @Path("/by/facturaPagos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response facturaPagos(FacElectronicaRequest request) throws Exception {
    	//LOGGER.debug(yarDto.toString());
    	EspecMsFacturaPagosTxtDTO  especMsFacturaPagos = new EspecMsFacturaPagosTxtDTO();
        try {
        	//trackService.saveYard(yarDto);
        	
        	
        	//EspecOrdEncaFacElecTxtDTO temp = new EspecOrdEncaFacElecTxtDTO();
        	//temp.setAlternateIdentificationGln("X");
        	//temp.setAnoAprobacion9("X");
        	//temp.setCalifTradingPartnerProv("X");
        	
        	especMsFacturaPagos = generaTxtPagos.getFacturaPagosTxt(request);
        	
        	//espeFacElecTxtDTO.add(temp);
        	
           
        //} catch (ServiceException e) {
        } catch (Exception e) {
        	//LOGGER.debug(e.getMessage());
            throw new Exception(e.getMessage());
        }
        return Response.ok(especMsFacturaPagos).build();
    }

   
}
