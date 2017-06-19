package com.loiane.java.aula43labsIII;

public class Mamifero extends Animal {
	
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public Mamifero() {
		super();
		this.setCor("Castanho");
		this.alimento = "Mel";
		
	}
	
	@Override
	public String toString() {
		String s =  super.toString();
		s += "\nAlimento: " + alimento;
		
		return s;
	}
	
}
