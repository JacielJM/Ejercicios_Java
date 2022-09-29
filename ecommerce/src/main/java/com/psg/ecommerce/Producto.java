package com.psg.ecommerce;

public class Producto {
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private Double precio;
	private int id; //id para identificar el producto
	private static int total = 0; //
	
	public Producto(String nombre, String descripcion, String URL_imagen, Double precio) {
		total++; // cada que se agrega un producto, aumenta el contador
		this.id = total;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_imagen = URL_imagen;
		this.precio = precio;
	}//constructor
	
	//constructor vacío para que la librería jackson pueda leer el nuevo producto
	public Producto() {
		total++;
		this.id = total;
	}
	
	
	public int getId() {
		return id;
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
	public String getURL_imagen() {
		return URL_imagen;
	}
	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}//getters y setters


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen=" + URL_imagen
				+ ", precio=" + precio + ", id=" + id + "]";
	}//toString
}//clase
