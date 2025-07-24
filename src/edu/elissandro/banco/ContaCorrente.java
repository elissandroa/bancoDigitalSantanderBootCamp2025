package edu.elissandro.banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Integer numero, Integer agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		imprimirInfosComuns();
	}

}
