package com.loiane.java.aula52;
// criando exception
public class DivisaoNaoExata extends Exception {
	//1� os atributos
	private int num;
	private int denom;
	//2� um construtor com campos
	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}
	// depois, uma saida  gerando  To String
	@Override
	public String toString() {
		return "Resultado de " + num + " / " + denom + " n�o � um inteiro.";
	}
	
	

}
