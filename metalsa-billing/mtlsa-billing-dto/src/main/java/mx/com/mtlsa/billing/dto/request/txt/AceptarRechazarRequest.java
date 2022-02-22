package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class AceptarRechazarRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6226058660011760403L;
	
	
	private String cCfdiUuid;
	private Boolean bAutorizoCliente;
	
	
	public AceptarRechazarRequest() {
		
	}
	
	public String getcCfdiUuid() {
		return cCfdiUuid;
	}
	public void setcCfdiUuid(String cCfdiUuid) {
		this.cCfdiUuid = cCfdiUuid;
	}

	public Boolean getbAutorizoCliente() {
		return bAutorizoCliente;
	}

	public void setbAutorizoCliente(Boolean bAutorizoCliente) {
		this.bAutorizoCliente = bAutorizoCliente;
	}

	@Override
	public String toString() {
		return "AceptarRechazarRequest [cCfdiUuid=" + cCfdiUuid + ", bAutorizoCliente=" + bAutorizoCliente + "]";
	}
	
	
	
	
	

}
