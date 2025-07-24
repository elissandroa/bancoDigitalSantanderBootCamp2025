package edu.elissandro.banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {

	private String nome;
	
	Set<Cliente> clientes = new HashSet<>();
	Conta conta;
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	
	public void listarClientes() {
		if (clientes.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado no banco " + nome + ".");
		} else {
			System.out.println("Clientes do banco " + nome + ":");
			for (Cliente cliente : clientes) {
				System.out.println("- " + cliente);
			}
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public Set<Cliente> getClientes() {
		return clientes;
	}
	
	public void adicionarCliente(String cliente) {
		if (clientes.add(new Cliente(cliente))) {
			System.out.println("Cliente " + cliente + " adicionado com sucesso ao banco " + nome + ".");
		} else {
			System.out.println("Cliente " + cliente + " já existe no banco " + nome + ".");
		}
	}
}
