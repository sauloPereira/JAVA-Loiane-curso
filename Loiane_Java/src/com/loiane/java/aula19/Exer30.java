package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[20];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
			
			if (a[i] % 2 == 0){
				b[i] = a[i];
			}
			else {
				c[i] = a[i];
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
		System.out.print("\nVetor C = ");
		for (int i = 0; i < c.length; i++){
			System.out.print(c[i] + " ");
		}

	}

}
