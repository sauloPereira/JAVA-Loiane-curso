package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0;
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		int inferior = 0;
		int maior = 0;
		System.out.println("\nSoma dos inferiores a 15 = ");
		for (int i = 0; i < a.length; i++){
			if (a[i] < 15){
				System.out.print(a[i] + " + ");
				
				soma += a[i];
				inferior++;
			}
		}
		System.out.println(" = " + soma);
		System.out.println("Quantidade de elementos menores que 15 = " + inferior);
		
		int igual = 0, somaIg = 0;
		for (int i = 0; i < a.length; i++){
			if (a[i] == 15){
				System.out.print(a[i] + " ");
				
				somaIg += a[i];
				igual++;
			}
		}
		System.out.print("Soma dos iguais a 15 = " + soma);
		System.out.println("\nQuantidade igual a 15 = " + igual);
		
		int media = 0;
		System.out.print("Maiores que 15 = ");
		for (int i = 0; i < a.length; i++){
			if(a[i] > 15){
				System.out.print(a[i] + " + ");
				
				soma += a[i];
				maior++;
				media = (soma / maior);
			}
		}
		System.out.println("Quantidade de elementos maiores que 15 = " + maior);
		System.out.println("MEdia dos maiores de 15 = " + media);
	}

}
