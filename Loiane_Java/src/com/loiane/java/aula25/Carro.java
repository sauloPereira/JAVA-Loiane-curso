package com.loiane.java.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	//Metodo simples
	//void - n�o retorna nenhum valor
	void exibirAutonomia(){
		System.out.println("A auton�mia do carro �: " 
	+ capacidadeCombustivel * consumoCombustivel + " km");
		
	}
	
}
