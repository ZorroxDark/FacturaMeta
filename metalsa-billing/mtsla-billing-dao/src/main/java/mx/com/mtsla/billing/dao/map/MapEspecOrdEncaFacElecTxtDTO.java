package mx.com.mtsla.billing.dao.map;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.utils.UtilsNumeros;

public class MapEspecOrdEncaFacElecTxtDTO {
	
	public static List<EspecOrdEncaFacElecTxtDTO> especOrdEncaFacElecTxtDTO(List<Object[]> objectList) {

		List<EspecOrdEncaFacElecTxtDTO> especOrdEncaFacList = new ArrayList<EspecOrdEncaFacElecTxtDTO>();

		if (objectList != null) {

			try {

				
				System.out.println("CREA OBJETO mapEspecOrdEncaFacElecTxtDTO  ..");

				// hacer validacion si viene nulo

				for (Object[] respuesta : objectList) {
					
					EspecOrdEncaFacElecTxtDTO especOrdEncaFac = new EspecOrdEncaFacElecTxtDTO();
		        	
		        	//especOrdEncaFac.setFolio(null != respuesta[0] ? UtilsNumeros.valStrToInt(respuesta[0].toString()):"");
					//especOrdEncaFac.setFolio("9000"); // se pone porvisional debe der numerico pero el query trae Alfanumerico
				    especOrdEncaFac.setNombreEmisor(null != respuesta[1] ? respuesta[1].toString().trim():"");
				    especOrdEncaFac.setRfcEmisor(null != respuesta[2] ? respuesta[2].toString().trim():"");
				    especOrdEncaFac.setDomEmisorCalle(null != respuesta[3] ? respuesta[3].toString().trim():"");
				    especOrdEncaFac.setDomEmisorNoExterior(null != respuesta[4] ? respuesta[4].toString().trim():"");
				    especOrdEncaFac.setDomEmisorNoInterior(null != respuesta[5] ? respuesta[5].toString().trim():"");
				    especOrdEncaFac.setDomEmisorColonia(null != respuesta[6] ? respuesta[6].toString().trim():"");
				    especOrdEncaFac.setDomEmisorLocalidad(null != respuesta[7] ? respuesta[7].toString().trim():"");
				    especOrdEncaFac.setDomEmisorReferencia(null != respuesta[8] ? respuesta[8].toString().trim():"");
					especOrdEncaFac.setDomEmisorMunicipio(null != respuesta[9] ? respuesta[9].toString().trim():"");
					
					
					especOrdEncaFac.setDomEmisorEstado(null != respuesta[10] ? respuesta[10].toString().trim():"");
				    especOrdEncaFac.setDomEmisorPais(null != respuesta[11] ? respuesta[11].toString().trim():"");
				    especOrdEncaFac.setDomEmisorCodigoPostal(null != respuesta[12] ? respuesta[12].toString().trim():"");
					especOrdEncaFac.setTelEmisor(null != respuesta[13] ? respuesta[13].toString().trim():"");
					especOrdEncaFac.setDomSucursalCalle(null != respuesta[14] ? respuesta[14].toString().trim():"");
					especOrdEncaFac.setDomSucursalNoExterior(null != respuesta[15] ? respuesta[15].toString().trim():"");
					especOrdEncaFac.setDomSucursalNoInterior(null != respuesta[16] ? respuesta[16].toString().trim():"");
					especOrdEncaFac.setDomSucursalColonia(null != respuesta[17] ? respuesta[17].toString().trim():"");
					especOrdEncaFac.setDomSucursalLocalidad(null != respuesta[18] ? respuesta[18].toString().trim():"");
					especOrdEncaFac.setDomSucursalReferencia(null != respuesta[19] ? respuesta[19].toString().trim():"");
					
					
					especOrdEncaFac.setDomSucursalMunicipio(null != respuesta[20] ? respuesta[20].toString().trim():"");
					especOrdEncaFac.setDomSucursalEstado(null != respuesta[21] ? respuesta[21].toString().trim():"");
					especOrdEncaFac.setDomSucursalPais(null != respuesta[22] ? respuesta[22].toString().trim():"");
					especOrdEncaFac.setDomSucursalCodigoPostal(null != respuesta[23] ? respuesta[23].toString().trim():"");
					especOrdEncaFac.setTelSucursal(null != respuesta[24] ? respuesta[24].toString().trim():"");
					especOrdEncaFac.setVersion(null != respuesta[25] ? respuesta[25].toString().trim():"");
					especOrdEncaFac.setSerieComprobante(null != respuesta[26] ? respuesta[26].toString().trim():"");
					especOrdEncaFac.setNumeroAprobacion(null != respuesta[27] ? UtilsNumeros.valStrToInt(respuesta[27].toString()):"");
					especOrdEncaFac.setFormaPago(null != respuesta[28] ? respuesta[28].toString().trim():"");
					especOrdEncaFac.setFecha(null != respuesta[29] ? respuesta[29].toString().trim():"");
					
					especOrdEncaFac.setHora(null != respuesta[30] ? respuesta[30].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideCalle(null != respuesta[31] ? respuesta[31].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideNoExterior(null != respuesta[32] ? respuesta[32].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideNoInterior(null != respuesta[33] ? respuesta[33].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideColonia(null != respuesta[34] ? respuesta[34].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideLocalidad(null != respuesta[35] ? respuesta[35].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideReferencia(null != respuesta[36] ? respuesta[36].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideMunicipio(null != respuesta[37] ? respuesta[37].toString().trim():"");
					especOrdEncaFac.setDomLugarExpideEstado(null != respuesta[38] ? respuesta[38].toString().trim():"");
					especOrdEncaFac.setDomLugarExpidePais(null != respuesta[39] ? respuesta[39].toString().trim():"");
					
					
					especOrdEncaFac.setDomLugarExpideCodigoPostal(null != respuesta[40] ? respuesta[40].toString().trim():"");
					especOrdEncaFac.setNombreReceptor(null != respuesta[41] ? respuesta[41].toString().trim():"");
					especOrdEncaFac.setRfcReceptor(null != respuesta[42] ? respuesta[42].toString().trim():"");
					especOrdEncaFac.setDomReceptorCalle(null != respuesta[43] ? respuesta[43].toString().trim():"");
					especOrdEncaFac.setDomReceptorNoExterior(null != respuesta[44] ? respuesta[44].toString().trim():"");
					especOrdEncaFac.setDomReceptorNoInterior(null != respuesta[45] ? respuesta[45].toString().trim():"");
					especOrdEncaFac.setDomReceptorColonia(null != respuesta[46] ? respuesta[46].toString().trim():"");
					especOrdEncaFac.setDomReceptorLocalidad(null != respuesta[47] ? respuesta[47].toString().trim():"");
					especOrdEncaFac.setDomReceptorReferencia(null != respuesta[48] ? respuesta[48].toString().trim():"");
					especOrdEncaFac.setDomReceptorMunicipio(null != respuesta[49] ? respuesta[49].toString().trim():"");
					
					especOrdEncaFac.setDomReceptorEstado(null != respuesta[50] ? respuesta[50].toString().trim():"");
					especOrdEncaFac.setDomReceptorPais(null != respuesta[51] ? respuesta[51].toString().trim():"");
					especOrdEncaFac.setDomReceptorCodigoPostal(null != respuesta[52] ? respuesta[52].toString().trim():"");
					especOrdEncaFac.setMontoSubTotal(null != respuesta[53] ? UtilsNumeros.numDecimal2(respuesta[53].toString()):"");
					especOrdEncaFac.setMontoIVA(null != respuesta[54] ? UtilsNumeros.numDecimal2(respuesta[54].toString()):"");
					especOrdEncaFac.setMontoTotal(null != respuesta[55] ? UtilsNumeros.numDecimal2(respuesta[55].toString()):"");
					especOrdEncaFac.setEstado(null != respuesta[56] ?  UtilsNumeros.valStrToInt(respuesta[56].toString()):"");
					especOrdEncaFac.setTipoCFD(null != respuesta[57] ? respuesta[57].toString().trim():"");
					especOrdEncaFac.setNotas(null != respuesta[58] ? respuesta[58].toString().trim():"");
					especOrdEncaFac.setNotas02(null != respuesta[59] ? respuesta[59].toString().trim():"");
					
					especOrdEncaFac.setNotas03(null != respuesta[60] ? respuesta[60].toString().trim():"");
					especOrdEncaFac.setTradingPartnerProv(null != respuesta[61] ? respuesta[61].toString().trim():"");
					especOrdEncaFac.setCalifTradingPartnerProv(null != respuesta[62] ? respuesta[62].toString().trim():"");
					especOrdEncaFac.setEanProveedor(null != respuesta[63] ? respuesta[63].toString().trim():"");
					especOrdEncaFac.setNumeroFactura(null != respuesta[64] ? respuesta[64].toString().trim():"");
					especOrdEncaFac.setNumeroOrdenCompra(null != respuesta[65] ? respuesta[65].toString().trim():"");
					especOrdEncaFac.setFechaOrdenCompra(null != respuesta[66] ? respuesta[66].toString().trim():"");
					especOrdEncaFac.setNumeroProveedor(null != respuesta[67] ? respuesta[67].toString().trim():"");
					especOrdEncaFac.setEanTienda(null != respuesta[68] ? respuesta[68].toString().trim():"");
					especOrdEncaFac.setNumeroTienda(null != respuesta[69] ? respuesta[69].toString().trim():"");
					
					
					especOrdEncaFac.setNombreTienda(null != respuesta[70] ? respuesta[70].toString().trim():"");
					especOrdEncaFac.setDomTiendaCalle(null != respuesta[71] ? respuesta[71].toString().trim():"");
					especOrdEncaFac.setDomTiendaNoExterior(null != respuesta[72] ? respuesta[72].toString().trim():"");
					especOrdEncaFac.setDomTiendaNoInterior(null != respuesta[73] ? respuesta[73].toString().trim():"");
					especOrdEncaFac.setDomTiendaColonia(null != respuesta[74] ? respuesta[74].toString().trim():"");
					especOrdEncaFac.setDomTiendaLocalidad(null != respuesta[75] ? respuesta[75].toString().trim():"");
					especOrdEncaFac.setDomTiendaReferencia(null != respuesta[76] ? respuesta[76].toString().trim():"");
					especOrdEncaFac.setDomTiendaMunicipio(null != respuesta[77] ? respuesta[77].toString().trim():"");
					especOrdEncaFac.setDomTiendaEstado(null != respuesta[78] ? respuesta[78].toString().trim():"");
					especOrdEncaFac.setDomTiendaPais(null != respuesta[79] ? respuesta[79].toString().trim():"");
					
					
					especOrdEncaFac.setDomTiendaCodigoPostal(null != respuesta[80] ? respuesta[80].toString().trim():"");
					especOrdEncaFac.setRfcTienda(null != respuesta[81] ? respuesta[81].toString().trim():"");
					especOrdEncaFac.setCodMoneda(null != respuesta[82] ? respuesta[82].toString().trim():"");
					especOrdEncaFac.setDiasPago(null != respuesta[83] ? UtilsNumeros.valStrToInt(respuesta[83].toString()):"");
					especOrdEncaFac.setPorcDescProntoPago(null != respuesta[84] ? UtilsNumeros.valStrToInt(respuesta[84].toString()):"");
					especOrdEncaFac.setMontoDescProntoPago(null != respuesta[85] ? UtilsNumeros.numDecimal2(respuesta[85].toString()):"");
					especOrdEncaFac.setCodDescuento(null != respuesta[86] ? respuesta[86].toString().trim():"");
					especOrdEncaFac.setPorcDescuento(null != respuesta[87] ? UtilsNumeros.numDecimal2(respuesta[87].toString()):"");
					especOrdEncaFac.setMontoDescuento(null != respuesta[88] ? UtilsNumeros.numDecimal2(respuesta[88].toString()):"");
					especOrdEncaFac.setCantidadLineasFactura(null != respuesta[89] ? UtilsNumeros.numDecimal2(respuesta[89].toString()):"");
					
					
					especOrdEncaFac.setFechaVencimiento(null != respuesta[90] ? respuesta[90].toString().trim():"");
					especOrdEncaFac.setCodZona(null != respuesta[91] ? respuesta[91].toString().trim():"");
					especOrdEncaFac.setNumeroReceptor(null != respuesta[92] ? respuesta[92].toString().trim():"");
					especOrdEncaFac.setCodVendedor(null != respuesta[93] ? respuesta[93].toString().trim():"");
					especOrdEncaFac.setNombreVendedor(null != respuesta[94] ? respuesta[94].toString().trim():"");
					especOrdEncaFac.setViaEmbarque(null != respuesta[95] ? respuesta[95].toString().trim():"");
					especOrdEncaFac.setCondicionesPago(null != respuesta[96] ? respuesta[96].toString().trim():"");
					especOrdEncaFac.setNumeroPedido(null != respuesta[97] ? respuesta[97].toString().trim():"");
					especOrdEncaFac.setFechaPedido(null != respuesta[98] ? respuesta[98].toString().trim():"");
					especOrdEncaFac.setLetrasMontoTotal(null != respuesta[99] ? respuesta[99].toString().trim():"");
					
					
					
					especOrdEncaFac.setCantidadUnidades(null != respuesta[100] ? UtilsNumeros.valStrToInt(respuesta[100].toString()):"");
				    especOrdEncaFac.setCantidadEmpaques(null != respuesta[101] ? UtilsNumeros.valStrToInt(respuesta[101].toString()):"");
				    especOrdEncaFac.setEanReceptor(null != respuesta[102] ? respuesta[102].toString().trim():"");
				    especOrdEncaFac.setEanLugarExpide(null != respuesta[103] ? respuesta[103].toString().trim():"");
				    especOrdEncaFac.setIepsId(null != respuesta[104] ? respuesta[104].toString().trim():"");
				    especOrdEncaFac.setEstatus(null != respuesta[105] ? respuesta[105].toString().trim():"");
				    especOrdEncaFac.setNumeroEmisor(null != respuesta[106] ? UtilsNumeros.numDecimal2(respuesta[106].toString()):"");
				    especOrdEncaFac.setMontoMerma(null != respuesta[107] ? UtilsNumeros.numDecimal2(respuesta[107].toString()):"");
				    especOrdEncaFac.setMontoSubTotalApIVA(null != respuesta[108] ? respuesta[108].toString().trim():"");
					especOrdEncaFac.setTransportista(null != respuesta[109] ? respuesta[109].toString().trim():"");
					
					
					especOrdEncaFac.setNumeroSolicitud(null != respuesta[110] ? respuesta[110].toString().trim():"");
				    especOrdEncaFac.setDescMoneda(null != respuesta[111] ? respuesta[111].toString().trim():"");
				    especOrdEncaFac.setMisc01(null != respuesta[112] ? respuesta[112].toString().trim():"");
					especOrdEncaFac.setMisc02(null != respuesta[113] ? respuesta[113].toString().trim():"");
					especOrdEncaFac.setMisc03(null != respuesta[114] ? respuesta[114].toString().trim():"");
					especOrdEncaFac.setMisc04(null != respuesta[115] ? respuesta[115].toString().trim():"");
					especOrdEncaFac.setMisc05(null != respuesta[116] ? respuesta[116].toString().trim():"");
					especOrdEncaFac.setMisc06(null != respuesta[117] ? respuesta[117].toString().trim():"");
					especOrdEncaFac.setMisc07(null != respuesta[118] ? respuesta[118].toString().trim():"");
					especOrdEncaFac.setMisc08(null != respuesta[119] ? respuesta[119].toString().trim():"");
					
					
					especOrdEncaFac.setMisc09(null != respuesta[120] ? respuesta[120].toString().trim():"");
					especOrdEncaFac.setMisc10(null != respuesta[121] ? respuesta[121].toString().trim():"");
					especOrdEncaFac.setMisc11(null != respuesta[122] ? respuesta[122].toString().trim():"");
					especOrdEncaFac.setMisc12(null != respuesta[123] ? respuesta[123].toString().trim():"");
					especOrdEncaFac.setMisc13(null != respuesta[124] ? respuesta[124].toString().trim():"");
					especOrdEncaFac.setMisc14(null != respuesta[125] ? respuesta[125].toString().trim():"");
					especOrdEncaFac.setMisc15(null != respuesta[126] ? respuesta[126].toString().trim():"");
					especOrdEncaFac.setMisc16(null != respuesta[127] ? respuesta[127].toString().trim():"");
					especOrdEncaFac.setMisc17(null != respuesta[128] ? respuesta[128].toString().trim():"");
					especOrdEncaFac.setMisc18(null != respuesta[129] ? respuesta[129].toString().trim():"");
					
					especOrdEncaFac.setMisc19(null != respuesta[130] ? respuesta[130].toString().trim():"");
					especOrdEncaFac.setMisc20(null != respuesta[131] ? respuesta[131].toString().trim():"");
					especOrdEncaFac.setMisc21(null != respuesta[132] ? respuesta[132].toString().trim():"");
					especOrdEncaFac.setMisc22(null != respuesta[133] ? respuesta[133].toString().trim():"");
					especOrdEncaFac.setMisc23(null != respuesta[134] ? respuesta[134].toString().trim():"");
					especOrdEncaFac.setMisc24(null != respuesta[135] ? respuesta[135].toString().trim():"");
					especOrdEncaFac.setMisc25(null != respuesta[136] ? respuesta[136].toString().trim():"");
					especOrdEncaFac.setMisc26(null != respuesta[137] ? respuesta[137].toString().trim():"");
					especOrdEncaFac.setMisc27(null != respuesta[138] ? respuesta[138].toString().trim():"");
					especOrdEncaFac.setMisc28(null != respuesta[139] ? respuesta[139].toString().trim():"");
					
					
					especOrdEncaFac.setMisc29(null != respuesta[140] ? respuesta[140].toString().trim():"");
					especOrdEncaFac.setMisc30(null != respuesta[141] ? respuesta[141].toString().trim():"");
					especOrdEncaFac.setMisc31(null != respuesta[142] ? respuesta[142].toString().trim():"");
					especOrdEncaFac.setMisc32(null != respuesta[143] ? respuesta[143].toString().trim():"");
					especOrdEncaFac.setMisc33(null != respuesta[144] ? respuesta[144].toString().trim():"");
					especOrdEncaFac.setMisc34(null != respuesta[145] ? respuesta[145].toString().trim():"");
					especOrdEncaFac.setMisc35(null != respuesta[146] ? respuesta[146].toString().trim():"");
					especOrdEncaFac.setMisc36(null != respuesta[147] ? respuesta[147].toString().trim():"");
					especOrdEncaFac.setMisc37(null != respuesta[148] ? respuesta[148].toString().trim():"");
					especOrdEncaFac.setMisc38(null != respuesta[149] ? respuesta[149].toString().trim():"");
					
					especOrdEncaFac.setMisc39(null != respuesta[150] ? respuesta[150].toString().trim():"");
					especOrdEncaFac.setMisc40(null != respuesta[151] ? respuesta[151].toString().trim():"");
					especOrdEncaFac.setMisc41(null != respuesta[152] ? respuesta[152].toString().trim():"");
					especOrdEncaFac.setMisc42(null != respuesta[153] ? respuesta[153].toString().trim():"");
					especOrdEncaFac.setMisc43(null != respuesta[154] ? respuesta[154].toString().trim():"");
					especOrdEncaFac.setMisc44(null != respuesta[155] ? respuesta[155].toString().trim():"");
					especOrdEncaFac.setMisc45(null != respuesta[156] ? respuesta[156].toString().trim():"");
					especOrdEncaFac.setMisc46(null != respuesta[157] ? respuesta[157].toString().trim():"");
					especOrdEncaFac.setMisc47(null != respuesta[158] ? respuesta[158].toString().trim():"");
					especOrdEncaFac.setMisc48(null != respuesta[159] ? respuesta[159].toString().trim():"");
					
					especOrdEncaFac.setMisc49(null != respuesta[160] ? respuesta[160].toString().trim():"");
					especOrdEncaFac.setMisc50(null != respuesta[161] ? respuesta[161].toString().trim():"");
					especOrdEncaFac.setPorcIVA(null != respuesta[162] ? UtilsNumeros.numDecimal2(respuesta[162].toString()):"");
					especOrdEncaFac.setMontoIEPS(null != respuesta[163] ? UtilsNumeros.numDecimal2(respuesta[163].toString()):"");
					especOrdEncaFac.setDocumentStatus(null != respuesta[164] ? respuesta[164].toString().trim():"");
					especOrdEncaFac.setDeliveryDate(null != respuesta[165] ? respuesta[165].toString().trim():"");
					especOrdEncaFac.setRegimenFiscal(null != respuesta[166] ? respuesta[166].toString().trim():"");
					especOrdEncaFac.setNumCtaPago(null != respuesta[167] ? respuesta[167].toString().trim():"");
					especOrdEncaFac.setNumContraRecibo(null != respuesta[168] ? respuesta[168].toString().trim():"");
					especOrdEncaFac.setFechaNumContraRecibo(null != respuesta[169] ? respuesta[169].toString().trim():"");
					
					
					especOrdEncaFac.setContactoCompras(null != respuesta[170] ? respuesta[170].toString().trim():"");
					especOrdEncaFac.setCustomsgln(null != respuesta[171] ? respuesta[171].toString().trim():"");
					especOrdEncaFac.setAlternateIdentificationGln(null != respuesta[172] ? respuesta[172].toString().trim():"");
					especOrdEncaFac.setNombreAduana(null != respuesta[173] ? respuesta[173].toString().trim():"");
					especOrdEncaFac.setNombreAduanaCiudad(null != respuesta[174] ? respuesta[174].toString().trim():"");
					especOrdEncaFac.setFuncDivisa(null != respuesta[175] ? respuesta[175].toString().trim():"");
					especOrdEncaFac.setTasaDivisa(null != respuesta[176] ? UtilsNumeros.numDecimal2(respuesta[176].toString()):"");
					
					especOrdEncaFac.setRefTiempoPago(null != respuesta[177] ? respuesta[177].toString().trim():"");
					especOrdEncaFac.setRefTerminoTiempoPago(null != respuesta[178] ? UtilsNumeros.valStrToInt(respuesta[178].toString()):"");
					especOrdEncaFac.setLugarExpedicion(null != respuesta[179] ? respuesta[179].toString().trim():"");
					
					
					especOrdEncaFac.setSerieFolioFiscalOrig(null != respuesta[180] ? respuesta[180].toString().trim():"");
					especOrdEncaFac.setTipoEspecialDeServicio(null != respuesta[181] ? respuesta[181].toString().trim():"");
					especOrdEncaFac.setFechaFolioFiscalOrig(null != respuesta[182] ? respuesta[182].toString().trim():"");
					especOrdEncaFac.setPorcentajeNoAplicado(null != respuesta[183] ? UtilsNumeros.numDecimal2(respuesta[183].toString()):"");
					especOrdEncaFac.setMontoFolioFiscalOrig(null != respuesta[184] ? UtilsNumeros.numDecimal2(respuesta[184].toString()):"");
					especOrdEncaFac.setMontoTotalDescuentos(null != respuesta[185] ? UtilsNumeros.numDecimal2(respuesta[185].toString()):"");
					especOrdEncaFac.setMontoTotalPagar(null != respuesta[186] ? UtilsNumeros.numDecimal2(respuesta[186].toString()):"");
					especOrdEncaFac.setAnoAprobacion9(null != respuesta[187] ? UtilsNumeros.valStrToInt(respuesta[187].toString()):"");
					especOrdEncaFac.setMotivoDescuento(null != respuesta[188] ? respuesta[188].toString().trim():"");
					especOrdEncaFac.setMetodoPago(null != respuesta[189] ? respuesta[189].toString().trim():"");
					
					
					especOrdEncaFac.setEfectoComprobante(null != respuesta[190] ? respuesta[190].toString().trim():"");
					//especOrdEncaFac.setMontoTotalImpRetenidos(null != respuesta[191] ? UtilsNumeros.numDecimal2(respuesta[191].toString()):""); EEROR vienen numericas
					//especOrdEncaFac.setMontoTotalImpTrasladados(null != respuesta[192] ? UtilsNumeros.numDecimal2(respuesta[192].toString()):"");
					especOrdEncaFac.setMontoTotalImpRetenidos(null != respuesta[191] ? respuesta[191].toString().trim():"");
					especOrdEncaFac.setMontoTotalImpTrasladados(null != respuesta[192] ? respuesta[192].toString().trim():"");
			
					especOrdEncaFacList.add(especOrdEncaFac);

				}

			} catch (Exception e) {
				System.out.println("Error mapEspecOrdEncaFacElecTxtDTO" + e);
			}

		}
		
		return especOrdEncaFacList;

	}
	

}
