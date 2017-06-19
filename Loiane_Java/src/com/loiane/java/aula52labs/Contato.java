package com.loiane.java.aula52labs;

public class Contato {
	
	private static int contador = 0;
	
	private String nome;
	private String telefone;
	private String email;
	private int id;
	
	public Contato() {
		contador++;
		id = contador;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	/*O id não poderá ser setado configurado
	 * public void setId(int id) {
	 
		this.id = id;
	}
	*/
	
	@Override
	public String toString() {
		String s = "-------------------";
		s += "\nNome: " + nome;
		s += "\nTelefone: " + telefone;
		s += "\nE-mail: " + email;
		s += "\nId: " + id;
		return s;
	}
	

}