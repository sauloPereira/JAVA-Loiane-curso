package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		int qnt = 0;
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Informe a " + (i+1) + "º idade: ");
			a[i] = input.nextInt();
		}
		
		System.out.print("Idades maiores que 35 anos: ");
		for (int i = 0; i < a.length; i++){
			if (a[i] > 35){
				System.out.print(a[i] + " ");
				qnt++;
			}
		}
		System.out.println("\nQnt pessoas com mais de 35 anos: " + qnt);

	}

}
