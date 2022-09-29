package com.ecommerce.ferrepsg.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.ferrepsg.model.Newsletter;

public interface NewsletterRepository extends JpaRepository<Newsletter, Long>{

	@Query("SELECT n FROM Newsletter n WHERE n.correo=?1")
	Optional<Newsletter> findByCorreo (String correo);
	
}
