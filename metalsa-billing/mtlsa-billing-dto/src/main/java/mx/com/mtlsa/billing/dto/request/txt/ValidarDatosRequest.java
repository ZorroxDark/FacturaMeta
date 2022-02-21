package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.math.BigDecimal;

public class ValidarDatosRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8702039149843254388L;
	
	
	
	
	private String cfdiUuid;
	private String rfcReceptor;
	private String rfcEmisor;
	private BigDecimal montoTotal ; 
	private String tipoDoc;
	private String validarUuids;
	
	public ValidarDatosRequest(){
		
	}

	public String getCfdiUuid() {
		return cfdiUuid;
	}

	public void setCfdiUuid(String cfdiUuid) {
		this.cfdiUuid = cfdiUuid;
	}

	public String getRfcReceptor() {
		return rfcReceptor;
	}

	public void setRfcReceptor(String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}

	public String getRfcEmisor() {
		return rfcEmisor;
	}

	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}

	

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getValidarUuids() {
		return validarUuids;
	}

	public void setValidarUuids(String validarUuids) {
		this.validarUuids = validarUuids;
	}

	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}

	@Override
	public String toString() {
		return "ValidarDatosRequest [cfdiUuid=" + cfdiUuid + ", rfcReceptor=" + rfcReceptor + ", rfcEmisor=" + rfcEmisor
				+ ", montoTotal=" + montoTotal + ", tipoDoc=" + tipoDoc + ", validarUuids=" + validarUuids + "]";
	}

	
	

}
