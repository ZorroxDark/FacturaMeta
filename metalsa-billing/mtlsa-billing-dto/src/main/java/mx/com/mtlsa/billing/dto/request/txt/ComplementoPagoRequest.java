package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ComplementoPagoRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5720800263913064193L;
	
	
	List<FacturaRequest> factura = new ArrayList<FacturaRequest>();
	
	
	public ComplementoPagoRequest(){
		
	}


	public List<FacturaRequest> getFactura() {
		return factura;
	}


	public void setFactura(List<FacturaRequest> factura) {
		this.factura = factura;
	}

	

	@Override
	public String toString() {
		return "ComplementoPagoRequest [factura=" + factura + "]";
	}
	
	
	
	
	
	

}
