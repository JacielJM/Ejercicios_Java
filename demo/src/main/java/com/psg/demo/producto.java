package com.psg.demo;

public class producto {
	//1. Atributos
	
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private double precio;
	
	//2. Constructor
	public producto(String nombre, String descripcion, String URL_imagen, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_imagen = URL_imagen;
		this.precio = precio;
	}
	//3. Getters y Setters

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
	public String getURL_imagen() {
		return URL_imagen;
	}
	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	//4. (opcional) toString
	@Override
	public String toString() {
		return "producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen=" + URL_imagen
				+ ", precio=" + precio + "]";
	}
	
	
}
