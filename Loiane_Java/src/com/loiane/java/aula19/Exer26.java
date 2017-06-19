package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
			
		}
		for (int i = 0; i < b.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor B:");
			b[i] = input.nextInt();
			
			if (a[i] == b[i]){
				c[i] = 0;
			}
			else if (a[i] > b[i]){
				c[i] = 1;
			}
			else{
				c[i] = -1;
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
