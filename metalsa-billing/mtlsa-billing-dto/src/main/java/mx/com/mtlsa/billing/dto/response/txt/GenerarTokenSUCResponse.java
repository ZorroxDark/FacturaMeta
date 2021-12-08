package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class GenerarTokenSUCResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5670224803777648108L;
	
	private boolean estado;
	private String mensaje;
	private String datos;
	
	
	public GenerarTokenSUCResponse() {
		
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


	public String getDatos() {
		return datos;
	}


	public void setDatos(String datos) {
		this.datos = datos;
	}





	@Override
	public String toString() {
		return "GenerarTokenSUCResponse [estado=" + estado + ", mensaje=" + mensaje + ", datos=" + datos + "]";
	}


	
	
	
	
}
