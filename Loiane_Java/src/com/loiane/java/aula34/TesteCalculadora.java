package com.loiane.java.aula34;

public class TesteCalculadora {

	public static void main(String[] args) {
/*
		MinhaCalculadora calc = new MinhaCalculadora();
		//atrav�s da instancia acima, temos acesso as metodos da classe MinhaCalculadora
		calc.soma(1, 2);
*/
		//Com "satic" nos metodos, n�o � necessario instanciar a classe.
		MinhaCalculadora.soma(1, 2);
		
	}

}
