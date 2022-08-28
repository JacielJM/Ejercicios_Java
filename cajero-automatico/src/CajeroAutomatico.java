import java.util.ArrayList;
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
		sc.close();
	}
	
	void sacarDinero() {
		System.out.println("¿Cuanto dinero quiere sacar?");
		Scanner sc = new Scanner(System.in);
		double cantidad = sc.nextDouble();
		cActual.sacarDinero(cantidad);
		sc.close();
	}
	
	void consultarMovimientos() {
		GeneradorRdmMovsBancarios movimientos = new GeneradorRdmMovsBancarios();
		System.out.println("¿Cuantos movimientos desea consultar?");
		Scanner sc = new Scanner(System.in);
		int numMovs = sc.nextInt();
		ArrayList<String> ultimosMovimientos = movimientos.obtenerMovimientos(numMovs, "MXN");
		mostrarMovimientos(ultimosMovimientos);
		sc.close();
	}
	
	void mostrarMovimientos(ArrayList<String> movs) {
		for(String movimiento:movs) {
			System.out.println(movimiento);
		}
	}
	void salir() {
		System.out.println("Muchas gracias por utilizar nuestros servicios");
	}
}
