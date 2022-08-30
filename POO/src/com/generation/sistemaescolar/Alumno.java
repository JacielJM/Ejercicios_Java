package com.generation.sistemaescolar;

import java.util.HashMap;

public class Alumno {
	String nombre;
	String primerApellido;
	String segundoApellido;
	int grupo;
	HashMap<String, Double> calificaciones = new HashMap<String, Double>();
	
	public Alumno(String nombre, String primerApellido, String segundoApellido, int grupo, HashMap<String, Double> calificaciones) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.grupo = grupo;
		this.calificaciones = calificaciones;
	}

	public Alumno(String nombre, String primerApellido, String segundoApellido, int grupo) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.grupo = grupo;
	}
	
	public Alumno(String nombre, String primerApellido, String segundoApellido) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}

	public Alumno(String nombre, HashMap<String, Double> calificaciones) {
		this.nombre = nombre;
		this.calificaciones = calificaciones;
	}


	public double calcularPromedio() {
		double suma = 0;
		double promedio;
		for (double nota:calificaciones.values()) {
			suma += nota;
		}
		promedio = suma / 5.0;
		System.out.println("El promedio de " + this.nombre + " es " + promedio);
		return promedio;
	}
	
	public String materiaMasBaja () {
		double menor = 11;
		String materia = "";
		for(String i: calificaciones.keySet()) {
			if(calificaciones.get(i)<menor) {
				menor = calificaciones.get(i);
				materia = i;
			}
		}
		System.out.println(this.nombre + " obtuvo " + menor + " en " + materia);
		return materia;
	}
	
	public String materiaMasAlta () {
		double mayor = -1;
		String materia = "";
		for(String i: calificaciones.keySet()) {
			if(calificaciones.get(i)>mayor) {
				mayor = calificaciones.get(i);
				materia = i;
			}
		}
		System.out.println(this.nombre + " obtuvo " + mayor + " en " + materia);
		return materia;
	}
	
	public void verAlumno() {
		String nombre = String.join(" ",this.nombre,this.primerApellido,this.segundoApellido);
		if(this.grupo > 0) {
		System.out.println(nombre + " pertenece al grupo " + this.grupo);
		} else {
		System.out.println(nombre + " aún no tiene un grupo asignado");
		}
	}
	
	public void asignarGrupo(int grupo) {
		this.grupo = grupo;
		System.out.println(nombre + " se ha asignó al grupo " + this.grupo);
	}
}
