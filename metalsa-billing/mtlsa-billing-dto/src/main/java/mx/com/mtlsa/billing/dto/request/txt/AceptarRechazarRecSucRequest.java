package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AceptarRechazarRecSucRequest implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2302703410259313687L;
	
	
	
	private String cToken;
	private List<AceptarRechazarRequest> listUuids = new ArrayList<AceptarRechazarRequest>();
	
	
	public AceptarRechazarRecSucRequest(){
		
	}
	
	


	public String getcToken() {
		return cToken;
	}


	public void setcToken(String cToken) {
		this.cToken = cToken;
	}


	public List<AceptarRechazarRequest> getListUuids() {
		return listUuids;
	}


	public void setListUuids(List<AceptarRechazarRequest> listUuids) {
		this.listUuids = listUuids;
	}


	@Override
	public String toString() {
		return "AceptarRechazarRecSucRequest [cToken=" + cToken + ", listUuids=" + listUuids + "]";
	}
	
}
