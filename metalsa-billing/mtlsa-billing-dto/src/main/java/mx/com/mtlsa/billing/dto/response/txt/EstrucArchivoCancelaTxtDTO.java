package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;

public class EstrucArchivoCancelaTxtDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1463283438816425497L;
	
	
	
	private String cancelacionSerie;
	private String cancelacionFolio;
	private String cancelacionRfcEmisor;
	private String cancelacionFecha;
	private String cancelacionHora;
	private String cancelacionObservaciones;
	private String cancelacionResponsable;
	
	private String cancelacionMisc01;
	private String cancelacionMisc02;
	private String cancelacionMisc03;
	private String cancelacionMisc04;
	private String cancelacionMisc05;
	
	
	public EstrucArchivoCancelaTxtDTO() {
		
	}


	public String getCancelacionSerie() {
		return cancelacionSerie;
	}


	public void setCancelacionSerie(String cancelacionSerie) {
		this.cancelacionSerie = cancelacionSerie;
	}


	public String getCancelacionFolio() {
		return cancelacionFolio;
	}


	public void setCancelacionFolio(String cancelacionFolio) {
		this.cancelacionFolio = cancelacionFolio;
	}


	public String getCancelacionRfcEmisor() {
		return cancelacionRfcEmisor;
	}


	public void setCancelacionRfcEmisor(String cancelacionRfcEmisor) {
		this.cancelacionRfcEmisor = cancelacionRfcEmisor;
	}


	public String getCancelacionFecha() {
		return cancelacionFecha;
	}


	public void setCancelacionFecha(String cancelacionFecha) {
		this.cancelacionFecha = cancelacionFecha;
	}


	public String getCancelacionHora() {
		return cancelacionHora;
	}


	public void setCancelacionHora(String cancelacionHora) {
		this.cancelacionHora = cancelacionHora;
	}


	public String getCancelacionObservaciones() {
		return cancelacionObservaciones;
	}


	public void setCancelacionObservaciones(String cancelacionObservaciones) {
		this.cancelacionObservaciones = cancelacionObservaciones;
	}


	public String getCancelacionResponsable() {
		return cancelacionResponsable;
	}


	public void setCancelacionResponsable(String cancelacionResponsable) {
		this.cancelacionResponsable = cancelacionResponsable;
	}


	public String getCancelacionMisc01() {
		return cancelacionMisc01;
	}


	public void setCancelacionMisc01(String cancelacionMisc01) {
		this.cancelacionMisc01 = cancelacionMisc01;
	}


	public String getCancelacionMisc02() {
		return cancelacionMisc02;
	}


	public void setCancelacionMisc02(String cancelacionMisc02) {
		this.cancelacionMisc02 = cancelacionMisc02;
	}


	public String getCancelacionMisc03() {
		return cancelacionMisc03;
	}


	public void setCancelacionMisc03(String cancelacionMisc03) {
		this.cancelacionMisc03 = cancelacionMisc03;
	}


	public String getCancelacionMisc04() {
		return cancelacionMisc04;
	}


	public void setCancelacionMisc04(String cancelacionMisc04) {
		this.cancelacionMisc04 = cancelacionMisc04;
	}


	public String getCancelacionMisc05() {
		return cancelacionMisc05;
	}


	public void setCancelacionMisc05(String cancelacionMisc05) {
		this.cancelacionMisc05 = cancelacionMisc05;
	}


	@Override
	public String toString() {
		return "EstrucArchivoCancelaTxtDTO [cancelacionSerie=" + cancelacionSerie + ", cancelacionFolio="
				+ cancelacionFolio + ", cancelacionRfcEmisor=" + cancelacionRfcEmisor + ", cancelacionFecha="
				+ cancelacionFecha + ", cancelacionHora=" + cancelacionHora + ", cancelacionObservaciones="
				+ cancelacionObservaciones + ", cancelacionResponsable=" + cancelacionResponsable
				+ ", cancelacionMisc01=" + cancelacionMisc01 + ", cancelacionMisc02=" + cancelacionMisc02
				+ ", cancelacionMisc03=" + cancelacionMisc03 + ", cancelacionMisc04=" + cancelacionMisc04
				+ ", cancelacionMisc05=" + cancelacionMisc05 + "]";
	}
	
	
	
	
	

}
