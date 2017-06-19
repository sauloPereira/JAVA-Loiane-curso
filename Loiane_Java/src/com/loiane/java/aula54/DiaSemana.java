package com.loiane.java.aula54;

public enum DiaSemana {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5),
	SABADO(6), DOMINGO(7);
	
	private int valor;
	//declarando construtor
	DiaSemana(int valor) {//n�o esquecer de passar os valores int para os enum.
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}
	
}