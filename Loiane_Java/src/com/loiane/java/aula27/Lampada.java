package com.loiane.java.aula27;

public class Lampada {
	
	String modelo;
	String tensao;
	String tipoLuz;
	String cor;
	int potencia;
	int garatiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar(){
		ligada = true;
	}
	void desligar(){
		ligada = false;
	}
	void mudarEstado(){
		if (ligada){
			desligar();
			//System.out.println("Lampada ligada.");
		}
		else {
			ligar();
			//System.out.println("Lampada desligada.");
		}
	}
	void mostrarEstado(){
		if (ligada){
			System.out.println("Lampada ligada.");
		}
		else {
			System.out.println("Lampada desligada.");
	
		}
	}
	
}
