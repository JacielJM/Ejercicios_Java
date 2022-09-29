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

import com.ecommerce.ferrepsg.service.NewsletterService;
import com.ecommerce.ferrepsg.model.Newsletter;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
		RequestMethod.PUT })
@RestController
@RequestMapping(path = "/api/newsletter/")
public class NewsletterController {

	// Constante de servicio
	public final NewsletterService newsServ;

	@Autowired // Inyeccion de dependecias
	public NewsletterController(NewsletterService newsServ) {
		this.newsServ = newsServ;
	}

	// Metodo GET
	@GetMapping
	public List<Newsletter> getNewsletters() {
		return newsServ.getNewsletters();
	}

	// Metodo GET por id de producto
	@GetMapping(path = "{idnewsletter}")
	public Newsletter getNewsletter(@PathVariable("idnewsletter") Long idnewsletter) {
		return newsServ.getNewsletter(idnewsletter);
	}

	// Metodo DELETE por id de producto
	@DeleteMapping(path = "{idnewsletter}")
	public void deleteNewsletter(@PathVariable("idnewsletter") Long idnewsletter) {
		newsServ.deleteNewsletter(idnewsletter);
	}

	// Metodo POST
	@PostMapping
	public void addNewsletter(@RequestBody Newsletter news) {
		newsServ.addNewsletter(news);
	}

	// Metodo PUT
	@PutMapping(path = "{idnewsletter}")
	public void updateNewsletter(@PathVariable("idnewsletter") Long idnewsletter,
			@RequestParam(required = false) String correo) {
		newsServ.updateNewsletter(idnewsletter, correo);
	}
}
