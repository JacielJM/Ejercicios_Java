package com.jjmenera.banco;

public abstract class CuentaBancaria {
	private String titular;
	private TipoDeCuenta tipoDeCuenta;
	protected double saldo;

	private final double COMISION = 1.2;

	public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo) {
		this.titular = titular;
		this.tipoDeCuenta = tipo;
		this.saldo = saldo;
	}

	//sobrecarga de constructores
	public CuentaBancaria(String titular, double saldo) {
		this(titular, TipoDeCuenta.AHORRO, saldo);
	}

	public CuentaBancaria() {
		this("", TipoDeCuenta.AHORRO, 0); //no recibe args y define uno por default
	}
	
	public double obtenerSaldo() {
		return saldo;
	}
	
	public void sacarDinero(double cantidad) {
		// código a ejecutar
		if(cantidad < 0) return;
		saldo -= cantidad;
	}

	public void ingresarDinero(double cantidad) {
		// código a ejecutar
		if(cantidad < 0) return;
		saldo += cantidad;
	}
	
	public abstract void infoTermsCondiciones();
}
