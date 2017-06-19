package com.loiane.java.aula20;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] m = new int[10][10];
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				m[i][j] = random.nextInt(100);
			}
		}
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
		
		int maiorL5 = 0;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		
		for (int i = 0; i < m[linha5].length; i++){
			if (m[linha5][i] > maiorL5){
				maiorL5 = m[linha5][i];

			}
			if (m[linha5][i] < menorL5){
				menorL5 = m[linha5][i];
			}
			
		}
		
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5);
		
		int maiorC7 = 0;
		int menorC7 = Integer.MAX_VALUE;
		int col7 = 7;
		
		for (int i = 0; i < m.length; i++){
			if (m[i][col7] > maiorC7){
				maiorC7 = m[i][col7];
				
			}
			if (m[i][col7] < menorC7){
				menorC7 = m[i][col7];
			}
			
		}
		
		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("Menor valor da coluna 7 = " + menorC7);
		
	}

}
