package com.loiane.java.aula25;

public class TesteCarroMetodo {

	public static void main(String[] args) {

        Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		//Chamada do Método
		//Métodos sempre começam com verbo (Exibir)
		van.exibirAutonomia();
	}

}
