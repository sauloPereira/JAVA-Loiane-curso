package com.loiane.java.aula43labsIII;

public class Animal {

	private String nome;
	private String comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
		numPatas = 4;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		String s = "-----------------------";
		s += "\nAnimal: " + nome;
		s += "\ncomprimento: " + comprimento + " cm";
		s += "\nPatas: " + numPatas;
		s += "\nCor: " + cor;
		s += "\nAmbiente: " + ambiente;
		s += "\nVelocidade: " + velocidade + " m/s";
		
		return s;
	}
	
}
