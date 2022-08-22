import java.util.Scanner;

public class Buclecitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		while (suma <= 10) {
			System.out.println(suma++);
		}

//		DO WHILE

		int suma1 = 0;
		boolean disparador = true;

		do {
			System.out.println(++suma1);
			disparador = false;
		} while (disparador == true);
		
//		Algoritmo de un do while para hacer la suma de los primeros 10 numeros naturales
//		Sumar 1 + 1 = 2, 2 + 2 = 4, 4 + 3 = 7, 7 + 4 = 11 ... n + 10;
		System.out.println("INICIO DO WHILE");
		int contador = 0;
		int resultado = 0;
		
		do {
			resultado = resultado + contador;
			contador++;
		} while (contador <= 10);
		System.out.println("La suma es igual a " + resultado);
		//
		
		
		
		
		
		
		
		
		
		
		Scanner factor = new Scanner(System.in);
		System.out.println("Ingrese el número:");
		int numero = factor.nextInt();
		int res =1;
		
		for(int i=numero; i>0; i--) {
			res *= i;
		}
		System.out.println("El factorial de "+numero+ " es "+res);
		
		for(int i = 1; i <=25; i++) {
			if(i % 15 == 0) {
				System.out.println("Fizz Buzz " + i);
			}
			if(i % 3 == 0) {
				System.out.println("Fizz " + i);
			}
			if(i % 2 == 0) {
				System.out.println("Buzz " + i);
			}
		}
		
		int numeroFactorizar = 5;
		int factorial = 1;
		
		do {
			factorial *= numeroFactorizar;
			numeroFactorizar--;
			System.out.println(factorial);
		} while (numeroFactorizar > 1);
		
//		Variables globales
		int cont = 1;
		int a = 0;
		int c = 0;
		int b = 1;
		
		while(cont <= 13) {
			a = b;
			b = c;
			c = a + b;
			cont++;
			System.out.println(c);
		}


	}

}
