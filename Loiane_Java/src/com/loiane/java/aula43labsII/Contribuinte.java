package com.loiane.java.aula43labsII;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		String s = "Nome: " + nome;
		s += " | Renda Brutal: R$ " + rendaBruta;
		
		return s;
	}

}
