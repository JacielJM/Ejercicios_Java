package com.jjmenera.datosprivados;

public class Bigotes {
	public String nombre;
	public int edad;
	private String colorPelo;
	private int numeroBigotes;
	public boolean enfermedades;
	private String raza;
	public boolean vacunas;
	private String calle;
	private int numeroCasa;
	public String colonia;
	public String numeroTelefono;
	private int codigoPostal;
	public String signoZodiacal;
	private double peso;
	
	public Bigotes(String nombre, int edad, String colorPelo, int numeroBigotes, boolean enfermedades, String raza,
			boolean vacunas, String calle, int numeroCasa, String colonia, String numeroTelefono, int codigoPostal,
			String signoZodiacal, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.colorPelo = colorPelo;
		this.numeroBigotes = numeroBigotes;
		this.enfermedades = enfermedades;
		this.raza = raza;
		this.vacunas = vacunas;
		this.calle = calle;
		this.numeroCasa = numeroCasa;
		this.colonia = colonia;
		this.numeroTelefono = numeroTelefono;
		this.codigoPostal = codigoPostal;
		this.signoZodiacal = signoZodiacal;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Bigotes [nombre=" + nombre + ", edad=" + edad + ", colorPelo=" + colorPelo + ", numeroBigotes="
				+ numeroBigotes + ", enfermedades=" + enfermedades + ", raza=" + raza + ", vacunas=" + vacunas
				+ ", calle=" + calle + ", numeroCasa=" + numeroCasa + ", colonia=" + colonia + ", numeroTelefono="
				+ numeroTelefono + ", codigoPostal=" + codigoPostal + ", signoZodiacal=" + signoZodiacal + ", peso="
				+ peso + "]";
	}

	/*
	 * Los getters y los setters son metodos ya establecidos para poder sacar la informacion privada de mi objeto, almacenarla en un espacio de memoria "virtual", para con estos metodos poder consultar o modificar segun me convenga. La gran ventaja de usarlos es que si los borro, nunca se habra modificado el objeto original.
	 */

	//Getters y setters
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	
	
}
