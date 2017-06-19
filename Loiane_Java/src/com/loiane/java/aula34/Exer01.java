package com.loiane.java.aula34;

public class Exer01 {
	
	static void imprimirValor(){
		System.out.println(Contador.obterValor());
	}
	//O atributo (int) sendo static, sempre será compartinhado por todas instancias
	public static void main(String[] args) {
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.obterValor();
		
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerarCont();
		imprimirValor();

	}

}
