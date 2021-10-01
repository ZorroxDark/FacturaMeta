package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class EspecOrdLineImpuestoCfdTxtDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5322403061983550514L;


	private String impuestoTipoImpuesto;
	private String impuestoDescripcion;
	private String impuestoMontoImporte;
	private String impuestoTasa;
	private String tipoFactor;
	
	public EspecOrdLineImpuestoCfdTxtDTO() {
		
	}
	
	public String getImpuestoTipoImpuesto() {
		return impuestoTipoImpuesto;
	}



	public void setImpuestoTipoImpuesto(String impuestoTipoImpuesto) {
		this.impuestoTipoImpuesto = impuestoTipoImpuesto;
	}



	public String getImpuestoDescripcion() {
		return impuestoDescripcion;
	}



	public void setImpuestoDescripcion(String impuestoDescripcion) {
		this.impuestoDescripcion = impuestoDescripcion;
	}



	public String getImpuestoMontoImporte() {
		return impuestoMontoImporte;
	}



	public void setImpuestoMontoImporte(String impuestoMontoImporte) {
		this.impuestoMontoImporte = impuestoMontoImporte;
	}



	public String getImpuestoTasa() {
		return impuestoTasa;
	}



	public void setImpuestoTasa(String impuestoTasa) {
		this.impuestoTasa = impuestoTasa;
	}



	public String getTipoFactor() {
		return tipoFactor;
	}



	public void setTipoFactor(String tipoFactor) {
		this.tipoFactor = tipoFactor;
	}

	@Override
	public String toString() {
		return "EspecOrdLineImpuestoCfdTxtDTO [impuestoTipoImpuesto=" + impuestoTipoImpuesto + ", impuestoDescripcion="
				+ impuestoDescripcion + ", impuestoMontoImporte=" + impuestoMontoImporte + ", impuestoTasa="
				+ impuestoTasa + ", tipoFactor=" + tipoFactor + "]";
	}



	

}
