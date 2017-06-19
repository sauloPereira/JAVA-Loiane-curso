package com.loiane.java.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 7;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 9.5;
		
		//Mostrando na tela
		
		for (int i = 0; i < notasAlunos.length; i++){
			//Endereço de memoria.
			System.out.print(notasAlunos[i] + " ");
			for (int j = 0; j < notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + "  ");
			}
			System.out.println();
		}
		//Mudando o valor de uma célula matriz
		notasAlunos[1][3] = 8;
		
		System.out.println();
		for (int i = 0; i < notasAlunos.length; i++){
			for (int j = 0; j < notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + "  ");
			}
			System.out.println();
		}
		//Calculando média das notas de cada aluno.
		double soma;
		
		System.out.println("Calculando a media de cada aluno");
		for (int i = 0; i < notasAlunos.length; i++){
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++){
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + i + " é = " + (soma/4));
			
		}
		
		//Inicializando Matriz ou vetores
		
		double[] notasAluno1 = {7, 8, 9, 10};
		
		double[][] notasAluno2 = {{7, 8, 9, 10}, {8, 6, 7, 9}};
		
		System.out.println("Output da matriz notasAluno2");
		for (int i = 0; i < notasAluno2.length; i++){
			for (int j = 0; j < notasAluno2[i].length; j++){
				System.out.print(notasAluno2[i][j] + "  ");
			}
			System.out.println();
		}
		
		
	}

}
