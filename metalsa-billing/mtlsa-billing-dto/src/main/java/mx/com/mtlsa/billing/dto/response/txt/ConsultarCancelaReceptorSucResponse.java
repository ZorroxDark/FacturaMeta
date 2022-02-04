package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class ConsultarCancelaReceptorSucResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5351725759372564871L;
	
	
	
	private boolean estado;
	private ConsultarCancelaDatos listRechazoCancelacion;
	private ConsultarCancelaDatos listAceptaCancelacion;
	
	
	public ConsultarCancelaReceptorSucResponse() {
		
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ConsultarCancelaDatos getListRechazoCancelacion() {
		return listRechazoCancelacion;
	}

	public void setListRechazoCancelacion(ConsultarCancelaDatos listRechazoCancelacion) {
		this.listRechazoCancelacion = listRechazoCancelacion;
	}

	public ConsultarCancelaDatos getListAceptaCancelacion() {
		return listAceptaCancelacion;
	}

	public void setListAceptaCancelacion(ConsultarCancelaDatos listAceptaCancelacion) {
		this.listAceptaCancelacion = listAceptaCancelacion;
	}

	
	
	
	
	
	
}
