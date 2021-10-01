package mx.com.mtlsa.billing.utils.txt;

import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.utils.Constantes;

public class GeneraStringFacturas {
	
	public static StringBuilder facturaCabecera(EspecOrdEncaFacElecTxtDTO  facCabecera) {
		
		StringBuilder getFacturaCabecera = new StringBuilder(Constantes.TILDE);
		try {
			
			
			//Carga 
			
			getFacturaCabecera.append(facCabecera.getFolio()!= null ? facCabecera.getFolio() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNombreEmisor()!= null ? facCabecera.getNombreEmisor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getRfcEmisor()!= null ? facCabecera.getRfcEmisor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorCalle()!= null ? facCabecera.getDomEmisorCalle() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorNoExterior()!= null ? facCabecera.getDomEmisorNoExterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorNoInterior()!= null ? facCabecera.getDomEmisorNoInterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorColonia()!= null ? facCabecera.getDomEmisorColonia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorLocalidad()!= null ? facCabecera.getDomEmisorLocalidad() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorReferencia()!= null ? facCabecera.getDomEmisorReferencia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorMunicipio()!= null ? facCabecera.getDomEmisorMunicipio() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 10
			getFacturaCabecera.append(facCabecera.getDomEmisorEstado()!= null ? facCabecera.getDomEmisorEstado() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorPais()!= null ? facCabecera.getDomEmisorPais() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomEmisorCodigoPostal()!= null ? facCabecera.getDomEmisorCodigoPostal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getTelEmisor()!= null ? facCabecera.getTelEmisor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalCalle()!= null ? facCabecera.getDomSucursalCalle() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalNoExterior()!= null ? facCabecera.getDomSucursalNoExterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalNoInterior()!= null ? facCabecera.getDomSucursalNoInterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalColonia()!= null ? facCabecera.getDomSucursalColonia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalLocalidad()!= null ? facCabecera.getDomSucursalLocalidad() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalReferencia()!= null ? facCabecera.getDomSucursalReferencia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 20
			getFacturaCabecera.append(facCabecera.getDomSucursalMunicipio()!= null ? facCabecera.getDomSucursalMunicipio() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalEstado()!= null ? facCabecera.getDomSucursalEstado() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalPais()!= null ? facCabecera.getDomSucursalPais() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomSucursalCodigoPostal()!= null ? facCabecera.getDomSucursalCodigoPostal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getTelSucursal()!= null ? facCabecera.getTelSucursal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getVersion()!= null ? facCabecera.getVersion() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getSerieComprobante()!= null ? facCabecera.getSerieComprobante() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroAprobacion()!= null ? facCabecera.getNumeroAprobacion() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getFormaPago()!= null ? facCabecera.getFormaPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getFecha()!= null ? facCabecera.getFecha() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 30
			getFacturaCabecera.append(facCabecera.getHora()!= null ? facCabecera.getHora() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideCalle()!= null ? facCabecera.getDomLugarExpideCalle() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideNoExterior()!= null ? facCabecera.getDomLugarExpideNoExterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideNoInterior()!= null ? facCabecera.getDomLugarExpideNoInterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideColonia()!= null ? facCabecera.getDomLugarExpideColonia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideLocalidad()!= null ? facCabecera.getDomLugarExpideLocalidad() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideReferencia()!= null ? facCabecera.getDomLugarExpideReferencia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideMunicipio()!= null ? facCabecera.getDomLugarExpideMunicipio() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpideEstado()!= null ? facCabecera.getDomLugarExpideEstado() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomLugarExpidePais()!= null ? facCabecera.getDomLugarExpidePais() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 40
			getFacturaCabecera.append(facCabecera.getDomLugarExpideCodigoPostal()!= null ? facCabecera.getDomLugarExpideCodigoPostal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNombreReceptor()!= null ? facCabecera.getNombreReceptor() :".");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getRfcReceptor()!= null ? facCabecera.getRfcReceptor() :".");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorCalle()!= null ? facCabecera.getDomReceptorCalle() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorNoExterior()!= null ? facCabecera.getDomReceptorNoExterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorNoInterior()!= null ? facCabecera.getDomReceptorNoInterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorColonia()!= null ? facCabecera.getDomReceptorColonia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorLocalidad()!= null ? facCabecera.getDomReceptorLocalidad() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorReferencia()!= null ? facCabecera.getDomReceptorReferencia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorMunicipio()!= null ? facCabecera.getDomReceptorMunicipio() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 50
			getFacturaCabecera.append(facCabecera.getDomReceptorEstado()!= null ? facCabecera.getDomReceptorEstado() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorPais()!= null ? facCabecera.getDomReceptorPais() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomReceptorCodigoPostal()!= null ? facCabecera.getDomReceptorCodigoPostal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoSubTotal()!= null ? facCabecera.getMontoSubTotal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoIVA()!= null ? facCabecera.getMontoIVA() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoTotal()!= null ? facCabecera.getMontoTotal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getEstado()!= null ? facCabecera.getEstado() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getTipoCFD()!= null ? facCabecera.getTipoCFD() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNotas()!= null ? facCabecera.getNotas() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNotas02()!= null ? facCabecera.getNotas02() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			
			//Carga 60
			getFacturaCabecera.append(facCabecera.getNotas03()!= null ? facCabecera.getNotas03() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getTradingPartnerProv()!= null ? facCabecera.getTradingPartnerProv() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCalifTradingPartnerProv()!= null ? facCabecera.getCalifTradingPartnerProv() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getEanProveedor()!= null ? facCabecera.getEanProveedor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroFactura()!= null ? facCabecera.getNumeroFactura() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroOrdenCompra()!= null ? facCabecera.getNumeroOrdenCompra() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getFechaOrdenCompra()!= null ? facCabecera.getFechaOrdenCompra() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroProveedor()!= null ? facCabecera.getNumeroProveedor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getEanTienda()!= null ? facCabecera.getEanTienda() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroTienda()!= null ? facCabecera.getNumeroTienda() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 70
			getFacturaCabecera.append(facCabecera.getNombreTienda()!= null ? facCabecera.getNombreTienda() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaCalle()!= null ? facCabecera.getDomTiendaCalle() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaNoExterior()!= null ? facCabecera.getDomTiendaNoExterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaNoInterior()!= null ? facCabecera.getDomTiendaNoInterior() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaColonia()!= null ? facCabecera.getDomTiendaColonia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaLocalidad()!= null ? facCabecera.getDomTiendaLocalidad() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaReferencia()!= null ? facCabecera.getDomTiendaReferencia() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaMunicipio()!= null ? facCabecera.getDomTiendaMunicipio() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaEstado()!= null ? facCabecera.getDomTiendaEstado() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDomTiendaPais()!= null ? facCabecera.getDomTiendaPais() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 80
			getFacturaCabecera.append(facCabecera.getDomTiendaCodigoPostal()!= null ? facCabecera.getDomTiendaCodigoPostal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getRfcTienda()!= null ? facCabecera.getRfcTienda() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCodMoneda()!= null ? facCabecera.getCodMoneda() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDiasPago()!= null ? facCabecera.getDiasPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getPorcDescProntoPago()!= null ? facCabecera.getPorcDescProntoPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoDescProntoPago()!= null ? facCabecera.getMontoDescProntoPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCodDescuento()!= null ? facCabecera.getCodDescuento() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getPorcDescuento()!= null ? facCabecera.getPorcDescuento() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoDescuento()!= null ? facCabecera.getMontoDescuento() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCantidadLineasFactura()!= null ? facCabecera.getCantidadLineasFactura() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 90
			getFacturaCabecera.append(facCabecera.getFechaVencimiento()!= null ? facCabecera.getFechaVencimiento() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCodZona()!= null ? facCabecera.getCodZona() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroReceptor()!= null ? facCabecera.getNumeroReceptor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCodVendedor()!= null ? facCabecera.getCodVendedor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNombreVendedor()!= null ? facCabecera.getNombreVendedor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getViaEmbarque()!= null ? facCabecera.getViaEmbarque() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCondicionesPago()!= null ? facCabecera.getCondicionesPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroPedido()!= null ? facCabecera.getNumeroPedido() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getFechaPedido()!= null ? facCabecera.getFechaPedido() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getLetrasMontoTotal()!= null ? facCabecera.getLetrasMontoTotal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			
			//Carga 100
			getFacturaCabecera.append(facCabecera.getCantidadUnidades()!= null ? facCabecera.getCantidadUnidades() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCantidadEmpaques()!= null ? facCabecera.getCantidadEmpaques() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getEanReceptor()!= null ? facCabecera.getEanReceptor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getEanLugarExpide()!= null ? facCabecera.getEanLugarExpide() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getIepsId()!= null ? facCabecera.getEanLugarExpide() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getEstatus()!= null ? facCabecera.getEstatus() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumeroEmisor()!= null ? facCabecera.getNumeroEmisor() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoMerma()!= null ? facCabecera.getMontoMerma() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoSubTotalApIVA()!= null ? facCabecera.getMontoSubTotalApIVA() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getTransportista()!= null ? facCabecera.getTransportista() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 110
			getFacturaCabecera.append(facCabecera.getNumeroSolicitud()!= null ? facCabecera.getNumeroSolicitud() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDescMoneda()!= null ? facCabecera.getDescMoneda() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc01()!= null ? facCabecera.getMisc01() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc02()!= null ? facCabecera.getMisc02() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc03()!= null ? facCabecera.getMisc03() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc04()!= null ? facCabecera.getMisc04() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc05()!= null ? facCabecera.getMisc05() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc06()!= null ? facCabecera.getMisc06() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc07()!= null ? facCabecera.getMisc07() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc08()!= null ? facCabecera.getMisc08() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 120
			getFacturaCabecera.append(facCabecera.getMisc09()!= null ? facCabecera.getMisc09() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc10()!= null ? facCabecera.getMisc10() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc11()!= null ? facCabecera.getMisc11() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc12()!= null ? facCabecera.getMisc12() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc13()!= null ? facCabecera.getMisc13() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc14()!= null ? facCabecera.getMisc14() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc15()!= null ? facCabecera.getMisc15() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc16()!= null ? facCabecera.getMisc16() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc17()!= null ? facCabecera.getMisc17() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc18()!= null ? facCabecera.getMisc18() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 130
			getFacturaCabecera.append(facCabecera.getMisc19()!= null ? facCabecera.getMisc19() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc20()!= null ? facCabecera.getMisc20() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc21()!= null ? facCabecera.getMisc21() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc22()!= null ? facCabecera.getMisc22() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc23()!= null ? facCabecera.getMisc23() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc24()!= null ? facCabecera.getMisc24() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc25()!= null ? facCabecera.getMisc25() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc26()!= null ? facCabecera.getMisc26() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc27()!= null ? facCabecera.getMisc27() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc28()!= null ? facCabecera.getMisc28() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			
			//Carga 140
			getFacturaCabecera.append(facCabecera.getMisc29()!= null ? facCabecera.getMisc29() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc30()!= null ? facCabecera.getMisc30() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc31()!= null ? facCabecera.getMisc31() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc32()!= null ? facCabecera.getMisc32() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc33()!= null ? facCabecera.getMisc33() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc34()!= null ? facCabecera.getMisc34() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc35()!= null ? facCabecera.getMisc35() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc36()!= null ? facCabecera.getMisc36() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc37()!= null ? facCabecera.getMisc37() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc38()!= null ? facCabecera.getMisc38() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 150
			getFacturaCabecera.append(facCabecera.getMisc39()!= null ? facCabecera.getMisc39() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc40()!= null ? facCabecera.getMisc40() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc41()!= null ? facCabecera.getMisc41() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc42()!= null ? facCabecera.getMisc42() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc43()!= null ? facCabecera.getMisc43() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc44()!= null ? facCabecera.getMisc44() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc45()!= null ? facCabecera.getMisc45() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc46()!= null ? facCabecera.getMisc46() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc47()!= null ? facCabecera.getMisc47() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc48()!= null ? facCabecera.getMisc48() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 160
			getFacturaCabecera.append(facCabecera.getMisc49()!= null ? facCabecera.getMisc49() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMisc50()!= null ? facCabecera.getMisc50() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getPorcIVA()!= null ? facCabecera.getPorcIVA() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoIEPS()!= null ? facCabecera.getMontoIEPS() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDocumentStatus()!= null ? facCabecera.getDocumentStatus() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getDeliveryDate()!= null ? facCabecera.getDeliveryDate() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getRegimenFiscal()!= null ? facCabecera.getRegimenFiscal() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumCtaPago()!= null ? facCabecera.getNumCtaPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNumContraRecibo()!= null ? facCabecera.getNumContraRecibo() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getFechaNumContraRecibo()!= null ? facCabecera.getFechaNumContraRecibo() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 170
			getFacturaCabecera.append(facCabecera.getContactoCompras()!= null ? facCabecera.getContactoCompras() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getCustomsgln()!= null ? facCabecera.getCustomsgln() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getAlternateIdentificationGln()!= null ? facCabecera.getAlternateIdentificationGln() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNombreAduana()!= null ? facCabecera.getNombreAduana() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getNombreAduanaCiudad()!= null ? facCabecera.getNombreAduanaCiudad() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getFuncDivisa()!= null ? facCabecera.getFuncDivisa() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getTasaDivisa()!= null ? facCabecera.getTasaDivisa() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getRefTiempoPago()!= null ? facCabecera.getRefTiempoPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getRefTerminoTiempoPago()!= null ? facCabecera.getRefTerminoTiempoPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getLugarExpedicion()!= null ? facCabecera.getLugarExpedicion() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 180
			getFacturaCabecera.append(facCabecera.getSerieFolioFiscalOrig()!= null ? facCabecera.getSerieFolioFiscalOrig() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getTipoEspecialDeServicio()!= null ? facCabecera.getTipoEspecialDeServicio() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getFechaFolioFiscalOrig()!= null ? facCabecera.getFechaFolioFiscalOrig() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getPorcentajeNoAplicado()!= null ? facCabecera.getPorcentajeNoAplicado() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoFolioFiscalOrig()!= null ? facCabecera.getMontoFolioFiscalOrig() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoTotalDescuentos()!= null ? facCabecera.getMontoTotalDescuentos() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoTotalPagar()!= null ? facCabecera.getMontoTotalPagar() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getAnoAprobacion9()!= null ? facCabecera.getAnoAprobacion9() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMotivoDescuento()!= null ? facCabecera.getMotivoDescuento() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMetodoPago()!= null ? facCabecera.getMetodoPago() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			
			//Carga 190
			getFacturaCabecera.append(facCabecera.getEfectoComprobante()!= null ? facCabecera.getEfectoComprobante() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoTotalImpRetenidos()!= null ? facCabecera.getMontoTotalImpRetenidos() :"");
			getFacturaCabecera.append(Constantes.PIPE);
			getFacturaCabecera.append(facCabecera.getMontoTotalImpTrasladados()!= null ? facCabecera.getMontoTotalImpTrasladados() :"");
			getFacturaCabecera.append(Constantes.SALTO_LINEA);
		
		
		}catch (Exception e) {
			System.out.println("Error generacion stringBuilder facturaCabecera "+e);
		}
		return getFacturaCabecera;
		
	}
	
	
	
	
	
}
