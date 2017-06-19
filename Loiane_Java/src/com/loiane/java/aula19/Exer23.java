package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
			
			if (a[i] % 2 != 0){
				System.out.println("Fim do processo - numero impar - ");
				break;
			}
		}

	}

}
