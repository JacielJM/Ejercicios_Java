package com.generation.ferrepsgdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ferrepsgdb.model.Producto;
import com.generation.ferrepsgdb.service.ProductoServicio;

@RestController
@RequestMapping(path="/api/productos/")
public class ProductoController {
	
	//Creamos la constante de nuestro servicio
	public final ProductoServicio pService;
	
	@Autowired //Inyección de dependencias para escanear e instanciar lo que se requiere
	public ProductoController(ProductoServicio pService) {
		this.pService = pService;
	}
	
	
	//Método GET (para mostrar toda la lista)
	@GetMapping
	public List<Producto> getProductos(){
			return pService.getAllProductos();
		}
		
	@GetMapping(path="{id}")
	public Producto getProducto(@PathVariable("id") Long id) {
		return pService.getProducto(id);
	}
		
	//Método POST (para agregar un producto)
		
	@PostMapping
	public void addProducto(@RequestBody Producto prod) {
		pService.addProducto(prod);
	}
		
	@DeleteMapping(path="{id}")
	public void deleteProducto(@PathVariable("id") Long id) {
		pService.deleteProducto(id);
	}
		
	@PutMapping(path="{id}")
	public void updateProducto(@PathVariable("id") Long id,
		@RequestParam (required = false) String nombre,
		@RequestParam (required = false) String descripcion,
		@RequestParam (required = false) Double precio,
		@RequestParam (required = false) String url_imagen) {
		pService.updateProducto(id, nombre, descripcion, precio, url_imagen);
	}
}
