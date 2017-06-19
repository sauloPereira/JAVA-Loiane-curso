package com.loiane.java.aula27;

public class TesteCarroParametros {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
							//Passa como argumento
		double qntCombustivel10 = van.calcularCombustivel(10);
		double qntCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println(qntCombustivel10);
		System.out.println(qntCombustivel15);
		
	}

}
