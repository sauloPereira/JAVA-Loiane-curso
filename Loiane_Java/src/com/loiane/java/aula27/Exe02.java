package com.loiane.java.aula27;

public class Exe02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.num = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.saldo = 1000.00;
		conta.limite = 500.00;
		
		conta.fazerSaque();
		
	}

}
