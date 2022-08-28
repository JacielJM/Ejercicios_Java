package com.jjmenera.cajero;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.jjmenera.banco.CuentaAhorro;
import com.jjmenera.banco.CuentaBancaria;
import com.jjmenera.mock.GeneradorRdmMovsBancarios;

public class CajeroAutomatico {
	private CuentaBancaria cActual;
	
	protected CajeroAutomatico(String identificador, String contraseña) {
		double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
		
		cActual = new CuentaAhorro("Jaciel Menera", cantidadAleatoria);
	}
	
	protected void mostrarSaldo() {
		System.out.println("Su saldo es " + cActual.obtenerSaldo());
	}
	
	protected void ingresarDinero() {
		System.out.println("¿Cuanto dinero quiere ingresar?");
		Scanner sc = new Scanner(System.in);
		double cantidad = sc.nextDouble();
		cActual.ingresarDinero(cantidad);
	}
	
	protected void sacarDinero() {
		System.out.println("¿Cuanto dinero quiere sacar?");
		Scanner sc = new Scanner(System.in);
		double cantidad = sc.nextDouble();
		cActual.sacarDinero(cantidad);
	}
	
	protected void consultarMovimientos() {
		GeneradorRdmMovsBancarios movimientos = new GeneradorRdmMovsBancarios();
		System.out.println("¿Cuantos movimientos desea consultar?");
		Scanner sc = new Scanner(System.in);
		int numMovs = sc.nextInt();
		ArrayList<String> ultimosMovimientos = movimientos.obtenerMovimientos(numMovs, "MXN");
		mostrarMovimientos(ultimosMovimientos);
	}
	
	private void mostrarMovimientos(ArrayList<String> movs) {
		for(String movimiento:movs) {
			System.out.println(movimiento);
		}
	}
	
	protected void mostrarTermsCondiciones() {
		cActual.infoTermsCondiciones();
	}
	
	protected void salir() {
		System.out.println("Muchas gracias por utilizar nuestros servicios");
	}
}
