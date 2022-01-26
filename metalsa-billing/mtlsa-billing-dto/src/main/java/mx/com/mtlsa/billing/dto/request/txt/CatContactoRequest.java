package mx.com.mtlsa.billing.dto.request.txt;

import java.io.Serializable;

import mx.com.mtlsa.billing.dto.MensajeDTO;

public class CatContactoRequest   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6174034256492396070L;
	
	
	private String empresa;
	private String cliente;
	private String contacto ;
	private String nombre; 
	private String apPaterno ; 
	private String apMaterno ; 
	private String email ; 
	private String area ; 
	private String comentarios;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	@Override
	public String toString() {
		return "CatContactoRequest [cliente=" + cliente + ", empresa=" + empresa + ", contacto=" + contacto
				+ ", nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", email=" + email
				+ ", area=" + area + ", comentarios=" + comentarios + "]";
	}
	
	
	
	
	

	
}
