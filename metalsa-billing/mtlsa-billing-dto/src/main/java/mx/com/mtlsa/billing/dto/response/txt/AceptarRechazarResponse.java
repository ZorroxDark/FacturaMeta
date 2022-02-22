package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class AceptarRechazarResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7940163786542532424L;
	
	
	public AceptarRechazarResponse() {
		
	}
	
	
	private String cCfdiUuid; 
	private Boolean bEstado;
	private String cMensaje;
	

	public String getcCfdiUuid() {
		return cCfdiUuid;
	}
	public void setcCfdiUuid(String cCfdiUuid) {
		this.cCfdiUuid = cCfdiUuid;
	}
	
	public String getcMensaje() {
		return cMensaje;
	}
	public void setcMensaje(String cMensaje) {
		this.cMensaje = cMensaje;
	}
	public Boolean getbEstado() {
		return bEstado;
	}
	public void setbEstado(Boolean bEstado) {
		this.bEstado = bEstado;
	}
	@Override
	public String toString() {
		return "AceptarRechazarResponse [cCfdiUuid=" + cCfdiUuid + ", bEstado=" + bEstado + ", cMensaje=" + cMensaje
				+ "]";
	}
	
	
	
	
	

}
