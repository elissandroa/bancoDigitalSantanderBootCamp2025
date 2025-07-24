package edu.elissandro.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Integer numero, Integer agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		imprimirInfosComuns();
	}

}
