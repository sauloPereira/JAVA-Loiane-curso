package com.loiane.java.aula45;

public class Teste {
	
	public static void main (String[]args){
		/*Transformando uma classe menor em uma maior
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno;//UPcasting
	
		//Pessoa aluno = new Aluno();
		//ou
		//Pessoa aluno = (Pessoa) new Aluno();
		
		Aluno aluno2 = (Aluno) pessoaAluno; //Downcasting

		System.out.println(aluno2);
		*/
		
		//Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if(aluno instanceof Pessoa){
			System.out.println("� do tipo pessoa");
		}
		if(prof instanceof Pessoa){
			System.out.println("� do tipo Professor");
		}
		
		
	
	}	
}
