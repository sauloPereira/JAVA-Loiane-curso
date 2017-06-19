package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		int qntPares = 0;
		
		System.out.print("Pares no vetor A = ");
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 == 0){
				System.out.print(a[i] + " ");
				
				qntPares = qntPares + 1;
			}
		}
		System.out.println("\nQuantidade pares: " + qntPares);

	}
}
