package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double soma = 0;
		double media;
		double nota;
		
		System.out.print("Informe o número de notas: ");
		int notas = input.nextInt();
		
		System.out.println("Informe as notas: ");
		
		for (int i = 0; i < notas; i++){
			System.out.println("Entre com a nota: " + (i+1));
			nota = input.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
	}
	

}
