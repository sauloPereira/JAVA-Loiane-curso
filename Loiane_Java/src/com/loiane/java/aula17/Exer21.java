package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe o número de turmas: ");
		int nTurmas = input.nextInt();
		
		int quantAlunos;
		int soma = 0;
		boolean invalido = true;
		
		for (int i = 0; i < nTurmas; i++){
			
			invalido = true;
			do {
				System.out.println("Informe a quantidade de alunos na turma " + (i+1) + ": ");
				quantAlunos = input.nextInt();
				
				if (quantAlunos <= 40){
					invalido = false;		
				}
				else {
					System.out.println("Quantidade inválida");
				}
			}
			while (invalido);
			
			soma += quantAlunos;
		}
		double media = soma / nTurmas;
		
		System.out.println("Média de alunos por classe: " + media);
	}

}
