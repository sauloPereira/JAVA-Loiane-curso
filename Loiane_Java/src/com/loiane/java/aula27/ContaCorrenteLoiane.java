package com.loiane.java.aula27;

public class ContaCorrenteLoiane {
	
	String num;
	String agencia;
	boolean especial;
	double saldo;
	double limiteEspecial;
	double saldoAtual;
	
	boolean fazerSaque(double qntSacar){
		//tem saldo
		if (saldo >= qntSacar){
			saldo -= qntSacar;
			return true;
		}
		else {
			if (especial){
				//Verificar cheque especial
				double limite = limiteEspecial + saldo;
				if (limite >= qntSacar){
					saldo -= qntSacar;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		
	}
	
	void depositar(double valorDepositado){
		saldo += valorDepositado;
		
	}
	
	void consultarSaldo(){
		System.out.println("Saldo Atual R$ " + saldo);
	}
	
	boolean VerificarChequeEspecial(){
		return saldo < 0;
	}
	
}
