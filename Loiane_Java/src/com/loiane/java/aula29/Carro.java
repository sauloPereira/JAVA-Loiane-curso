package com.loiane.java.aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_,int numPassageiros_,
			double capacidadeCombustivel_, double consulmoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capacidadeCombustivel = capacidadeCombustivel_;
		consumoCombustivel = consulmoCombustivel_;
		
		Carro2 carro2 = new Carro2(marca_, modelo_, numPassageiros_,
				capacidadeCombustivel_, consulmoCombustivel_);
		
	}
	
	
	double obterAutonomia(){
		System.out.println("Método obter autonomia foi chamado.");
		return capacidadeCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km){
		double qntCombustivel = km / consumoCombustivel;
		
		return qntCombustivel;
		
	}

}
