package com.loiane.java.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		//Desta forma, aponta para refêrencia da MEMORIA
		System.out.println(aluno);
		//Apos declarar metodo toString - mostra output

		String s1 = "shuashua";
		String s2 = "shuashua";
		
		System.out.println(s1 == s2);
		//EQUALS
		//usado para objects
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciência da Computação");
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno == aluno2);
		System.out.println(aluno.equals(aluno2));
		
		
	}

}
