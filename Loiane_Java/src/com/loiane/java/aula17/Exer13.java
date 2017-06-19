package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe o número base: ");
		int base = input.nextInt();
		
		System.out.print("Informe o número espoênte: ");
		int expo = input.nextInt();
		
		//double result = Math.pow(base, expo);
		int result = base;
		
		for (int i = 1; i < expo; i++){
			result *= base;
			
		}
		
		System.out.println (base + " elevado a " + expo + " = " + result);
		

	}

}
