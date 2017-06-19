package com.loiane.java.aula27;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lam = new Lampada();
		
		lam.ligar();
		System.out.println("Ligada está " + lam.ligada);
		lam.desligar();
		System.out.println("Ligada está " + lam.ligada);
		
		lam.mudarEstado();
		
		lam.mostrarEstado();

	}

}
