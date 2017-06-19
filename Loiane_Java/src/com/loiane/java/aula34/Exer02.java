package com.loiane.java.aula34;

public class Exer02 {
	
	static void imprimirTela(double num){
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		imprimirTela(Calculadora.soma(2, 3));
		
		imprimirTela(Calculadora.subtracao(2, 3));
		
		imprimirTela(Calculadora.multiplica(2, 3));
		
		imprimirTela(Calculadora.divide(2, 3));
		
		imprimirTela(Calculadora.potencia(2, 3));

		imprimirTela(Fatorial.fatorial(5));
	}

}
