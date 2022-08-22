import java.util.Scanner;
import java.util.Random;

public class Adivinador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random numero = new Random();

		System.out.println("Adivina el número que estoy pensando:");
		int random = numero.nextInt(10) + 1;
		int userGuess = sc.nextInt();
		int contador = 1;

		// System.out.println("El número random es: "+random);

		while (userGuess != random) {
			if (userGuess > random) {
				System.out.println("El número ingresado es mayor a la respuesta");
			} else {
				System.out.println("El número ingresado es menor a la respuesta");
			}
			System.out.println("Intente nuevamente:");
			userGuess = sc.nextInt();
			contador++;
		}
		System.out.println("Correcto! El número era: " + random);
		System.out.println("Le tomó " + contador + " intentos");
		sc.close();
	}
}
