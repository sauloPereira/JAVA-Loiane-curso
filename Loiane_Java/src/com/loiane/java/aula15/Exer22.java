package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double quantidade = 0;
		double precoMorango = 0;
		double precoMaca = 0;
		double totalAPagar = 0;
		double total = 0;
		double desconto = 0;
		
		System.out.print ("Escolha Morango ou Maçã: ");
		String frutas = input.next(); 
		
		System.out.print ("Quantidade de Kilos: ");
		quantidade = input.nextDouble();
				
		if (frutas.equalsIgnoreCase ("morango")){
			if (quantidade <= 5) {
				precoMorango = 2.50;
			}
			else if ((quantidade > 5) || (quantidade < 8)){
				precoMorango = 2.20;
			}
			
			total = precoMorango * quantidade;
			System.out.println ("Valor total: R$ " + total);
			
			if (quantidade >=8){
				desconto = (total * 10) / 100;
				System.out.println ("Valor do desconto: R$ " + desconto);	
			}
			
			totalAPagar = total - desconto;
			System.out.println ("Total a pagar: R$ " + totalAPagar);
			
		}
		
		else if (frutas.equalsIgnoreCase ("maca")){
			if (quantidade <= 5) {
				precoMaca = 1.80;
			}
			else if ((quantidade > 5) || (quantidade < 8)){
				precoMaca = 1.50;
			}
			else if (quantidade >= 8){
				precoMaca = (1.5 * 10) / 100;
			}
			
			total = precoMaca * quantidade;
			System.out.println ("Valor total: R$ " + total);
			
			if (quantidade >=8){
				desconto = (total * 10) / 100;
				System.out.println ("Valor do desconto: R$ " + desconto);	
			}
			
			totalAPagar = total - desconto;
			System.out.println ("Total a pagar: R$ " + totalAPagar);
			
		}
	

	}

}
