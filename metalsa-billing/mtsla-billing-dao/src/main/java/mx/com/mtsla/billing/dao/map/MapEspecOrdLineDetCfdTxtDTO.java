package mx.com.mtsla.billing.dao.map;

import java.util.ArrayList;
import java.util.List;

import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdVarLineAduanaCfdTxtDTO;

public class MapEspecOrdLineDetCfdTxtDTO {
	
public static List<EspecOrdLineDetCfdTxtDTO>  especOrdLineDetalle(List<Object[]> objectList) {

		
		List<EspecOrdLineDetCfdTxtDTO> listLineDetTemp = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
		
		
		
		if (objectList != null) {

			try {

				System.out.println("CREA OBJETO mapEspecOrdLineDetCfdTxtDTO  ..");

				// hacer validacion si viene nulo

				for (Object[] respuesta : objectList) {
					
					EspecOrdLineDetCfdTxtDTO detCfd = new EspecOrdLineDetCfdTxtDTO();
		        	
					detCfd.setLineaDescripcion(null != respuesta[0] ? respuesta[0].toString().trim():"");
					detCfd.setLineaCantidad(null != respuesta[1] ? respuesta[1].toString().trim():"");
					detCfd.setLineaUnidad(null != respuesta[2] ? respuesta[2].toString().trim():"");
					detCfd.setLineaPrecioUnitario(null != respuesta[3] ? respuesta[3].toString().trim():"");
					detCfd.setLineaImporte(null != respuesta[4] ? respuesta[4].toString().trim():"");
					detCfd.setLineaAduanaNumDoc(null != respuesta[5] ? respuesta[5].toString().trim():"");
					detCfd.setLineaAduanaFechaDoc(null != respuesta[6] ? respuesta[6].toString().trim():"");
					detCfd.setLineaAduanaNombre(null != respuesta[7] ? respuesta[7].toString().trim():"");
					detCfd.setLineaCuentaPredialNumero(null != respuesta[8] ? respuesta[8].toString().trim():"");
					detCfd.setLineaFraccionArancelaria(null != respuesta[9] ? respuesta[9].toString().trim():"");
						
					detCfd.setLineaNotas(null != respuesta[10] ? respuesta[10].toString().trim():"");
					detCfd.setLineaCodUPC(null != respuesta[11] ? respuesta[11].toString().trim():"");
					detCfd.setLineaPiezasEmpaque(null != respuesta[12] ? respuesta[12].toString().trim():"");
					detCfd.setLineaCodDUN(null != respuesta[13] ? respuesta[13].toString().trim():"");
					detCfd.setLineaCodBarras(null != respuesta[14] ? respuesta[14].toString().trim():"");
					detCfd.setLineaCodArticulo(null != respuesta[15] ? respuesta[15].toString().trim():"");
					detCfd.setLineaCodDesc(null != respuesta[16] ? respuesta[16].toString().trim():"");
					detCfd.setLineaPorcDesc(null != respuesta[17] ? respuesta[17].toString().trim():"");
					detCfd.setLineaMontoDesc(null != respuesta[18] ? respuesta[18].toString().trim():"");
					detCfd.setLineaPrecioUnitarioSinDesc(null != respuesta[19] ? respuesta[19].toString().trim():"");
					
					detCfd.setLineaCantEmpaquesFac(null != respuesta[20] ? respuesta[20].toString().trim():"");
					detCfd.setLineaCantEmpaquesEmb(null != respuesta[21] ? respuesta[21].toString().trim():"");
					detCfd.setLineaPorcIVA(null != respuesta[22] ? respuesta[22].toString().trim():"");
					detCfd.setLineaMontoIVA(null != respuesta[23] ? respuesta[23].toString().trim():"");
					detCfd.setLineaPorcIEPS(null != respuesta[24] ? respuesta[24].toString().trim():"");
					detCfd.setLineaMontoIEPS(null != respuesta[25] ? respuesta[25].toString().trim():"");
					detCfd.setLineaPrecioUnitarioConImp(null != respuesta[26] ? respuesta[26].toString().trim():"");
					detCfd.setLineaImporteConImp(null != respuesta[27] ? respuesta[27].toString().trim():"");
					detCfd.setLineaFrontera(null != respuesta[28] ? respuesta[28].toString().trim():"");
					detCfd.setLineaPaisOrigen(null != respuesta[29] ? respuesta[29].toString().trim():"");
				
					detCfd.setLineaEANAduana(null != respuesta[30] ? respuesta[30].toString().trim():"");
					detCfd.setLineaMisc01(null != respuesta[31] ? respuesta[31].toString().trim():"");
					detCfd.setLineaMisc02(null != respuesta[32] ? respuesta[32].toString().trim():"");
					detCfd.setLineaMisc03(null != respuesta[33] ? respuesta[33].toString().trim():"");
					detCfd.setLineaMisc04(null != respuesta[34] ? respuesta[34].toString().trim():"");
					detCfd.setLineaMisc05(null != respuesta[35] ? respuesta[35].toString().trim():"");
					detCfd.setLineaMisc06(null != respuesta[36] ? respuesta[36].toString().trim():"");
					detCfd.setLineaMisc07(null != respuesta[37] ? respuesta[37].toString().trim():"");
					detCfd.setLineaMisc08(null != respuesta[38] ? respuesta[38].toString().trim():"");
					detCfd.setLineaMisc09(null != respuesta[39] ? respuesta[39].toString().trim():"");
					
					detCfd.setLineaMisc10(null != respuesta[40] ? respuesta[40].toString().trim():"");
					detCfd.setLineaMisc11(null != respuesta[41] ? respuesta[41].toString().trim():"");
					detCfd.setLineaMisc12(null != respuesta[42] ? respuesta[42].toString().trim():"");
					detCfd.setLineaMisc13(null != respuesta[43] ? respuesta[43].toString().trim():"");
					detCfd.setLineaMisc14(null != respuesta[44] ? respuesta[44].toString().trim():"");
					detCfd.setLineaMisc15(null != respuesta[45] ? respuesta[45].toString().trim():"");
					detCfd.setLineaMisc16(null != respuesta[46] ? respuesta[46].toString().trim():"");
					detCfd.setLineaMisc17(null != respuesta[47] ? respuesta[47].toString().trim():"");
					detCfd.setLineaMisc18(null != respuesta[48] ? respuesta[48].toString().trim():"");
					detCfd.setLineaMisc19(null != respuesta[49] ? respuesta[49].toString().trim():"");
					
					detCfd.setLineaMisc20(null != respuesta[50] ? respuesta[50].toString().trim():"");
					detCfd.setLineaMisc21(null != respuesta[51] ? respuesta[51].toString().trim():"");
					detCfd.setLineaMisc22(null != respuesta[52] ? respuesta[52].toString().trim():"");
					detCfd.setLineaMisc23(null != respuesta[53] ? respuesta[53].toString().trim():"");
					detCfd.setLineaMisc24(null != respuesta[54] ? respuesta[54].toString().trim():"");
					detCfd.setLineaMisc25(null != respuesta[55] ? respuesta[55].toString().trim():"");
					detCfd.setLineaMisc26(null != respuesta[56] ? respuesta[56].toString().trim():"");
					detCfd.setLineaMisc27(null != respuesta[57] ? respuesta[57].toString().trim():"");
					detCfd.setLineaMisc28(null != respuesta[58] ? respuesta[58].toString().trim():"");
					detCfd.setLineaMisc29(null != respuesta[59] ? respuesta[59].toString().trim():"");
					
					detCfd.setLineaMisc30(null != respuesta[60] ? respuesta[60].toString().trim():"");
					detCfd.setLineaMisc31(null != respuesta[61] ? respuesta[61].toString().trim():"");
					detCfd.setLineaMisc32(null != respuesta[62] ? respuesta[62].toString().trim():"");
					detCfd.setLineaMisc33(null != respuesta[63] ? respuesta[63].toString().trim():"");
					detCfd.setLineaMisc34(null != respuesta[64] ? respuesta[64].toString().trim():"");
					detCfd.setLineaMisc35(null != respuesta[65] ? respuesta[65].toString().trim():"");
					detCfd.setLineaMisc36(null != respuesta[66] ? respuesta[66].toString().trim():"");
					detCfd.setLineaMisc37(null != respuesta[67] ? respuesta[67].toString().trim():"");
					detCfd.setLineaMisc38(null != respuesta[68] ? respuesta[68].toString().trim():"");
					detCfd.setLineaMisc39(null != respuesta[69] ? respuesta[69].toString().trim():"");
					
				
					detCfd.setLineaMisc40(null != respuesta[70] ? respuesta[70].toString().trim():"");
					detCfd.setLineaMisc41(null != respuesta[71] ? respuesta[71].toString().trim():"");
					detCfd.setLineaMisc42(null != respuesta[72] ? respuesta[72].toString().trim():"");
					detCfd.setLineaMisc43(null != respuesta[73] ? respuesta[73].toString().trim():"");
					detCfd.setLineaMisc44(null != respuesta[74] ? respuesta[74].toString().trim():"");
					detCfd.setLineaMisc45(null != respuesta[75] ? respuesta[75].toString().trim():"");
					detCfd.setLineaMisc46(null != respuesta[76] ? respuesta[76].toString().trim():"");
					detCfd.setLineaMisc47(null != respuesta[77] ? respuesta[77].toString().trim():"");
					detCfd.setLineaMisc48(null != respuesta[78] ? respuesta[78].toString().trim():"");
					detCfd.setLineaMisc49(null != respuesta[79] ? respuesta[79].toString().trim():"");
					
					
					detCfd.setLineaMisc50(null != respuesta[80] ? respuesta[80].toString().trim():"");
					detCfd.setLineaMedicionSecundaria(null != respuesta[81] ? respuesta[81].toString().trim():"");
					detCfd.setLineaTipoIdentAdicional(null != respuesta[82] ? respuesta[82].toString().trim():"");
					detCfd.setLineaDescripIdioma(null != respuesta[83] ? respuesta[83].toString().trim():"");
					detCfd.setLineaCantAdicional(null != respuesta[84] ? respuesta[84].toString().trim():"");
					detCfd.setLineaCantAdicionalTipo(null != respuesta[85] ? respuesta[85].toString().trim():"");
					detCfd.setLineaTipoReferencia(null != respuesta[86] ? respuesta[86].toString().trim():"");
					detCfd.setLineaCalifNumIdentidad(null != respuesta[87] ? respuesta[87].toString().trim():"");
					detCfd.setLineaTipoEmpaquetado(null != respuesta[88] ? respuesta[88].toString().trim():"");
					detCfd.setLineaMetodoPago(null != respuesta[89] ? respuesta[89].toString().trim():"");
					
					
					detCfd.setLineaNumeroLote(null != respuesta[90] ? respuesta[90].toString().trim():"");
					detCfd.setLineaFechaProdLote(null != respuesta[91] ? respuesta[91].toString().trim():"");
					detCfd.setLineaIndCargoDescuento(null != respuesta[92] ? respuesta[92].toString().trim():"");
					detCfd.setLineaInfCargoDescuento(null != respuesta[93] ? respuesta[93].toString().trim():"");
					detCfd.setLineaSecuenciaCalculo(null != respuesta[94] ? respuesta[94].toString().trim():"");
					detCfd.setLineaTipoServiciosEsp(null != respuesta[95] ? respuesta[95].toString().trim():"");
					detCfd.setLineaIdentImpuesto(null != respuesta[96] ? respuesta[96].toString().trim():"");
					detCfd.setLineaCodEAN(null != respuesta[97] ? respuesta[97].toString().trim():"");
					detCfd.setLineaNoIdentificacion(null != respuesta[98] ? respuesta[98].toString().trim():"");
					
					
					
					
					
					//if(null != respuesta[99]){ 
					EspecOrdVarLineAduanaCfdTxtDTO lineAduana = new EspecOrdVarLineAduanaCfdTxtDTO();
					lineAduana.setVariacionModo(null != respuesta[99] ? respuesta[99].toString().trim():"");
					lineAduana.setVariacionTipo(null != respuesta[100] ? respuesta[100].toString().trim():"");
					lineAduana.setVariacionTipo02(null != respuesta[101] ? respuesta[101].toString().trim():"");
					lineAduana.setVariacionPorc(null != respuesta[102] ? respuesta[102].toString().trim():"");
					lineAduana.setVariacionPorc02(null != respuesta[103] ? respuesta[103].toString().trim():"");
					lineAduana.setVariacionPorc03(null != respuesta[104] ? respuesta[104].toString().trim():"");
					lineAduana.setVariacionModoRet(null != respuesta[105] ? respuesta[105].toString().trim():"");
					lineAduana.setVariacionTipoRet(null != respuesta[106] ? respuesta[106].toString().trim():"");
					lineAduana.setVariacionTipoRet02(null != respuesta[107] ? respuesta[107].toString().trim():"");
					lineAduana.setVariacionPorcRet(null != respuesta[108] ? respuesta[108].toString().trim():"");
					lineAduana.setVariacionPorcRet02(null != respuesta[109] ? respuesta[109].toString().trim():"");
					lineAduana.setVariacionPorcRet03(null != respuesta[110] ? respuesta[110].toString().trim():"");
						
						//listLineAduanaTemp.add(lineAduana);
						
					//}
					
					detCfd.setLineAduana(lineAduana);
					
					listLineDetTemp.add(detCfd);
					
					
				
				
				}
				
				
				
			
			
			
			
				}catch (Exception e) {
						System.out.println("Error mapEspecOrdLineDetCfdTxtDTO" + e);
					}

				}
				
				return listLineDetTemp;
	
	}



		public static List<EspecOrdLineDetCfdTxtDTO>  especOrdLinePagosDetalle(List<Object[]> objectList) {
		
			
			List<EspecOrdLineDetCfdTxtDTO> listLineDetTemp = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
			
			
			
			if (objectList != null) {
		
				try {
		
					System.out.println("CREA OBJETO mapEspecOrdLineDetCfdTxtDTO  ..");
		
					// hacer validacion si viene nulo
		
					for (Object[] respuesta : objectList) {
						
						EspecOrdLineDetCfdTxtDTO detCfd = new EspecOrdLineDetCfdTxtDTO();
			        	
						detCfd.setLineaDescripcion(null != respuesta[0] ? respuesta[0].toString().trim():"");
						detCfd.setLineaCantidad(null != respuesta[1] ? respuesta[1].toString().trim():"");
						detCfd.setLineaUnidad(null != respuesta[2] ? respuesta[2].toString().trim():"");
						detCfd.setLineaPrecioUnitario(null != respuesta[3] ? respuesta[3].toString().trim():"");
						detCfd.setLineaImporte(null != respuesta[4] ? respuesta[4].toString().trim():"");
						detCfd.setLineaAduanaNumDoc(null != respuesta[5] ? respuesta[5].toString().trim():"");
						detCfd.setLineaAduanaFechaDoc(null != respuesta[6] ? respuesta[6].toString().trim():"");
						detCfd.setLineaAduanaNombre(null != respuesta[7] ? respuesta[7].toString().trim():"");
						detCfd.setLineaCuentaPredialNumero(null != respuesta[8] ? respuesta[8].toString().trim():"");
						detCfd.setLineaFraccionArancelaria(null != respuesta[9] ? respuesta[9].toString().trim():"");
							
						detCfd.setLineaNotas(null != respuesta[10] ? respuesta[10].toString().trim():"");
						detCfd.setLineaCodUPC(null != respuesta[11] ? respuesta[11].toString().trim():"");
						detCfd.setLineaPiezasEmpaque(null != respuesta[12] ? respuesta[12].toString().trim():"");
						detCfd.setLineaCodDUN(null != respuesta[13] ? respuesta[13].toString().trim():"");
						detCfd.setLineaCodBarras(null != respuesta[14] ? respuesta[14].toString().trim():"");
						detCfd.setLineaCodArticulo(null != respuesta[15] ? respuesta[15].toString().trim():"");
						detCfd.setLineaCodDesc(null != respuesta[16] ? respuesta[16].toString().trim():"");
						detCfd.setLineaPorcDesc(null != respuesta[17] ? respuesta[17].toString().trim():"");
						detCfd.setLineaMontoDesc(null != respuesta[18] ? respuesta[18].toString().trim():"");
						detCfd.setLineaPrecioUnitarioSinDesc(null != respuesta[19] ? respuesta[19].toString().trim():"");
						
						detCfd.setLineaCantEmpaquesFac(null != respuesta[20] ? respuesta[20].toString().trim():"");
						detCfd.setLineaCantEmpaquesEmb(null != respuesta[21] ? respuesta[21].toString().trim():"");
						detCfd.setLineaPorcIVA(null != respuesta[22] ? respuesta[22].toString().trim():"");
						detCfd.setLineaMontoIVA(null != respuesta[23] ? respuesta[23].toString().trim():"");
						detCfd.setLineaPorcIEPS(null != respuesta[24] ? respuesta[24].toString().trim():"");
						detCfd.setLineaMontoIEPS(null != respuesta[25] ? respuesta[25].toString().trim():"");
						detCfd.setLineaPrecioUnitarioConImp(null != respuesta[26] ? respuesta[26].toString().trim():"");
						detCfd.setLineaImporteConImp(null != respuesta[27] ? respuesta[27].toString().trim():"");
						detCfd.setLineaFrontera(null != respuesta[28] ? respuesta[28].toString().trim():"");
						detCfd.setLineaPaisOrigen(null != respuesta[29] ? respuesta[29].toString().trim():"");
					
						detCfd.setLineaEANAduana(null != respuesta[30] ? respuesta[30].toString().trim():"");
						detCfd.setLineaMisc01(null != respuesta[31] ? respuesta[31].toString().trim():"");
						detCfd.setLineaMisc02(null != respuesta[32] ? respuesta[32].toString().trim():"");
						detCfd.setLineaMisc03(null != respuesta[33] ? respuesta[33].toString().trim():"");
						detCfd.setLineaMisc04(null != respuesta[34] ? respuesta[34].toString().trim():"");
						detCfd.setLineaMisc05(null != respuesta[35] ? respuesta[35].toString().trim():"");
						detCfd.setLineaMisc06(null != respuesta[36] ? respuesta[36].toString().trim():"");
						detCfd.setLineaMisc07(null != respuesta[37] ? respuesta[37].toString().trim():"");
						detCfd.setLineaMisc08(null != respuesta[38] ? respuesta[38].toString().trim():"");
						detCfd.setLineaMisc09(null != respuesta[39] ? respuesta[39].toString().trim():"");
						
						detCfd.setLineaMisc10(null != respuesta[40] ? respuesta[40].toString().trim():"");
						detCfd.setLineaMisc11(null != respuesta[41] ? respuesta[41].toString().trim():"");
						detCfd.setLineaMisc12(null != respuesta[42] ? respuesta[42].toString().trim():"");
						detCfd.setLineaMisc13(null != respuesta[43] ? respuesta[43].toString().trim():"");
						detCfd.setLineaMisc14(null != respuesta[44] ? respuesta[44].toString().trim():"");
						detCfd.setLineaMisc15(null != respuesta[45] ? respuesta[45].toString().trim():"");
						detCfd.setLineaMisc16(null != respuesta[46] ? respuesta[46].toString().trim():"");
						detCfd.setLineaMisc17(null != respuesta[47] ? respuesta[47].toString().trim():"");
						detCfd.setLineaMisc18(null != respuesta[48] ? respuesta[48].toString().trim():"");
						detCfd.setLineaMisc19(null != respuesta[49] ? respuesta[49].toString().trim():"");
						
						detCfd.setLineaMisc20(null != respuesta[50] ? respuesta[50].toString().trim():"");
						detCfd.setLineaMisc21(null != respuesta[51] ? respuesta[51].toString().trim():"");
						detCfd.setLineaMisc22(null != respuesta[52] ? respuesta[52].toString().trim():"");
						detCfd.setLineaMisc23(null != respuesta[53] ? respuesta[53].toString().trim():"");
						detCfd.setLineaMisc24(null != respuesta[54] ? respuesta[54].toString().trim():"");
						detCfd.setLineaMisc25(null != respuesta[55] ? respuesta[55].toString().trim():"");
						detCfd.setLineaMisc26(null != respuesta[56] ? respuesta[56].toString().trim():"");
						detCfd.setLineaMisc27(null != respuesta[57] ? respuesta[57].toString().trim():"");
						detCfd.setLineaMisc28(null != respuesta[58] ? respuesta[58].toString().trim():"");
						detCfd.setLineaMisc29(null != respuesta[59] ? respuesta[59].toString().trim():"");
						
						detCfd.setLineaMisc30(null != respuesta[60] ? respuesta[60].toString().trim():"");
						detCfd.setLineaMisc31(null != respuesta[61] ? respuesta[61].toString().trim():"");
						detCfd.setLineaMisc32(null != respuesta[62] ? respuesta[62].toString().trim():"");
						detCfd.setLineaMisc33(null != respuesta[63] ? respuesta[63].toString().trim():"");
						detCfd.setLineaMisc34(null != respuesta[64] ? respuesta[64].toString().trim():"");
						detCfd.setLineaMisc35(null != respuesta[65] ? respuesta[65].toString().trim():"");
						detCfd.setLineaMisc36(null != respuesta[66] ? respuesta[66].toString().trim():"");
						detCfd.setLineaMisc37(null != respuesta[67] ? respuesta[67].toString().trim():"");
						detCfd.setLineaMisc38(null != respuesta[68] ? respuesta[68].toString().trim():"");
						detCfd.setLineaMisc39(null != respuesta[69] ? respuesta[69].toString().trim():"");
						
					
						detCfd.setLineaMisc40(null != respuesta[70] ? respuesta[70].toString().trim():"");
						detCfd.setLineaMisc41(null != respuesta[71] ? respuesta[71].toString().trim():"");
						detCfd.setLineaMisc42(null != respuesta[72] ? respuesta[72].toString().trim():"");
						detCfd.setLineaMisc43(null != respuesta[73] ? respuesta[73].toString().trim():"");
						detCfd.setLineaMisc44(null != respuesta[74] ? respuesta[74].toString().trim():"");
						detCfd.setLineaMisc45(null != respuesta[75] ? respuesta[75].toString().trim():"");
						detCfd.setLineaMisc46(null != respuesta[76] ? respuesta[76].toString().trim():"");
						detCfd.setLineaMisc47(null != respuesta[77] ? respuesta[77].toString().trim():"");
						detCfd.setLineaMisc48(null != respuesta[78] ? respuesta[78].toString().trim():"");
						detCfd.setLineaMisc49(null != respuesta[79] ? respuesta[79].toString().trim():"");
						
						
						detCfd.setLineaMisc50(null != respuesta[80] ? respuesta[80].toString().trim():"");
						detCfd.setLineaMedicionSecundaria(null != respuesta[81] ? respuesta[81].toString().trim():"");
						detCfd.setLineaTipoIdentAdicional(null != respuesta[82] ? respuesta[82].toString().trim():"");
						detCfd.setLineaDescripIdioma(null != respuesta[83] ? respuesta[83].toString().trim():"");
						detCfd.setLineaCantAdicional(null != respuesta[84] ? respuesta[84].toString().trim():"");
						detCfd.setLineaCantAdicionalTipo(null != respuesta[85] ? respuesta[85].toString().trim():"");
						detCfd.setLineaTipoReferencia(null != respuesta[86] ? respuesta[86].toString().trim():"");
						detCfd.setLineaCalifNumIdentidad(null != respuesta[87] ? respuesta[87].toString().trim():"");
						detCfd.setLineaTipoEmpaquetado(null != respuesta[88] ? respuesta[88].toString().trim():"");
						detCfd.setLineaMetodoPago(null != respuesta[89] ? respuesta[89].toString().trim():"");
						
						
						detCfd.setLineaNumeroLote(null != respuesta[90] ? respuesta[90].toString().trim():"");
						detCfd.setLineaFechaProdLote(null != respuesta[91] ? respuesta[91].toString().trim():"");
						detCfd.setLineaIndCargoDescuento(null != respuesta[92] ? respuesta[92].toString().trim():"");
						detCfd.setLineaInfCargoDescuento(null != respuesta[93] ? respuesta[93].toString().trim():"");
						detCfd.setLineaSecuenciaCalculo(null != respuesta[94] ? respuesta[94].toString().trim():"");
						detCfd.setLineaTipoServiciosEsp(null != respuesta[95] ? respuesta[95].toString().trim():"");
						detCfd.setLineaIdentImpuesto(null != respuesta[96] ? respuesta[96].toString().trim():"");
						detCfd.setLineaCodEAN(null != respuesta[97] ? respuesta[97].toString().trim():"");
						detCfd.setLineaNoIdentificacion(null != respuesta[98] ? respuesta[98].toString().trim():"");
						
						
						
						
						
						//if(null != respuesta[99]){ 
						/*EspecOrdVarLineAduanaCfdTxtDTO lineAduana = new EspecOrdVarLineAduanaCfdTxtDTO();
						lineAduana.setVariacionModo(null != respuesta[99] ? respuesta[99].toString().trim():"");
						lineAduana.setVariacionTipo(null != respuesta[100] ? respuesta[100].toString().trim():"");
						lineAduana.setVariacionTipo02(null != respuesta[101] ? respuesta[101].toString().trim():"");
						lineAduana.setVariacionPorc(null != respuesta[102] ? respuesta[102].toString().trim():"");
						lineAduana.setVariacionPorc02(null != respuesta[103] ? respuesta[103].toString().trim():"");
						lineAduana.setVariacionPorc03(null != respuesta[104] ? respuesta[104].toString().trim():"");
						lineAduana.setVariacionModoRet(null != respuesta[105] ? respuesta[105].toString().trim():"");
						lineAduana.setVariacionTipoRet(null != respuesta[106] ? respuesta[106].toString().trim():"");
						lineAduana.setVariacionTipoRet02(null != respuesta[107] ? respuesta[107].toString().trim():"");
						lineAduana.setVariacionPorcRet(null != respuesta[108] ? respuesta[108].toString().trim():"");
						lineAduana.setVariacionPorcRet02(null != respuesta[109] ? respuesta[109].toString().trim():"");
						lineAduana.setVariacionPorcRet03(null != respuesta[110] ? respuesta[110].toString().trim():"");*/
							
							//listLineAduanaTemp.add(lineAduana);
							
						//}
						
						//detCfd.setLineAduana(lineAduana);
						
						listLineDetTemp.add(detCfd);
						
						
					
					
					}
					
					
					
				
				
				
				
					}catch (Exception e) {
							System.out.println("Error especOrdLinePagosDetalle" + e);
						}
		
					}
					
					return listLineDetTemp;
		
		}

}
