package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite 1� nota: ");
		double nota1 = input.nextDouble();
		
		System.out.print ("Digite 2� nota: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media <= 9){
			System.out.println ("Sua media �: " + media + " Aprovado!!");
		}
		else if (media < 7){
			System.out.println ("Sua media �: " + media +  " Reprovado!!");
		}
		else if (media == 10){
			System.out.println ("Sua media �: " + media + " Aprovado com distin��o!!");
		}

	}

}
