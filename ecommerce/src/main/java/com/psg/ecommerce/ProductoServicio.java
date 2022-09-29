package com.psg.ecommerce;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

//Debemos agregar la anotacion Service para que Spring identifique que esta clase es para crear servicios (productos). En esta capa vamos a crear todo nuestro listado de productos, mismo que sera modificado segun el metodo que utilicemos (GET, POST, PUT, DELETE).Para esto, es importante crear un constructor vacio para instancia toda la lista.

@Service
public class ProductoServicio {
	public final ArrayList<Producto> lista = new ArrayList<Producto>();
	
	public ProductoServicio() {
		lista.add(new Producto("Nieve de Oreo", "Helado sabor galleta de chocolate y crema, 1L", "nieveoreo.jpg", 150.0));
		lista.add(new Producto("Galletas Marías", "Galletas sabor mantequilla", "marias.jpg", 15.0));
		lista.add(new Producto("Pap's Sal", "Frituras de papas con sal", "papitas.jpg", 28.0));
		lista.add(new Producto("Coca-Cola", "Refresco sabor cola, 0.6L", "coca.jpg", 18.0));
	}
	
	//metodo para mostrar todos los productos
	public ArrayList<Producto> getAllProductos() {
		return lista;
	}//getAll
	
	//método para agregar un nuevo producto
	public void addProducto(Producto prod) {
		lista.add(prod);
	}//addProducto
	
	//método para mostrar un producto específico
	public Producto getProducto(Long id) {
		Producto temp = null;
		for (Producto prod : lista) {
			if(prod.getId() == id) {
				temp = prod;
			}//if
		}//foreach
		return temp;
	}//get producto
	
	public void updateProducto(Long id, String nombre, String descripcion, Double precio, String url_imagen) {
		for (Producto prod : lista) {
			if (prod.getId()== id) {
				if(nombre != null) prod.setNombre(nombre);
				if(descripcion != null) prod.setDescripcion(descripcion);
				if(precio != null) prod.setPrecio(precio);
				if(url_imagen != null) prod.setURL_imagen(url_imagen);
			}
		}
	}
	
	public void deleteProducto(Long id) {
		for(Producto prod : lista) {
			if(prod.getId()== id) {
				lista.remove(prod);
				break;
			}//if
		}//foreach
	}//deleteProducto
	
	// borrar toda la lista
	public void deleteProductos() {
		lista.clear();
	}
}
