package com.loiane.java.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Morgana");
		
		professor.setNome("mamae"); 
		
		//Por Pessoa (Super Classe) por ser a classe mae e pai da classe Aluno
		//Desta forma, apenas se tem acesso aos atributos comuns as classes.
		//não se tem acesso aos atributos especificos da classe filho.
		//Ex. alun.setNotas()//
		Pessoa alun = new Aluno();
		alun.setCpf("00099999955");

	}

}
