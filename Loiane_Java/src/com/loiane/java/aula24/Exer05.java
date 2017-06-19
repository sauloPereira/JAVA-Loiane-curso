package com.loiane.java.aula24;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numConta = 123456;
		conta.saldo = 1000.00;
		conta.status = new String[2];
		conta.status[0] = "Conta Especial";
		conta.status[1] = "Conta Comum";
		conta.limite = 500.00;
		
		conta.num = "123456";
		conta.agencia = "1234";
		conta.especial = true;

	}

}
