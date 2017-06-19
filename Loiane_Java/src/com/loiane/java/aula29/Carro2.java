package com.loiane.java.aula29;

public class Carro2 {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	//construtor com parametro
	public Carro2(String marca, String modelo, int numPassageiros,
			double capacidadeCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	//Caso declare classe com paramentro por boa pratica delarar um construtor vazio
	//Carro2(){}//ou

	public Carro2() {
//	pois frameworks do java precisam de um construtor vazio.
	}
	
	
	
	

}
