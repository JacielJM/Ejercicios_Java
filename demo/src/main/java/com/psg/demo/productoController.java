package com.psg.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; //Con esta anotacion, le digo a Spring que esta clase debe tomarse en cuenta como un controller y asi poder agregar los metodos http (get, put, delete, post)


@RestController
@RequestMapping(path= "/api/productos/")

public class productoController {
	//Método GET para mostrar el producto que voy a sacar
	@GetMapping
	
	// Instanciar nuestro producto
	//public producto getProductos() {
		//producto p = new producto("Sopa carbonara picante", "Sopa instantánea sabor a carbonara con queso picante", "sopacarbonara.jpg",40.0);
		//return p; // si no hay return no hay objeto mostrado en la vista
	//} //getProductos
	
	public List<producto> getProductos() {
		ArrayList<producto> lista = new ArrayList<producto>();
		
		lista.add(new producto("Sopa SamYang Carbonara Picante", "Sopa instantánea tipo noodle", "sopacarbonara.jpg", 40.0));
		
		lista.add(new producto("Agua mineral Peñafiel", "Agua mineral 600 ml PET", "mineralpenafiel.jpg", 12.0));
		
		lista.add(new producto("Schweepes original", "Refresco sabor ginger ale 600 ml PET", "schweepes.jpg", 15.0));
		
		return lista;
	}
	
} //productController
