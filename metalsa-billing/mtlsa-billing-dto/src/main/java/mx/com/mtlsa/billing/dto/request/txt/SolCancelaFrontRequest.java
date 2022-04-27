package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

public class SolCancelaFrontRequest  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -704100449448277156L;
	
	
	private String cfdiuuid;
	private String rfcReceptor;
	private String motivo;
	private String tipoDoc;
	private String rfcEmisor;
	private String montoTotal;
	
	public SolCancelaFrontRequest() {
		
	}

	public String getCfdiuuid() {
		return cfdiuuid;
	}

	public void setCfdiuuid(String cfdiuuid) {
		this.cfdiuuid = cfdiuuid;
	}

	public String getRfcReceptor() {
		return rfcReceptor;
	}

	public void setRfcReceptor(String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getRfcEmisor() {
		return rfcEmisor;
	}

	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}

	public String getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(String montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
	


}
