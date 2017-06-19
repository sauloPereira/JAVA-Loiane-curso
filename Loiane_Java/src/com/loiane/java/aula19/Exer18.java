package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++){
			System.out.println("Informe a " + (i+1) + "º idade: ");
			idades[i] = input.nextInt();
		}
		
		int menor = idades[0];
		int indexMenor = idades[0];
		int maior = idades[0];
		int indexMaior = idades[0];
		
		for (int i = 1; i < idades.length; i++){
			if (idades[i] > maior){
				maior = idades[i];
				indexMaior = (i+1);
			}
			else {
				menor = idades[i];
				indexMenor = i;
			}
			
		}
		System.out.print("Idades: ");
		for (int i = 0; i < idades.length; i++){
			System.out.print(idades[i] + " ");
		}
		System.out.println("\nMenor idade: " + menor);
		System.out.println("Posição: " + (indexMenor+1));
		
		System.out.println("Maior idade: " + maior);
		System.out.println("Posição: " + indexMaior);

	}

}
