package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CancelacionInfoAddResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8404285597349896886L;
	
	
	private String uuid;
	private String razonSocial;
	private ArrayList<String> emailProveedor = new ArrayList<String>();
	private ArrayList<String> emailComprador = new ArrayList<String>();
	private String status;
	
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<String> getEmailProveedor() {
		return emailProveedor;
	}
	public void setEmailProveedor(ArrayList<String> emailProveedor) {
		this.emailProveedor = emailProveedor;
	}
	public ArrayList<String> getEmailComprador() {
		return emailComprador;
	}
	public void setEmailComprador(ArrayList<String> emailComprador) {
		this.emailComprador = emailComprador;
	}
	@Override
	public String toString() {
		return "CancelacionInfoAddResponse [uuid=" + uuid + ", razonSocial=" + razonSocial + ", emailProveedor="
				+ emailProveedor + ", emailComprador=" + emailComprador + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	

}
