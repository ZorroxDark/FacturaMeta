package mx.com.mtlsa.billing.dto;

import java.io.Serializable;

public class ReceiveCFDResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1333317559746005936L;
	
	private String errorCode;
	private String errorMessage;
	private String errorDateTime;
	
	
	public ReceiveCFDResponse(){
		
	}


	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public String getErrorDateTime() {
		return errorDateTime;
	}


	public void setErrorDateTime(String errorDateTime) {
		this.errorDateTime = errorDateTime;
	}


	@Override
	public String toString() {
		return "ReceiveCFDResponse [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", errorDateTime="
				+ errorDateTime + "]";
	}



	
	
	
	
	
	
	

}
