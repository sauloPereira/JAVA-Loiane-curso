package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pre�o do p�o: R$ ");
		double valor = input.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os:");
		
		for (int i = 1; i <= 50; i++){
			System.out.println(i + " - R$ " + (valor * i));
			
		}
	}

}
