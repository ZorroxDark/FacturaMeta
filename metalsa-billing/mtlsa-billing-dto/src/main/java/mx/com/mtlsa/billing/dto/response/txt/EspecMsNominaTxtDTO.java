package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EspecMsNominaTxtDTO  implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7567917368570048389L;

	
	private EspecOrdEncaFacElecTxtDTO cabecera = new EspecOrdEncaFacElecTxtDTO();
	
	private List<EspecOrdLineDetCfdTxtDTO> complemento = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
	
	private List<EspecOrdLineImpuestoCfdTxtDTO> impuestos = new ArrayList<EspecOrdLineImpuestoCfdTxtDTO>();

	//private ListaAuxComplePagoTxtDTO auxComplePago = new ListaAuxComplePagoTxtDTO();
	private List<EstrucSecAuxComplePagoTxtDTO>  auxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
	
	
	public EspecMsNominaTxtDTO(){
		
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


	public List<EspecOrdLineImpuestoCfdTxtDTO> getImpuestos() {
		return impuestos;
	}


	public void setImpuestos(List<EspecOrdLineImpuestoCfdTxtDTO> impuestos) {
		this.impuestos = impuestos;
	}


	public List<EstrucSecAuxComplePagoTxtDTO> getAuxComplePago() {
		return auxComplePago;
	}


	public void setAuxComplePago(List<EstrucSecAuxComplePagoTxtDTO> auxComplePago) {
		this.auxComplePago = auxComplePago;
	}


	@Override
	public String toString() {
		return "EspecMsNominaTxtDTO [cabecera=" + cabecera + ", complemento=" + complemento + ", impuestos=" + impuestos
				+ ", auxComplePago=" + auxComplePago + "]";
	}


	

	

	
	


//	public ListaAuxComplePagoTxtDTO getAuxComplePago() {
//		return auxComplePago;
//	}
//
//
//	public void setAuxComplePago(ListaAuxComplePagoTxtDTO auxComplePago) {
//		this.auxComplePago = auxComplePago;
//	}


//	@Override
//	public String toString() {
//		return "EspecMsFacturaTxtDTO [cabecera=" + cabecera + ", complemento=" + complemento + ", impuestos="
//				+ impuestos + ", auxComplePago=" + auxComplePago + "]";
//	}
	
	


	
	
	
	
	
	
	

}
