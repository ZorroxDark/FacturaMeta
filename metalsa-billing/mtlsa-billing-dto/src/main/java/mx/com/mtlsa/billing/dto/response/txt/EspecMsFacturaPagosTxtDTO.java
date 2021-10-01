package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EspecMsFacturaPagosTxtDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5512127431735121069L;
	
	private EspecOrdEncaFacElecTxtDTO cabecera = new EspecOrdEncaFacElecTxtDTO();
	
	private List<EspecOrdLineDetCfdTxtDTO> complemento = new ArrayList<EspecOrdLineDetCfdTxtDTO>();

	private List<EstrucSecAuxComplePagoTxtDTO> auxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
	
	public EspecMsFacturaPagosTxtDTO(){
		
	}

	public EspecOrdEncaFacElecTxtDTO getCabecera() {
		return cabecera;
	}

	public void setCabecera(EspecOrdEncaFacElecTxtDTO cabecera) {
		this.cabecera = cabecera;
	}

	public List<EspecOrdLineDetCfdTxtDTO> getComplemento() {
		return complemento;
	}

	public void setComplemento(List<EspecOrdLineDetCfdTxtDTO> complemento) {
		this.complemento = complemento;
	}

	public List<EstrucSecAuxComplePagoTxtDTO> getAuxComplePago() {
		return auxComplePago;
	}

	public void setAuxComplePago(List<EstrucSecAuxComplePagoTxtDTO> auxComplePago) {
		this.auxComplePago = auxComplePago;
	}

	@Override
	public String toString() {
		return "EspecMsFacturaPagosTxtDTO [cabecera=" + cabecera + ", complemento=" + complemento + ", auxComplePago="
				+ auxComplePago + "]";
	}
	
	
	
	
	

}
