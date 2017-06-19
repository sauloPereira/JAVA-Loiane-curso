package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double precoFile = 0;
		double precoAlcatra = 0;
		double precoPicanha = 0;
		double valor; 
		double desconto;
		double total;
		
		System.out.print ("Escolha uma das carnes "
				+ "(F) - File Duplo /(A) - Alcatra /(P) - Picanha): ");
		String carnes = input.next ();
		
		System.out.print ("Quantidade em (Kg): ");
		double quantidade = input.nextDouble();
		
		System.out.print ("Pagamento em Cartão? (0 - não) / (1 - sim): ");
		int cartao = input.nextInt();
		
		if (carnes.equalsIgnoreCase("f")){
			if (quantidade <= 5){
				precoFile = 4.9;
			}
			else {
				precoFile = 5.8;
			}
			
			valor = precoFile * quantidade;
			
			System.out.println ("Tipo de Carne      : File Duplo");
			System.out.println ("Quantidade (Kg)    : " + quantidade + " Kg");
			System.out.println ("Preço Total:       : R$ " + valor);
			
			if (cartao == 0){
				System.out.println ("Tipo de Pagamento  : Dinheiro ");
				System.out.println ("Valor a pagar      : R$ " + valor);
				
			}
			else if (cartao == 1){
				desconto = (valor * 5) / 100;
				total = valor - desconto;
				
				System.out.println ("Tipo de Pagamento  : Cartão ");
				System.out.println ("Desconto (5%)      : R$ " + desconto);
				System.out.println ("Valor a pagar      : R$ " + total);
				
			}
			
		}
		else if (carnes.equalsIgnoreCase("a")){
			if (quantidade <= 5){
				precoAlcatra = 5.9;
			}
			else {
				precoAlcatra = 6.8;
			}
			
			valor = precoAlcatra * quantidade;
			
			System.out.println ("Tipo de Carne      : Alcatra");
			System.out.println ("Quantidade (Kg)    : " + quantidade + " Kg");
			System.out.println ("Preço Total:       : R$ " + valor);
			
			if (cartao == 0){
				System.out.println ("Tipo de Pagamento  : Dinheiro ");
				System.out.println ("Valor a pagar      : R$ " + valor);
				
			}
			else if (cartao == 1){
				desconto = (valor * 5) / 100;
				total = valor - desconto;
				
				System.out.println ("Tipo de Pagamento  : Cartão ");
				System.out.println ("Desconto (5%)      : R$ " + desconto);
				System.out.println ("Valor a pagar      : R$ " + total);
				
			}
			
		}
		else if (carnes.equalsIgnoreCase("p")){
			if (quantidade <= 5){
				precoPicanha = 6.9;
			}
			else {
				precoPicanha = 7.8;
			}
			
			valor = precoPicanha * quantidade;
			
			System.out.println ("Tipo de Carne      : Picanha");
			System.out.println ("Quantidade (Kg)    : " + quantidade + " Kg");
			System.out.println ("Preço Total:       : R$ " + valor);
			
			if (cartao == 0){
				System.out.println ("Tipo de Pagamento  : Dinheiro ");
				System.out.println ("Valor a pagar      : R$ " + valor);
				
			}
			else if (cartao == 1){
				desconto = (valor * 5) / 100;
				total = valor - desconto;
				
				System.out.println ("Tipo de Pagamento  : Cartão ");
				System.out.println ("Desconto (5%)      : R$ " + desconto);
				System.out.println ("Valor a pagar      : R$ " + total);
				
			}
			
		}
		
		else {
			System.out.print ("Inválido");
		}


	}

}
