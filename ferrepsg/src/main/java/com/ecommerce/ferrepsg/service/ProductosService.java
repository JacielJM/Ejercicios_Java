package com.ecommerce.ferrepsg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ferrepsg.model.Productos;

@Service

public class ProductosService {
public final ProductosRepository prodRepo;
	
	@Autowired
	public ProductosService(ProductosRepository prodRepo) {
		super();
		this.prodRepo = prodRepo;
	}

	public List<Productos> getProductos() {
		return prodRepo.findAll();
	}


	public Productos getProductos(Long idProductos) {
		return prodRepo.findById(idProductos).orElseThrow(()-> new IllegalStateException("El Producto con id "+idProductos+" no existe."));
	}

	public void deleteProductos(Long idProductos) {
		if (prodRepo.existsById(idProductos))
			prodRepo.deleteById(idProductos);
	}

	public void addProductos(Productos prod) {
		Optional<Productos> prodName = prodRepo.findByProductos(prod.getNombre());
		if (prodName.isPresent()) {
			throw new IllegalStateException("El Producto ya Existe");
		} else {
			prodRepo.save(prod);
		}
		
	}

	@SuppressWarnings("deprecation")
	public void updateProductos(Long idProductos, String nombre, String descripcion, String imagen, String rating, String precio) {
		if(prodRepo.existsById(idProductos)) {
			Productos prodTemp = prodRepo.getById(idProductos); 
			if (nombre != null) prodTemp.setNombre(nombre);
			if (descripcion !=null) prodTemp.setDescripcion(descripcion);
			if (imagen != null) prodTemp.setImagen(imagen);
			prodRepo.save(prodTemp);
		} else {
			System.out.println("No existe el id " + idProductos);
		}
	}

}
