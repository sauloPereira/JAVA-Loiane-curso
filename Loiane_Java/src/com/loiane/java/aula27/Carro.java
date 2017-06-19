package com.loiane.java.aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	//Comeca com o tipo de retorno (double)
	
	double obterAutonomia(){
		System.out.println("Método obter autonomia foi chamado.");
		//Sempre pede no fim um (return)
		return capacidadeCombustivel * consumoCombustivel;
		
	}
							//Parametro
	double calcularCombustivel(double km){
		double qntCombustivel = km / consumoCombustivel;
		
		return qntCombustivel;
		
	}
}
