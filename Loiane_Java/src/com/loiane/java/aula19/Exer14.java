package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int soma = 0;
		double media = 0;
		int qnt = 0;
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.print("\nImpares no vetor = ");
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 != 0){
				System.out.print(a[i] + " ");
				
				soma += a[i];
				qnt = qnt + 1;
				media = (soma / qnt);
			}
		}
		System.out.println("\nSoma dos Impares = " + soma);
		
		System.out.println("Quantidade de impares = " + qnt);
		
		System.out.println("Media = " + media);
	}

}
