package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		
		System.out.print ("Informe o 1º número: ");
		int num1 = input.nextInt();
		
		System.out.print ("Informe o 2º nùmero: ");
		int num2 = input.nextInt();
		
		System.out.print ("Informe o 3º número: ");
		int num3 = input.nextInt();
		
		if (num1 >= num2 && num1 >= num3 && num2 >= num3){
			System.out.println ("Em ordem decrescente: " + num1 + ", " + num2 + ", " + num3);
		}
		else if (num1 >= num2 && num1 >= num3 && num3 >= num2){
			System.out.println ("Em ordem decrescente: " + num1 + ", " + num3 + ", " + num2);
		}
		else if (num2 >= num1 && num2 >= num3 && num1 >= num3){
			System.out.println ("Em ordem decrescente: " + num2 + ", " + num1 + ", " + num3);
		}
		else if (num2 >= num1 && num2 >= num3 && num3 >= num1){
			System.out.println ("Em ordem decrescente: " + num2 + ", " + num3 + ", " + num1);
		}
		else if (num3 >= num2 && num3 >= num1 && num2 >= num1){
			System.out.println ("Em ordem decrescente: " + num3 + ", " + num2 + ", " + num1);
		}
		else if (num3 >= num1 && num3 >= num2 && num1 >= num2){
			System.out.println ("Em ordem decrescente: " + num3 + ", " + num1 + ", " + num2);
		}

	}

}
