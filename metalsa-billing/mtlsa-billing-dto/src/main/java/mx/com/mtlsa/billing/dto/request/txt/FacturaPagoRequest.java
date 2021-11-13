package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FacturaPagoRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 281541060072260933L;
	
	List<FacturaRequest> factura = new ArrayList<FacturaRequest>();

	public List<FacturaRequest> getFactura() {
		return factura;
	}

	public void setFactura(List<FacturaRequest> factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "FacturaPagoRequest [factura=" + factura + "]";
	}
	
	
	
	
	

}
