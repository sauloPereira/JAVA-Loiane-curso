package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double prod1, prod2, prod3;
		
		System.out.print ("Informe o 1º preço: R$ ");
		prod1 = input.nextDouble();
		
		System.out.print ("Informe o 2º preço: R$ ");
		prod2 = input.nextDouble();
		
		System.out.print ("Informe o 3º preço: R$ ");
		prod3 = input.nextDouble();
		
		if (prod1 <= prod2 && prod1 <= prod3){
			System.out.println ("Melhor opção: R$ " + prod1);
		}
		if (prod2 <= prod1 && prod2 <= prod3){
			System.out.println ("Melhor opção: R$ " + prod2);
		}
		if (prod3 <= prod1 && prod3 <= prod2){
			System.out.println ("Melhor opção: R$ " + prod3);
		}

	}

}
