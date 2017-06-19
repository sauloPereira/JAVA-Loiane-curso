package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer07 {
//		INCOMPLETO
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite 1º número: ");
		int num1 = input.nextInt();
		
		System.out.print ("Digite 2º número: ");
		int num2 = input.nextInt();
		
		System.out.print ("Digite 3º número: ");
		int num3 = input.nextInt();
		
		if (num1 >= num2 && num1 >= num3){
			System.out.print ("O maior número é: " + num1);
		}
		else if (num2 >= num1 && num2 >= num3){
			System.out.print ("O maior número é: " + num2);
		}
		else if (num3 >= num2 && num3 >= num1){
			System.out.print ("O maior número é: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3){
			System.out.print (" O menor número é: " + num1);
		}
		else if (num2 <= num1 && num3 >= num2){
			System.out.print (" O menor número é: " + num2);
		}
		else if (num3 <= num1 && num3 <= num2){
			System.out.print (" O menor número é: " + num1);
		}

	}

}
