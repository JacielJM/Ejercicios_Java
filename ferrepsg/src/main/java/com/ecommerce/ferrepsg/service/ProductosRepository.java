package com.ecommerce.ferrepsg.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.ferrepsg.model.Productos;
@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {
	@Query("SELECT c FROM Productos c WHERE c.nombre=?1")
	Optional<Productos> findByProductos(String nombre);
	
//	@Query("SELECT c FROM Productos c WHERE c.nuevo=TRUE")
//	Optional<Productos> findByProductosNuevos(Boolean nuevo);

}
