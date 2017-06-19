package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[11];
		
		for (int i = 0; i < a.length; i++){
			a[i] = (int) Math.pow(2, i);
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

}
