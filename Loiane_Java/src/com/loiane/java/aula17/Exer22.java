package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de CDs: ");
		int nCDs = input.nextInt();
		
		double valor;
		double soma = 0;
		
		for (int i = 0; i < nCDs; i++){
			System.out.println("Informe o valor do CD " + (i+1) + ": ");
			valor = input.nextDouble();
		
			soma += valor;
		}
		System.out.println("Valor total gasto: " + soma);
		
		double media = soma / nCDs;
		System.out.println("Média gasta por CD: " + media);

	}

}
