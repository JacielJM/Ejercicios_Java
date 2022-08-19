import java.util.Scanner;
import java.util.Random;

public class Adivinador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random numero = new Random();
		
		System.out.println("Ingrese su adivinanza:");
		int random = numero.nextInt(10)+1;
		int userGuess = sc.nextInt();
		
		//System.out.println("El número random es: "+random);
		
		while(userGuess!=random) {
			System.out.println("Intente nuevamente:");
			userGuess = sc.nextInt();
		}
		System.out.println("Correcto! El número era: "+random);
		sc.close();
	}
}
