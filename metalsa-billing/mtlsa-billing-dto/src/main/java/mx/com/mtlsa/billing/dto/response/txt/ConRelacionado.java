package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;


public class ConRelacionado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5072999120282470619L;

	
    private String mensaje;
    private boolean estado;
    private String cfdiuuid;
    private String uuidRelacionado;
    private String rfcEmisor;
    private String rfcReceptor;
    private String tipoRelacion;
	
    
    public ConRelacionado() {
    	
    }


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public String getCfdiuuid() {
		return cfdiuuid;
	}


	public void setCfdiuuid(String cfdiuuid) {
		this.cfdiuuid = cfdiuuid;
	}


	public String getUuidRelacionado() {
		return uuidRelacionado;
	}


	public void setUuidRelacionado(String uuidRelacionado) {
		this.uuidRelacionado = uuidRelacionado;
	}


	public String getRfcEmisor() {
		return rfcEmisor;
	}


	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}


	public String getRfcReceptor() {
		return rfcReceptor;
	}


	public void setRfcReceptor(String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}


	public String getTipoRelacion() {
		return tipoRelacion;
	}


	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}


	@Override
	public String toString() {
		return "ConRelacionado [mensaje=" + mensaje + ", estado=" + estado + ", cfdiuuid=" + cfdiuuid
				+ ", uuidRelacionado=" + uuidRelacionado + ", rfcEmisor=" + rfcEmisor + ", rfcReceptor=" + rfcReceptor
				+ ", tipoRelacion=" + tipoRelacion + "]";
	}
	
	
    
    
    
    
    
}
