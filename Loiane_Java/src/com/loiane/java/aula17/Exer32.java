package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod, qnt;
		double total = 0;
		String output = "";
		
		do {
			System.out.println("Digite o código e a quantidade. Digite 0 0 para sair");
			cod = input.nextInt();
			qnt = input.nextInt();
			
			if (cod == 0 && qnt == 0){
				naoTerminar = false;
				output += "Total a pagar: R$ " + total;
			}
			else {
				if (cod == 100){
					output += "Cachorro Quente -> R$ 1,20 * " + qnt;
					output += " = " + (1.2 * qnt) + "\n";
					total += (1.2 * qnt);
				}
				else if (cod == 101){
					output += "Bauru Simples -> R$ 1,30 * " + qnt;
					output += " = " + (1.3 * qnt) + "\n";
					total += (1.3 * qnt);
				}
				else if (cod == 102){
					output += "Bauru com ovo -> R$ 1,50 * " + qnt;
					output += " = " + (1.5 * qnt) + "\n";
					total += (1.5 * qnt);
				}
				else if (cod == 103){
					output += "Hamburguer -> R$ 1,20 * " + qnt;
					output += " = " + (1.2 * qnt) + "\n";
					total += (1.2 * qnt);
				}
				else if (cod == 104){
					output += "Cheeseburguer -> R$ 1,30 * " + qnt;
					output += " = " + (1.3 * qnt) + "\n";
					total += (1.3 * qnt);
				}
				else if (cod == 105){
					output += "Refrigerante -> R$ 1,00 * " + qnt;
					output += " = " + (1 * qnt) + "\n";
					total += (1 * qnt);
				}
			}
			
		}
		while (naoTerminar);
		
		System.out.println(output);
	}

}
