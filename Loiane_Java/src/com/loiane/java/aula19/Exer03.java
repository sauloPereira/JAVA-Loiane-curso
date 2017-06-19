package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[15];
		int[] B = new int[A.length];
		
		for (int i = 0; i < A.length; i++){
			System.out.println("Entre com o valor da posiçaõ " + (i+1));
			A[i] = input.nextInt();
			
			B[i] = A[i] * A[i];	
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
