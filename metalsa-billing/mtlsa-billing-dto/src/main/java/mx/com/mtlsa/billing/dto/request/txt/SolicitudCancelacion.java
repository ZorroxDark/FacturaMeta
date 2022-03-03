package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.math.BigDecimal;

public class SolicitudCancelacion  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8453929717614159482L;
	
    private String cfdiuuid;
    private String rfcEmisor;
    private String rfcReceptor;
    private BigDecimal montoTotal;
    private String tipoDoc;
    private String motivo;
    private String folioSustitucion;
    
    
    public SolicitudCancelacion(){
    	
    }


	public String getCfdiuuid() {
		return cfdiuuid;
	}


	public void setCfdiuuid(String cfdiuuid) {
		this.cfdiuuid = cfdiuuid;
	}


	public String getRfcEmisor() {
		return rfcEmisor;
	}


	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}


	public String getRfcReceptor() {
		return rfcReceptor;
	}


	public void setRfcReceptor(String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}


	public BigDecimal getMontoTotal() {
		return montoTotal;
	}


	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}


	public String getTipoDoc() {
		return tipoDoc;
	}


	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getFolioSustitucion() {
		return folioSustitucion;
	}


	public void setFolioSustitucion(String folioSustitucion) {
		this.folioSustitucion = folioSustitucion;
	}


	@Override
	public String toString() {
		return "SolicitudCancelacion [cfdiuuid=" + cfdiuuid + ", rfcEmisor=" + rfcEmisor + ", rfcReceptor="
				+ rfcReceptor + ", montoTotal=" + montoTotal + ", tipoDoc=" + tipoDoc + ", motivo=" + motivo
				+ ", folioSustitucion=" + folioSustitucion + "]";
	}
    

}
