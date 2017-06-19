package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer30L {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[20];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		int posB = 0;
		int posC = 0;
		
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 == 0){
				b[posB] = a[i];
				posB++;
			} 
			else {
				c[posC] = a[i];
				posC++;
			} 
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.print("\nVetor B = ");
		for (int i = 0; i < posB; i++){
			System.out.print(b[i] + " ");
		}
		System.out.print("\nVetor C = ");
		for (int i = 0; i < posC; i++){
			System.out.print(c[i] + " ");
		}

	}

}
