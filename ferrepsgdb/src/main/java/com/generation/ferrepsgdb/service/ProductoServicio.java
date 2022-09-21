package com.generation.ferrepsgdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ferrepsgdb.model.Producto;

@Service
public class ProductoServicio {

	//aqui va la lista de productos emulada, pero viene de la base de datos
	// constante para autowired
	private final ProductosRepository productosRepository;
	
	//constructor
	@Autowired
	public ProductoServicio(ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}
	
	
	public List<Producto> getAllProductos() {
		return productosRepository.findAll(); // consulta que retorna todos los elementos del tipo Producto
	}


	public Producto getProducto(Long id) {
		return productosRepository.findById(id).orElseThrow(()-> new IllegalStateException("El producto con el ID " + id + " no existe."));
	}

	// Metodo POST para agregar un producto
	public void addProducto(Producto prod) {
		Optional <Producto> prodName = productosRepository.findByNombre(prod.getNombre());
		if (prodName.isPresent()) {
			throw new IllegalStateException("El producto con el nombre "+ prod.getNombre() + " ya existe.");
		} else {
			productosRepository.save(prod);
		}
	}
	
	@SuppressWarnings("deprecation")
	public void updateProducto(Long id, String nombre, String descripcion, Double precio, String url_imagen) {
		if (productosRepository.existsById(id)) {
			Producto p = productosRepository.getById(id);
			if (nombre != null) p.setNombre(nombre);
			if (descripcion != null) p.setDescripcion(descripcion);
			if (precio != null) p.setPrecio(precio);
			if (url_imagen != null) p.setUrl_imagen(url_imagen);
			productosRepository.save(p);
		} else {
			System.out.println("No existe el id " + id);
		}
	}

	public void deleteProducto(Long id) {
		if(productosRepository.existsById(id)) {
			productosRepository.deleteById(id);
		}
	}
}
