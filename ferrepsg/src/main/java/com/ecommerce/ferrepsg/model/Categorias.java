package com.ecommerce.ferrepsg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "categorias")
public class Categorias {
	
	// Atributos
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idcategorias", unique = true, nullable = false)
	private Long idCategorias;
	private String nombre;
	private String descripcion;
	
	// Coonstructor
	public Categorias(Long idCategorias, String nombre, String descripcion) {
		super();
		this.idCategorias = idCategorias;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	// Constructor vacio
	public Categorias() {
		// TODO Auto-generated constructor stub
	}

	// Getters y setters
	public Long getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(Long idCategorias) {
		this.idCategorias = idCategorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// toString()
	@Override
	public String toString() {
		return "Categoria [idCategorias=" + idCategorias + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
}
