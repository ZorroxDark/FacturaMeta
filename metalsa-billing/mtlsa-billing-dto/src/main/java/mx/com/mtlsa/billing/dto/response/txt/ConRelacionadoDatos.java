package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConRelacionadoDatos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9098227713670473528L;
	
	
	   

	
	private List<ConRelacionado> relacionados = new ArrayList<ConRelacionado>();
	
	
	
	public ConRelacionadoDatos() {
		
	}



	public List<ConRelacionado> getRelacionados() {
		return relacionados;
	}



	public void setRelacionados(List<ConRelacionado> relacionados) {
		this.relacionados = relacionados;
	}



	@Override
	public String toString() {
		return "ConRelacionadoDatos [relacionados=" + relacionados + "]";
	}
	
	
	
	
	
	
	

}
