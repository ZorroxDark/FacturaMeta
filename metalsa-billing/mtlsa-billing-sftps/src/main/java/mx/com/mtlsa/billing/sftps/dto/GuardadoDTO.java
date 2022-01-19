package mx.com.mtlsa.billing.sftps.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class GuardadoDTO  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2261892163414972434L;
	
	
	private String resultado;
	private String url;
	private String rutaDestino;
	private List<String> archivosAgregados = new ArrayList<String>();
	
	
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRutaDestino() {
		return rutaDestino;
	}
	public void setRutaDestino(String rutaDestino) {
		this.rutaDestino = rutaDestino;
	}
	public List<String> getArchivosAgregados() {
		return archivosAgregados;
	}
	public void setArchivosAgregados(List<String> archivosAgregados) {
		this.archivosAgregados = archivosAgregados;
	}
	@Override
	public String toString() {
		return "GuardadoDTO [resultado=" + resultado + ", url=" + url + ", rutaDestino=" + rutaDestino
				+ ", archivosAgregados=" + archivosAgregados + "]";
	}
	
	
	


}

