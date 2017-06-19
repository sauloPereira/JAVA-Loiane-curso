package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int prox;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe n-ésimo (variavel) termo da série de Fibonacci: ");
		int n = input.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i = 3; i <= n; i++){
			
			prox = num1 + num2;
			num1 = num2;
			num2 = prox;
			
			System.out.println(prox);
		}
		
	}

}
