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

import com.ecommerce.ferrepsg.model.Categorias;
import com.ecommerce.ferrepsg.service.CategoriaService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
		RequestMethod.PUT })
@RestController
@RequestMapping(path = "/api/categorias/")
public class CategoriaController {
	
	public final CategoriaService catServ;
	
	@Autowired
	public CategoriaController(CategoriaService catServ) {
		super();
		this.catServ = catServ;
	}
	
	@GetMapping
	public List<Categorias> getCategorias() {
		return catServ.getCategorias();
	}
	
	@GetMapping(path = "{idCategorias}")
	public Categorias getCategoria(@PathVariable("idCategorias") Long idCategorias) {
		return catServ.getCategoria(idCategorias);
	}
	
	@DeleteMapping(path = "{idCategorias}")
	public void deleteCategoria(@PathVariable("idCategorias") Long idCategorias) {
		catServ.deleteCategoria(idCategorias);
	}
	
	@PostMapping
	public void addCategoria(@RequestBody Categorias cat) {
		catServ.addCategoria(cat);
	}
	
	@PutMapping(path = "{idCategorias}")
	public void updateCategoria(@PathVariable("{idCategorias}") Long idCategorias,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String descripcion) {
		catServ.updateCategoria(idCategorias, nombre, descripcion);
	}

}
