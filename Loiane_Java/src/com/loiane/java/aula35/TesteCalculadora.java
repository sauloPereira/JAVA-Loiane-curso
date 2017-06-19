package com.loiane.java.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {

		int fatorialNR = Calculadora.fatorialNaoRecursiva(5);
		System.out.println(fatorialNR);
		
		int fatorialRecursivo = Calculadora.fatorial(5);
		System.out.println(fatorialRecursivo);

	}

}
