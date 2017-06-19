package com.loiane.java.aula30;


public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	
	
	public Carro(String marca, String modelo) {
		//This chamando construtor
		this("Fiat", "Ducato", 10);
		System.out.println("Chamando construtor com 2 parametros");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parametros");
	}

	public Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}

	double obterAutonomia(){
		System.out.println("Método obter autonomia foi chamado.");
		return capacidadeCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km){
		double qntCombustivel = km / consumoCombustivel;
		
		return qntCombustivel;
		
	}

}
