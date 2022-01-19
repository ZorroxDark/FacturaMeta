package mx.com.mtsla.billing.dao.map;

import java.util.ArrayList;
import java.util.List;

import mx.com.mtlsa.billing.dto.request.txt.CatContactoRequest;
import mx.com.mtlsa.billing.dto.request.txt.CatSocioComercialRequest;

public class MapCatalogosDTO {

	public static List<CatContactoRequest> mapCatalogoContacto(List<Object[]> objectList) {

		List<CatContactoRequest> listCatContacto = new ArrayList<CatContactoRequest>();

		if (objectList != null) {

			try {

				System.out.println("CREA OBJETO mapCatalogoContacto  ..");

				// hacer validacion si viene nulo

				for (Object[] respuesta : objectList) {

					CatContactoRequest catContacto= new CatContactoRequest();
					
					catContacto.setEmpresa(null != respuesta[0] ? respuesta[0].toString().trim() : "");
					catContacto.setCliente(null != respuesta[1] ? respuesta[1].toString().trim() : "");
					catContacto.setContacto(null != respuesta[2] ? respuesta[2].toString().trim() : "");
					catContacto.setNombre(null != respuesta[3] ? respuesta[3].toString().trim() : "");
					catContacto.setApPaterno(null != respuesta[4] ? respuesta[4].toString().trim() : "");
					
					catContacto.setApMaterno(null != respuesta[5] ? respuesta[5].toString().trim() : "");
					catContacto.setEmail(null != respuesta[6] ? respuesta[6].toString().trim() : "");
					catContacto.setArea(null != respuesta[7] ? respuesta[7].toString().trim() : "");
					catContacto.setComentarios(null != respuesta[8] ? respuesta[8].toString().trim() : "");
					
					listCatContacto.add(catContacto);

				}

			} catch (Exception e) {
				System.out.println("Error mapCatalogoContacto " + e);
			}

		}

		return listCatContacto;

	}
	
	
	
	
	public static List<CatSocioComercialRequest> mapCatalogoSocioComercial(List<Object[]> objectList) {

		List<CatSocioComercialRequest> listCatSocioComercial = new ArrayList<CatSocioComercialRequest>();

		if (objectList != null) {

			try {

				System.out.println("CREA OBJETO mapCatalogoSocioComercial  ..");

				// hacer validacion si viene nulo

				for (Object[] respuesta : objectList) {

					CatSocioComercialRequest catSocioComercial= new CatSocioComercialRequest();
					
					catSocioComercial.setCliente(null != respuesta[0] ? respuesta[0].toString().trim() : "");
					catSocioComercial.setEmpresa(null != respuesta[1] ? respuesta[1].toString().trim() : "");
					catSocioComercial.setRazonSocial(null != respuesta[2] ? respuesta[2].toString().trim() : "");
					catSocioComercial.setRfc(null != respuesta[3] ? respuesta[3].toString().trim() : "");
					catSocioComercial.setGiro(null != respuesta[4] ? respuesta[4].toString().trim() : "");
					
					catSocioComercial.setCuentaContable(null != respuesta[5] ? respuesta[5].toString().trim() : "");
					catSocioComercial.setActivo(null != respuesta[6] ? respuesta[6].toString().trim() : "");
					catSocioComercial.setLinea1(null != respuesta[7] ? respuesta[7].toString().trim() : "");
					catSocioComercial.setLinea2(null != respuesta[8] ? respuesta[8].toString().trim() : "");
					catSocioComercial.setLinea3(null != respuesta[9] ? respuesta[9].toString().trim() : "");
					
					catSocioComercial.setLinea4(null != respuesta[10] ? respuesta[10].toString().trim() : "");
					catSocioComercial.setLinea5(null != respuesta[11] ? respuesta[11].toString().trim() : "");
					catSocioComercial.setLinea6(null != respuesta[12] ? respuesta[12].toString().trim() : "");
					catSocioComercial.setRol(null != respuesta[13] ? respuesta[13].toString().trim() : "");
					catSocioComercial.setDirImpFe(null != respuesta[14] ? respuesta[14].toString().trim() : "");
					
					catSocioComercial.setDirExpFe(null != respuesta[15] ? respuesta[15].toString().trim() : "");
					catSocioComercial.setNombreCertificado(null != respuesta[16] ? respuesta[16].toString().trim() : "");
					catSocioComercial.setCertificado(null != respuesta[17] ? respuesta[17].toString().trim() : "");
					catSocioComercial.setFormato1(null != respuesta[18] ? respuesta[18].toString().trim() : "");
					catSocioComercial.setFormato2(null != respuesta[19] ? respuesta[19].toString().trim() : "");
					
					catSocioComercial.setFormato3(null != respuesta[20] ? respuesta[20].toString().trim() : "");
					catSocioComercial.setFormato4(null != respuesta[21] ? respuesta[21].toString().trim() : "");
					catSocioComercial.setFormato5(null != respuesta[22] ? respuesta[22].toString().trim() : "");
					catSocioComercial.setFormato6(null != respuesta[23] ? respuesta[23].toString().trim() : "");
					catSocioComercial.setFormato7(null != respuesta[24] ? respuesta[24].toString().trim() : "");
					
					catSocioComercial.setFormato8(null != respuesta[25] ? respuesta[25].toString().trim() : "");
					catSocioComercial.setFormato9(null != respuesta[26] ? respuesta[26].toString().trim() : "");
					catSocioComercial.setFormato10(null != respuesta[27] ? respuesta[27].toString().trim() : "");
					catSocioComercial.setFormato11(null != respuesta[28] ? respuesta[28].toString().trim() : "");
					catSocioComercial.setFormato12(null != respuesta[29] ? respuesta[29].toString().trim() : "");
					
					catSocioComercial.setFormato13(null != respuesta[30] ? respuesta[30].toString().trim() : "");
					catSocioComercial.setFormato14(null != respuesta[31] ? respuesta[31].toString().trim() : "");
					catSocioComercial.setFormato15(null != respuesta[32] ? respuesta[32].toString().trim() : "");
					catSocioComercial.setAdenda(null != respuesta[33] ? respuesta[33].toString().trim() : "");
					catSocioComercial.setTransporte(null != respuesta[34] ? respuesta[34].toString().trim() : "");
					
					catSocioComercial.setLogin(null != respuesta[35] ? respuesta[35].toString().trim() : "");
					catSocioComercial.setUsuario(null != respuesta[36] ? respuesta[36].toString().trim() : "");
					catSocioComercial.setNoProveedor(null != respuesta[37] ? respuesta[37].toString().trim() : "");
					catSocioComercial.setGln(null != respuesta[38] ? respuesta[38].toString().trim() : "");
					catSocioComercial.setsCnCF01(null != respuesta[39] ? respuesta[39].toString().trim() : "");
					
					
					catSocioComercial.setsCnCF02(null != respuesta[40] ? respuesta[40].toString().trim() : "");
					catSocioComercial.setsCnCF03(null != respuesta[41] ? respuesta[41].toString().trim() : "");
					catSocioComercial.setsCnCF04(null != respuesta[42] ? respuesta[42].toString().trim() : "");
					catSocioComercial.setsCnCF05(null != respuesta[43] ? respuesta[43].toString().trim() : "");
					catSocioComercial.setE_fa(null != respuesta[44] ? respuesta[44].toString().trim() : "");
					
					catSocioComercial.setE_nc(null != respuesta[45] ? respuesta[45].toString().trim() : "");
					catSocioComercial.setE_nd(null != respuesta[46] ? respuesta[46].toString().trim() : "");
					catSocioComercial.setE_ot(null != respuesta[47] ? respuesta[47].toString().trim() : "");
					catSocioComercial.setFormaPago(null != respuesta[48] ? respuesta[48].toString().trim() : "");
					catSocioComercial.setNumCtaPago(null != respuesta[49] ? respuesta[49].toString().trim() : "");
					
					catSocioComercial.setConsolida(null != respuesta[50] ? respuesta[50].toString().trim() : "");
					catSocioComercial.setTin(null != respuesta[51] ? respuesta[51].toString().trim() : "");
					catSocioComercial.setCurp(null != respuesta[52] ? respuesta[52].toString().trim() : "");
					catSocioComercial.setUsoCFDI(null != respuesta[53] ? respuesta[53].toString().trim() : "");
					catSocioComercial.setMetodoPago(null != respuesta[54] ? respuesta[54].toString().trim() : "");
					
					
					listCatSocioComercial.add(catSocioComercial);

				}

			} catch (Exception e) {
				System.out.println("Error mapCatalogoSocioComercial " + e);
			}

		}

		return listCatSocioComercial;

	}
	

}
