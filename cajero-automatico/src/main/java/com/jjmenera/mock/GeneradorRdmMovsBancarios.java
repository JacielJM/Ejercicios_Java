package com.jjmenera.mock;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorRdmMovsBancarios {
	private static final String TRANSFERENCIA = "Transferencia de ";
	private static final String INGRESO = "Ingreso de ";
	private static final String RETIRO = "Retiro de ";
	private static final String PAGO_TARJETA = "Pago con tarjeta de ";
	private static final String NOMINA = "Ingreso nómina de ";
	private static final String PAGO_RECIBO = "Pago de recibo de ";
	
	public ArrayList<String> obtenerMovimientos(int numDeMovimientos, String moneda) {
		ArrayList<String> movimientos = new ArrayList<String>();
		for (int i = 0; i<numDeMovimientos; i++) {
			int numDeMovimiento = generarRdmInt(1, 6);
			String tipoDeMovimiento;
			switch (numDeMovimiento) {
			case 1:
				tipoDeMovimiento = TRANSFERENCIA;
				break;
			case 2:
				tipoDeMovimiento = INGRESO;
				break;
			case 3:
				tipoDeMovimiento = RETIRO;
				break;
			case 4:
				tipoDeMovimiento = PAGO_TARJETA;
				break;
			case 5:
				tipoDeMovimiento = NOMINA;
				break;
			default:
				tipoDeMovimiento = PAGO_RECIBO;
			}
			double cantidadRdm = generarRdmDouble(1.0, 3000.0);
			String movimientoAleatorio = tipoDeMovimiento + String.format("%.2f", cantidadRdm) + " " + moneda;
			movimientos.add(movimientoAleatorio);
		}
		return movimientos;
	}
	
	private int generarRdmInt(int minimo, int maximo) {
		return ThreadLocalRandom.current().nextInt(minimo, maximo+1);
	}
	
	private double generarRdmDouble(double minimo, double maximo) {
		return ThreadLocalRandom.current().nextDouble(minimo, maximo+1);
	}
}
