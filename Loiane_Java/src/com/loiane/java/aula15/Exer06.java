package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite 1� n�mero: ");
		int num1 = input.nextInt();
		
		System.out.print ("Digite 2� n�mero: ");
		int num2 = input.nextInt();
		
		System.out.print ("Digite 3� n�mero: ");
		int num3 = input.nextInt();
		
		if (num1 <= num2 && num2 <= num3){
			System.out.print ("O maior n�mero �: " + num3);
		}
		else if (num1 >= num2 && num2 >= num3){
			System.out.print ("o maior n�mero �: " + num1);
		}
		else {
			System.out.print ("o maior n�mero �: " + num2);
		}
		
	}

}