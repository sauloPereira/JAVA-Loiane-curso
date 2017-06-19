package com.loiane.java.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a qnt de pessoas entrevistadas: ");
		int numEntrevistados = input.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i = 0; i < nomesFilhos.length; i++){
			System.out.println("Informe a qnt da filhos: ");
			int qntFilhos = input.nextInt();
			
			nomesFilhos[i] = new String[qntFilhos];
			//para esta posição esta sendo criado outro vetor
			for (int j = 0; j < nomesFilhos[i][j].length(); j++){
				System.out.println("Digite o nome do filho " + (j+1));
				nomesFilhos[i][j] = input.next();
				
			}
		}
		for (int i = 0; i < nomesFilhos.length; i++){
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
			for (int j = 0; j < nomesFilhos[i][j].length(); j++){
				System.out.println(nomesFilhos[i][j]);
				
			}
			
		}
		
		
	}

}
