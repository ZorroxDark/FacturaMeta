package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class GenerarTokenSucRequest implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 205552466564459682L;
	
	
	
	private String cUsuario;
	private String cPasswordUsuario;
	private String cRFCEmisor;
	private String cAlias;
	
	public GenerarTokenSucRequest() {
		
	}

	public String getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getcPasswordUsuario() {
		return cPasswordUsuario;
	}

	public void setcPasswordUsuario(String cPasswordUsuario) {
		this.cPasswordUsuario = cPasswordUsuario;
	}

	public String getcRFCEmisor() {
		return cRFCEmisor;
	}

	public void setcRFCEmisor(String cRFCEmisor) {
		this.cRFCEmisor = cRFCEmisor;
	}

	public String getcAlias() {
		return cAlias;
	}

	public void setcAlias(String cAlias) {
		this.cAlias = cAlias;
	}

	@Override
	public String toString() {
		return "GenerarTokenSucRequest [cUsuario=" + cUsuario + ", cPasswordUsuario=" + cPasswordUsuario
				+ ", cRFCEmisor=" + cRFCEmisor + ", cAlias=" + cAlias + "]";
	}
	
	
	
	
	
}
