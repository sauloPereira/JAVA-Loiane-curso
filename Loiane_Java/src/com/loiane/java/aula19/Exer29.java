package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length * 2];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
			
			c[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor B:");
			b[i] = input.nextInt();
			
			//c[i + 10] = b[i];
			c[a.length + i] = b[i];
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
