package com.ecommerce.ferrepsg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ferrepsg.model.Newsletter;

@Service
public class NewsletterService {

	public final NewsletterRepository newsletterRepository;

	@Autowired
	public NewsletterService(NewsletterRepository newsletterRepository) {
		this.newsletterRepository = newsletterRepository;
	}

	public List<Newsletter> getNewsletters() {
		return newsletterRepository.findAll();
	}

	public Newsletter getNewsletter(Long idnewsletter) {
		return newsletterRepository.findById(idnewsletter).orElseThrow(
				() -> new IllegalStateException("El correo con el ID " + idnewsletter + "no esta registrado."));
	}

	public void deleteNewsletter(Long idnewsletter) {
		if (newsletterRepository.existsById(idnewsletter))
			newsletterRepository.deleteById(idnewsletter);
	}

	public void addNewsletter(Newsletter news) {
		Optional<Newsletter> newsByCorreo = newsletterRepository.findByCorreo(news.getCorreo());
		if (newsByCorreo.isPresent()) {
			throw new IllegalStateException("El correo: " + news.getCorreo() + " ya esta registrado.");
		} else {
			newsletterRepository.save(news);
		}
	}

	@SuppressWarnings("deprecation")
	public void updateNewsletter(Long idnewsletter, String correo) {
		if (newsletterRepository.existsById(idnewsletter)) {
			Newsletter newsTemp = newsletterRepository.getById(idnewsletter);
			if (correo != null)
				newsTemp.setCorreo(correo);
			newsletterRepository.save(newsTemp);
		} else {
			System.out.println("No existe el id " + idnewsletter);
		}
	}

}
