package com.loiane.java.aula33;


public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNum("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setSaldo(1000.00);
		conta.setLimiteEspecial(500.00);
		
		System.out.println("Saldo da conta Nº " + conta.getNum() + " = " + conta.getSaldo());
		
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
