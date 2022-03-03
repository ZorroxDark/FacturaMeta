package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.math.BigDecimal;

public class CancelacionV40  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1380091057400152228L;
	
	public CancelacionV40 () {
		
	}
	
	
	private String correo;
	private String cfdiuuid;
	private String rfcReceptor;
	private String rfcEmisor;
	private String estadoDocumento;
	private String fechaSolicitud;
	private String estadoCancelacion;
	private Boolean autorizoCliente;
	private String observaciones;
	private String fechaEstatus;
	private BigDecimal montoTotal;
	private String xmlAcuseB64;
	private String motivo;
	private String folioSustitucion;
	private String efos;
	private String tipoDoc;

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCfdiuuid() {
		return cfdiuuid;
	}
	public void setCfdiuuid(String cfdiuuid) {
		this.cfdiuuid = cfdiuuid;
	}
	public String getRfcReceptor() {
		return rfcReceptor;
	}
	public void setRfcReceptor(String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}
	public String getRfcEmisor() {
		return rfcEmisor;
	}
	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}
	public String getEstadoDocumento() {
		return estadoDocumento;
	}
	public void setEstadoDocumento(String estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}
	public String getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getEstadoCancelacion() {
		return estadoCancelacion;
	}
	public void setEstadoCancelacion(String estadoCancelacion) {
		this.estadoCancelacion = estadoCancelacion;
	}
	public Boolean getAutorizoCliente() {
		return autorizoCliente;
	}
	public void setAutorizoCliente(Boolean autorizoCliente) {
		this.autorizoCliente = autorizoCliente;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getFechaEstatus() {
		return fechaEstatus;
	}
	public void setFechaEstatus(String fechaEstatus) {
		this.fechaEstatus = fechaEstatus;
	}
	public BigDecimal getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getXmlAcuseB64() {
		return xmlAcuseB64;
	}
	public void setXmlAcuseB64(String xmlAcuseB64) {
		this.xmlAcuseB64 = xmlAcuseB64;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getFolioSustitucion() {
		return folioSustitucion;
	}
	public void setFolioSustitucion(String folioSustitucion) {
		this.folioSustitucion = folioSustitucion;
	}
	public String getEfos() {
		return efos;
	}
	public void setEfos(String efos) {
		this.efos = efos;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	
	
	@Override
	public String toString() {
		return "CancelacionV40 [correo=" + correo + ", cfdiuuid=" + cfdiuuid + ", rfcReceptor=" + rfcReceptor
				+ ", rfcEmisor=" + rfcEmisor + ", estadoDocumento=" + estadoDocumento + ", fechaSolicitud="
				+ fechaSolicitud + ", estadoCancelacion=" + estadoCancelacion + ", autorizoCliente=" + autorizoCliente
				+ ", observaciones=" + observaciones + ", fechaEstatus=" + fechaEstatus + ", montoTotal=" + montoTotal
				+ ", xmlAcuseB64=" + xmlAcuseB64 + ", motivo=" + motivo + ", folioSustitucion=" + folioSustitucion
				+ ", efos=" + efos + ", tipoDoc=" + tipoDoc + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
