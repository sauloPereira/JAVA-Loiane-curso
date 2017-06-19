package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for (int i = 0; i < A.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1));
			A[i] = input.nextInt();
			
			B[i] = A[i] * (i+1);
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < A.length; i++){
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < B.length; i++){
			System.out.print(B[i] + " ");
		}
		System.out.println();

	}

}
