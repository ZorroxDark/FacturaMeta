package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NominaPagoRequest implements Serializable {

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -392480806566418214L;
	
	
	List<FacturaRequest> factura = new ArrayList<FacturaRequest>();
	
	
	

	public NominaPagoRequest(){
		
	}




	public List<FacturaRequest> getFactura() {
		return factura;
	}




	public void setFactura(List<FacturaRequest> factura) {
		this.factura = factura;
	}




	@Override
	public String toString() {
		return "NominaPagoRequest [factura=" + factura + "]";
	}

	
	
	

	
	
	

}
