package com.loiane.java.aula31;

public class Carro {
	// Qualquer classe de qualquer Packege pode "vê-los"
	public String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	

	double obterAutonomia(){
		System.out.println("Método obter autonomia foi chamado.");
		return capacidadeCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km){
		double qntCombustivel = km / consumoCombustivel;
		
		return qntCombustivel;
		
	}
	
}
