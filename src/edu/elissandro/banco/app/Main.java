package edu.elissandro.banco.app;

import edu.elissandro.banco.Banco;
import edu.elissandro.banco.Cliente;
import edu.elissandro.banco.ContaCorrente;
import edu.elissandro.banco.ContaPoupanca;

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
		ContaCorrente conta1 = new ContaCorrente(12345, 678);
        ContaCorrente conta2 = new ContaCorrente(54321, 876);
        ContaPoupanca conta3 = new ContaPoupanca(11111, 222);
        ContaPoupanca conta4 = new ContaPoupanca(22222, 333);
       	cliente1.adicionarConta(conta1);
        cliente1.adicionarConta(conta3);
        cliente2.adicionarConta(conta2);
        cliente2.adicionarConta(conta4);
		cliente1.listarContas();
		cliente2.listarContas();
		conta1.depositar(1000.0);
		conta1.sacar(200.0);
		conta1.transferir(300.0, conta2);
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
		conta3.depositar(500.0);
		conta3.sacar(100.0);
		conta3.transferir(200.0, conta4);
		conta3.imprimirExtrato();
		conta4.imprimirExtrato();
		conta1.transferir(100.0, conta4);
		conta4.imprimirExtrato();
		System.out.println("Operações concluídas com sucesso!");
		
		
		

		
		
		
		
	


		

	}

}
