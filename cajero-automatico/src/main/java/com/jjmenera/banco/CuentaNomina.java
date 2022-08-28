package com.jjmenera.banco;

public class CuentaNomina extends CuentaBancaria {
	
	public CuentaNomina(String titular, TipoDeCuenta tipo, double saldo) {
		super(titular, tipo, saldo);
	}

	//sobrecarga de constructores
	public CuentaNomina(String titular, double saldo) {
		super(titular, saldo);
	}

	public CuentaNomina() {
		super();
	}
	
	@Override
	public void infoTermsCondiciones() {
		// Solo imprime frases legales
		System.out.println("Términos y condiciones del servicio.");
		System.out.println("Según el acuerdo firmado por usted...");
		System.out.println("No existen comisiones al tener su nómina con nosotros.");
		
	}
}
