package mx.com.mtlsa.billing.soap;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtService;

@Stateless
@WebService(endpointInterface = "mx.com.mtlsa.billing.soap.GeneraTxtServiceWS")
public class GeneraTxtServiceImp implements GeneraTxtServiceWS {
	  @Inject
	     GeneraTxtService generaTxtService;
	

    @Override
    public List<EspecOrdEncaFacElecTxtDTO> facturas(FacElectronicaRequest request) throws Exception {
     	//LOGGER.debug(yarDto.toString());
   	 List<EspecOrdEncaFacElecTxtDTO> espeFacElecTxtDTO = new ArrayList<EspecOrdEncaFacElecTxtDTO>();
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
        return espeFacElecTxtDTO;
    }

}
