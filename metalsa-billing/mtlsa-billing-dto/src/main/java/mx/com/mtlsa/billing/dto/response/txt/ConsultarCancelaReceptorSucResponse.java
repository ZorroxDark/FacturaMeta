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
	
	private  String mensaje;
	private  String codigo;
	
	
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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "ConsultarCancelaReceptorSucResponse [estado=" + estado + ", listRechazoCancelacion="
				+ listRechazoCancelacion + ", listAceptaCancelacion=" + listAceptaCancelacion + ", mensaje=" + mensaje
				+ ", codigo=" + codigo + "]";
	}

	
	
	
	
	
	
	
}
