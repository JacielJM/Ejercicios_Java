package com.ecommerce.ferrepsg.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.ferrepsg.model.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {

	@Query ("SELECT c FROM Clientes c WHERE c.nombre=?1")
	Optional<Clientes> findByNombre(String nombre);
	
	@Query ("SELECT c FROM Clientes c WHERE c.nombreusuario=?1")
	Optional<Clientes> findByNombreUsuario(String nombreusuario);
	
}
