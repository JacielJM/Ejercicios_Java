package com.ecommerce.ferrepsg.controller;

import java.util.Date;
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

import com.ecommerce.ferrepsg.service.ClienteService;
import com.ecommerce.ferrepsg.model.Clientes;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
		RequestMethod.PUT })
@RestController
@RequestMapping(path = "/api/clientes/")
public class ClienteController {

	public final ClienteService cliServ;
	
	@Autowired
	public ClienteController(ClienteService cliServ) {
		super();
		this.cliServ = cliServ;
	}
	
	@GetMapping
	public List<Clientes> getClientes(){
		return cliServ.getClientes();
	}
	
	@GetMapping(path = "{idClientes}")
	public Clientes getCliente(@PathVariable("idClientes") Long idClientes) {
		return cliServ.getCliente(idClientes);
	}
	
	@DeleteMapping(path = "{idClientes}")
	public void deleteCliente(@PathVariable("idClientes") Long idClientes) {
		cliServ.deleteCliente(idClientes);
	}
	
	@PostMapping
	public void addCliente(@RequestBody Clientes cli) {
		cliServ.addCliente(cli);
	}
	
	@PutMapping
	public void updateCliente(@PathVariable("{idClientes}") Long idClientes,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String apellido,
			@RequestParam(required = false) String nombreusuario,
			@RequestParam(required = false) String contraseña,
			@RequestParam(required = false) String correo,
			@RequestParam(required = false) Date create_time,
			@RequestParam(required = false) String telefono, 
			@RequestParam(required = false) Boolean newsletter) {
		cliServ.updateCliente(idClientes, nombre, apellido, nombreusuario, contraseña, correo, create_time, telefono, newsletter);
	}
	
}
