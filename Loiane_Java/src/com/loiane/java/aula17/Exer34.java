package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("INforme o valor de n: ");
		int n = input.nextInt();
		double soma = 0;
		
		for (int i = 1; i <= n; i++){
			
			soma += 1/i;
			
			System.out.print("1/" + i + " + ");
		}
		System.out.println(" = " + soma);

	}

}
