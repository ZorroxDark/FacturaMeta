package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class ConsultarCancelaReceptorSucResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5351725759372564871L;
	
	
	
	private boolean estado;
	private ConsultarCancelaDatos datos;
	
	
	public ConsultarCancelaReceptorSucResponse() {
		
	}


	


	public boolean isEstado() {
		return estado;
	}





	public void setEstado(boolean estado) {
		this.estado = estado;
	}





	public ConsultarCancelaDatos getDatos() {
		return datos;
	}


	public void setDatos(ConsultarCancelaDatos datos) {
		this.datos = datos;
	}





	@Override
	public String toString() {
		return "ConsultarCancelaReceptorSucResponse [estado=" + estado + ", datos=" + datos + "]";
	}

	
	
	
	
	
}
