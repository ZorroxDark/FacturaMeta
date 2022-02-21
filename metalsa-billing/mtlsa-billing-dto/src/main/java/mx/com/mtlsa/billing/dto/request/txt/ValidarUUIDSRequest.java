package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidarUUIDSRequest implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2451178773879915900L;
	
	
	private List<ValidarDatosRequest> listUUID = new ArrayList<ValidarDatosRequest>();
	private String cToken;

	public ValidarUUIDSRequest(){
	}

	
	

	public String getcToken() {
		return cToken;
	}

	public void setcToken(String cToken) {
		this.cToken = cToken;
	}




	public List<ValidarDatosRequest> getListUUID() {
		return listUUID;
	}




	public void setListUUID(List<ValidarDatosRequest> listUUID) {
		this.listUUID = listUUID;
	}




	@Override
	public String toString() {
		return "ValidarUUIDSRequest [listUUID=" + listUUID + ", cToken=" + cToken + "]";
	}



	
	
	
	
}
