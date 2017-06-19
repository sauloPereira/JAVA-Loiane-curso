package com.loiane.java.aula47;

public class Excesao {
	
	public static void main(String [] args){
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da Exception");
			
			//posi��o que n�o existe
			vetor[4] = 1;
			System.out.println("Esse texto n�o ser� impresso");
		}
		catch (ArrayIndexOutOfBoundsException exception){
			System.out.println("Erro ao acessar um indice do vetor que n�o existe.");
		}
		System.out.println("Esse texto ap�s a exces�o");
	}
	
	
}
