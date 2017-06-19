package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[15];
		int[] b = new int[a.length];
		
 		for (int i = 0; i < a.length; i++){
 			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
 			a[i] = input.nextInt();
 			
 		}

		for (int i = 0; i < a.length; i++){
			b[i] = 1;
			for (int j = 1; j <= a[i]; j++){
				b[i] *= j;

			}
			
		}
 		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.print("\nVetor B = ");
		for (int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
 		

	}

}
