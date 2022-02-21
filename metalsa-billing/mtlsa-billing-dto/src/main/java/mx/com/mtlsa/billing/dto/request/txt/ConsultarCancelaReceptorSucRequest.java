package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class ConsultarCancelaReceptorSucRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4867172941932762724L;
	
	public ConsultarCancelaReceptorSucRequest() {
		
	}
	
	private String cToken;
	private String cRFCEmisor;

	public String getcToken() {
		return cToken;
	}

	public void setcToken(String cToken) {
		this.cToken = cToken;
	}

	public String getcRFCEmisor() {
		return cRFCEmisor;
	}

	public void setcRFCEmisor(String cRFCEmisor) {
		this.cRFCEmisor = cRFCEmisor;
	}

	@Override
	public String toString() {
		return "ConsultarCancelaReceptorSucRequest [cToken=" + cToken + ", cRFCEmisor=" + cRFCEmisor + "]";
	}

	
	

}
