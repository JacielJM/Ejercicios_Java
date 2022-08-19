import java.util.Scanner;

public class EjerciciosBasicos {

	public static void main(String[] args) {
		// Práctica 1
		int num1 = 12, num2 = 24, num3 = 25, num4 = 92, num5 = 91;
		boolean resultado1, resultado2;
		
		System.out.println("Práctica 1:");
		resultado1 = (num1 < num2 || num2 < num3) && (!(num1 != num2) && num5 != num3);
		System.out.println("La comparación da: "+resultado1);
		
		// Práctica 2
		System.out.println("Práctica 2:");
		resultado2 = (num5 > num2 && num4 < num3) || (!(num1 == num2) || num3 != num3);
		System.out.println("La comparación da: "+resultado2);
		
		/*
		 * REPO EJERCICIOS PRÁCTICOS @alexanyernas
		 */
		
		/*
		 * 1. Escribir un programa que pregunte al usuario por el número de horas
trabajadas y el coste por hora. Después debe mostrar por la pantalla la
paga total que le corresponde al usuario.
		 */
		Scanner horas, coste;
		float horasTrabajadas, costeHora, pagaTotal;
		
		System.out.println("\nPROGRAMA DE PAGO AL USUARIO");
		System.out.println("Ingrese el número de horas laboradas:");
		horas = new Scanner(System.in);
		horasTrabajadas = horas.nextFloat();
		System.out.println("Ingrese el pago por hora:");
		coste = new Scanner(System.in);
		costeHora = coste.nextFloat();
		
		pagaTotal = horasTrabajadas*costeHora;
		System.out.println("El pago total es de: " + pagaTotal + " MN");
		
		horas.close();
		coste.close();
		
		/*
		 * 2. Escribir un programa que realice la siguiente operación aritmética:
		 *  ( 3 + 2 ) 
		 *  ---------
		 *    2 * 5
		 */
		System.out.println("\nOPERACIÓN MATEMÁTICA FRACCIONARIA");
		float operacion = (float) ((3.0+2.0)/(2.0*5.0));
		System.out.println("El resultado es: " + operacion);
		
		/*
		 * 3. Escribir un programa que realice la siguiente operación aritmética:
		 *  raíz cuadrada de [(3.9 + 5.5 * 2.1)^5]
		 */
		
		System.out.println("\nOPERACIÓN MATEMÁTICA RAIZ");
		double operacion2 = Math.sqrt(Math.pow((3.9+(5.5*2.1)),5));
		System.out.println("El resultado es: " + operacion2);
	} // main

} // class
