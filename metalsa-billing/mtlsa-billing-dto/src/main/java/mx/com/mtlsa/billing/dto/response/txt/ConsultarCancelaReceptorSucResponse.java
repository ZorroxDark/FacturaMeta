package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class ConsultarCancelaReceptorSucResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5351725759372564871L;
	
	
	
	private boolean estado;
	private ConsultarCancelaDatos listaCancelacion;
	
	private ConsultarCancelaDatos listaRechazados;
	
	
	public ConsultarCancelaReceptorSucResponse() {
		
	}


	


	public boolean isEstado() {
		return estado;
	}





	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	




	public ConsultarCancelaDatos getListaCancelacion() {
		return listaCancelacion;
	}





	public void setListaCancelacion(ConsultarCancelaDatos listaCancelacion) {
		this.listaCancelacion = listaCancelacion;
	}





	public ConsultarCancelaDatos getListaRechazados() {
		return listaRechazados;
	}





	public void setListaRechazados(ConsultarCancelaDatos listaRechazados) {
		this.listaRechazados = listaRechazados;
	}





	@Override
	public String toString() {
		return "ConsultarCancelaReceptorSucResponse [estado=" + estado + ", listaCancelacion=" + listaCancelacion
				+ ", listaRechazados=" + listaRechazados + "]";
	}




	
	
	
	
}
