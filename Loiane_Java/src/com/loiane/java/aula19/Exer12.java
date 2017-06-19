package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
			
			soma += a[i];
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("\nSoma = " + soma);

	}

}
