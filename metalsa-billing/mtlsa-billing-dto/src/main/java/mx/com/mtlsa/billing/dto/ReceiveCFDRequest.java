package mx.com.mtlsa.billing.dto;

import java.io.Serializable;

public class ReceiveCFDRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3993071860201031382L;
	
	private String usuario;
	private String psswd;
	private String xmlFirmado;
	
	
	public ReceiveCFDRequest() {
		
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPsswd() {
		return psswd;
	}


	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}


	public String getXmlFirmado() {
		return xmlFirmado;
	}


	public void setXmlFirmado(String xmlFirmado) {
		this.xmlFirmado = xmlFirmado;
	}


	@Override
	public String toString() {
		return "ReceiveCFDRequest [usuario=" + usuario + ", psswd=" + psswd + ", xmlFirmado=" + xmlFirmado + "]";
	}
	
	
	
	
	

}
