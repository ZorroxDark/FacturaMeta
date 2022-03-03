package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class ConsultaCancelacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8783787126169148374L;
	
	private String uid;
	

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "ConsultaCancelacion [uid=" + uid + "]";
	}
	
	
	
	
	
	

}
