package com.psg.ecommerce;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE}) //permite hacer pruebas conectando entre puertos locales 8080 y 5500 pej

@RestController //Permite manejar métodos HTTP (GET, POST, PUT, DELETE)
@RequestMapping(path="api/productos/")

public class ProductoController {
	private final ProductoServicio pService; //constante para el servicio
	
	@Autowired //indica que con esta anotacion se construira la lista de productos para evitar el new producto cada que iniciemos el servidor (evitamos hacer la construccion de productos de forma manual)
	
	// constructor que lleva como parámetro el prodService (variable declarada arriba), para que la pueda ejecutar el autowired
	public ProductoController(ProductoServicio pService) {
		this.pService = pService;
	}//constructor para el Autowired
	
	//Método GET (para mostrar toda la lista)
	@GetMapping
	public ArrayList<Producto> getProductos(){
		return pService.getAllProductos();
	}
	
	@GetMapping(path="{id}")
	public Producto getProducto(@PathVariable("id") Long id) {
		return pService.getProducto(id);
	}
	
	@DeleteMapping
	public void deleteProductos() {
		pService.deleteProductos();
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
