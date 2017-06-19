package com.loiane.java.aula27;

public class Exer02L {

	public static void main(String[] args) {
		
		ContaCorrenteLoiane conta = new ContaCorrenteLoiane();
		conta.num = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.saldo = 1000.00;
		conta.limiteEspecial = 500.00;
		
		System.out.println("Saldo da conta Nº " + conta.num + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.fazerSaque(10);
		
		if (saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}
		else {
			System.out.println("Saque indisponivel");
		}
		
		System.out.println("Deposito de R$ 500");
		conta.depositar(500);
		conta.consultarSaldo();

		if (conta.VerificarChequeEspecial()){
			System.out.println("Esta usando Cheque Especial");
		}
		else {
			System.out.println("Não esta usando Cheque Especial");
		}
		
	}

}
