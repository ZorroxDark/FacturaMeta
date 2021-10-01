package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class ListaAuxComplePagoTxtDTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3806603719529888503L;
	
	private EstrucSecAuxComplePagoTxtDTO encabezado = new EstrucSecAuxComplePagoTxtDTO();
	private EstrucSecAuxComplePagoTxtDTO destinatario = new EstrucSecAuxComplePagoTxtDTO();
	private EstrucSecAuxComplePagoTxtDTO domEmisor = new EstrucSecAuxComplePagoTxtDTO();
	private EstrucSecAuxComplePagoTxtDTO domReceptor = new EstrucSecAuxComplePagoTxtDTO();
	private EstrucSecAuxComplePagoTxtDTO txtLeyeda = new EstrucSecAuxComplePagoTxtDTO();
	
	
	public ListaAuxComplePagoTxtDTO() {
		
	}


	public EstrucSecAuxComplePagoTxtDTO getEncabezado() {
		return encabezado;
	}


	public void setEncabezado(EstrucSecAuxComplePagoTxtDTO encabezado) {
		this.encabezado = encabezado;
	}


	public EstrucSecAuxComplePagoTxtDTO getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(EstrucSecAuxComplePagoTxtDTO destinatario) {
		this.destinatario = destinatario;
	}


	public EstrucSecAuxComplePagoTxtDTO getDomEmisor() {
		return domEmisor;
	}


	public void setDomEmisor(EstrucSecAuxComplePagoTxtDTO domEmisor) {
		this.domEmisor = domEmisor;
	}


	public EstrucSecAuxComplePagoTxtDTO getDomReceptor() {
		return domReceptor;
	}


	public void setDomReceptor(EstrucSecAuxComplePagoTxtDTO domReceptor) {
		this.domReceptor = domReceptor;
	}


	public EstrucSecAuxComplePagoTxtDTO getTxtLeyeda() {
		return txtLeyeda;
	}


	public void setTxtLeyeda(EstrucSecAuxComplePagoTxtDTO txtLeyeda) {
		this.txtLeyeda = txtLeyeda;
	}


	@Override
	public String toString() {
		return "ListaAuxComplePagoTxtDTO [encabezado=" + encabezado + ", destinatario=" + destinatario + ", domEmisor="
				+ domEmisor + ", domReceptor=" + domReceptor + ", txtLeyeda=" + txtLeyeda + "]";
	}
	
	
	
	
	

}
