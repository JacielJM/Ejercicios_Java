package com.generation.ferrepsgdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Convierte el modelo o clase en una entidad de una DB
@Table(name = "producto") // la tabla debe coincidir exactamente con la existente en MySQL
public class Producto { // Estructura POJOS -> Plain Old Java Objects
	//1. Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String descripcion;
	private String url_imagen;
	private Double precio;
	
	//2. Constructor con campos
	public Producto(Long id, String nombre, String descripcion, String url_imagen, Double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url_imagen = url_imagen;
		this.precio = precio;
	}
	
	//3. Constructor vacío
	public Producto() {
	}
	
	//4. Getters y setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getUrl_imagen() {
		return url_imagen;
	}
	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	//5. toString
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", url_imagen="
				+ url_imagen + ", precio=" + precio + "]";
	}
}//class
