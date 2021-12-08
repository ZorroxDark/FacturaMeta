package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class GuardarCertificadoSucResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6426287177354067245L;
	
	
	    private  boolean estado;
	    private  String mensaje;
	    private  String datos;

	    
	    public GuardarCertificadoSucResponse(){
	    	
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
			return "GuardarCertificadoSucResponse [estado=" + estado + ", mensaje=" + mensaje + ", datos=" + datos
					+ "]";
		}
	    
	    
	    
}
