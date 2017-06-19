package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		
		boolean palindromo = true;
		for (int i = 0; i < a.length; i++){
			if (a[i] != a[a.length - 1 - i]){
				palindromo = false;
				break;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		
		if (palindromo){
			System.out.println("Palindromo");
		}
		else {
			System.out.println("Não é palindromo");
		}

	}

}
