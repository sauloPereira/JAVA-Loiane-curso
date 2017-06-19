package com.loiane.java.aula43labs;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste Conta Bancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("João Conta Simples");
		contaSimples.setNumConta("12345");
		//contaSimples.setSaldo();
		contaSimples.depositar(1000);
		
		realizarSaque(contaSimples, 100);
		
		realizarSaque(contaSimples, 1100);
		
		System.out.println(contaSimples);
		
		//====================================
		
		System.out.println("*** Teste Conta Poupança ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("João Conta Poupanca");
		contaPoupanca.setNumConta("123333");
		contaPoupanca.setDiaRendimento(2);
		//contaSimples.setSaldo();
		contaPoupanca.depositar(1000);
		
		realizarSaque(contaPoupanca, 100);
		
		realizarSaque(contaPoupanca, 1100);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)){
			System.out.println("Rendimento aplicado, novo saldo é: R$ " + contaPoupanca.getSaldo());
		}
		else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println(contaPoupanca);
		
		//===============================================
		
		System.out.println("*** Teste Conta Especial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("João Conta Especial");
		contaEspecial.setNumConta("12345");
		contaEspecial.setLimite(500);
		//contaSimples.setSaldo();
		contaEspecial.depositar(1000);
		
		realizarSaque(contaEspecial, 100);
		
		realizarSaque(contaEspecial, 1100);
		
		realizarSaque(contaEspecial, 400);
		
		System.out.println(contaEspecial);

	}
	
	
	
	//dentro da classe com metodo static, para outro metodo fora dele
	//tem que ser static
	private static void realizarSaque(ContaBancaria conta, double value) {
		if (conta.sacar(value)){
			System.out.println("Saque Efetuado com Sucesso!\nNovo saldo: R$"
					+ conta.getSaldo());
			
		}
		else {
			System.out.println("Saldo Insulficiente para o valor R$ " 
					+ value + "| Saldo: R$ " + conta.getSaldo());
		}
		
	}
}
