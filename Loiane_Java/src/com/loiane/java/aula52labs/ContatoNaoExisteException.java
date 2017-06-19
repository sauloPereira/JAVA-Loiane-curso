package com.loiane.java.aula52labs;

public class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;
	
	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String toString() {
	
		return "Contato " + nomeContato + " n�o existente";
	}

}