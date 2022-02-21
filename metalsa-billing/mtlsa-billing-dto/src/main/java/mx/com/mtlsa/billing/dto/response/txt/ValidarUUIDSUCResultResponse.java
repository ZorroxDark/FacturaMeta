package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidarUUIDSUCResultResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3823185544903004446L;
	
	private Boolean estado;
	private String mensaje;
	private List<DatosValidarUUIDSUCResponse> datos = new ArrayList<DatosValidarUUIDSUCResponse>();
	
	
	

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
	public List<DatosValidarUUIDSUCResponse> getDatos() {
		return datos;
	}
	public void setDatos(List<DatosValidarUUIDSUCResponse> datos) {
		this.datos = datos;
	}
	@Override
	public String toString() {
		return "ValidarUUIDSUCResultResponse [estado=" + estado + ", mensaje=" + mensaje + ", datos=" + datos + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
