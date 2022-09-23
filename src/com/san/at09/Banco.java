package com.san.at09;

public class Banco {

	private Conta[] contas;
	private int prox;
	
	public Banco(int tan) {
		
		//error
		clientes = new Cliente();
	}
	
	public void add(Conta c) {
		
		//error
		clientes[prox] = c;
	}
	
	public void depositar(String numero, double valor) {
		for (int i = 0; i < prox; i++) {
			if(contas[i].getNumero().equals(numero)) {
				contas[i].depositar(valor);
			}
		}
	}
	
	public void renderJuros(double taxa) {
		for (int i = 0; i < contas.length; i++) {
			if(contas[i] instanceof Poupanca) {
				contas[i].depositar(taxa);
			}
		}
	}
}
