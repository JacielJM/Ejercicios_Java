import java.util.HashMap;

import com.generation.sistemaescolar.Alumno;

public class TestAlumno {

	public static void main(String[] args) {
		
		HashMap<String, Double> notasJaciel = new HashMap<String, Double>();
		notasJaciel.put("Español", 9.5);
		notasJaciel.put("Inglés", 8.5);
		notasJaciel.put("Matemáticas", 8.0);
		notasJaciel.put("Programación", 10.0);
		notasJaciel.put("Historia", 6.5);
		
		Alumno Jaciel = new Alumno("Jaciel", notasJaciel); 
		
		Jaciel.calcularPromedio();
		Jaciel.materiaMasAlta();
		Jaciel.materiaMasBaja();
		
		System.out.println("-----------------------------------------------");
		
		HashMap<String, Double> notasMariana = new HashMap<String, Double>();
		notasMariana.put("Español", 10.0);
		notasMariana.put("Inglés", 7.5);
		notasMariana.put("Matemáticas", 9.0);
		notasMariana.put("Programación", 9.0);
		notasMariana.put("Historia", 8.5);
		
		Alumno Mariana = new Alumno("Mariana", notasMariana); 
		
		Mariana.calcularPromedio();
		Mariana.materiaMasAlta();
		Mariana.materiaMasBaja();
		
		System.out.println("-----------------------------------------------");
		
		Alumno Paulina = new Alumno("Paulina", "Meza", "Padilla", 15);
		Paulina.verAlumno();
		
		System.out.println("-----------------------------------------------");
		
		Alumno Adal = new Alumno("Adal", "Obregón", "F");
		Adal.verAlumno();
		Adal.asignarGrupo(15);
		Adal.verAlumno();
	}

}
