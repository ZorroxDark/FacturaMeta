package mx.com.mtlsa.billing.utils.txt;

import java.util.List;

import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.utils.Constantes;

public class GeneraStringComplemento {

	public static StringBuilder facturaComplementoNomina(List<EspecOrdLineDetCfdTxtDTO> listFacComplemento) {

		StringBuilder getFacturaComplemento = new StringBuilder();
		try {
			
			boolean separador = true;
			
			for(EspecOrdLineDetCfdTxtDTO facComplemento :listFacComplemento) {
				//Carga 
				
				if(separador) {
					getFacturaComplemento.append(Constantes.SIG_NEG);
					separador=false;
				}
				
				
				getFacturaComplemento.append(facComplemento.getLineaDescripcion() != null ? facComplemento.getLineaDescripcion() :"" );
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantidad() != null ? facComplemento.getLineaCantidad() :"" );
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaUnidad()!= null ? facComplemento.getLineaUnidad() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPrecioUnitario()!= null ? facComplemento.getLineaPrecioUnitario() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaImporte()!= null ? facComplemento.getLineaImporte() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaAduanaNumDoc()!= null ? facComplemento.getLineaAduanaNumDoc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaAduanaFechaDoc()!= null ? facComplemento.getLineaAduanaFechaDoc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaAduanaNombre()!= null ? facComplemento.getLineaAduanaNombre() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCuentaPredialNumero()!= null ? facComplemento.getLineaCuentaPredialNumero() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaFraccionArancelaria() != null ? facComplemento.getLineaFraccionArancelaria() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 10
				getFacturaComplemento.append(facComplemento.getLineaNotas() != null ? facComplemento.getLineaNotas() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodUPC() != null ? facComplemento.getLineaCodUPC() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPiezasEmpaque() != null ? facComplemento.getLineaPiezasEmpaque() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodDUN() != null ? facComplemento.getLineaCodDUN() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodBarras() != null ? facComplemento.getLineaCodBarras() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodArticulo() != null ? facComplemento.getLineaCodArticulo() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodDesc() != null ? facComplemento.getLineaCodDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPorcDesc() != null ? facComplemento.getLineaPorcDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMontoDesc() != null ? facComplemento.getLineaMontoDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPrecioUnitarioSinDesc() != null ? facComplemento.getLineaPrecioUnitarioSinDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 20
				getFacturaComplemento.append(facComplemento.getLineaCantEmpaquesFac()!= null ? facComplemento.getLineaCantEmpaquesFac() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantEmpaquesEmb()!= null ? facComplemento.getLineaCantEmpaquesEmb() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPorcIVA()!= null ? facComplemento.getLineaPorcIVA() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMontoIVA()!= null ? facComplemento.getLineaMontoIVA() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPorcIEPS()!= null ? facComplemento.getLineaPorcIEPS() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMontoIEPS()!= null ? facComplemento.getLineaMontoIEPS() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPrecioUnitarioConImp()!= null ? facComplemento.getLineaPrecioUnitarioConImp() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaImporteConImp()!= null ? facComplemento.getLineaImporteConImp() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaFrontera()!= null ? facComplemento.getLineaFrontera() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPaisOrigen()!= null ? facComplemento.getLineaPaisOrigen() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				
				
				//Carga 30
				getFacturaComplemento.append(facComplemento.getLineaEANAduana()!= null ? facComplemento.getLineaEANAduana() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc01()!= null ? facComplemento.getLineaMisc01() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc02()!= null ? facComplemento.getLineaMisc02() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc03()!= null ? facComplemento.getLineaMisc03() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc04()!= null ? facComplemento.getLineaMisc04() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc05()!= null ? facComplemento.getLineaMisc05() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc06()!= null ? facComplemento.getLineaMisc06() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc07()!= null ? facComplemento.getLineaMisc07() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc08()!= null ? facComplemento.getLineaMisc08() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc09()!= null ? facComplemento.getLineaMisc09() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 40
				getFacturaComplemento.append(facComplemento.getLineaMisc10()!= null ? facComplemento.getLineaMisc10() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc11()!= null ? facComplemento.getLineaMisc11() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc12()!= null ? facComplemento.getLineaMisc12() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc13()!= null ? facComplemento.getLineaMisc13() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc14()!= null ? facComplemento.getLineaMisc14() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc15()!= null ? facComplemento.getLineaMisc15() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc16()!= null ? facComplemento.getLineaMisc16() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc17()!= null ? facComplemento.getLineaMisc17() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc18()!= null ? facComplemento.getLineaMisc18() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc19()!= null ? facComplemento.getLineaMisc19() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 50
				getFacturaComplemento.append(facComplemento.getLineaMisc20()!= null ? facComplemento.getLineaMisc20() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc21()!= null ? facComplemento.getLineaMisc21() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc22()!= null ? facComplemento.getLineaMisc22() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc23()!= null ? facComplemento.getLineaMisc23() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc24()!= null ? facComplemento.getLineaMisc24() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc25()!= null ? facComplemento.getLineaMisc25() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc26()!= null ? facComplemento.getLineaMisc26() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc27()!= null ? facComplemento.getLineaMisc27() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc28()!= null ? facComplemento.getLineaMisc28() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc29()!= null ? facComplemento.getLineaMisc29() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 60
				getFacturaComplemento.append(facComplemento.getLineaMisc30()!= null ? facComplemento.getLineaMisc30() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc31()!= null ? facComplemento.getLineaMisc31() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc32()!= null ? facComplemento.getLineaMisc32() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc33()!= null ? facComplemento.getLineaMisc33() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc34()!= null ? facComplemento.getLineaMisc34() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc35()!= null ? facComplemento.getLineaMisc35() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc36()!= null ? facComplemento.getLineaMisc36() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc37()!= null ? facComplemento.getLineaMisc37() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc38()!= null ? facComplemento.getLineaMisc38() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc39()!= null ? facComplemento.getLineaMisc39() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 70
				getFacturaComplemento.append(facComplemento.getLineaMisc40()!= null ? facComplemento.getLineaMisc40() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc41()!= null ? facComplemento.getLineaMisc41() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc42()!= null ? facComplemento.getLineaMisc42() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc43()!= null ? facComplemento.getLineaMisc43() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc44()!= null ? facComplemento.getLineaMisc44() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc45()!= null ? facComplemento.getLineaMisc45() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc46()!= null ? facComplemento.getLineaMisc46() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc47()!= null ? facComplemento.getLineaMisc47() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc48()!= null ? facComplemento.getLineaMisc48() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc49()!= null ? facComplemento.getLineaMisc49() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				//Carga 80
				getFacturaComplemento.append(facComplemento.getLineaMisc50()!= null ? facComplemento.getLineaMisc50() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMedicionSecundaria()!= null ? facComplemento.getLineaMedicionSecundaria() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoIdentAdicional()!= null ? facComplemento.getLineaTipoIdentAdicional() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaDescripIdioma()!= null ? facComplemento.getLineaDescripIdioma() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantAdicional()!= null ? facComplemento.getLineaCantAdicional() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantAdicionalTipo()!= null ? facComplemento.getLineaCantAdicionalTipo() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoReferencia()!= null ? facComplemento.getLineaTipoReferencia() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCalifNumIdentidad()!= null ? facComplemento.getLineaCalifNumIdentidad() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoEmpaquetado()!= null ? facComplemento.getLineaTipoEmpaquetado() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMetodoPago()!= null ? facComplemento.getLineaMetodoPago() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				//Carga 90
				getFacturaComplemento.append(facComplemento.getLineaNumeroLote()!= null ? facComplemento.getLineaNumeroLote() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaFechaProdLote()!= null ? facComplemento.getLineaFechaProdLote() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaIndCargoDescuento()!= null ? facComplemento.getLineaFechaProdLote() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaInfCargoDescuento()!= null ? facComplemento.getLineaInfCargoDescuento() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaSecuenciaCalculo()!= null ? facComplemento.getLineaSecuenciaCalculo() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoServiciosEsp()!= null ? facComplemento.getLineaTipoServiciosEsp() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaIdentImpuesto()!= null ? facComplemento.getLineaIdentImpuesto() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodEAN()!= null ? facComplemento.getLineaCodEAN() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaNoIdentificacion()!= null ? facComplemento.getLineaNoIdentificacion() :"");
				//getFacturaComplemento.append(Constantes.PIPE);
				
				// nvo 
				//complemento de pago no va
				/*getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionModo()	!= null ? facComplemento.getLineAduana().getVariacionModo() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionTipo()	!= null ? facComplemento.getLineAduana().getVariacionTipo() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionTipo02()	!= null ? facComplemento.getLineAduana().getVariacionTipo02() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorc()	!= null ? facComplemento.getLineAduana().getVariacionPorc() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorc02()	!= null ? facComplemento.getLineAduana().getVariacionPorc02() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorc03()	!= null ? facComplemento.getLineAduana().getVariacionPorc03() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionModoRet()	!= null ? facComplemento.getLineAduana().getVariacionModoRet() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionTipoRet02()	!= null ? facComplemento.getLineAduana().getVariacionTipoRet02() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorcRet()	!= null ? facComplemento.getLineAduana().getVariacionPorcRet() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorcRet02()	!= null ? facComplemento.getLineAduana().getVariacionPorcRet02() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorcRet03()	!= null ? facComplemento.getLineAduana().getVariacionPorcRet03() : "");
				*/
				getFacturaComplemento.append(Constantes.SALTO_LINEA);
			}
			
			
			

		} catch (Exception e) {
			System.out.println("Error generacion stringBuilder facturaComplemento "+e);
		}
		return getFacturaComplemento;

	}
	
	
	public static StringBuilder facturaComplementoFacturas(List<EspecOrdLineDetCfdTxtDTO> listFacComplemento) {

		StringBuilder getFacturaComplemento = new StringBuilder();
		try {
			
			boolean separador = true;
			
			for(EspecOrdLineDetCfdTxtDTO facComplemento :listFacComplemento) {
				//Carga 
				
				if(separador) {
					getFacturaComplemento.append(Constantes.SIG_NEG);
					separador=false;
				}
				
				
				getFacturaComplemento.append(facComplemento.getLineaDescripcion() != null ? facComplemento.getLineaDescripcion() :"" );
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantidad() != null ? facComplemento.getLineaCantidad() :"" );
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaUnidad()!= null ? facComplemento.getLineaUnidad() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPrecioUnitario()!= null ? facComplemento.getLineaPrecioUnitario() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaImporte()!= null ? facComplemento.getLineaImporte() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaAduanaNumDoc()!= null ? facComplemento.getLineaAduanaNumDoc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaAduanaFechaDoc()!= null ? facComplemento.getLineaAduanaFechaDoc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaAduanaNombre()!= null ? facComplemento.getLineaAduanaNombre() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCuentaPredialNumero()!= null ? facComplemento.getLineaCuentaPredialNumero() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaFraccionArancelaria() != null ? facComplemento.getLineaFraccionArancelaria() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 10
				getFacturaComplemento.append(facComplemento.getLineaNotas() != null ? facComplemento.getLineaNotas() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodUPC() != null ? facComplemento.getLineaCodUPC() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPiezasEmpaque() != null ? facComplemento.getLineaPiezasEmpaque() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodDUN() != null ? facComplemento.getLineaCodDUN() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodBarras() != null ? facComplemento.getLineaCodBarras() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodArticulo() != null ? facComplemento.getLineaCodArticulo() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodDesc() != null ? facComplemento.getLineaCodDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPorcDesc() != null ? facComplemento.getLineaPorcDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMontoDesc() != null ? facComplemento.getLineaMontoDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPrecioUnitarioSinDesc() != null ? facComplemento.getLineaPrecioUnitarioSinDesc() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 20
				getFacturaComplemento.append(facComplemento.getLineaCantEmpaquesFac()!= null ? facComplemento.getLineaCantEmpaquesFac() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantEmpaquesEmb()!= null ? facComplemento.getLineaCantEmpaquesEmb() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPorcIVA()!= null ? facComplemento.getLineaPorcIVA() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMontoIVA()!= null ? facComplemento.getLineaMontoIVA() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPorcIEPS()!= null ? facComplemento.getLineaPorcIEPS() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMontoIEPS()!= null ? facComplemento.getLineaMontoIEPS() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPrecioUnitarioConImp()!= null ? facComplemento.getLineaPrecioUnitarioConImp() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaImporteConImp()!= null ? facComplemento.getLineaImporteConImp() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaFrontera()!= null ? facComplemento.getLineaFrontera() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaPaisOrigen()!= null ? facComplemento.getLineaPaisOrigen() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				
				
				//Carga 30
				getFacturaComplemento.append(facComplemento.getLineaEANAduana()!= null ? facComplemento.getLineaEANAduana() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc01()!= null ? facComplemento.getLineaMisc01() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc02()!= null ? facComplemento.getLineaMisc02() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc03()!= null ? facComplemento.getLineaMisc03() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc04()!= null ? facComplemento.getLineaMisc04() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc05()!= null ? facComplemento.getLineaMisc05() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc06()!= null ? facComplemento.getLineaMisc06() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc07()!= null ? facComplemento.getLineaMisc07() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc08()!= null ? facComplemento.getLineaMisc08() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc09()!= null ? facComplemento.getLineaMisc09() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 40
				getFacturaComplemento.append(facComplemento.getLineaMisc10()!= null ? facComplemento.getLineaMisc10() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc11()!= null ? facComplemento.getLineaMisc11() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc12()!= null ? facComplemento.getLineaMisc12() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc13()!= null ? facComplemento.getLineaMisc13() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc14()!= null ? facComplemento.getLineaMisc14() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc15()!= null ? facComplemento.getLineaMisc15() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc16()!= null ? facComplemento.getLineaMisc16() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc17()!= null ? facComplemento.getLineaMisc17() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc18()!= null ? facComplemento.getLineaMisc18() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc19()!= null ? facComplemento.getLineaMisc19() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 50
				getFacturaComplemento.append(facComplemento.getLineaMisc20()!= null ? facComplemento.getLineaMisc20() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc21()!= null ? facComplemento.getLineaMisc21() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc22()!= null ? facComplemento.getLineaMisc22() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc23()!= null ? facComplemento.getLineaMisc23() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc24()!= null ? facComplemento.getLineaMisc24() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc25()!= null ? facComplemento.getLineaMisc25() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc26()!= null ? facComplemento.getLineaMisc26() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc27()!= null ? facComplemento.getLineaMisc27() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc28()!= null ? facComplemento.getLineaMisc28() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc29()!= null ? facComplemento.getLineaMisc29() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 60
				getFacturaComplemento.append(facComplemento.getLineaMisc30()!= null ? facComplemento.getLineaMisc30() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc31()!= null ? facComplemento.getLineaMisc31() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc32()!= null ? facComplemento.getLineaMisc32() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc33()!= null ? facComplemento.getLineaMisc33() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc34()!= null ? facComplemento.getLineaMisc34() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc35()!= null ? facComplemento.getLineaMisc35() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc36()!= null ? facComplemento.getLineaMisc36() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc37()!= null ? facComplemento.getLineaMisc37() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc38()!= null ? facComplemento.getLineaMisc38() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc39()!= null ? facComplemento.getLineaMisc39() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				
				//Carga 70
				getFacturaComplemento.append(facComplemento.getLineaMisc40()!= null ? facComplemento.getLineaMisc40() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc41()!= null ? facComplemento.getLineaMisc41() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc42()!= null ? facComplemento.getLineaMisc42() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc43()!= null ? facComplemento.getLineaMisc43() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc44()!= null ? facComplemento.getLineaMisc44() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc45()!= null ? facComplemento.getLineaMisc45() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc46()!= null ? facComplemento.getLineaMisc46() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc47()!= null ? facComplemento.getLineaMisc47() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc48()!= null ? facComplemento.getLineaMisc48() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMisc49()!= null ? facComplemento.getLineaMisc49() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				//Carga 80
				getFacturaComplemento.append(facComplemento.getLineaMisc50()!= null ? facComplemento.getLineaMisc50() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMedicionSecundaria()!= null ? facComplemento.getLineaMedicionSecundaria() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoIdentAdicional()!= null ? facComplemento.getLineaTipoIdentAdicional() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaDescripIdioma()!= null ? facComplemento.getLineaDescripIdioma() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantAdicional()!= null ? facComplemento.getLineaCantAdicional() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCantAdicionalTipo()!= null ? facComplemento.getLineaCantAdicionalTipo() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoReferencia()!= null ? facComplemento.getLineaTipoReferencia() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCalifNumIdentidad()!= null ? facComplemento.getLineaCalifNumIdentidad() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoEmpaquetado()!= null ? facComplemento.getLineaTipoEmpaquetado() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaMetodoPago()!= null ? facComplemento.getLineaMetodoPago() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				
				//Carga 90
				getFacturaComplemento.append(facComplemento.getLineaNumeroLote()!= null ? facComplemento.getLineaNumeroLote() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaFechaProdLote()!= null ? facComplemento.getLineaFechaProdLote() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaIndCargoDescuento()!= null ? facComplemento.getLineaFechaProdLote() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaInfCargoDescuento()!= null ? facComplemento.getLineaInfCargoDescuento() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaSecuenciaCalculo()!= null ? facComplemento.getLineaSecuenciaCalculo() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaTipoServiciosEsp()!= null ? facComplemento.getLineaTipoServiciosEsp() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaIdentImpuesto()!= null ? facComplemento.getLineaIdentImpuesto() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaCodEAN()!= null ? facComplemento.getLineaCodEAN() :"");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineaNoIdentificacion()!= null ? facComplemento.getLineaNoIdentificacion() :"");
				//getFacturaComplemento.append(Constantes.PIPE);
				
				
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionModo()	!= null ? facComplemento.getLineAduana().getVariacionModo().replace("/","\\") : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionTipo()	!= null ? facComplemento.getLineAduana().getVariacionTipo() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorc()	!= null ? facComplemento.getLineAduana().getVariacionPorc() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorc02()	!= null ? facComplemento.getLineAduana().getVariacionPorc02() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionTipo02()	!= null ? facComplemento.getLineAduana().getVariacionTipo02() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorc03()	!= null ? facComplemento.getLineAduana().getVariacionPorc03() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionModoRet()	!= null ? facComplemento.getLineAduana().getVariacionModoRet() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionTipoRet02()	!= null ? facComplemento.getLineAduana().getVariacionTipoRet02() : "");
				
				getFacturaComplemento.append(Constantes.PIPE);
				/*getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorcRet()	!= null ? facComplemento.getLineAduana().getVariacionPorcRet() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorcRet02()	!= null ? facComplemento.getLineAduana().getVariacionPorcRet02() : "");
				getFacturaComplemento.append(Constantes.PIPE);
				getFacturaComplemento.append(facComplemento.getLineAduana().getVariacionPorcRet03()	!= null ? facComplemento.getLineAduana().getVariacionPorcRet03() : "");
				*/
				getFacturaComplemento.append(Constantes.SALTO_LINEA);
				
				
				//Se quitan diagonales "/"  este no va se cambia por --> "\" impuestos solo
				
				
			}
			
			
			

		} catch (Exception e) {
			System.out.println("Error generacion stringBuilder facturaComplemento "+e);
		}
		return getFacturaComplemento;

	}
}
