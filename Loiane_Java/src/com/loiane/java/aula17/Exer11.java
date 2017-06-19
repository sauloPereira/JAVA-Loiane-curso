package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int soma = 0;
		
		System.out.print ("Informe 1º número: ");
		int num1 = input.nextInt();
		
		System.out.print ("Informe 2º número: ");
		int num2 = input.nextInt();
		
		if (num1 > num2){
			for (int i = num1; i >= num2; i--){
				System.out.println(i);
				
				soma += i;
			}
		}
		
		else {
			for (int i = num1; i <= num2; i++){
				System.out.println (i);
			
				soma += i;
			}
		}
			
		System.out.println ("Valor da soma: " + soma);
		

	}

}
