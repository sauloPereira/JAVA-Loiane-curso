package com.loiane.java.aula54;

public class Formulario {
	// para algo especifico que n�o ter� utilidade para outras classes.
	enum Genero {
		FEMININO('f'), MASCULINO('m');
		
		private char valor;
		
		Genero(char valor) {
			this.valor = valor;
		}
		
	}
	
	private String nome;
	private Genero genero;
	

}
