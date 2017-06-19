package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		//int[] b = new int[a.length]; Tabela asc//
		char[] b = new char[a.length];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
			
			if (a[i] < 7){
				b[i] = 'a';
			}
			else if (a[i] == 7){
				b[i] = 'b';
			}
			else if (a[i] > 7 && a[i] < 10){
				b[i] = 'c';
			}
			else if (a[i] == 10){
				b[i] = 'd';
			}
			else if (a[i] > 10){
				b[i] = 'e';
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
	}

}
