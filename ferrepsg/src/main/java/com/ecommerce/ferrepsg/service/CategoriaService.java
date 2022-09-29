package com.ecommerce.ferrepsg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ferrepsg.model.Categorias;

@Service
public class CategoriaService {
	
	public final CategoriaRepository catRepo;
	
	@Autowired
	public CategoriaService(CategoriaRepository catRepo) {
		super();
		this.catRepo = catRepo;
	}

	public List<Categorias> getCategorias() {
		return catRepo.findAll();
	}

	public Categorias getCategoria(Long idCategorias) {
		return catRepo.findById(idCategorias).orElseThrow(()-> new IllegalStateException("La categoria con id "+idCategorias+" no existe."));
	}

	public void deleteCategoria(Long idCategorias) {
		if (catRepo.existsById(idCategorias))
			catRepo.deleteById(idCategorias);
	}

	public void addCategoria(Categorias cat) {
		Optional<Categorias> catName = catRepo.findByCategoria(cat.getNombre());
		if (catName.isPresent()) {
			throw new IllegalStateException("La categoria ya existe");
		} else {
			catRepo.save(cat);
		}
		
	}

	@SuppressWarnings("deprecation")
	public void updateCategoria(Long idCategorias, String nombre, String descripcion) {
		if(catRepo.existsById(idCategorias)) {
			Categorias catTemp = catRepo.getById(idCategorias); 
			if (nombre != null) catTemp.setNombre(nombre);
			if (descripcion !=null) catTemp.setDescripcion(descripcion);
			catRepo.save(catTemp);
		} else {
			System.out.println("No existe el id " + idCategorias);
		}
	}

}
