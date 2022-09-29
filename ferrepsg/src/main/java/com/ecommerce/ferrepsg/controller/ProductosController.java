package com.ecommerce.ferrepsg.controller;

import java.util.List;

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

import com.ecommerce.ferrepsg.model.Newsletter;
import com.ecommerce.ferrepsg.model.Productos;
import com.ecommerce.ferrepsg.service.ProductosService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
		RequestMethod.PUT })
@RestController
@RequestMapping(path = "/api/productos/")
public class ProductosController {
	
	public final ProductosService catProd;
	

	@Autowired
	public ProductosController(ProductosService catProd) {
		super();
		this.catProd = catProd;
	}
	
	@GetMapping
	public List<Productos> getProductos() {
		return catProd.getProductos();
	}
	
	@GetMapping(path = "{idProductos}")
	public Productos getProductos(@PathVariable("idProductos") Long idProductos) {
		return catProd.getProductos(idProductos);
	}
	
	@DeleteMapping(path = "{idProductos}")
	public void deleteProductos(@PathVariable("idProductos") Long idProductos) {
		catProd.deleteProductos(idProductos);
	}
	
	@PostMapping
	public void addProductos(@RequestBody Productos cat) {
		catProd.addProductos(cat);
	}
	
	@PutMapping(path = "{idProductos}")
	public void updateProductos(@PathVariable("idProductos") Long idProductos,
			@RequestParam(required = false) String marca,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String imagen,
			@RequestParam(required = false) String rating,
			@RequestParam(required = false) String precio	

			) {
		catProd.updateProductos(idProductos, marca, nombre, imagen, rating, precio);
	}



}
