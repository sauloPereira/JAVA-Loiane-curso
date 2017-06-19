package com.loiane.java.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	//Metodo simples
	//void - não retorna nenhum valor
	void exibirAutonomia(){
		System.out.println("A autonômia do carro é: " 
	+ capacidadeCombustivel * consumoCombustivel + " km");
		
	}
	
}
