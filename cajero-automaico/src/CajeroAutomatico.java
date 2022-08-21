import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
	CuentaBancaria cActual;
	
	CajeroAutomatico(String identificador, String contraseña) {
		double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
		
		cActual = new CuentaBancaria("Jaciel Menera", cantidadAleatoria);
	}
	
	void mostrarSaldo() {
		System.out.println("Su saldo es " + cActual.obtenerSaldo());
	}
	
	void ingresarDinero() {
		System.out.println("¿Cuanto dinero quiere ingresar?");
		Scanner sc = new Scanner(System.in);
		double cantidad = sc.nextDouble();
		cActual.ingresarDinero(cantidad);
	}
	
	void sacarDinero() {
		System.out.println("¿Cuanto dinero quiere sacar?");
		Scanner sc = new Scanner(System.in);
		double cantidad = sc.nextDouble();
		cActual.sacarDinero(cantidad);
	}
	
	void consultarMovimientos() {
		//
	}
	
	void salir() {
		System.out.println("Muchas gracias por utilizar nuestros servicios");
	}
}
