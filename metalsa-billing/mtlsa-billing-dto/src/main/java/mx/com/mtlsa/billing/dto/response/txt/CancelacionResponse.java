package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

public class CancelacionResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1688529472640869154L;
	
	public CancelacionResponse() {
		
	}
	
	
	private String cfdiUuid;
	private String rfcReceptor;
	private String rfcEmisor;
	private String estadoDocumento;
	private LocalDateTime fechaSolicitud;
	private String estadoCancelacion;
	private boolean autorizoCliente;
	private LocalDateTime fechaEstatus;
	private BigDecimal montoTotal;
	
	private String correo;
	private String observaciones;
	private String xmlAcuseB64;
	
	

	public String getCfdiUuid() {
		return cfdiUuid;
	}
	public void setCfdiUuid(String cfdiUuid) {
		this.cfdiUuid = cfdiUuid;
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
	public LocalDateTime getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getEstadoCancelacion() {
		return estadoCancelacion;
	}
	public void setEstadoCancelacion(String estadoCancelacion) {
		this.estadoCancelacion = estadoCancelacion;
	}
	public boolean isAutorizoCliente() {
		return autorizoCliente;
	}
	public void setAutorizoCliente(boolean autorizoCliente) {
		this.autorizoCliente = autorizoCliente;
	}
	public LocalDateTime getFechaEstatus() {
		return fechaEstatus;
	}
	public void setFechaEstatus(LocalDateTime fechaEstatus) {
		this.fechaEstatus = fechaEstatus;
	}
	public BigDecimal getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getXmlAcuseB64() {
		return xmlAcuseB64;
	}
	public void setXmlAcuseB64(String xmlAcuseB64) {
		this.xmlAcuseB64 = xmlAcuseB64;
	}
	@Override
	public String toString() {
		return "CancelacionResponse [cfdiUuid=" + cfdiUuid + ", rfcReceptor=" + rfcReceptor + ", rfcEmisor=" + rfcEmisor
				+ ", estadoDocumento=" + estadoDocumento + ", fechaSolicitud=" + fechaSolicitud + ", estadoCancelacion="
				+ estadoCancelacion + ", autorizoCliente=" + autorizoCliente + ", fechaEstatus=" + fechaEstatus
				+ ", montoTotal=" + montoTotal + ", correo=" + correo + ", observaciones=" + observaciones
				+ ", xmlAcuseB64=" + xmlAcuseB64 + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
