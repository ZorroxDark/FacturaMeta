package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class FacturaRequest  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 314526296758210750L;
	
	

	private String numDoc;
	private String empresa;
	
	public FacturaRequest() {
		
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
		return "FacturaRequest [numDoc=" + numDoc + ", empresa=" + empresa + "]";
	}
	
	
	
	
	

}
