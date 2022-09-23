package com.san.at09;

public class Conta {

	private String numero;
	private double saldo;
	
	public Conta() {

	}
	
	public Conta(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public String getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = getSaldo() + valor;
	}
	
}
