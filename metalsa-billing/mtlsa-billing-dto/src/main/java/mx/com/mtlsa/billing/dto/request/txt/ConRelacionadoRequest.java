package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class ConRelacionadoRequest implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = -271181821877691591L;
	
    private String  cCfdiUuid;
    private String  cToken;
	
     
     public String getcCfdiUuid() {
		return cCfdiUuid;
	}
	public void setcCfdiUuid(String cCfdiUuid) {
		this.cCfdiUuid = cCfdiUuid;
	}
	public String getcToken() {
		return cToken;
	}
	public void setcToken(String cToken) {
		this.cToken = cToken;
	}
	
	
	@Override
	public String toString() {
		return "ConRelacionadoRequest [cCfdiUuid=" + cCfdiUuid + ", cToken=" + cToken + "]";
	}
     
     
     

	
	
	
}
