package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num;
		int soma = 0;
		double media;
		
		for (int i = 0; i < 5; i++){
			System.out.print ("Digite um nuúmero: ");
			num = input.nextInt();
			
			soma += num;	
		}
		
		media = soma / 5;
		
		System.out.println ("Soma dos números é igual: " + soma);
		System.out.println ("A média: : " + media);
		
	}

}
