package mx.com.mtsla.billing.dao.map;

import java.util.ArrayList;
import java.util.List;

import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;

public class MapEspecOrdLineImpuesto {
	
public static List<EspecOrdLineImpuestoCfdTxtDTO> especOrdLineImpuesto(List<Object[]> objectList) {

		
		List<EspecOrdLineImpuestoCfdTxtDTO> listLineImpuesto = new ArrayList<EspecOrdLineImpuestoCfdTxtDTO>();
		
		
		if (objectList != null) {

			try {

				System.out.println("CREA OBJETO mapEspecOrdLineImpuesto  ..");

				// hacer validacion si viene nulo

				for (Object[] respuesta : objectList) {
					
					EspecOrdLineImpuestoCfdTxtDTO especOrdLineImpuesto = new EspecOrdLineImpuestoCfdTxtDTO();
					
					especOrdLineImpuesto.setImpuestoTipoImpuesto(null != respuesta[0] ? respuesta[0].toString().trim():"");
					especOrdLineImpuesto.setImpuestoDescripcion(null != respuesta[1] ? respuesta[1].toString().trim():"");
					especOrdLineImpuesto.setImpuestoMontoImporte(null != respuesta[2] ? respuesta[2].toString().trim():"");
					especOrdLineImpuesto.setImpuestoTasa(null != respuesta[3] ? respuesta[3].toString().trim():"");
					especOrdLineImpuesto.setTipoFactor(null != respuesta[4] ? respuesta[4].toString().trim():"");
					
					
					listLineImpuesto.add(especOrdLineImpuesto);
					
				}
				
				

			} catch (Exception e) {
				System.out.println("Error mapEspecOrdLineImpuesto " + e);
			}

		}

		return listLineImpuesto;

	}

}
