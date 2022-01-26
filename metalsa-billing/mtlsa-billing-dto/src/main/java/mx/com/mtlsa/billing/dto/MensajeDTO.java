package mx.com.mtlsa.billing.dto;

import java.io.Serializable;

public class MensajeDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1685666108838669636L;
	
	
	
	private String code;
	private String descripcion;
	
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
