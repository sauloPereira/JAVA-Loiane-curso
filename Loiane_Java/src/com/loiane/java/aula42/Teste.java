package com.loiane.java.aula42;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		
		//Instancia de classes filhas só podem ser feitas diretamente.
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		System.out.println(Constantes.URL_BLOG);
		System.out.println(Constantes.URL_CURSO_COMPLETO);

	}

}
