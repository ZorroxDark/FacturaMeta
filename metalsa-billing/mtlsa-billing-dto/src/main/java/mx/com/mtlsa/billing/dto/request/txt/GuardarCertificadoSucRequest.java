package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class GuardarCertificadoSucRequest  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3176023178687170654L;
	
	
	
	private String cUsuario;
	private String cPasswordUsuario;
	private String cRFCEmisor;
	private String cCertificado;
	private String cLLave;
	private String cPasswordCertificado;
	
	
	GuardarCertificadoSucRequest(){
		
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


	public String getcCertificado() {
		return cCertificado;
	}


	public void setcCertificado(String cCertificado) {
		this.cCertificado = cCertificado;
	}


	public String getcLLave() {
		return cLLave;
	}


	public void setcLLave(String cLLave) {
		this.cLLave = cLLave;
	}


	public String getcPasswordCertificado() {
		return cPasswordCertificado;
	}


	public void setcPasswordCertificado(String cPasswordCertificado) {
		this.cPasswordCertificado = cPasswordCertificado;
	}


	@Override
	public String toString() {
		return "GuardarCertificadoSucRequest [cUsuario=" + cUsuario + ", cPasswordUsuario=" + cPasswordUsuario
				+ ", cRFCEmisor=" + cRFCEmisor + ", cCertificado=" + cCertificado + ", cLLave=" + cLLave
				+ ", cPasswordCertificado=" + cPasswordCertificado + "]";
	}
	
	
	
	
	
	
	
	

}
