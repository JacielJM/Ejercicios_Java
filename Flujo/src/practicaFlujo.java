import java.util.Scanner;
public class practicaFlujo {

	public static void main(String[] args) {
		// Determina si el usuario es mayor de usuario
		int edad;
		Scanner sc;
		
		System.out.println("Por favor ingrese su edad:");
		sc = new Scanner(System.in);
		edad = sc.nextInt();
		
		if(edad>0) {
			if(edad>=18) {
				System.out.println("Bienvenido al mundo del SAT");
			} else {
				System.out.println("Disfruta mientras puedas");
			}
		} else {
			System.out.println("Ingrese una edad válida");
		}
		
//		Misma verificacion, con else if
		
		if(edad <= 0) {
			System.out.println("Ingrese un numero valido");
		} else if (edad < 18) {
			System.out.println("Chiquitin");
		} else {
			System.out.println("Ahi viene el SAT. Pasa al afore.");
		}

		
		//Verificar a que estacion le pertenece un año en particular
		int opcion;
		System.out.println("Elija su estación favorita:");
		Scanner op = new Scanner(System.in);
		opcion = op.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Es primavera!");
			break;
		case 2:
			System.out.println("Es verano!");
			break;
		case 3:
			System.out.println("Es otoño!");
			break;
		case 4:
			System.out.println("Es invierno!");
			break;
		default:
			System.out.println("Ingrese un número ENTERO entre 1 y 4");
		}
		int rand = (int) (Math.random()*10);
		System.out.println("Random: " + rand);
		sc.close();
		op.close();
		
	} //cierre main

} // cierre class
