package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;


public class ConRelacionadoResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2165194396316329884L;
	
	
	private boolean estado;
	private String mensaje;
    private ConRelacionadoDatos datos = new ConRelacionadoDatos();
	
	
	public ConRelacionadoResponse(){
		
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


	public ConRelacionadoDatos getDatos() {
		return datos;
	}


	public void setDatos(ConRelacionadoDatos datos) {
		this.datos = datos;
	}

}
