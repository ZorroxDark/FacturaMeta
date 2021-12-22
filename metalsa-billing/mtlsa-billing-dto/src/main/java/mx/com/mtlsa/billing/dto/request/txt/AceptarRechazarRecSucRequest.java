package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

import mx.com.mtlsa.billing.dto.response.txt.ConsultarCancelaDatos;

public class AceptarRechazarRecSucRequest implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2302703410259313687L;
	
	
	

	private ConsultarCancelaDatos envioListaCancelacion;
	
	private ConsultarCancelaDatos envioListaRechazados;
	
	
	AceptarRechazarRecSucRequest(){
		
	}


	public ConsultarCancelaDatos getEnvioListaCancelacion() {
		return envioListaCancelacion;
	}


	public void setEnvioListaCancelacion(ConsultarCancelaDatos envioListaCancelacion) {
		this.envioListaCancelacion = envioListaCancelacion;
	}


	public ConsultarCancelaDatos getEnvioListaRechazados() {
		return envioListaRechazados;
	}


	public void setEnvioListaRechazados(ConsultarCancelaDatos envioListaRechazados) {
		this.envioListaRechazados = envioListaRechazados;
	}
	
	
	
	

}
