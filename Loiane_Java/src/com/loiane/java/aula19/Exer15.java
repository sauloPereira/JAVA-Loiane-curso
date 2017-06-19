package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		int[] a = new int[10];
		int porcPar = 0;
		int porcImpars = 0;
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
			
		}
		int qntP = 0;
		System.out.print("\nNumeros pares = ");
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 == 0){
				System.out.print(a[i] + " ");
				
				qntP = qntP + 1;
			}
		}
		System.out.print("\nQuantidade de Pares = " + qntP);
		//System.out.print("\nPercentual de Pares = " + percPares + "%");
		
		int qntIm = 0;
		System.out.print("\nNumeros impares = ");
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 != 0){
				System.out.print(a[i] + " ");
				
				qntIm++;
				
			}
		}
		
		int par = a.length - qntIm;
		
		//a.length - 100%
		//par      - x
		//= x * a.length == par + 100
		//= x == (par * 100) / a.length
		
		porcPar = (par * 100) / a.length;
		porcImpars = 100 - porcPar;
		
		System.out.print("\nQuantidade de pares = " + par);
		System.out.print("\nPercentual de pares = " + porcPar + "%");
		System.out.print("\nQuantidade de impares = " + qntIm);
		System.out.print("\nPercentual de impares = " + porcImpars + "%");
	}

}
