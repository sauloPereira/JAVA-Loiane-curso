package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
			
			//Operador TERNÁRIO (para if (?) / else(:))
			//quando condiçaõ (a[i] % 2 == 0) acontecer, = 1(if/?)
			//(else/:) = 0.
			b[i] = (a[i] % 2 == 0) ? 1 : 0;
			/*
			if (a[i] % 2 == 0){
				b[i] = 1;
			}
			else {
				b[i] = 0;
			}*/
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
