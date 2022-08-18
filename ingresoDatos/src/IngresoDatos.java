import java.util.Scanner;

public class IngresoDatos {

	public static void main(String[] args) {
		/*Declaramos nuestro nuevo Scanner para ingresar datos, para esto usamos la palabra reservada Scanner sc, despues creamos un nuevo scanner con la palabra reservada new Scanner y dentro de los parentesis va la entrada de teclado
		 *  
		 */
		System.out.println("Hola, por favor ingrese su nombre");
		Scanner input = new Scanner(System.in);
		String miNombre = input.nextLine();
		System.out.println("Bienvenido "+miNombre);
		
		/*
		 * DATOS INTRODUCIDOS POR EL USUARIO
		 * 
		 * - boolean 
		 * 		boolean nextBoolean() //true, false
		 * - bytes
		 * 		byte nextByte() //30
		 * - double
		 * 		double nextDouble() //1.876500478912345
		 * - float
		 * 		float nextFloat() //3.1445678
		 * - int
		 * 		int nextInt() //100
		 * - String
		 * 		String nextString() //hola me gustan las gorditas de nata
		 * - long
		 * 		long nextLong() //4100405002034
		 * - short
		 * 		short nextShort() //182944505
		 * 
		 * -char
		 * 		char nextChar() // ?
		 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = input.nextLine();
		System.out.println("Edad: ");
		int edad = input.nextInt();
		System.out.println("Correo: ");
		String correo = sc.nextLine();
		System.out.println("Teléfono: ");
		long telefono = input.nextLong();
		System.out.println("Estudias?");
		boolean estudia = input.nextBoolean();
		System.out.println("Cuánto mides? ");
		float estatura = input.nextFloat();
		
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu edad es: " + edad);
		System.out.println("Tu correo es: " + correo);
		System.out.println("Tu teléfono es: " + telefono);
		System.out.println("Eres estudiante: " + estudia);
		System.out.println("Tu estatura es: " + estatura);
		
	} // main

} // class
