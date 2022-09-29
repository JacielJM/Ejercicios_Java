package com.ecommerce.ferrepsg.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ferrepsg.model.Clientes;

@Service
public class ClienteService {

	public final ClienteRepository cliRepo;

	@Autowired
	public ClienteService(ClienteRepository cliRepo) {
		super();
		this.cliRepo = cliRepo;
	}

	// Metodo para iniciar sesion
	public boolean login(String nombreusuario, String contraseña) {
		boolean respuesta = false;
		Optional<Clientes> cli = cliRepo.findByNombreUsuario(contraseña);
		if (cli.isPresent()) {
			if (cli.get().getContraseña().equals(contraseña)) {
				respuesta = true;
			} // if password
		} // if isPresent
		return respuesta;
	}

	public List<Clientes> getClientes() {
		return cliRepo.findAll();
	}

	public Clientes getCliente(Long idClientes) {
		return cliRepo.findById(idClientes).orElseThrow(() -> new IllegalStateException("El cliente ya no existe"));
	}

	public void deleteCliente(Long idClientes) {
		if (cliRepo.existsById(idClientes))
			cliRepo.deleteById(idClientes);
	}

	public void addCliente(Clientes cli) {

		Optional<Clientes> cliName = cliRepo.findByNombre(cli.getNombre());
		if (cliName.isPresent()) {
			throw new IllegalStateException("El clienta ya esta registrado");
		} else {
			cliRepo.save(cli);
		}

	}

	@SuppressWarnings("deprecation")
	public void updateCliente(Long idClientes, String nombre, String apellido, String nombreusuario, String contraseña,
			String correo, Date create_time, String telefono, Boolean newsletter) {
		if (cliRepo.existsById(idClientes)) {
			Clientes cliTemp = cliRepo.getById(idClientes);
			if (nombre != null)
				cliTemp.setNombre(nombre);
			if (apellido != null)
				cliTemp.setApellido(apellido);
			if (nombreusuario != null)
				cliTemp.setNombreUsuario(nombreusuario);
			if (contraseña != null)
				cliTemp.setContraseña(contraseña);
			;
			if (correo != null)
				cliTemp.setCorreo(correo);
			;
			if (telefono != null)
				cliTemp.setTelefono(telefono);
			;
			if (newsletter != null)
				cliTemp.setNewsletter(newsletter);
			;
			cliRepo.save(cliTemp);
		} else {
			System.out.println("No existe el id " + idClientes);
		}
	}

}
