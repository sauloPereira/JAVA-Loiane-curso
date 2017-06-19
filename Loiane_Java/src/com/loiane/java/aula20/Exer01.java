package com.loiane.java.aula20;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		Random numRandom = new Random();
		
		int[][] m = new int[4][4];
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				m[i][j] = numRandom.nextInt(100);//Gera num aleatórios até 100
				
			}
		}
		int maior = 0;
		int linha = 0;
		int col = 0;
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				if (m[i][j] > maior){
					maior = m[i][j];
					linha = i;
					col = j;
					
				}
				
			}
		}
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);

	}

}
