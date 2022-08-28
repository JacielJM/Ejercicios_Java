package com.jjmenera.cajero;
import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		
		System.out.println("Por favor ingrese su número de identificación");
		Scanner ns = new Scanner(System.in);
		String id = ns.nextLine();
		System.out.println("Por favor ingrese su contraseña");
		String pass = ns.nextLine();
		CajeroAutomatico cajero = new CajeroAutomatico(id, pass);
		
		int seleccion;
		do {
			System.out.println("Elija una de las siguientes opciones:");
			System.out.println("	1 para consutar su saldo");
			System.out.println("	2 para ingresar dinero");
			System.out.println("	3 para retirar dinero");
			System.out.println("	4 para consultar sus movimientos");
			System.out.println("Para salir escriba cualquier otro número");
			
			seleccion = ns.nextInt();
			
			switch (seleccion) {
			case 1:
				cajero.mostrarSaldo();
				break;
			case 2:
				cajero.ingresarDinero();
				break;
			case 3:
				cajero.sacarDinero();
				break;
			case 4:
				cajero.consultarMovimientos();
				break;
			default:
				cajero.salir();
			}
		} while (seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4);
		ns.close();
	} // cierre de main

} // cierre de clase
