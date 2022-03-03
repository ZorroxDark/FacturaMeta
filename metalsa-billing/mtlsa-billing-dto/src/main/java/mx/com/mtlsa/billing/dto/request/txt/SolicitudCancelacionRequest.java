package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SolicitudCancelacionRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8453929717614159482L;
	
	
	
	private List<SolicitudCancelacion> solicitudCancelacion = new ArrayList<SolicitudCancelacion>();
	private String  cToken;


	public List<SolicitudCancelacion> getSolicitudCancelacion() {
		return solicitudCancelacion;
	}



	public void setSolicitudCancelacion(List<SolicitudCancelacion> solicitudCancelacion) {
		this.solicitudCancelacion = solicitudCancelacion;
	}



	public String getcToken() {
		return cToken;
	}



	public void setcToken(String cToken) {
		this.cToken = cToken;
	}



	@Override
	public String toString() {
		return "SolicitudCancelacionRequest [solicitudCancelacion=" + solicitudCancelacion + ", cToken=" + cToken + "]";
	}

	

	
	

}
