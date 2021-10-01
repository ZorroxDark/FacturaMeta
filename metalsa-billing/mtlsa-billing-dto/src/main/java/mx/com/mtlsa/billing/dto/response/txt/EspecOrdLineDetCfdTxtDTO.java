package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class EspecOrdLineDetCfdTxtDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2091238661882500017L;
	
	
	
	
	private String lineaDescripcion;
	private String lineaCantidad;
	private String lineaUnidad;
	private String lineaPrecioUnitario;
	private String lineaImporte;
	private String lineaAduanaNumDoc;
	private String lineaAduanaFechaDoc;
	private String lineaAduanaNombre;
	private String lineaCuentaPredialNumero;
	private String lineaFraccionArancelaria;
	
	
	private String lineaNotas;
	private String lineaCodUPC;
	private String lineaPiezasEmpaque;
	private String lineaCodDUN;
	private String lineaCodBarras;
	private String lineaCodArticulo;
	private String lineaCodDesc;
	private String lineaPorcDesc;
	private String lineaMontoDesc;
	private String lineaPrecioUnitarioSinDesc;
	
	
	private String lineaCantEmpaquesFac;
	private String lineaCantEmpaquesEmb;
	private String lineaPorcIVA;
	private String lineaMontoIVA;
	private String lineaPorcIEPS;
	private String lineaMontoIEPS;
	private String lineaPrecioUnitarioConImp;
	private String lineaImporteConImp;
	private String lineaFrontera;
	private String lineaPaisOrigen;
	private String lineaEANAduana;
	
	private String lineaMisc01;
	private String lineaMisc02;
	private String lineaMisc03;
	private String lineaMisc04;
	private String lineaMisc05;
	private String lineaMisc06;
	private String lineaMisc07;
	private String lineaMisc08;
	private String lineaMisc09;
	private String lineaMisc10;
	
	private String lineaMisc11;
	private String lineaMisc12;
	private String lineaMisc13;
	private String lineaMisc14;
	private String lineaMisc15;
	private String lineaMisc16;
	private String lineaMisc17;
	private String lineaMisc18;
	private String lineaMisc19;
	private String lineaMisc20;
	
	private String lineaMisc21;
	private String lineaMisc22;
	private String lineaMisc23;
	private String lineaMisc24;
	private String lineaMisc25;
	private String lineaMisc26;
	private String lineaMisc27;
	private String lineaMisc28;
	private String lineaMisc29;
	private String lineaMisc30;
	
	private String lineaMisc31;
	private String lineaMisc32;
	private String lineaMisc33;
	private String lineaMisc34;
	private String lineaMisc35;
	private String lineaMisc36;
	private String lineaMisc37;
	private String lineaMisc38;
	private String lineaMisc39;
	private String lineaMisc40;
	
	
	private String lineaMisc41;
	private String lineaMisc42;
	private String lineaMisc43;
	private String lineaMisc44;
	private String lineaMisc45;
	private String lineaMisc46;
	private String lineaMisc47;
	private String lineaMisc48;
	private String lineaMisc49;
	private String lineaMisc50;
	
	private String lineaMedicionSecundaria;
	private String lineaTipoIdentAdicional;
	private String lineaDescripIdioma;
	private String lineaCantAdicional;
	private String lineaCantAdicionalTipo;
	private String lineaTipoReferencia;
	private String lineaCalifNumIdentidad;
	private String lineaTipoEmpaquetado;
	private String lineaMetodoPago;
	private String lineaNumeroLote;
	private String lineaFechaProdLote;
	private String lineaIndCargoDescuento;
	private String lineaInfCargoDescuento;
	private String lineaSecuenciaCalculo;
	private String lineaTipoServiciosEsp;
	private String lineaIdentImpuesto;
	private String lineaCodEAN;
	private String lineaNoIdentificacion;
	
	private EspecOrdVarLineAduanaCfdTxtDTO lineAduana =new EspecOrdVarLineAduanaCfdTxtDTO();
	
	
	public EspecOrdLineDetCfdTxtDTO() {
		
	}


	public String getLineaDescripcion() {
		return lineaDescripcion;
	}


	public void setLineaDescripcion(String lineaDescripcion) {
		this.lineaDescripcion = lineaDescripcion;
	}


	public String getLineaCantidad() {
		return lineaCantidad;
	}


	public void setLineaCantidad(String lineaCantidad) {
		this.lineaCantidad = lineaCantidad;
	}


	public String getLineaUnidad() {
		return lineaUnidad;
	}


	public void setLineaUnidad(String lineaUnidad) {
		this.lineaUnidad = lineaUnidad;
	}


	public String getLineaPrecioUnitario() {
		return lineaPrecioUnitario;
	}


	public void setLineaPrecioUnitario(String lineaPrecioUnitario) {
		this.lineaPrecioUnitario = lineaPrecioUnitario;
	}


	public String getLineaImporte() {
		return lineaImporte;
	}


	public void setLineaImporte(String lineaImporte) {
		this.lineaImporte = lineaImporte;
	}


	public String getLineaAduanaNumDoc() {
		return lineaAduanaNumDoc;
	}


	public void setLineaAduanaNumDoc(String lineaAduanaNumDoc) {
		this.lineaAduanaNumDoc = lineaAduanaNumDoc;
	}


	public String getLineaAduanaFechaDoc() {
		return lineaAduanaFechaDoc;
	}


	public void setLineaAduanaFechaDoc(String lineaAduanaFechaDoc) {
		this.lineaAduanaFechaDoc = lineaAduanaFechaDoc;
	}


	public String getLineaAduanaNombre() {
		return lineaAduanaNombre;
	}


	public void setLineaAduanaNombre(String lineaAduanaNombre) {
		this.lineaAduanaNombre = lineaAduanaNombre;
	}


	public String getLineaCuentaPredialNumero() {
		return lineaCuentaPredialNumero;
	}


	public void setLineaCuentaPredialNumero(String lineaCuentaPredialNumero) {
		this.lineaCuentaPredialNumero = lineaCuentaPredialNumero;
	}


	public String getLineaFraccionArancelaria() {
		return lineaFraccionArancelaria;
	}


	public void setLineaFraccionArancelaria(String lineaFraccionArancelaria) {
		this.lineaFraccionArancelaria = lineaFraccionArancelaria;
	}


	public String getLineaNotas() {
		return lineaNotas;
	}


	public void setLineaNotas(String lineaNotas) {
		this.lineaNotas = lineaNotas;
	}


	public String getLineaCodUPC() {
		return lineaCodUPC;
	}


	public void setLineaCodUPC(String lineaCodUPC) {
		this.lineaCodUPC = lineaCodUPC;
	}


	public String getLineaPiezasEmpaque() {
		return lineaPiezasEmpaque;
	}


	public void setLineaPiezasEmpaque(String lineaPiezasEmpaque) {
		this.lineaPiezasEmpaque = lineaPiezasEmpaque;
	}


	public String getLineaCodDUN() {
		return lineaCodDUN;
	}


	public void setLineaCodDUN(String lineaCodDUN) {
		this.lineaCodDUN = lineaCodDUN;
	}


	public String getLineaCodBarras() {
		return lineaCodBarras;
	}


	public void setLineaCodBarras(String lineaCodBarras) {
		this.lineaCodBarras = lineaCodBarras;
	}


	public String getLineaCodArticulo() {
		return lineaCodArticulo;
	}


	public void setLineaCodArticulo(String lineaCodArticulo) {
		this.lineaCodArticulo = lineaCodArticulo;
	}


	public String getLineaCodDesc() {
		return lineaCodDesc;
	}


	public void setLineaCodDesc(String lineaCodDesc) {
		this.lineaCodDesc = lineaCodDesc;
	}


	public String getLineaPorcDesc() {
		return lineaPorcDesc;
	}


	public void setLineaPorcDesc(String lineaPorcDesc) {
		this.lineaPorcDesc = lineaPorcDesc;
	}


	public String getLineaMontoDesc() {
		return lineaMontoDesc;
	}


	public void setLineaMontoDesc(String lineaMontoDesc) {
		this.lineaMontoDesc = lineaMontoDesc;
	}


	public String getLineaPrecioUnitarioSinDesc() {
		return lineaPrecioUnitarioSinDesc;
	}


	public void setLineaPrecioUnitarioSinDesc(String lineaPrecioUnitarioSinDesc) {
		this.lineaPrecioUnitarioSinDesc = lineaPrecioUnitarioSinDesc;
	}


	public String getLineaCantEmpaquesFac() {
		return lineaCantEmpaquesFac;
	}


	public void setLineaCantEmpaquesFac(String lineaCantEmpaquesFac) {
		this.lineaCantEmpaquesFac = lineaCantEmpaquesFac;
	}


	public String getLineaCantEmpaquesEmb() {
		return lineaCantEmpaquesEmb;
	}


	public void setLineaCantEmpaquesEmb(String lineaCantEmpaquesEmb) {
		this.lineaCantEmpaquesEmb = lineaCantEmpaquesEmb;
	}


	public String getLineaPorcIVA() {
		return lineaPorcIVA;
	}


	public void setLineaPorcIVA(String lineaPorcIVA) {
		this.lineaPorcIVA = lineaPorcIVA;
	}


	public String getLineaMontoIVA() {
		return lineaMontoIVA;
	}


	public void setLineaMontoIVA(String lineaMontoIVA) {
		this.lineaMontoIVA = lineaMontoIVA;
	}


	public String getLineaPorcIEPS() {
		return lineaPorcIEPS;
	}


	public void setLineaPorcIEPS(String lineaPorcIEPS) {
		this.lineaPorcIEPS = lineaPorcIEPS;
	}


	public String getLineaMontoIEPS() {
		return lineaMontoIEPS;
	}


	public void setLineaMontoIEPS(String lineaMontoIEPS) {
		this.lineaMontoIEPS = lineaMontoIEPS;
	}


	public String getLineaPrecioUnitarioConImp() {
		return lineaPrecioUnitarioConImp;
	}


	public void setLineaPrecioUnitarioConImp(String lineaPrecioUnitarioConImp) {
		this.lineaPrecioUnitarioConImp = lineaPrecioUnitarioConImp;
	}


	public String getLineaImporteConImp() {
		return lineaImporteConImp;
	}


	public void setLineaImporteConImp(String lineaImporteConImp) {
		this.lineaImporteConImp = lineaImporteConImp;
	}


	public String getLineaFrontera() {
		return lineaFrontera;
	}


	public void setLineaFrontera(String lineaFrontera) {
		this.lineaFrontera = lineaFrontera;
	}


	


	public String getLineaPaisOrigen() {
		return lineaPaisOrigen;
	}


	public void setLineaPaisOrigen(String lineaPaisOrigen) {
		this.lineaPaisOrigen = lineaPaisOrigen;
	}


	public String getLineaEANAduana() {
		return lineaEANAduana;
	}


	public void setLineaEANAduana(String lineaEANAduana) {
		this.lineaEANAduana = lineaEANAduana;
	}


	public String getLineaMisc01() {
		return lineaMisc01;
	}


	public void setLineaMisc01(String lineaMisc01) {
		this.lineaMisc01 = lineaMisc01;
	}


	public String getLineaMisc02() {
		return lineaMisc02;
	}


	public void setLineaMisc02(String lineaMisc02) {
		this.lineaMisc02 = lineaMisc02;
	}


	public String getLineaMisc03() {
		return lineaMisc03;
	}


	public void setLineaMisc03(String lineaMisc03) {
		this.lineaMisc03 = lineaMisc03;
	}


	public String getLineaMisc04() {
		return lineaMisc04;
	}


	public void setLineaMisc04(String lineaMisc04) {
		this.lineaMisc04 = lineaMisc04;
	}


	public String getLineaMisc05() {
		return lineaMisc05;
	}


	public void setLineaMisc05(String lineaMisc05) {
		this.lineaMisc05 = lineaMisc05;
	}


	public String getLineaMisc06() {
		return lineaMisc06;
	}


	public void setLineaMisc06(String lineaMisc06) {
		this.lineaMisc06 = lineaMisc06;
	}


	public String getLineaMisc07() {
		return lineaMisc07;
	}


	public void setLineaMisc07(String lineaMisc07) {
		this.lineaMisc07 = lineaMisc07;
	}


	public String getLineaMisc08() {
		return lineaMisc08;
	}


	public void setLineaMisc08(String lineaMisc08) {
		this.lineaMisc08 = lineaMisc08;
	}


	public String getLineaMisc09() {
		return lineaMisc09;
	}


	public void setLineaMisc09(String lineaMisc09) {
		this.lineaMisc09 = lineaMisc09;
	}


	public String getLineaMisc10() {
		return lineaMisc10;
	}


	public void setLineaMisc10(String lineaMisc10) {
		this.lineaMisc10 = lineaMisc10;
	}


	public String getLineaMisc11() {
		return lineaMisc11;
	}


	public void setLineaMisc11(String lineaMisc11) {
		this.lineaMisc11 = lineaMisc11;
	}


	public String getLineaMisc12() {
		return lineaMisc12;
	}


	public void setLineaMisc12(String lineaMisc12) {
		this.lineaMisc12 = lineaMisc12;
	}


	public String getLineaMisc13() {
		return lineaMisc13;
	}


	public void setLineaMisc13(String lineaMisc13) {
		this.lineaMisc13 = lineaMisc13;
	}


	public String getLineaMisc14() {
		return lineaMisc14;
	}


	public void setLineaMisc14(String lineaMisc14) {
		this.lineaMisc14 = lineaMisc14;
	}


	public String getLineaMisc15() {
		return lineaMisc15;
	}


	public void setLineaMisc15(String lineaMisc15) {
		this.lineaMisc15 = lineaMisc15;
	}


	public String getLineaMisc16() {
		return lineaMisc16;
	}


	public void setLineaMisc16(String lineaMisc16) {
		this.lineaMisc16 = lineaMisc16;
	}


	public String getLineaMisc17() {
		return lineaMisc17;
	}


	public void setLineaMisc17(String lineaMisc17) {
		this.lineaMisc17 = lineaMisc17;
	}


	public String getLineaMisc18() {
		return lineaMisc18;
	}


	public void setLineaMisc18(String lineaMisc18) {
		this.lineaMisc18 = lineaMisc18;
	}


	public String getLineaMisc19() {
		return lineaMisc19;
	}


	public void setLineaMisc19(String lineaMisc19) {
		this.lineaMisc19 = lineaMisc19;
	}


	public String getLineaMisc20() {
		return lineaMisc20;
	}


	public void setLineaMisc20(String lineaMisc20) {
		this.lineaMisc20 = lineaMisc20;
	}


	public String getLineaMisc21() {
		return lineaMisc21;
	}


	public void setLineaMisc21(String lineaMisc21) {
		this.lineaMisc21 = lineaMisc21;
	}


	public String getLineaMisc22() {
		return lineaMisc22;
	}


	public void setLineaMisc22(String lineaMisc22) {
		this.lineaMisc22 = lineaMisc22;
	}


	public String getLineaMisc23() {
		return lineaMisc23;
	}


	public void setLineaMisc23(String lineaMisc23) {
		this.lineaMisc23 = lineaMisc23;
	}


	public String getLineaMisc24() {
		return lineaMisc24;
	}


	public void setLineaMisc24(String lineaMisc24) {
		this.lineaMisc24 = lineaMisc24;
	}


	public String getLineaMisc25() {
		return lineaMisc25;
	}


	public void setLineaMisc25(String lineaMisc25) {
		this.lineaMisc25 = lineaMisc25;
	}


	public String getLineaMisc26() {
		return lineaMisc26;
	}


	public void setLineaMisc26(String lineaMisc26) {
		this.lineaMisc26 = lineaMisc26;
	}


	public String getLineaMisc27() {
		return lineaMisc27;
	}


	public void setLineaMisc27(String lineaMisc27) {
		this.lineaMisc27 = lineaMisc27;
	}


	public String getLineaMisc28() {
		return lineaMisc28;
	}


	public void setLineaMisc28(String lineaMisc28) {
		this.lineaMisc28 = lineaMisc28;
	}


	public String getLineaMisc29() {
		return lineaMisc29;
	}


	public void setLineaMisc29(String lineaMisc29) {
		this.lineaMisc29 = lineaMisc29;
	}


	public String getLineaMisc30() {
		return lineaMisc30;
	}


	public void setLineaMisc30(String lineaMisc30) {
		this.lineaMisc30 = lineaMisc30;
	}


	public String getLineaMisc31() {
		return lineaMisc31;
	}


	public void setLineaMisc31(String lineaMisc31) {
		this.lineaMisc31 = lineaMisc31;
	}


	public String getLineaMisc32() {
		return lineaMisc32;
	}


	public void setLineaMisc32(String lineaMisc32) {
		this.lineaMisc32 = lineaMisc32;
	}


	public String getLineaMisc33() {
		return lineaMisc33;
	}


	public void setLineaMisc33(String lineaMisc33) {
		this.lineaMisc33 = lineaMisc33;
	}


	public String getLineaMisc34() {
		return lineaMisc34;
	}


	public void setLineaMisc34(String lineaMisc34) {
		this.lineaMisc34 = lineaMisc34;
	}


	public String getLineaMisc35() {
		return lineaMisc35;
	}


	public void setLineaMisc35(String lineaMisc35) {
		this.lineaMisc35 = lineaMisc35;
	}


	public String getLineaMisc36() {
		return lineaMisc36;
	}


	public void setLineaMisc36(String lineaMisc36) {
		this.lineaMisc36 = lineaMisc36;
	}


	public String getLineaMisc37() {
		return lineaMisc37;
	}


	public void setLineaMisc37(String lineaMisc37) {
		this.lineaMisc37 = lineaMisc37;
	}


	public String getLineaMisc38() {
		return lineaMisc38;
	}


	public void setLineaMisc38(String lineaMisc38) {
		this.lineaMisc38 = lineaMisc38;
	}


	public String getLineaMisc39() {
		return lineaMisc39;
	}


	public void setLineaMisc39(String lineaMisc39) {
		this.lineaMisc39 = lineaMisc39;
	}


	public String getLineaMisc40() {
		return lineaMisc40;
	}


	public void setLineaMisc40(String lineaMisc40) {
		this.lineaMisc40 = lineaMisc40;
	}


	public String getLineaMisc41() {
		return lineaMisc41;
	}


	public void setLineaMisc41(String lineaMisc41) {
		this.lineaMisc41 = lineaMisc41;
	}


	public String getLineaMisc42() {
		return lineaMisc42;
	}


	public void setLineaMisc42(String lineaMisc42) {
		this.lineaMisc42 = lineaMisc42;
	}


	public String getLineaMisc43() {
		return lineaMisc43;
	}


	public void setLineaMisc43(String lineaMisc43) {
		this.lineaMisc43 = lineaMisc43;
	}


	public String getLineaMisc44() {
		return lineaMisc44;
	}


	public void setLineaMisc44(String lineaMisc44) {
		this.lineaMisc44 = lineaMisc44;
	}


	public String getLineaMisc45() {
		return lineaMisc45;
	}


	public void setLineaMisc45(String lineaMisc45) {
		this.lineaMisc45 = lineaMisc45;
	}


	public String getLineaMisc46() {
		return lineaMisc46;
	}


	public void setLineaMisc46(String lineaMisc46) {
		this.lineaMisc46 = lineaMisc46;
	}


	public String getLineaMisc47() {
		return lineaMisc47;
	}


	public void setLineaMisc47(String lineaMisc47) {
		this.lineaMisc47 = lineaMisc47;
	}


	public String getLineaMisc48() {
		return lineaMisc48;
	}


	public void setLineaMisc48(String lineaMisc48) {
		this.lineaMisc48 = lineaMisc48;
	}


	public String getLineaMisc49() {
		return lineaMisc49;
	}


	public void setLineaMisc49(String lineaMisc49) {
		this.lineaMisc49 = lineaMisc49;
	}


	public String getLineaMisc50() {
		return lineaMisc50;
	}


	public void setLineaMisc50(String lineaMisc50) {
		this.lineaMisc50 = lineaMisc50;
	}


	public String getLineaMedicionSecundaria() {
		return lineaMedicionSecundaria;
	}


	public void setLineaMedicionSecundaria(String lineaMedicionSecundaria) {
		this.lineaMedicionSecundaria = lineaMedicionSecundaria;
	}


	public String getLineaTipoIdentAdicional() {
		return lineaTipoIdentAdicional;
	}


	public void setLineaTipoIdentAdicional(String lineaTipoIdentAdicional) {
		this.lineaTipoIdentAdicional = lineaTipoIdentAdicional;
	}


	public String getLineaDescripIdioma() {
		return lineaDescripIdioma;
	}


	public void setLineaDescripIdioma(String lineaDescripIdioma) {
		this.lineaDescripIdioma = lineaDescripIdioma;
	}


	public String getLineaCantAdicional() {
		return lineaCantAdicional;
	}


	public void setLineaCantAdicional(String lineaCantAdicional) {
		this.lineaCantAdicional = lineaCantAdicional;
	}


	public String getLineaCantAdicionalTipo() {
		return lineaCantAdicionalTipo;
	}


	public void setLineaCantAdicionalTipo(String lineaCantAdicionalTipo) {
		this.lineaCantAdicionalTipo = lineaCantAdicionalTipo;
	}


	public String getLineaTipoReferencia() {
		return lineaTipoReferencia;
	}


	public void setLineaTipoReferencia(String lineaTipoReferencia) {
		this.lineaTipoReferencia = lineaTipoReferencia;
	}


	public String getLineaCalifNumIdentidad() {
		return lineaCalifNumIdentidad;
	}


	public void setLineaCalifNumIdentidad(String lineaCalifNumIdentidad) {
		this.lineaCalifNumIdentidad = lineaCalifNumIdentidad;
	}


	public String getLineaTipoEmpaquetado() {
		return lineaTipoEmpaquetado;
	}


	public void setLineaTipoEmpaquetado(String lineaTipoEmpaquetado) {
		this.lineaTipoEmpaquetado = lineaTipoEmpaquetado;
	}


	public String getLineaMetodoPago() {
		return lineaMetodoPago;
	}


	public void setLineaMetodoPago(String lineaMetodoPago) {
		this.lineaMetodoPago = lineaMetodoPago;
	}


	public String getLineaNumeroLote() {
		return lineaNumeroLote;
	}


	public void setLineaNumeroLote(String lineaNumeroLote) {
		this.lineaNumeroLote = lineaNumeroLote;
	}


	public String getLineaFechaProdLote() {
		return lineaFechaProdLote;
	}


	public void setLineaFechaProdLote(String lineaFechaProdLote) {
		this.lineaFechaProdLote = lineaFechaProdLote;
	}


	public String getLineaIndCargoDescuento() {
		return lineaIndCargoDescuento;
	}


	public void setLineaIndCargoDescuento(String lineaIndCargoDescuento) {
		this.lineaIndCargoDescuento = lineaIndCargoDescuento;
	}


	public String getLineaInfCargoDescuento() {
		return lineaInfCargoDescuento;
	}


	public void setLineaInfCargoDescuento(String lineaInfCargoDescuento) {
		this.lineaInfCargoDescuento = lineaInfCargoDescuento;
	}


	public String getLineaSecuenciaCalculo() {
		return lineaSecuenciaCalculo;
	}


	public void setLineaSecuenciaCalculo(String lineaSecuenciaCalculo) {
		this.lineaSecuenciaCalculo = lineaSecuenciaCalculo;
	}


	public String getLineaTipoServiciosEsp() {
		return lineaTipoServiciosEsp;
	}


	public void setLineaTipoServiciosEsp(String lineaTipoServiciosEsp) {
		this.lineaTipoServiciosEsp = lineaTipoServiciosEsp;
	}


	public String getLineaIdentImpuesto() {
		return lineaIdentImpuesto;
	}


	public void setLineaIdentImpuesto(String lineaIdentImpuesto) {
		this.lineaIdentImpuesto = lineaIdentImpuesto;
	}


	public String getLineaCodEAN() {
		return lineaCodEAN;
	}


	public void setLineaCodEAN(String lineaCodEAN) {
		this.lineaCodEAN = lineaCodEAN;
	}


	public String getLineaNoIdentificacion() {
		return lineaNoIdentificacion;
	}


	public void setLineaNoIdentificacion(String lineaNoIdentificacion) {
		this.lineaNoIdentificacion = lineaNoIdentificacion;
	}


	public EspecOrdVarLineAduanaCfdTxtDTO getLineAduana() {
		return lineAduana;
	}


	public void setLineAduana(EspecOrdVarLineAduanaCfdTxtDTO lineAduana) {
		this.lineAduana = lineAduana;
	}


	@Override
	public String toString() {
		return "EspecOrdLineDetCfdTxtDTO [lineaDescripcion=" + lineaDescripcion + ", lineaCantidad=" + lineaCantidad
				+ ", lineaUnidad=" + lineaUnidad + ", lineaPrecioUnitario=" + lineaPrecioUnitario + ", lineaImporte="
				+ lineaImporte + ", lineaAduanaNumDoc=" + lineaAduanaNumDoc + ", lineaAduanaFechaDoc="
				+ lineaAduanaFechaDoc + ", lineaAduanaNombre=" + lineaAduanaNombre + ", lineaCuentaPredialNumero="
				+ lineaCuentaPredialNumero + ", lineaFraccionArancelaria=" + lineaFraccionArancelaria + ", lineaNotas="
				+ lineaNotas + ", lineaCodUPC=" + lineaCodUPC + ", lineaPiezasEmpaque=" + lineaPiezasEmpaque
				+ ", lineaCodDUN=" + lineaCodDUN + ", lineaCodBarras=" + lineaCodBarras + ", lineaCodArticulo="
				+ lineaCodArticulo + ", lineaCodDesc=" + lineaCodDesc + ", lineaPorcDesc=" + lineaPorcDesc
				+ ", lineaMontoDesc=" + lineaMontoDesc + ", lineaPrecioUnitarioSinDesc=" + lineaPrecioUnitarioSinDesc
				+ ", lineaCantEmpaquesFac=" + lineaCantEmpaquesFac + ", lineaCantEmpaquesEmb=" + lineaCantEmpaquesEmb
				+ ", lineaPorcIVA=" + lineaPorcIVA + ", lineaMontoIVA=" + lineaMontoIVA + ", lineaPorcIEPS="
				+ lineaPorcIEPS + ", lineaMontoIEPS=" + lineaMontoIEPS + ", lineaPrecioUnitarioConImp="
				+ lineaPrecioUnitarioConImp + ", lineaImporteConImp=" + lineaImporteConImp + ", lineaFrontera="
				+ lineaFrontera + ", lineaPaisOrigen=" + lineaPaisOrigen + ", lineaEANAduana=" + lineaEANAduana
				+ ", lineaMisc01=" + lineaMisc01 + ", lineaMisc02=" + lineaMisc02 + ", lineaMisc03=" + lineaMisc03
				+ ", lineaMisc04=" + lineaMisc04 + ", lineaMisc05=" + lineaMisc05 + ", lineaMisc06=" + lineaMisc06
				+ ", lineaMisc07=" + lineaMisc07 + ", lineaMisc08=" + lineaMisc08 + ", lineaMisc09=" + lineaMisc09
				+ ", lineaMisc10=" + lineaMisc10 + ", lineaMisc11=" + lineaMisc11 + ", lineaMisc12=" + lineaMisc12
				+ ", lineaMisc13=" + lineaMisc13 + ", lineaMisc14=" + lineaMisc14 + ", lineaMisc15=" + lineaMisc15
				+ ", lineaMisc16=" + lineaMisc16 + ", lineaMisc17=" + lineaMisc17 + ", lineaMisc18=" + lineaMisc18
				+ ", lineaMisc19=" + lineaMisc19 + ", lineaMisc20=" + lineaMisc20 + ", lineaMisc21=" + lineaMisc21
				+ ", lineaMisc22=" + lineaMisc22 + ", lineaMisc23=" + lineaMisc23 + ", lineaMisc24=" + lineaMisc24
				+ ", lineaMisc25=" + lineaMisc25 + ", lineaMisc26=" + lineaMisc26 + ", lineaMisc27=" + lineaMisc27
				+ ", lineaMisc28=" + lineaMisc28 + ", lineaMisc29=" + lineaMisc29 + ", lineaMisc30=" + lineaMisc30
				+ ", lineaMisc31=" + lineaMisc31 + ", lineaMisc32=" + lineaMisc32 + ", lineaMisc33=" + lineaMisc33
				+ ", lineaMisc34=" + lineaMisc34 + ", lineaMisc35=" + lineaMisc35 + ", lineaMisc36=" + lineaMisc36
				+ ", lineaMisc37=" + lineaMisc37 + ", lineaMisc38=" + lineaMisc38 + ", lineaMisc39=" + lineaMisc39
				+ ", lineaMisc40=" + lineaMisc40 + ", lineaMisc41=" + lineaMisc41 + ", lineaMisc42=" + lineaMisc42
				+ ", lineaMisc43=" + lineaMisc43 + ", lineaMisc44=" + lineaMisc44 + ", lineaMisc45=" + lineaMisc45
				+ ", lineaMisc46=" + lineaMisc46 + ", lineaMisc47=" + lineaMisc47 + ", lineaMisc48=" + lineaMisc48
				+ ", lineaMisc49=" + lineaMisc49 + ", lineaMisc50=" + lineaMisc50 + ", lineaMedicionSecundaria="
				+ lineaMedicionSecundaria + ", lineaTipoIdentAdicional=" + lineaTipoIdentAdicional
				+ ", lineaDescripIdioma=" + lineaDescripIdioma + ", lineaCantAdicional=" + lineaCantAdicional
				+ ", lineaCantAdicionalTipo=" + lineaCantAdicionalTipo + ", lineaTipoReferencia=" + lineaTipoReferencia
				+ ", lineaCalifNumIdentidad=" + lineaCalifNumIdentidad + ", lineaTipoEmpaquetado="
				+ lineaTipoEmpaquetado + ", lineaMetodoPago=" + lineaMetodoPago + ", lineaNumeroLote=" + lineaNumeroLote
				+ ", lineaFechaProdLote=" + lineaFechaProdLote + ", lineaIndCargoDescuento=" + lineaIndCargoDescuento
				+ ", lineaInfCargoDescuento=" + lineaInfCargoDescuento + ", lineaSecuenciaCalculo="
				+ lineaSecuenciaCalculo + ", lineaTipoServiciosEsp=" + lineaTipoServiciosEsp + ", lineaIdentImpuesto="
				+ lineaIdentImpuesto + ", lineaCodEAN=" + lineaCodEAN + ", lineaNoIdentificacion="
				+ lineaNoIdentificacion + ", lineAduana=" + lineAduana + "]";
	}

	
	
	
	
	
	
	
	
}
