package mx.com.mtlsa.billing.utils.txt;

import java.util.List;

import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
import mx.com.mtlsa.billing.utils.Constantes;

public class GenerarStringImpuesto {

	public static StringBuilder facturaImpuesto(List<EspecOrdLineImpuestoCfdTxtDTO> listFacImpuesto) {

		StringBuilder getFacturaImpuesto = new StringBuilder();
		try {
			
			getFacturaImpuesto.append(Constantes.SIG_NEG);
			for(EspecOrdLineImpuestoCfdTxtDTO facImpuesto:listFacImpuesto) {
				
				getFacturaImpuesto.append(facImpuesto.getImpuestoTipoImpuesto() != null ? facImpuesto.getImpuestoTipoImpuesto() :"" );
				getFacturaImpuesto.append(Constantes.PIPE);
				getFacturaImpuesto.append(facImpuesto.getImpuestoDescripcion() != null ? facImpuesto.getImpuestoDescripcion() :"" );
				getFacturaImpuesto.append(Constantes.PIPE);
				getFacturaImpuesto.append(facImpuesto.getImpuestoMontoImporte() != null ? facImpuesto.getImpuestoMontoImporte() :"" );
				getFacturaImpuesto.append(Constantes.PIPE);
				getFacturaImpuesto.append(facImpuesto.getImpuestoTasa() != null ? facImpuesto.getImpuestoTasa() :"");
				getFacturaImpuesto.append(Constantes.PIPE);
				getFacturaImpuesto.append(facImpuesto.getTipoFactor()!= null ? facImpuesto.getTipoFactor() :"");
				getFacturaImpuesto.append(Constantes.SALTO_LINEA);
				
			}
			
			
			
		
		} catch (Exception e) {
			System.out.println("Error generacion stringBuilder facturaImpuesto " + e);
		}
		
		return getFacturaImpuesto;
	}
}
