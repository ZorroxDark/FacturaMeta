package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AceptarRechazarRecSucResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7336966088899647906L;
	
	private List<AceptarRechazarResponse> listUuids = new ArrayList<AceptarRechazarResponse>();
	
	private  String mensaje;
	private  String codigo;

	public List<AceptarRechazarResponse> getListUuids() {
		return listUuids;
	}

	public void setListUuids(List<AceptarRechazarResponse> listUuids) {
		this.listUuids = listUuids;
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
		return "AceptarRechazarRecSucResponse [listUuids=" + listUuids + ", mensaje=" + mensaje + ", codigo=" + codigo
				+ "]";
	}

	
	
		
	
}
