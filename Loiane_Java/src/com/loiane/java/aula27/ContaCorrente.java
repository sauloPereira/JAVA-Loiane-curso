package com.loiane.java.aula27;

import java.util.Scanner;

public class ContaCorrente {
	Scanner input = new Scanner(System.in);
	
	String num;
	String agencia;
	boolean especial;
	double saldo;
	double limite;
	double saldoAtual;
	
	boolean fazerSaque(){
		System.out.print("Informe o valor do saque: ");
		double valor = input.nextDouble();
		if (limite <= valor){
			saldoAtual = (limite - valor);
			System.out.println("\nSaque realizaddo com sucesso." + saldoAtual);
		}
		else {
			System.out.println("Valor indisponivel");
		} 
		return true;
	}
	
	double fazerDeposito(){
		System.out.print("Valor do Deposito: ");
		double valorDep = input.nextDouble();
		System.out.println("\nDeposito realizao com sucesso." + valorDep);
		
		return limite + valorDep;
	}
	
	void fazerConsulta(){
		System.out.println("Consultar Saldo?");
		String consult = input.next();
		System.out.println("Seu saldo atual: R$" + limite);
		
	}
	
	
	
}
