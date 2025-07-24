package edu.elissandro.banco.app;

import edu.elissandro.banco.Banco;
import edu.elissandro.banco.Cliente;
import edu.elissandro.banco.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao Banco Digital!");
		System.out.println("Este é um exemplo de aplicação bancária simples.");
		System.out.println("Você pode criar contas, realizar saques, depósitos e transferências.");
		
		Banco banco = new Banco("Banco Digital");
		Cliente cliente1 = new Cliente("Elissandro");
		Cliente cliente2 = new Cliente("Maria");
		banco.adicionarCliente(cliente1.getNome());
		banco.adicionarCliente(cliente2.getNome());
		banco.listarClientes();
		cliente1.adicionarConta(new ContaCorrente(12345, 678));
		cliente2.adicionarConta(new ContaCorrente(54321, 876));
		cliente1.listarContas();
		cliente2.listarContas();
		
		

		
		
		
		
	


		

	}

}
