package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer23_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Escolha uma das carnes "
				+ "(1) - File Duplo /(2) - Alcatra /(3) - Picanha): ");
		int carnes = input.nextInt();
		
		System.out.print("Quantidade em (Kg): ");
		double qtd = input.nextDouble();
		
		double precoKg = 0;
		
		if (carnes == 1){
			
			System.out.println (qtd + " Kg - File Duplo" );
			
			if (qtd <= 5){
				precoKg = 4.9;
				
			}
			else {
				precoKg = 5.8;
			}
		}
		
		else if (carnes == 2){
			
			System.out.println (qtd + " Kg - Alcatra" );
			
			if (qtd <= 5){
				precoKg = 5.9;
				
			}
			else {
				precoKg = 6.8;
			}
		}
		
		else if (carnes == 3){
			
			System.out.println (qtd + " Kg - Picanha" );
			
			if (qtd <= 5){
				precoKg = 6.9;
				
			}
			else {
				precoKg = 7.8;
			}
		}
		
		double total = qtd * precoKg;
		System.out.println (qtd + " Kg * " + precoKg + " = " + total);
		
		System.out.print ("Pagamento em Cartão? (0 - não) / (1 - sim): ");
		int cartao = input.nextInt();
		
		if (cartao == 1){
			double desconto = (total * 5) / 100;
			System.out.println ("Desconto (5%)      : R$ " + desconto);
			System.out.println ("Valor a pagar      : R$ "
									+ (total - desconto));
		}
		else {
			System.out.println ("Valor a pagar      : R$ " + total);
		}
		
	}

}
