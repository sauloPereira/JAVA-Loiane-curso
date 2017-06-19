package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Tabuada de " + a[i]);
			
			for (int j = 0; j <= 10; j++){
				System.out.println(j + " x " + a[i] + " = " + (a[i]*j));
				
			}
			System.out.println();
		}

	}

}
