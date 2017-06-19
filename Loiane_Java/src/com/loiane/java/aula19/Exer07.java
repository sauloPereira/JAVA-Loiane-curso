package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		for (int i = 0; i < A.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			A[i] = input.nextInt();
		}
		for (int i = 0; i < B.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor B:");
			B[i] = input.nextInt();
			
			C[i] = A[i] - B[i];
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
		
		System.out.print("Vetor C = ");
		for (int i = 0; i < C.length; i++){
			System.out.print(C[i] + " ");
		}
		System.out.println();
	}

}
