package mx.com.mtlsa.billing.dto;

import java.io.Serializable;

public class ErrorDTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9155610740871005373L;
	
	
	
	private String code;
	private String descripcion;
	
	
	public ErrorDTO() {
		
	}


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


	@Override
	public String toString() {
		return "ErrorDTO [code=" + code + ", descripcion=" + descripcion + "]";
	}
	
	
	

}
