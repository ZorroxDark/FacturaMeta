package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class RespuestaCancelacionV40 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5953622537445903492L;

	 private Boolean estado;
	 private String mensaje;
	 private CancelacionV40 datos = new CancelacionV40();
	 
	 
	 public RespuestaCancelacionV40() {
		 
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


	public CancelacionV40 getDatos() {
		return datos;
	}


	public void setDatos(CancelacionV40 datos) {
		this.datos = datos;
	}


	@Override
	public String toString() {
		return "RespuestaCancelacionV40 [estado=" + estado + ", mensaje=" + mensaje + ", datos=" + datos + "]";
	}


	


	 
	 
	
	
	
}
