import java.util.Scanner;
import java.util.Random;

public class Adivinador {
	
	static int randomizer() {
		Random numero = new Random();
		int random = numero.nextInt(10) + 1;
		return random;
	}
	
	static String resultado(int usuario, int objetivo) {
		String mensaje;
		if (usuario == 0) {
			mensaje = "Adivina el número que estoy pensando:";
		} else if (usuario > objetivo) {
			mensaje = "El número ingresado es mayor a la respuesta\nIntente nuevamente:";
		} else if (usuario == objetivo) {
			mensaje = "Correcto! El número era " + objetivo;
		} 
		else {
			mensaje = "El número ingresado es menor a la respuesta\nIntente nuevamente:";
		}
		return mensaje;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int userGuess = 0, contador = 0;
		int random = randomizer();
		
		while (userGuess != random) {
			System.out.println(resultado(userGuess, random));
			userGuess = sc.nextInt();
			contador++;
		}
		
		System.out.println(resultado(userGuess, random));
		System.out.println("Le tomó " + contador + " intentos");
		sc.close();
	}
}
