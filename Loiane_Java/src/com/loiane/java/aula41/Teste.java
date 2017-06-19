package com.loiane.java.aula41;

public class Teste {

	public static void main(String[] args) {
		//A classe Pessoa não pode mais instanciada.
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua u01, 772");
		aluno.setEndereco("Av. 007, 666");
		professor.setEndereco("Rua 95, 6090");

	}

}
