package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsultaCancelacionRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3841497880591021495L;
	
	
	 private List<ConsultaCancelacion> oListUUID = new ArrayList<ConsultaCancelacion>();
	 private String dFechaInicio;
	 private String dFechaFin;
	 private String cToken;

	 
	 public ConsultaCancelacionRequest() {
		 
	 }

	 

	public List<ConsultaCancelacion> getoListUUID() {
		return oListUUID;
	}



	public void setoListUUID(List<ConsultaCancelacion> oListUUID) {
		this.oListUUID = oListUUID;
	}



	public String getdFechaInicio() {
		return dFechaInicio;
	}


	public void setdFechaInicio(String dFechaInicio) {
		this.dFechaInicio = dFechaInicio;
	}


	public String getdFechaFin() {
		return dFechaFin;
	}


	public void setdFechaFin(String dFechaFin) {
		this.dFechaFin = dFechaFin;
	}


	public String getcToken() {
		return cToken;
	}


	public void setcToken(String cToken) {
		this.cToken = cToken;
	}



	@Override
	public String toString() {
		return "ConsultaCancelacionRequest [oListUUID=" + oListUUID + ", dFechaInicio=" + dFechaInicio + ", dFechaFin="
				+ dFechaFin + ", cToken=" + cToken + "]";
	}



}
