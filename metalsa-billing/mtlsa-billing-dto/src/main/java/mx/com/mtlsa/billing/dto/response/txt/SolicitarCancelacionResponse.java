package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class SolicitarCancelacionResponse implements Serializable{
	
	
	 /**
	 * 
	 */
	
	private static final long serialVersionUID = 2341205842921297396L;
	
	
	private boolean estado;
	private String mensaje;
	private List<RespuestaCancelacionV40> datos  = new ArrayList<RespuestaCancelacionV40>();
	
	
	public SolicitarCancelacionResponse() {
		
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public List<RespuestaCancelacionV40> getDatos() {
		return datos;
	}


	public void setDatos(List<RespuestaCancelacionV40> datos) {
		this.datos = datos;
	}


	@Override
	public String toString() {
		return "SolicitarCancelacionResponse [estado=" + estado + ", mensaje=" + mensaje + ", datos=" + datos + "]";
	}

	

	
	

}
