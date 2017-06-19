package com.loiane.java.aula32;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		//van.marca = "Fiat";//erro
		//Getter Setter - Atribuido valores
		
		//o metodo set para atribuir valor
		van.setMarca("Fiat");
		//metodo get para obter valor
		System.out.println(van.getMarca());

	}

}
