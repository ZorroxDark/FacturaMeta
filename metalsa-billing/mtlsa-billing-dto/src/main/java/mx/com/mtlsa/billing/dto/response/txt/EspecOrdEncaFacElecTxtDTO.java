package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;


@XmlRootElement(name="especOrdEncaFacElecTxt")
@XmlAccessorType(XmlAccessType.FIELD)
public class EspecOrdEncaFacElecTxtDTO implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6852605700731859828L;
	
	
	
	private String folio;
	private String nombreEmisor;
	private String rfcEmisor;
	private String domEmisorCalle;
	private String domEmisorNoExterior;
	private String domEmisorNoInterior;
	private String domEmisorColonia;
	private String domEmisorLocalidad;
	private String domEmisorReferencia;
	private String domEmisorMunicipio;
	private String domEmisorEstado;
	private String domEmisorPais;
	private String domEmisorCodigoPostal;
	private String telEmisor;
	private String domSucursalCalle;
	private String domSucursalNoExterior;
	private String domSucursalNoInterior;
	private String domSucursalColonia;
	private String domSucursalLocalidad;
	private String domSucursalReferencia;
	
	private String domSucursalMunicipio;
	private String domSucursalEstado;
	private String domSucursalPais;
	private String domSucursalCodigoPostal;
	private String telSucursal;
	private String version;
	private String serieComprobante;
	private String numeroAprobacion;
	private String formaPago;
	private String fecha;
	
	private String hora;
	private String domLugarExpideCalle;
	private String domLugarExpideNoExterior;
	private String domLugarExpideNoInterior;
	private String domLugarExpideColonia;
	private String domLugarExpideLocalidad;
	private String domLugarExpideReferencia;
	private String domLugarExpideMunicipio;
	private String domLugarExpideEstado;
	private String domLugarExpidePais;
	
	private String domLugarExpideCodigoPostal;
	private String nombreReceptor;
	private String rfcReceptor;
	private String domReceptorCalle;
	private String domReceptorNoExterior;
	private String domReceptorNoInterior;
	private String domReceptorColonia;
	private String domReceptorLocalidad;
	private String domReceptorReferencia;
	
	private String domReceptorMunicipio;
	private String domReceptorEstado;
	private String domReceptorPais;
	private String domReceptorCodigoPostal;
	private String montoSubTotal;
	private String montoIVA;
	private String montoTotal;
	private String estado;
	private String tipoCFD;
	private String notas;
	
	
	private String notas02;
	private String notas03;
	private String tradingPartnerProv;
	private String califTradingPartnerProv;
	private String eanProveedor;
	private String numeroFactura;
	private String numeroOrdenCompra;
	private String fechaOrdenCompra;
	private String numeroProveedor;
	private String eanTienda;
	private String numeroTienda;
	
	private String nombreTienda;
	private String domTiendaCalle;
	private String domTiendaNoExterior;
	private String domTiendaNoInterior;
	private String domTiendaColonia;
	private String domTiendaLocalidad;
	private String domTiendaReferencia;
	private String domTiendaMunicipio;
	private String domTiendaEstado;
	private String domTiendaPais;
	
	
	private String domTiendaCodigoPostal;
	private String rfcTienda;
	private String codMoneda;
	private String diasPago;
	private String porcDescProntoPago;
	private String montoDescProntoPago;
	private String codDescuento;
	private String porcDescuento;
	private String montoDescuento;
	private String cantidadLineasFactura;
	
	
	private String fechaVencimiento;
	private String codZona;
	private String numeroReceptor;
	private String codVendedor;
	private String nombreVendedor;
	private String viaEmbarque;
	private String condicionesPago;
	private String numeroPedido;
	private String fechaPedido;
	private String letrasMontoTotal;
	
	
	private String cantidadUnidades;
	private String cantidadEmpaques;
	private String eanReceptor;
	private String eanLugarExpide;
	private String iepsId;
	private String estatus;
	private String numeroEmisor;
	private String montoMerma;
	private String montoSubTotalApIVA;
	private String transportista;
	
	
	private String numeroSolicitud;
	private String descMoneda;
	
	private String misc01;
	private String misc02;
	private String misc03;
	private String misc04;
	private String misc05;
	private String misc06;
	private String misc07;
	private String misc08;
	private String misc09;
	private String misc10;
	
	private String misc11;
	private String misc12;
	private String misc13;
	private String misc14;
	private String misc15;
	private String misc16;
	private String misc17;
	private String misc18;
	private String misc19;
	private String misc20;
	
	private String misc21;
	private String misc22;
	private String misc23;
	private String misc24;
	private String misc25;
	private String misc26;
	private String misc27;
	private String misc28;
	private String misc29;
	private String misc30;
	
	private String misc31;
	private String misc32;
	private String misc33;
	private String misc34;
	private String misc35;
	private String misc36;
	private String misc37;
	private String misc38;
	private String misc39;
	private String misc40;
	
	private String misc41;
	private String misc42;
	private String misc43;
	private String misc44;
	private String misc45;
	private String misc46;
	private String misc47;
	private String misc48;
	private String misc49;
	private String misc50;
	
	private String porcIVA;
	private String montoIEPS;
	private String documentStatus;
	private String deliveryDate;
	private String regimenFiscal;
	private String numCtaPago;
	private String numContraRecibo;
	private String fechaNumContraRecibo;
	private String contactoCompras;
	private String customsgln;
	private String alternateIdentificationGln;
	private String nombreAduana;
	private String nombreAduanaCiudad;
	private String funcDivisa;
	private String tasaDivisa;
	private String refTiempoPago;
	private String refTerminoTiempoPago;
	private String lugarExpedicion;
	
	
	private String serieFolioFiscalOrig;
	private String tipoEspecialDeServicio;
	private String fechaFolioFiscalOrig;
	private String porcentajeNoAplicado;
	private String montoFolioFiscalOrig;
	private String montoTotalDescuentos;
	private String montoTotalPagar;
	private String anoAprobacion9;
	private String motivoDescuento;
	private String metodoPago;
	
	
	private String efectoComprobante;
	private String montoTotalImpRetenidos;
	private String montoTotalImpTrasladados;
	
	
	
	public EspecOrdEncaFacElecTxtDTO (){
		
	}
	
	
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getNombreEmisor() {
		return nombreEmisor;
	}
	public void setNombreEmisor(String nombreEmisor) {
		this.nombreEmisor = nombreEmisor;
	}
	public String getRfcEmisor() {
		return rfcEmisor;
	}
	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}
	public String getDomEmisorCalle() {
		return domEmisorCalle;
	}
	public void setDomEmisorCalle(String domEmisorCalle) {
		this.domEmisorCalle = domEmisorCalle;
	}
	public String getDomEmisorNoExterior() {
		return domEmisorNoExterior;
	}
	public void setDomEmisorNoExterior(String domEmisorNoExterior) {
		this.domEmisorNoExterior = domEmisorNoExterior;
	}
	public String getDomEmisorNoInterior() {
		return domEmisorNoInterior;
	}
	public void setDomEmisorNoInterior(String domEmisorNoInterior) {
		this.domEmisorNoInterior = domEmisorNoInterior;
	}
	public String getDomEmisorColonia() {
		return domEmisorColonia;
	}
	public void setDomEmisorColonia(String domEmisorColonia) {
		this.domEmisorColonia = domEmisorColonia;
	}
	public String getDomEmisorLocalidad() {
		return domEmisorLocalidad;
	}
	public void setDomEmisorLocalidad(String domEmisorLocalidad) {
		this.domEmisorLocalidad = domEmisorLocalidad;
	}
	public String getDomEmisorReferencia() {
		return domEmisorReferencia;
	}
	public void setDomEmisorReferencia(String domEmisorReferencia) {
		this.domEmisorReferencia = domEmisorReferencia;
	}
	public String getDomEmisorMunicipio() {
		return domEmisorMunicipio;
	}
	public void setDomEmisorMunicipio(String domEmisorMunicipio) {
		this.domEmisorMunicipio = domEmisorMunicipio;
	}
	public String getDomEmisorEstado() {
		return domEmisorEstado;
	}
	public void setDomEmisorEstado(String domEmisorEstado) {
		this.domEmisorEstado = domEmisorEstado;
	}
	public String getDomEmisorPais() {
		return domEmisorPais;
	}
	public void setDomEmisorPais(String domEmisorPais) {
		this.domEmisorPais = domEmisorPais;
	}
	public String getDomEmisorCodigoPostal() {
		return domEmisorCodigoPostal;
	}
	public void setDomEmisorCodigoPostal(String domEmisorCodigoPostal) {
		this.domEmisorCodigoPostal = domEmisorCodigoPostal;
	}
	public String getTelEmisor() {
		return telEmisor;
	}
	public void setTelEmisor(String telEmisor) {
		this.telEmisor = telEmisor;
	}
	public String getDomSucursalCalle() {
		return domSucursalCalle;
	}
	public void setDomSucursalCalle(String domSucursalCalle) {
		this.domSucursalCalle = domSucursalCalle;
	}
	public String getDomSucursalNoExterior() {
		return domSucursalNoExterior;
	}
	public void setDomSucursalNoExterior(String domSucursalNoExterior) {
		this.domSucursalNoExterior = domSucursalNoExterior;
	}
	public String getDomSucursalNoInterior() {
		return domSucursalNoInterior;
	}
	public void setDomSucursalNoInterior(String domSucursalNoInterior) {
		this.domSucursalNoInterior = domSucursalNoInterior;
	}
	public String getDomSucursalColonia() {
		return domSucursalColonia;
	}
	public void setDomSucursalColonia(String domSucursalColonia) {
		this.domSucursalColonia = domSucursalColonia;
	}
	public String getDomSucursalLocalidad() {
		return domSucursalLocalidad;
	}
	public void setDomSucursalLocalidad(String domSucursalLocalidad) {
		this.domSucursalLocalidad = domSucursalLocalidad;
	}
	public String getDomSucursalReferencia() {
		return domSucursalReferencia;
	}
	public void setDomSucursalReferencia(String domSucursalReferencia) {
		this.domSucursalReferencia = domSucursalReferencia;
	}
	public String getDomSucursalMunicipio() {
		return domSucursalMunicipio;
	}
	public void setDomSucursalMunicipio(String domSucursalMunicipio) {
		this.domSucursalMunicipio = domSucursalMunicipio;
	}
	public String getDomSucursalEstado() {
		return domSucursalEstado;
	}
	public void setDomSucursalEstado(String domSucursalEstado) {
		this.domSucursalEstado = domSucursalEstado;
	}
	public String getDomSucursalPais() {
		return domSucursalPais;
	}
	public void setDomSucursalPais(String domSucursalPais) {
		this.domSucursalPais = domSucursalPais;
	}
	public String getDomSucursalCodigoPostal() {
		return domSucursalCodigoPostal;
	}
	public void setDomSucursalCodigoPostal(String domSucursalCodigoPostal) {
		this.domSucursalCodigoPostal = domSucursalCodigoPostal;
	}
	public String getTelSucursal() {
		return telSucursal;
	}
	public void setTelSucursal(String telSucursal) {
		this.telSucursal = telSucursal;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSerieComprobante() {
		return serieComprobante;
	}
	public void setSerieComprobante(String serieComprobante) {
		this.serieComprobante = serieComprobante;
	}
	public String getNumeroAprobacion() {
		return numeroAprobacion;
	}
	public void setNumeroAprobacion(String numeroAprobacion) {
		this.numeroAprobacion = numeroAprobacion;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDomLugarExpideCalle() {
		return domLugarExpideCalle;
	}
	public void setDomLugarExpideCalle(String domLugarExpideCalle) {
		this.domLugarExpideCalle = domLugarExpideCalle;
	}
	public String getDomLugarExpideNoExterior() {
		return domLugarExpideNoExterior;
	}
	public void setDomLugarExpideNoExterior(String domLugarExpideNoExterior) {
		this.domLugarExpideNoExterior = domLugarExpideNoExterior;
	}
	public String getDomLugarExpideNoInterior() {
		return domLugarExpideNoInterior;
	}
	public void setDomLugarExpideNoInterior(String domLugarExpideNoInterior) {
		this.domLugarExpideNoInterior = domLugarExpideNoInterior;
	}
	public String getDomLugarExpideColonia() {
		return domLugarExpideColonia;
	}
	public void setDomLugarExpideColonia(String domLugarExpideColonia) {
		this.domLugarExpideColonia = domLugarExpideColonia;
	}
	public String getDomLugarExpideLocalidad() {
		return domLugarExpideLocalidad;
	}
	public void setDomLugarExpideLocalidad(String domLugarExpideLocalidad) {
		this.domLugarExpideLocalidad = domLugarExpideLocalidad;
	}
	public String getDomLugarExpideReferencia() {
		return domLugarExpideReferencia;
	}
	public void setDomLugarExpideReferencia(String domLugarExpideReferencia) {
		this.domLugarExpideReferencia = domLugarExpideReferencia;
	}
	public String getDomLugarExpideMunicipio() {
		return domLugarExpideMunicipio;
	}
	public void setDomLugarExpideMunicipio(String domLugarExpideMunicipio) {
		this.domLugarExpideMunicipio = domLugarExpideMunicipio;
	}
	public String getDomLugarExpideEstado() {
		return domLugarExpideEstado;
	}
	public void setDomLugarExpideEstado(String domLugarExpideEstado) {
		this.domLugarExpideEstado = domLugarExpideEstado;
	}
	public String getDomLugarExpidePais() {
		return domLugarExpidePais;
	}
	public void setDomLugarExpidePais(String domLugarExpidePais) {
		this.domLugarExpidePais = domLugarExpidePais;
	}
	public String getDomLugarExpideCodigoPostal() {
		return domLugarExpideCodigoPostal;
	}
	public void setDomLugarExpideCodigoPostal(String domLugarExpideCodigoPostal) {
		this.domLugarExpideCodigoPostal = domLugarExpideCodigoPostal;
	}
	public String getNombreReceptor() {
		return nombreReceptor;
	}
	public void setNombreReceptor(String nombreReceptor) {
		this.nombreReceptor = nombreReceptor;
	}
	public String getRfcReceptor() {
		return rfcReceptor;
	}
	public void setRfcReceptor(String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}
	public String getDomReceptorCalle() {
		return domReceptorCalle;
	}
	public void setDomReceptorCalle(String domReceptorCalle) {
		this.domReceptorCalle = domReceptorCalle;
	}
	public String getDomReceptorNoExterior() {
		return domReceptorNoExterior;
	}
	public void setDomReceptorNoExterior(String domReceptorNoExterior) {
		this.domReceptorNoExterior = domReceptorNoExterior;
	}
	public String getDomReceptorNoInterior() {
		return domReceptorNoInterior;
	}
	public void setDomReceptorNoInterior(String domReceptorNoInterior) {
		this.domReceptorNoInterior = domReceptorNoInterior;
	}
	public String getDomReceptorColonia() {
		return domReceptorColonia;
	}
	public void setDomReceptorColonia(String domReceptorColonia) {
		this.domReceptorColonia = domReceptorColonia;
	}
	public String getDomReceptorLocalidad() {
		return domReceptorLocalidad;
	}
	public void setDomReceptorLocalidad(String domReceptorLocalidad) {
		this.domReceptorLocalidad = domReceptorLocalidad;
	}
	public String getDomReceptorReferencia() {
		return domReceptorReferencia;
	}
	public void setDomReceptorReferencia(String domReceptorReferencia) {
		this.domReceptorReferencia = domReceptorReferencia;
	}
	public String getDomReceptorMunicipio() {
		return domReceptorMunicipio;
	}
	public void setDomReceptorMunicipio(String domReceptorMunicipio) {
		this.domReceptorMunicipio = domReceptorMunicipio;
	}
	public String getDomReceptorEstado() {
		return domReceptorEstado;
	}
	public void setDomReceptorEstado(String domReceptorEstado) {
		this.domReceptorEstado = domReceptorEstado;
	}
	public String getDomReceptorPais() {
		return domReceptorPais;
	}
	public void setDomReceptorPais(String domReceptorPais) {
		this.domReceptorPais = domReceptorPais;
	}
	public String getDomReceptorCodigoPostal() {
		return domReceptorCodigoPostal;
	}
	public void setDomReceptorCodigoPostal(String domReceptorCodigoPostal) {
		this.domReceptorCodigoPostal = domReceptorCodigoPostal;
	}
	public String getMontoSubTotal() {
		return montoSubTotal;
	}
	public void setMontoSubTotal(String montoSubTotal) {
		this.montoSubTotal = montoSubTotal;
	}
	public String getMontoIVA() {
		return montoIVA;
	}
	public void setMontoIVA(String montoIVA) {
		this.montoIVA = montoIVA;
	}
	public String getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(String montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipoCFD() {
		return tipoCFD;
	}
	public void setTipoCFD(String tipoCFD) {
		this.tipoCFD = tipoCFD;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public String getNotas02() {
		return notas02;
	}
	public void setNotas02(String notas02) {
		this.notas02 = notas02;
	}
	public String getNotas03() {
		return notas03;
	}
	public void setNotas03(String notas03) {
		this.notas03 = notas03;
	}
	public String getTradingPartnerProv() {
		return tradingPartnerProv;
	}
	public void setTradingPartnerProv(String tradingPartnerProv) {
		this.tradingPartnerProv = tradingPartnerProv;
	}
	public String getCalifTradingPartnerProv() {
		return califTradingPartnerProv;
	}
	public void setCalifTradingPartnerProv(String califTradingPartnerProv) {
		this.califTradingPartnerProv = califTradingPartnerProv;
	}
	public String getEanProveedor() {
		return eanProveedor;
	}
	public void setEanProveedor(String eanProveedor) {
		this.eanProveedor = eanProveedor;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getNumeroOrdenCompra() {
		return numeroOrdenCompra;
	}
	public void setNumeroOrdenCompra(String numeroOrdenCompra) {
		this.numeroOrdenCompra = numeroOrdenCompra;
	}
	public String getFechaOrdenCompra() {
		return fechaOrdenCompra;
	}
	public void setFechaOrdenCompra(String fechaOrdenCompra) {
		this.fechaOrdenCompra = fechaOrdenCompra;
	}
	public String getNumeroProveedor() {
		return numeroProveedor;
	}
	public void setNumeroProveedor(String numeroProveedor) {
		this.numeroProveedor = numeroProveedor;
	}
	public String getEanTienda() {
		return eanTienda;
	}
	public void setEanTienda(String eanTienda) {
		this.eanTienda = eanTienda;
	}
	public String getNumeroTienda() {
		return numeroTienda;
	}
	public void setNumeroTienda(String numeroTienda) {
		this.numeroTienda = numeroTienda;
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public String getDomTiendaCalle() {
		return domTiendaCalle;
	}
	public void setDomTiendaCalle(String domTiendaCalle) {
		this.domTiendaCalle = domTiendaCalle;
	}
	public String getDomTiendaNoExterior() {
		return domTiendaNoExterior;
	}
	public void setDomTiendaNoExterior(String domTiendaNoExterior) {
		this.domTiendaNoExterior = domTiendaNoExterior;
	}
	public String getDomTiendaNoInterior() {
		return domTiendaNoInterior;
	}
	public void setDomTiendaNoInterior(String domTiendaNoInterior) {
		this.domTiendaNoInterior = domTiendaNoInterior;
	}
	public String getDomTiendaColonia() {
		return domTiendaColonia;
	}
	public void setDomTiendaColonia(String domTiendaColonia) {
		this.domTiendaColonia = domTiendaColonia;
	}
	public String getDomTiendaLocalidad() {
		return domTiendaLocalidad;
	}
	public void setDomTiendaLocalidad(String domTiendaLocalidad) {
		this.domTiendaLocalidad = domTiendaLocalidad;
	}
	public String getDomTiendaReferencia() {
		return domTiendaReferencia;
	}
	public void setDomTiendaReferencia(String domTiendaReferencia) {
		this.domTiendaReferencia = domTiendaReferencia;
	}
	public String getDomTiendaMunicipio() {
		return domTiendaMunicipio;
	}
	public void setDomTiendaMunicipio(String domTiendaMunicipio) {
		this.domTiendaMunicipio = domTiendaMunicipio;
	}
	public String getDomTiendaEstado() {
		return domTiendaEstado;
	}
	public void setDomTiendaEstado(String domTiendaEstado) {
		this.domTiendaEstado = domTiendaEstado;
	}
	public String getDomTiendaPais() {
		return domTiendaPais;
	}
	public void setDomTiendaPais(String domTiendaPais) {
		this.domTiendaPais = domTiendaPais;
	}
	public String getDomTiendaCodigoPostal() {
		return domTiendaCodigoPostal;
	}
	public void setDomTiendaCodigoPostal(String domTiendaCodigoPostal) {
		this.domTiendaCodigoPostal = domTiendaCodigoPostal;
	}
	public String getRfcTienda() {
		return rfcTienda;
	}
	public void setRfcTienda(String rfcTienda) {
		this.rfcTienda = rfcTienda;
	}
	public String getCodMoneda() {
		return codMoneda;
	}
	public void setCodMoneda(String codMoneda) {
		this.codMoneda = codMoneda;
	}
	public String getDiasPago() {
		return diasPago;
	}
	public void setDiasPago(String diasPago) {
		this.diasPago = diasPago;
	}
	public String getPorcDescProntoPago() {
		return porcDescProntoPago;
	}
	public void setPorcDescProntoPago(String porcDescProntoPago) {
		this.porcDescProntoPago = porcDescProntoPago;
	}
	public String getMontoDescProntoPago() {
		return montoDescProntoPago;
	}
	public void setMontoDescProntoPago(String montoDescProntoPago) {
		this.montoDescProntoPago = montoDescProntoPago;
	}
	public String getCodDescuento() {
		return codDescuento;
	}
	public void setCodDescuento(String codDescuento) {
		this.codDescuento = codDescuento;
	}
	public String getPorcDescuento() {
		return porcDescuento;
	}
	public void setPorcDescuento(String porcDescuento) {
		this.porcDescuento = porcDescuento;
	}
	public String getMontoDescuento() {
		return montoDescuento;
	}
	public void setMontoDescuento(String montoDescuento) {
		this.montoDescuento = montoDescuento;
	}
	public String getCantidadLineasFactura() {
		return cantidadLineasFactura;
	}
	public void setCantidadLineasFactura(String cantidadLineasFactura) {
		this.cantidadLineasFactura = cantidadLineasFactura;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getCodZona() {
		return codZona;
	}
	public void setCodZona(String codZona) {
		this.codZona = codZona;
	}
	public String getNumeroReceptor() {
		return numeroReceptor;
	}
	public void setNumeroReceptor(String numeroReceptor) {
		this.numeroReceptor = numeroReceptor;
	}
	public String getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(String codVendedor) {
		this.codVendedor = codVendedor;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public String getViaEmbarque() {
		return viaEmbarque;
	}
	public void setViaEmbarque(String viaEmbarque) {
		this.viaEmbarque = viaEmbarque;
	}
	public String getCondicionesPago() {
		return condicionesPago;
	}
	public void setCondicionesPago(String condicionesPago) {
		this.condicionesPago = condicionesPago;
	}
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public String getLetrasMontoTotal() {
		return letrasMontoTotal;
	}
	public void setLetrasMontoTotal(String letrasMontoTotal) {
		this.letrasMontoTotal = letrasMontoTotal;
	}
	public String getCantidadUnidades() {
		return cantidadUnidades;
	}
	public void setCantidadUnidades(String cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}
	public String getCantidadEmpaques() {
		return cantidadEmpaques;
	}
	public void setCantidadEmpaques(String cantidadEmpaques) {
		this.cantidadEmpaques = cantidadEmpaques;
	}
	public String getEanReceptor() {
		return eanReceptor;
	}
	public void setEanReceptor(String eanReceptor) {
		this.eanReceptor = eanReceptor;
	}
	public String getEanLugarExpide() {
		return eanLugarExpide;
	}
	public void setEanLugarExpide(String eanLugarExpide) {
		this.eanLugarExpide = eanLugarExpide;
	}
	public String getIepsId() {
		return iepsId;
	}
	public void setIepsId(String iepsId) {
		this.iepsId = iepsId;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getNumeroEmisor() {
		return numeroEmisor;
	}
	public void setNumeroEmisor(String numeroEmisor) {
		this.numeroEmisor = numeroEmisor;
	}
	public String getMontoMerma() {
		return montoMerma;
	}
	public void setMontoMerma(String montoMerma) {
		this.montoMerma = montoMerma;
	}
	public String getMontoSubTotalApIVA() {
		return montoSubTotalApIVA;
	}
	public void setMontoSubTotalApIVA(String montoSubTotalApIVA) {
		this.montoSubTotalApIVA = montoSubTotalApIVA;
	}
	public String getTransportista() {
		return transportista;
	}
	public void setTransportista(String transportista) {
		this.transportista = transportista;
	}
	public String getNumeroSolicitud() {
		return numeroSolicitud;
	}
	public void setNumeroSolicitud(String numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}
	public String getDescMoneda() {
		return descMoneda;
	}
	public void setDescMoneda(String descMoneda) {
		this.descMoneda = descMoneda;
	}
	public String getMisc01() {
		return misc01;
	}
	public void setMisc01(String misc01) {
		this.misc01 = misc01;
	}
	public String getMisc02() {
		return misc02;
	}
	public void setMisc02(String misc02) {
		this.misc02 = misc02;
	}
	public String getMisc03() {
		return misc03;
	}
	public void setMisc03(String misc03) {
		this.misc03 = misc03;
	}
	public String getMisc04() {
		return misc04;
	}
	public void setMisc04(String misc04) {
		this.misc04 = misc04;
	}
	public String getMisc05() {
		return misc05;
	}
	public void setMisc05(String misc05) {
		this.misc05 = misc05;
	}
	public String getMisc06() {
		return misc06;
	}
	public void setMisc06(String misc06) {
		this.misc06 = misc06;
	}
	public String getMisc07() {
		return misc07;
	}
	public void setMisc07(String misc07) {
		this.misc07 = misc07;
	}
	public String getMisc08() {
		return misc08;
	}
	public void setMisc08(String misc08) {
		this.misc08 = misc08;
	}
	public String getMisc09() {
		return misc09;
	}
	public void setMisc09(String misc09) {
		this.misc09 = misc09;
	}
	public String getMisc10() {
		return misc10;
	}
	public void setMisc10(String misc10) {
		this.misc10 = misc10;
	}
	public String getMisc11() {
		return misc11;
	}
	public void setMisc11(String misc11) {
		this.misc11 = misc11;
	}
	public String getMisc12() {
		return misc12;
	}
	public void setMisc12(String misc12) {
		this.misc12 = misc12;
	}
	public String getMisc13() {
		return misc13;
	}
	public void setMisc13(String misc13) {
		this.misc13 = misc13;
	}
	public String getMisc14() {
		return misc14;
	}
	public void setMisc14(String misc14) {
		this.misc14 = misc14;
	}
	public String getMisc15() {
		return misc15;
	}
	public void setMisc15(String misc15) {
		this.misc15 = misc15;
	}
	public String getMisc16() {
		return misc16;
	}
	public void setMisc16(String misc16) {
		this.misc16 = misc16;
	}
	public String getMisc17() {
		return misc17;
	}
	public void setMisc17(String misc17) {
		this.misc17 = misc17;
	}
	public String getMisc18() {
		return misc18;
	}
	public void setMisc18(String misc18) {
		this.misc18 = misc18;
	}
	public String getMisc19() {
		return misc19;
	}
	public void setMisc19(String misc19) {
		this.misc19 = misc19;
	}
	public String getMisc20() {
		return misc20;
	}
	public void setMisc20(String misc20) {
		this.misc20 = misc20;
	}
	public String getMisc21() {
		return misc21;
	}
	public void setMisc21(String misc21) {
		this.misc21 = misc21;
	}
	public String getMisc22() {
		return misc22;
	}
	public void setMisc22(String misc22) {
		this.misc22 = misc22;
	}
	public String getMisc23() {
		return misc23;
	}
	public void setMisc23(String misc23) {
		this.misc23 = misc23;
	}
	public String getMisc24() {
		return misc24;
	}
	public void setMisc24(String misc24) {
		this.misc24 = misc24;
	}
	public String getMisc25() {
		return misc25;
	}
	public void setMisc25(String misc25) {
		this.misc25 = misc25;
	}
	public String getMisc26() {
		return misc26;
	}
	public void setMisc26(String misc26) {
		this.misc26 = misc26;
	}
	public String getMisc27() {
		return misc27;
	}
	public void setMisc27(String misc27) {
		this.misc27 = misc27;
	}
	public String getMisc28() {
		return misc28;
	}
	public void setMisc28(String misc28) {
		this.misc28 = misc28;
	}
	public String getMisc29() {
		return misc29;
	}
	public void setMisc29(String misc29) {
		this.misc29 = misc29;
	}
	public String getMisc30() {
		return misc30;
	}
	public void setMisc30(String misc30) {
		this.misc30 = misc30;
	}
	public String getMisc31() {
		return misc31;
	}
	public void setMisc31(String misc31) {
		this.misc31 = misc31;
	}
	public String getMisc32() {
		return misc32;
	}
	public void setMisc32(String misc32) {
		this.misc32 = misc32;
	}
	public String getMisc33() {
		return misc33;
	}
	public void setMisc33(String misc33) {
		this.misc33 = misc33;
	}
	public String getMisc34() {
		return misc34;
	}
	public void setMisc34(String misc34) {
		this.misc34 = misc34;
	}
	public String getMisc35() {
		return misc35;
	}
	public void setMisc35(String misc35) {
		this.misc35 = misc35;
	}
	public String getMisc36() {
		return misc36;
	}
	public void setMisc36(String misc36) {
		this.misc36 = misc36;
	}
	public String getMisc37() {
		return misc37;
	}
	public void setMisc37(String misc37) {
		this.misc37 = misc37;
	}
	public String getMisc38() {
		return misc38;
	}
	public void setMisc38(String misc38) {
		this.misc38 = misc38;
	}
	public String getMisc39() {
		return misc39;
	}
	public void setMisc39(String misc39) {
		this.misc39 = misc39;
	}
	public String getMisc40() {
		return misc40;
	}
	public void setMisc40(String misc40) {
		this.misc40 = misc40;
	}
	public String getMisc41() {
		return misc41;
	}
	public void setMisc41(String misc41) {
		this.misc41 = misc41;
	}
	public String getMisc42() {
		return misc42;
	}
	public void setMisc42(String misc42) {
		this.misc42 = misc42;
	}
	public String getMisc43() {
		return misc43;
	}
	public void setMisc43(String misc43) {
		this.misc43 = misc43;
	}
	public String getMisc44() {
		return misc44;
	}
	public void setMisc44(String misc44) {
		this.misc44 = misc44;
	}
	public String getMisc45() {
		return misc45;
	}
	public void setMisc45(String misc45) {
		this.misc45 = misc45;
	}
	public String getMisc46() {
		return misc46;
	}
	public void setMisc46(String misc46) {
		this.misc46 = misc46;
	}
	public String getMisc47() {
		return misc47;
	}
	public void setMisc47(String misc47) {
		this.misc47 = misc47;
	}
	public String getMisc48() {
		return misc48;
	}
	public void setMisc48(String misc48) {
		this.misc48 = misc48;
	}
	public String getMisc49() {
		return misc49;
	}
	public void setMisc49(String misc49) {
		this.misc49 = misc49;
	}
	public String getMisc50() {
		return misc50;
	}
	public void setMisc50(String misc50) {
		this.misc50 = misc50;
	}
	public String getPorcIVA() {
		return porcIVA;
	}
	public void setPorcIVA(String porcIVA) {
		this.porcIVA = porcIVA;
	}
	public String getMontoIEPS() {
		return montoIEPS;
	}
	public void setMontoIEPS(String montoIEPS) {
		this.montoIEPS = montoIEPS;
	}
	public String getDocumentStatus() {
		return documentStatus;
	}
	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getRegimenFiscal() {
		return regimenFiscal;
	}
	public void setRegimenFiscal(String regimenFiscal) {
		this.regimenFiscal = regimenFiscal;
	}
	public String getNumCtaPago() {
		return numCtaPago;
	}
	public void setNumCtaPago(String numCtaPago) {
		this.numCtaPago = numCtaPago;
	}
	public String getNumContraRecibo() {
		return numContraRecibo;
	}
	public void setNumContraRecibo(String numContraRecibo) {
		this.numContraRecibo = numContraRecibo;
	}
	public String getFechaNumContraRecibo() {
		return fechaNumContraRecibo;
	}
	public void setFechaNumContraRecibo(String fechaNumContraRecibo) {
		this.fechaNumContraRecibo = fechaNumContraRecibo;
	}
	public String getContactoCompras() {
		return contactoCompras;
	}
	public void setContactoCompras(String contactoCompras) {
		this.contactoCompras = contactoCompras;
	}
	public String getCustomsgln() {
		return customsgln;
	}
	public void setCustomsgln(String customsgln) {
		this.customsgln = customsgln;
	}
	public String getAlternateIdentificationGln() {
		return alternateIdentificationGln;
	}
	public void setAlternateIdentificationGln(String alternateIdentificationGln) {
		this.alternateIdentificationGln = alternateIdentificationGln;
	}
	public String getNombreAduana() {
		return nombreAduana;
	}
	public void setNombreAduana(String nombreAduana) {
		this.nombreAduana = nombreAduana;
	}
	public String getNombreAduanaCiudad() {
		return nombreAduanaCiudad;
	}
	public void setNombreAduanaCiudad(String nombreAduanaCiudad) {
		this.nombreAduanaCiudad = nombreAduanaCiudad;
	}
	public String getFuncDivisa() {
		return funcDivisa;
	}
	public void setFuncDivisa(String funcDivisa) {
		this.funcDivisa = funcDivisa;
	}
	public String getTasaDivisa() {
		return tasaDivisa;
	}
	public void setTasaDivisa(String tasaDivisa) {
		this.tasaDivisa = tasaDivisa;
	}
	public String getRefTiempoPago() {
		return refTiempoPago;
	}
	public void setRefTiempoPago(String refTiempoPago) {
		this.refTiempoPago = refTiempoPago;
	}
	public String getRefTerminoTiempoPago() {
		return refTerminoTiempoPago;
	}
	public void setRefTerminoTiempoPago(String refTerminoTiempoPago) {
		this.refTerminoTiempoPago = refTerminoTiempoPago;
	}
	public String getLugarExpedicion() {
		return lugarExpedicion;
	}
	public void setLugarExpedicion(String lugarExpedicion) {
		this.lugarExpedicion = lugarExpedicion;
	}
	public String getSerieFolioFiscalOrig() {
		return serieFolioFiscalOrig;
	}
	public void setSerieFolioFiscalOrig(String serieFolioFiscalOrig) {
		this.serieFolioFiscalOrig = serieFolioFiscalOrig;
	}
	public String getTipoEspecialDeServicio() {
		return tipoEspecialDeServicio;
	}
	public void setTipoEspecialDeServicio(String tipoEspecialDeServicio) {
		this.tipoEspecialDeServicio = tipoEspecialDeServicio;
	}
	public String getFechaFolioFiscalOrig() {
		return fechaFolioFiscalOrig;
	}
	public void setFechaFolioFiscalOrig(String fechaFolioFiscalOrig) {
		this.fechaFolioFiscalOrig = fechaFolioFiscalOrig;
	}
	public String getPorcentajeNoAplicado() {
		return porcentajeNoAplicado;
	}
	public void setPorcentajeNoAplicado(String porcentajeNoAplicado) {
		this.porcentajeNoAplicado = porcentajeNoAplicado;
	}
	public String getMontoFolioFiscalOrig() {
		return montoFolioFiscalOrig;
	}
	public void setMontoFolioFiscalOrig(String montoFolioFiscalOrig) {
		this.montoFolioFiscalOrig = montoFolioFiscalOrig;
	}
	public String getMontoTotalDescuentos() {
		return montoTotalDescuentos;
	}
	public void setMontoTotalDescuentos(String montoTotalDescuentos) {
		this.montoTotalDescuentos = montoTotalDescuentos;
	}
	public String getMontoTotalPagar() {
		return montoTotalPagar;
	}
	public void setMontoTotalPagar(String montoTotalPagar) {
		this.montoTotalPagar = montoTotalPagar;
	}
	public String getAnoAprobacion9() {
		return anoAprobacion9;
	}
	public void setAnoAprobacion9(String anoAprobacion9) {
		this.anoAprobacion9 = anoAprobacion9;
	}
	public String getMotivoDescuento() {
		return motivoDescuento;
	}
	public void setMotivoDescuento(String motivoDescuento) {
		this.motivoDescuento = motivoDescuento;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getEfectoComprobante() {
		return efectoComprobante;
	}
	public void setEfectoComprobante(String efectoComprobante) {
		this.efectoComprobante = efectoComprobante;
	}
	public String getMontoTotalImpRetenidos() {
		return montoTotalImpRetenidos;
	}
	public void setMontoTotalImpRetenidos(String montoTotalImpRetenidos) {
		this.montoTotalImpRetenidos = montoTotalImpRetenidos;
	}
	public String getMontoTotalImpTrasladados() {
		return montoTotalImpTrasladados;
	}
	public void setMontoTotalImpTrasladados(String montoTotalImpTrasladados) {
		this.montoTotalImpTrasladados = montoTotalImpTrasladados;
	}
	
	
	
	@Override
	public String toString() {
		return "EspecOrdEncaFacElecTxtDTO [folio=" + folio + ", nombreEmisor=" + nombreEmisor + ", rfcEmisor="
				+ rfcEmisor + ", domEmisorCalle=" + domEmisorCalle + ", domEmisorNoExterior=" + domEmisorNoExterior
				+ ", domEmisorNoInterior=" + domEmisorNoInterior + ", domEmisorColonia=" + domEmisorColonia
				+ ", domEmisorLocalidad=" + domEmisorLocalidad + ", domEmisorReferencia=" + domEmisorReferencia
				+ ", domEmisorMunicipio=" + domEmisorMunicipio + ", domEmisorEstado=" + domEmisorEstado
				+ ", domEmisorPais=" + domEmisorPais + ", domEmisorCodigoPostal=" + domEmisorCodigoPostal
				+ ", telEmisor=" + telEmisor + ", domSucursalCalle=" + domSucursalCalle + ", domSucursalNoExterior="
				+ domSucursalNoExterior + ", domSucursalNoInterior=" + domSucursalNoInterior + ", domSucursalColonia="
				+ domSucursalColonia + ", domSucursalLocalidad=" + domSucursalLocalidad + ", domSucursalReferencia="
				+ domSucursalReferencia + ", domSucursalMunicipio=" + domSucursalMunicipio + ", domSucursalEstado="
				+ domSucursalEstado + ", domSucursalPais=" + domSucursalPais + ", domSucursalCodigoPostal="
				+ domSucursalCodigoPostal + ", telSucursal=" + telSucursal + ", version=" + version
				+ ", serieComprobante=" + serieComprobante + ", numeroAprobacion=" + numeroAprobacion + ", formaPago="
				+ formaPago + ", fecha=" + fecha + ", hora=" + hora + ", domLugarExpideCalle=" + domLugarExpideCalle
				+ ", domLugarExpideNoExterior=" + domLugarExpideNoExterior + ", domLugarExpideNoInterior="
				+ domLugarExpideNoInterior + ", domLugarExpideColonia=" + domLugarExpideColonia
				+ ", domLugarExpideLocalidad=" + domLugarExpideLocalidad + ", domLugarExpideReferencia="
				+ domLugarExpideReferencia + ", domLugarExpideMunicipio=" + domLugarExpideMunicipio
				+ ", domLugarExpideEstado=" + domLugarExpideEstado + ", domLugarExpidePais=" + domLugarExpidePais
				+ ", domLugarExpideCodigoPostal=" + domLugarExpideCodigoPostal + ", nombreReceptor=" + nombreReceptor
				+ ", rfcReceptor=" + rfcReceptor + ", domReceptorCalle=" + domReceptorCalle + ", domReceptorNoExterior="
				+ domReceptorNoExterior + ", domReceptorNoInterior=" + domReceptorNoInterior + ", domReceptorColonia="
				+ domReceptorColonia + ", domReceptorLocalidad=" + domReceptorLocalidad + ", domReceptorReferencia="
				+ domReceptorReferencia + ", domReceptorMunicipio=" + domReceptorMunicipio + ", domReceptorEstado="
				+ domReceptorEstado + ", domReceptorPais=" + domReceptorPais + ", domReceptorCodigoPostal="
				+ domReceptorCodigoPostal + ", montoSubTotal=" + montoSubTotal + ", montoIVA=" + montoIVA
				+ ", montoTotal=" + montoTotal + ", estado=" + estado + ", tipoCFD=" + tipoCFD + ", notas=" + notas
				+ ", notas02=" + notas02 + ", notas03=" + notas03 + ", tradingPartnerProv=" + tradingPartnerProv
				+ ", califTradingPartnerProv=" + califTradingPartnerProv + ", eanProveedor=" + eanProveedor
				+ ", numeroFactura=" + numeroFactura + ", numeroOrdenCompra=" + numeroOrdenCompra
				+ ", fechaOrdenCompra=" + fechaOrdenCompra + ", numeroProveedor=" + numeroProveedor + ", eanTienda="
				+ eanTienda + ", numeroTienda=" + numeroTienda + ", nombreTienda=" + nombreTienda + ", domTiendaCalle="
				+ domTiendaCalle + ", domTiendaNoExterior=" + domTiendaNoExterior + ", domTiendaNoInterior="
				+ domTiendaNoInterior + ", domTiendaColonia=" + domTiendaColonia + ", domTiendaLocalidad="
				+ domTiendaLocalidad + ", domTiendaReferencia=" + domTiendaReferencia + ", domTiendaMunicipio="
				+ domTiendaMunicipio + ", domTiendaEstado=" + domTiendaEstado + ", domTiendaPais=" + domTiendaPais
				+ ", domTiendaCodigoPostal=" + domTiendaCodigoPostal + ", rfcTienda=" + rfcTienda + ", codMoneda="
				+ codMoneda + ", diasPago=" + diasPago + ", porcDescProntoPago=" + porcDescProntoPago
				+ ", montoDescProntoPago=" + montoDescProntoPago + ", codDescuento=" + codDescuento + ", porcDescuento="
				+ porcDescuento + ", montoDescuento=" + montoDescuento + ", cantidadLineasFactura="
				+ cantidadLineasFactura + ", fechaVencimiento=" + fechaVencimiento + ", codZona=" + codZona
				+ ", numeroReceptor=" + numeroReceptor + ", codVendedor=" + codVendedor + ", nombreVendedor="
				+ nombreVendedor + ", viaEmbarque=" + viaEmbarque + ", condicionesPago=" + condicionesPago
				+ ", numeroPedido=" + numeroPedido + ", fechaPedido=" + fechaPedido + ", letrasMontoTotal="
				+ letrasMontoTotal + ", cantidadUnidades=" + cantidadUnidades + ", cantidadEmpaques="
				+ cantidadEmpaques + ", eanReceptor=" + eanReceptor + ", eanLugarExpide=" + eanLugarExpide
				+ ", iepsId=" + iepsId + ", estatus=" + estatus + ", numeroEmisor=" + numeroEmisor + ", montoMerma="
				+ montoMerma + ", montoSubTotalApIVA=" + montoSubTotalApIVA + ", transportista=" + transportista
				+ ", numeroSolicitud=" + numeroSolicitud + ", descMoneda=" + descMoneda + ", misc01=" + misc01
				+ ", misc02=" + misc02 + ", misc03=" + misc03 + ", misc04=" + misc04 + ", misc05=" + misc05
				+ ", misc06=" + misc06 + ", misc07=" + misc07 + ", misc08=" + misc08 + ", misc09=" + misc09
				+ ", misc10=" + misc10 + ", misc11=" + misc11 + ", misc12=" + misc12 + ", misc13=" + misc13
				+ ", misc14=" + misc14 + ", misc15=" + misc15 + ", misc16=" + misc16 + ", misc17=" + misc17
				+ ", misc18=" + misc18 + ", misc19=" + misc19 + ", misc20=" + misc20 + ", misc21=" + misc21
				+ ", misc22=" + misc22 + ", misc23=" + misc23 + ", misc24=" + misc24 + ", misc25=" + misc25
				+ ", misc26=" + misc26 + ", misc27=" + misc27 + ", misc28=" + misc28 + ", misc29=" + misc29
				+ ", misc30=" + misc30 + ", misc31=" + misc31 + ", misc32=" + misc32 + ", misc33=" + misc33
				+ ", misc34=" + misc34 + ", misc35=" + misc35 + ", misc36=" + misc36 + ", misc37=" + misc37
				+ ", misc38=" + misc38 + ", misc39=" + misc39 + ", misc40=" + misc40 + ", misc41=" + misc41
				+ ", misc42=" + misc42 + ", misc43=" + misc43 + ", misc44=" + misc44 + ", misc45=" + misc45
				+ ", misc46=" + misc46 + ", misc47=" + misc47 + ", misc48=" + misc48 + ", misc49=" + misc49
				+ ", misc50=" + misc50 + ", porcIVA=" + porcIVA + ", montoIEPS=" + montoIEPS + ", documentStatus="
				+ documentStatus + ", deliveryDate=" + deliveryDate + ", regimenFiscal=" + regimenFiscal
				+ ", numCtaPago=" + numCtaPago + ", numContraRecibo=" + numContraRecibo + ", fechaNumContraRecibo="
				+ fechaNumContraRecibo + ", contactoCompras=" + contactoCompras + ", customsgln=" + customsgln
				+ ", alternateIdentificationGln=" + alternateIdentificationGln + ", nombreAduana=" + nombreAduana
				+ ", nombreAduanaCiudad=" + nombreAduanaCiudad + ", funcDivisa=" + funcDivisa + ", tasaDivisa="
				+ tasaDivisa + ", refTiempoPago=" + refTiempoPago + ", refTerminoTiempoPago=" + refTerminoTiempoPago
				+ ", lugarExpedicion=" + lugarExpedicion + ", serieFolioFiscalOrig=" + serieFolioFiscalOrig
				+ ", tipoEspecialDeServicio=" + tipoEspecialDeServicio + ", fechaFolioFiscalOrig="
				+ fechaFolioFiscalOrig + ", porcentajeNoAplicado=" + porcentajeNoAplicado + ", montoFolioFiscalOrig="
				+ montoFolioFiscalOrig + ", montoTotalDescuentos=" + montoTotalDescuentos + ", montoTotalPagar="
				+ montoTotalPagar + ", anoAprobacion9=" + anoAprobacion9 + ", motivoDescuento=" + motivoDescuento
				+ ", metodoPago=" + metodoPago + ", efectoComprobante=" + efectoComprobante
				+ ", montoTotalImpRetenidos=" + montoTotalImpRetenidos + ", montoTotalImpTrasladados="
				+ montoTotalImpTrasladados + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
