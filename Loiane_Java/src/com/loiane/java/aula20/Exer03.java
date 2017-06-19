package com.loiane.java.aula20;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] m = new int[3][3];
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				System.out.println("Informe o valor da pos [" + i + ", " + j + "] ");
				m[i][j] = input.nextInt();
				
			}
			
		}
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
		
		int qntPar = 0;
		int qntImpar = 0;
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				if (m[i][j] % 2 == 0){
					qntPar++;
				}
				if (m[i][j] % 2 != 0){
					qntImpar++;
				}
				
			}

		}
		System.out.println("Qnt de Pares: " + qntPar);
		System.out.println("Qnt Impares: " + qntImpar);

	}

}
