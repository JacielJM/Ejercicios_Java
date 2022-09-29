package com.ecommerce.ferrepsg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="productos")
public class Productos {

//	Atributos
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idproductos", unique = true, nullable = false)
	private Long idProductos;
	private String marca;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Integer rating;
	private Double precio;
	private Boolean nuevo;
	
	
	//Constructor
	
	public Productos() {
		
	}

	public Productos(String marca, String nombre, String descripcion, String imagen, Integer rating, Double precio,
			Boolean nuevo) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.rating = rating;
		this.precio = precio;
		this.nuevo = nuevo;
	}

	//Getters & Setters
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
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


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Boolean getNuevo() {
		return nuevo;
	}


	public void setNuevo(Boolean nuevo) {
		this.nuevo = nuevo;
	}

	//toString

	@Override
	public String toString() {
		return "Productos [marca=" + marca + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen="
				+ imagen + ", Rating=" + rating + ", precio=" + precio + ", nuevo=" + nuevo + "]";
	}


	
	
	
	
	

	
	

	
	
	
	
}
