package com.jjmenera.banco;

public class CuentaAhorro extends CuentaBancaria{
	
	private final double COMISION = 0.12;
	
	public CuentaAhorro(String titular, TipoDeCuenta tipo, double saldo) {
		super(titular, tipo, saldo);
	}

	//sobrecarga de constructores
	public CuentaAhorro(String titular, double saldo) {
		super(titular, saldo);
	}

	public CuentaAhorro() {
		super();
	}
	
	@Override 
	public void sacarDinero(double cantidad) {
		if(cantidad < 0) return;
		saldo -= cantidad;
		saldo -= COMISION;
	};
	
	@Override
	public void infoTermsCondiciones() {
		// Solo imprime frases legales
		System.out.println("Términos y condiciones del servicio");
		System.out.println("Según el acuerdo firmado por usted...");
		System.out.println("La comisión por cada retiro de dinero será de " +  COMISION + " porcentual.");
		
	}

}
