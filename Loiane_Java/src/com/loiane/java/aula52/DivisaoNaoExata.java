package com.loiane.java.aula52;
// criando exception
public class DivisaoNaoExata extends Exception {
	//1º os atributos
	private int num;
	private int denom;
	//2º um construtor com campos
	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}
	// depois, uma saida  gerando  To String
	@Override
	public String toString() {
		return "Resultado de " + num + " / " + denom + " não é um inteiro.";
	}
	
	

}
