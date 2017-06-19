package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Analisando o número " + a[i]);
			
			for (int j = 2; j < a[i]; j++){
				if (j % 2 == 0){
					System.out.println(j + " É par");
				}
			}
			System.out.println();
				
		}

	}

}
