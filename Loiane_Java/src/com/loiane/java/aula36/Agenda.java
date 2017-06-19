package com.loiane.java.aula36;

public class Agenda {
	
	private String nome;
	private ContatoAgenda[] contatos;
	
	public Agenda() {}
	
	public Agenda(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContatoAgenda[] getContatos() {
		return contatos;
	}

	public void setContatos(ContatoAgenda[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo(){
		String info = "Nome: " + nome + "\n";
		
		if (contatos != null){
			for (ContatoAgenda c : contatos){
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;		
	}
	

}
