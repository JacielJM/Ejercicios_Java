import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		System.out.println("Bienvenido al conversor de moneda");
		System.out.println("Ingrese EUR para conocer su equivalencia en USD");
		
		Scanner sc = new Scanner(System.in);
		double euros = sc.nextDouble();
		
		String euroStr = Double.toString(euros);
		BigDecimal euroBD = new BigDecimal(euroStr);
		
		double tasaCambio = 1.19;
		
		String tCambioStr = Double.toString(tasaCambio);
		BigDecimal tCambioBD = new BigDecimal(tCambioStr);
		
		BigDecimal dolaresBD = euroBD.multiply(tCambioBD);
		
		System.out.println(euros + " euros equivalen a " + dolaresBD + " USD");

	} // cierre de main

} //cierre de clase
