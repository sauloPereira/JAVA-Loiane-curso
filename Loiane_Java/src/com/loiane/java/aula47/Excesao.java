package com.loiane.java.aula47;

public class Excesao {
	
	public static void main(String [] args){
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da Exception");
			
			//posição que não existe
			vetor[4] = 1;
			System.out.println("Esse texto não será impresso");
		}
		catch (ArrayIndexOutOfBoundsException exception){
			System.out.println("Erro ao acessar um indice do vetor que não existe.");
		}
		System.out.println("Esse texto após a excesão");
	}
	
	
}
