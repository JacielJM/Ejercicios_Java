package com.ecommerce.ferrepsg.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "clientes")
public class Clientes {

	// Atributos
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idclientes", unique = true, nullable = false)
	private Long idClientes;
	private String nombre;
	private String apellido;
	private String nombreusuario;
	private String contraseña;
	private String correo;
	@Column(name = "create_time", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_time;
	private String telefono;
	private Boolean newsletter;
	
	// Constructor
	public Clientes(Long idClientes, String nombre, String apellido, String nombreusuario, String contraseña,
			String correo,Date create_time, String telefono, Boolean newsletter) {
		super();
		this.idClientes = idClientes;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreusuario = nombreusuario;
		this.contraseña = contraseña;
		this.correo = correo;
		this.create_time = create_time;
		this.telefono = telefono;
		this.newsletter = newsletter;
	}
	
	
	
	// Constructor vacio
	public Clientes() {
		// TODO Auto-generated constructor stub
	}

	// Getters y setters
	public Long getIdClientes() {
		return idClientes;
	}

	public void setIdClientes(Long idClientes) {
		this.idClientes = idClientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreUsuario() {
		return nombreusuario;
	}

	public void setNombreUsuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(Boolean newsletter) {
		this.newsletter = newsletter;
	}

	// toString()
	@Override
	public String toString() {
		return "Clientes [idClientes=" + idClientes + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", nombreusuario=" + nombreusuario + ", contraseña=" + contraseña + ", correo=" + correo
				+ ", create_time=" + create_time + ", telefono=" + telefono + ", newsletter=" + newsletter + "]";
	}
	
}
