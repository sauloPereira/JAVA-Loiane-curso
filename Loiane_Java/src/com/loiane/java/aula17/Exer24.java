package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Preço do pão: R$ ");
		double valor = input.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços:");
		
		for (int i = 1; i <= 50; i++){
			System.out.println(i + " - R$ " + (valor * i));
			
		}
	}

}
