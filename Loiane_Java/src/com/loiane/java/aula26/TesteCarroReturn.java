package com.loiane.java.aula26;

public class TesteCarroReturn {

	public static void main(String[] args) {
		
        Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);

		//Criada variavel autonomia para receber
		//o retorno do metodo (obterAutonomia())	
		
		double autonomia = van.obterAutonomia();
		
		System.out.println(autonomia);
		//ou
		System.out.println(van.obterAutonomia());
	}

}
