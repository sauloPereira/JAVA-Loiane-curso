package com.loiane.java.aula36;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o nome do curso:");
		String nome = input.nextLine();

		System.out.println("Informe o horário do curso:");
		String horario = input.nextLine();
		
		System.out.println("Informe o nome do professor:");
		String nomeProf = input.nextLine();
		
		System.out.println("Informe o departamento do professor:");
		String depProf = input.nextLine();
		
		System.out.println("Informe o email do professor:");
		String emailProf = input.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
		System.out.println("----Alunos----");
		for (int i = 0; i < alunos.length; i++){
			
			input.nextLine();
			
			System.out.println("Digite nome do aluno:");
			String nomeAluno = input.nextLine();
			
			System.out.println("Digite matricula do aluno:");
			String matricAluno = input.nextLine();
			
			int[] notas = new int[4];
			for(int j = 0; j < notas.length; j++){

				System.out.println("Informe a "+(j+1)+"ª do aluno:");
				notas[j] = input.nextInt();
			}
			Aluno al = new Aluno();
			al.setNome(nomeAluno);
			al.setMatricula(matricAluno);
			al.setNotas(notas);
			
			alunos[i] = al;
		}
		curso.setAlunos(alunos); 
		
		if (curso != null){
			System.out.println(curso.obterInfo());
		}
	}

}
