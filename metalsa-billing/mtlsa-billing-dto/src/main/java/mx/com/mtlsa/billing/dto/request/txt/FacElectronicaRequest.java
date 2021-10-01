package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class FacElectronicaRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5720800263913064193L;
	
	
	private String numDoc;
	private String empresa;
	
	
	public FacElectronicaRequest() {
		
	}


	public String getNumDoc() {
		return numDoc;
	}


	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	@Override
	public String toString() {
		return "FacElectronicaRequest [numDoc=" + numDoc + ", empresa=" + empresa + "]";
	}
	

	

	
}
