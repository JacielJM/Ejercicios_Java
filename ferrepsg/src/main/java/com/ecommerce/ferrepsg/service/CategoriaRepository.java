package com.ecommerce.ferrepsg.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.ferrepsg.model.Categorias;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Long> {

	@Query("SELECT c FROM Categorias c WHERE c.nombre=?1")
	Optional<Categorias> findByCategoria(String nombre);
	
}
