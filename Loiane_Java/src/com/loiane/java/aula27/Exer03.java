package com.loiane.java.aula27;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno:");
		aluno.nome = input.next();

		System.out.println("Informe o nome do curso:");
		aluno.curso = input.next();
		
		System.out.println("Informe matricula:");
		aluno.matricula = input.next();
		
		//aluno.disciplinas = new String[3];
		
		for (int i = 0; i < aluno.disciplinas.length; i++){
			System.out.println("Informe o nome da " + (i+1) + "º disciplna");
			aluno.disciplinas[i] = input.next();
		}
		
		for (int i = 0; i < aluno.notas.length; i++){
			System.out.println("Informe a " + (i+1) + "º nota da disciplina "
					+ aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notas[i].length; j++){
				System.out.println("Informe a " + (j+1) + "º nota");
				aluno.notas[i][j] = input.nextDouble();
			}
		}
		
		aluno.mostrarInfo();
		
		for (int i = 0; i < aluno.disciplinas.length; i++){
			if (aluno.verificarAprovado(i)){
				System.out.println(aluno.verificarAprovado(i) + "Aprovado");
			}
			else {
				System.out.println(aluno.verificarAprovado(i) + "Reprovado");
			}
			
		}
		
	}

}
