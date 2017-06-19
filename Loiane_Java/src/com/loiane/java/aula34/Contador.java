package com.loiane.java.aula34;

public class Contador {
	
	private static int cont;
	
	public static void incrementar(){
		cont++;
	}
	
	public static void zerarCont(){
		cont = 0;
	}
	
	public static int obterValor(){
		return cont;
	}

}
