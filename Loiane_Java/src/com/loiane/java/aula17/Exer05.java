package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		boolean valido = false;
		double popA, taxaA;
		double popB, taxaB;
		int cont = 0;
		
		do {
			System.out.print ("Informe Popula��o A: ");
			popA = input.nextDouble();
			
			if (popA > 0){
				valido = true;
			}
			else {
				System.out.println ("Inv�lido!");
			}
		}
		while (!valido);
			
		valido = false;
		
		do{
			System.out.print ("Informe a taxa %  da Popula��o A: ");
			taxaA = input.nextDouble();
			
			if (taxaA > 0){
				valido = true;
			}
			else {
				System.out.println ("Inv�lido!");
			}
		}
		while (!valido);
		
		valido = false;
		
		do {
			System.out.print ("Informe Popula��o B: ");
			popB = input.nextDouble();
			
			if (popB > 0){
				valido = true;
			}
			else {
				System.out.println ("Inv�lido!");
			}
		}
		while (!valido);
		
		valido = false;
		
		do{
			System.out.print ("Informe a taxa % da Popula��o B: ");
			taxaB = input.nextDouble();
			
			if (taxaB > 0){
				valido = true;
			}
			else {
				System.out.println ("Inv�lido!");
			}
		}
		while (!valido);
		
			
		while (popA < popB){
			
			popA += (popA * taxaA) / 100;
			popB += (popB * taxaB) / 100;
			cont++;
		}

				
		System.out.println ("Popula��o A: " + popA + " com taxa de " 
							+ taxaA + " %  ");
		System.out.println ("Popula��o B: " + popB + " com taxa de " 
							+ taxaB + " %  ");
		System.out.println ("Qtd de Anos: " + cont);

	}
	
}
