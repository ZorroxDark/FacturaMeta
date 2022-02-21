package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class DatosValidarUUIDSUCResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4000580331549306629L;
	
	private String cfdiuuid;
	private String esCancelable; 
	private String estado; 
	private String estatusCancelacion; 
	private String validacionEFOS;
	
	
	public String getCfdiuuid() {
		return cfdiuuid;
	}
	public void setCfdiuuid(String cfdiuuid) {
		this.cfdiuuid = cfdiuuid;
	}
	public String getEsCancelable() {
		return esCancelable;
	}
	public void setEsCancelable(String esCancelable) {
		this.esCancelable = esCancelable;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstatusCancelacion() {
		return estatusCancelacion;
	}
	public void setEstatusCancelacion(String estatusCancelacion) {
		this.estatusCancelacion = estatusCancelacion;
	}
	public String getValidacionEFOS() {
		return validacionEFOS;
	}
	public void setValidacionEFOS(String validacionEFOS) {
		this.validacionEFOS = validacionEFOS;
	}
	
	
	@Override
	public String toString() {
		return "DatosValidarUUIDSUCResponse [cfdiuuid=" + cfdiuuid + ", esCancelable=" + esCancelable + ", estado="
				+ estado + ", estatusCancelacion=" + estatusCancelacion + ", validacionEFOS=" + validacionEFOS + "]";
	}
	
	
	
	
	
	

	
	
	
	
	
	
	

}
