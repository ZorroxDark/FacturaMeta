package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsultaCancelacionResponse implements Serializable{
	

	 /**
	 * 
	 */
	private static final long serialVersionUID = 20004218272142449L;
	
	
	
	private Boolean estado;
	private String mensaje;
	private List<CancelacionV40> datos = new ArrayList<CancelacionV40>();
	
	
	
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
	public List<CancelacionV40> getDatos() {
		return datos;
	}
	public void setDatos(List<CancelacionV40> datos) {
		this.datos = datos;
	}
	
	
	@Override
	public String toString() {
		return "ConsultaCancelacionResponse [estado=" + estado + ", mensaje=" + mensaje + ", datos=" + datos + "]";
	}
	
	
	
	 

}
