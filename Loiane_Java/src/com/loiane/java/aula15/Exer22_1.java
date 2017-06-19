package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer22_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double qtdMorango, qtdMaca;
		
		System.out.print ("Informe a quantidade em (Kg) de Morango: ");
		qtdMorango = input.nextDouble();
		
		System.out.print ("Informe a quantidade em (Kg) de Maçã: ");
		qtdMaca = input.nextDouble();
		
		double precoMorango = 0;
		if (qtdMorango <= 5){
			precoMorango = 2.5;
		}
		else {
			precoMorango = 2.2;
		}
		
		double precoMaca = 0;
		if (qtdMaca <= 5){
			precoMaca = 1.8;
		}
		else {
			precoMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoMorango;
		System.out.println ("Preço morangos: R$ " + precoTotalMorango);
		double precoTotalMaca = qtdMaca * precoMaca;
		System.out.println ("Preço maçãs: R$ " + precoTotalMaca);
		
		double precoParcial = precoMorango + precoMaca;
		System.out.println ("Preço parcial: R$ " + precoParcial);
		double precoTotal = precoParcial;
		
		if ((qtdMaca + qtdMorango > 8) || precoParcial > 25){
			precoTotal = precoParcial - ((precoParcial * 10) / 100);
			
		}
		
		System.out.println ("Preço total: R$ " + precoTotal);

	}

}
