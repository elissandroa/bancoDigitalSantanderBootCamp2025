package edu.elissandro.banco;

import java.util.Objects;

public abstract class Conta implements IConta {

	private Integer numero;
	private double saldo;
	private Integer agencia;
	private final Integer AGENCIA_PADRAO = 1;
	
	public Conta(Integer numero, Integer agencia) {
		this.numero = numero++;
		this.agencia = AGENCIA_PADRAO;
		this.saldo = 0.0;
	}

	public Integer getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getAGENCIA_PADRAO() {
		return AGENCIA_PADRAO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numero, other.numero);
	}

	@Override
	public void sacar(double valor) {
		if(valor <= getSaldo()) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
		
	}

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor de depósito inválido.");
		}
		
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if(valor <= getSaldo()) {
			sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente para transferência.");
		}
		
		System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta " + ((Conta) contaDestino).getNumero() + ".");
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta ===");
		System.out.println("Número da Conta: " + getNumero());
		System.out.println("Agência: " + getAgencia());
		System.out.println("Saldo Atual: R$" + getSaldo());
		System.out.println("=========================");
		
	}

	
	
	
}
