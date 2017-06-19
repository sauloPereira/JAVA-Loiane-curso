package com.loiane.java.aula36;
/*
 * Criando relacionamentos em classes e atributos.
 * */
public class Contato {
	
	private String nome;
	// alterado o tipo de atributo de (String para Endereco class)
	private Endereco endereco;
	private Telefone[] telefones;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//refeito os getter e setter
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	
}
