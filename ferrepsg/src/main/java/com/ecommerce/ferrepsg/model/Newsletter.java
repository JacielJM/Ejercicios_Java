package com.ecommerce.ferrepsg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "newsletter")
public class Newsletter {

	// Atributos
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idnewsletter", unique = true, nullable = false)
	private Long idnewsletter;
	private String correo;
	
	// Constructor
	public Newsletter(Long idnewsletter, String correo) {
		super();
		this.idnewsletter = idnewsletter;
		this.correo = correo;
	}
	
	// Constructor vacio
	public Newsletter() {
		// TODO Auto-generated constructor stub
	}
	
	// Getters y setters
	public Long getIdnewsletter() {
		return idnewsletter;
	}

	public void setIdnewsletter(Long idnewsletter) {
		this.idnewsletter = idnewsletter;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	//toString
	@Override
	public String toString() {
		return "Newsletter [idnewsletter=" + idnewsletter + ", correo=" + correo + "]";
	}
	
	
	
}
