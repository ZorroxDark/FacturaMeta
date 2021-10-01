package mx.com.mtsla.billing.dao.map;

import java.util.ArrayList;
import java.util.List;

import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;

public class MapEstrucSecAuxComplePagoTxtDTO {
	
public static EstrucSecAuxComplePagoTxtDTO estrucSecAuxComplePago(List<Object[]> objectList){
		

		EstrucSecAuxComplePagoTxtDTO auxComplePago = new EstrucSecAuxComplePagoTxtDTO();
		
		
		if (objectList != null) {

			try {

				
				System.out.println("ENTRA a objectListaTxtLeyeda  ..");

				// hacer validacion si viene nulo

				for (Object[] respuesta : objectList) {
					
					
				
					
					auxComplePago.setDetalleAuxTipo(null != respuesta[0] ? respuesta[0].toString().trim():"");
					auxComplePago.setDetalleAuxDescTipo(null != respuesta[1] ? respuesta[1].toString().trim():"");
					auxComplePago.setDetalleAuxMisc01(null != respuesta[2] ? respuesta[2].toString().trim():"");
					auxComplePago.setDetalleAuxMisc02(null != respuesta[3] ? respuesta[3].toString().trim():"");
					auxComplePago.setDetalleAuxMisc03(null != respuesta[4] ? respuesta[4].toString().trim():"");
					
					auxComplePago.setDetalleAuxMisc04(null != respuesta[5] ? respuesta[5].toString().trim():"");
					auxComplePago.setDetalleAuxMisc05(null != respuesta[6] ? respuesta[6].toString().trim():"");
					auxComplePago.setDetalleAuxMisc06(null != respuesta[7] ? respuesta[7].toString().trim():"");
					auxComplePago.setDetalleAuxMisc07(null != respuesta[8] ? respuesta[8].toString().trim():"");
					auxComplePago.setDetalleAuxMisc08(null != respuesta[9] ? respuesta[9].toString().trim():"");
						
					auxComplePago.setDetalleAuxMisc09(null != respuesta[10] ? respuesta[10].toString().trim():"");
					auxComplePago.setDetalleAuxMisc10(null != respuesta[11] ? respuesta[11].toString().trim():"");
					auxComplePago.setDetalleAuxMisc11(null != respuesta[12] ? respuesta[12].toString().trim():"");
					auxComplePago.setDetalleAuxMisc12(null != respuesta[13] ? respuesta[13].toString().trim():"");
					auxComplePago.setDetalleAuxMisc13(null != respuesta[14] ? respuesta[14].toString().trim():"");
					auxComplePago.setDetalleAuxMisc14(null != respuesta[15] ? respuesta[15].toString().trim():"");
					auxComplePago.setDetalleAuxMisc15(null != respuesta[16] ? respuesta[16].toString().trim():"");
					auxComplePago.setDetalleAuxMisc16(null != respuesta[17] ? respuesta[17].toString().trim():"");
			
					
					
					
				}
				
				

			} catch (Exception e) {
				System.out.println("Error objectListaTxtLeyeda " + e);
			}

		}

		return auxComplePago;
		
		
		
	}


	public static List<EstrucSecAuxComplePagoTxtDTO> estrucSecAuxPagosComplePago(List<Object[]> objectList){
		
	
		List<EstrucSecAuxComplePagoTxtDTO> listAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
		
		
		if (objectList != null) {
	
			try {
	
				
				System.out.println("ENTRA a MapEstrucSecAuxPagosComplePagoTxtDTO  ..");
	
				// hacer validacion si viene nulo
	
				for (Object[] respuesta : objectList) {
					
					EstrucSecAuxComplePagoTxtDTO auxComplePago = new EstrucSecAuxComplePagoTxtDTO();
				
					
					auxComplePago.setDetalleAuxTipo(null != respuesta[0] ? respuesta[0].toString().trim():"");
					auxComplePago.setDetalleAuxDescTipo(null != respuesta[1] ? respuesta[1].toString().trim():"");
					auxComplePago.setDetalleAuxMisc01(null != respuesta[2] ? respuesta[2].toString().trim():"");
					auxComplePago.setDetalleAuxMisc02(null != respuesta[3] ? respuesta[3].toString().trim():"");
					auxComplePago.setDetalleAuxMisc03(null != respuesta[4] ? respuesta[4].toString().trim():"");
					
					auxComplePago.setDetalleAuxMisc04(null != respuesta[5] ? respuesta[5].toString().trim():"");
					auxComplePago.setDetalleAuxMisc05(null != respuesta[6] ? respuesta[6].toString().trim():"");
					auxComplePago.setDetalleAuxMisc06(null != respuesta[7] ? respuesta[7].toString().trim():"");
					auxComplePago.setDetalleAuxMisc07(null != respuesta[8] ? respuesta[8].toString().trim():"");
					auxComplePago.setDetalleAuxMisc08(null != respuesta[9] ? respuesta[9].toString().trim():"");
						
					auxComplePago.setDetalleAuxMisc09(null != respuesta[10] ? respuesta[10].toString().trim():"");
					auxComplePago.setDetalleAuxMisc10(null != respuesta[11] ? respuesta[11].toString().trim():"");
					auxComplePago.setDetalleAuxMisc11(null != respuesta[12] ? respuesta[12].toString().trim():"");
					auxComplePago.setDetalleAuxMisc12(null != respuesta[13] ? respuesta[13].toString().trim():"");
					auxComplePago.setDetalleAuxMisc13(null != respuesta[14] ? respuesta[14].toString().trim():"");
					auxComplePago.setDetalleAuxMisc14(null != respuesta[15] ? respuesta[15].toString().trim():"");
					auxComplePago.setDetalleAuxMisc15(null != respuesta[16] ? respuesta[16].toString().trim():"");
					auxComplePago.setDetalleAuxMisc16(null != respuesta[17] ? respuesta[17].toString().trim():"");
					
					
					listAuxComplePago.add(auxComplePago);
					
					
					
				}
				
				
	
			} catch (Exception e) {
				System.out.println("Error MapEstrucSecAuxPagosComplePagoTxtDTO " + e);
			}
	
		}
	
		return listAuxComplePago;
		
		
		
	}


}
