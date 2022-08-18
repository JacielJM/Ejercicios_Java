import java.util.Scanner;

public class CalculoAreaTriangulo {

	public static void main(String[] args) {
		// El programa solicita al usuario que introduzca la altura y la base de un triángulo para calcular su área
		// Declaración de variables
		float base, altura, area;
		Scanner scBase, scAltura;
		
		System.out.println("Calculadora de Área de Triángulos\n");
		
		// Lectura y almacenamiento de la base
		System.out.println("Ingrese la base del triángulo:");
		scBase = new Scanner(System.in);
		base = scBase.nextFloat();
		
		// Lectura y almacenamiento de la altura
		System.out.println("Ingrese la altura del triángulo:");
		scAltura = new Scanner(System.in);
		altura = scAltura.nextFloat();
		
		// Cálculo e impresión del área
		area = (base * altura)/2;
		System.out.println("\nEl área del triángulo es:\n" + area + " unidades cuadradas");
		
		// Cierre del escáner
		scBase.close();
		scAltura.close();

	}

}
