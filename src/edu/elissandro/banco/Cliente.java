package edu.elissandro.banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

	private Long id;
	private String nome;
	
	Set<Conta> contas = new HashSet<>();
	
	public Cliente(String nome) {
		this.id = System.currentTimeMillis();
		this.nome = nome;
	}
	
	public void listarContas() {
		if (contas.isEmpty()) {
			System.out.println("Nenhuma conta cadastrada para o cliente " + nome + ".");
		} else {
			System.out.println("Contas do cliente " + nome + ":");
			for (Conta conta : contas) {
				System.out.println("- " + conta);
			}
		}
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Set<Conta> getConta() {
		return contas;
	}
	
	public void adicionarConta(Conta conta) {
		if (contas.add(conta)) {
			System.out.println("Conta " + conta.getNumero() + " adicionada com sucesso ao cliente " + nome + ".");
		} else {
			System.out.println("Conta " + conta.getNumero() + " já existe para o cliente " + nome + ".");
		}
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
