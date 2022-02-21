package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class ValidarUUID40Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2066351818014624820L;
	
	
	private Boolean estado;
	private String mensaje;
	private ValidarUUIDSUCResultResponse validarUUIDSUCV;
	
	
	
	public ValidarUUID40Response() {
		
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ValidarUUIDSUCResultResponse getValidarUUIDSUCV() {
		return validarUUIDSUCV;
	}

	public void setValidarUUIDSUCV(ValidarUUIDSUCResultResponse validarUUIDSUCV) {
		this.validarUUIDSUCV = validarUUIDSUCV;
	}
	
	

}
