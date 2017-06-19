package com.loiane.java.aula22;

import java.util.Scanner;

public class Debug {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		char[][] velha = new char[3][3];
		
		System.out.println("Jogador 01 - X");
		System.out.println("Jogador 02 - O");
		
		boolean ganhou = false;
		int jogada = 1;//Controle de players
		char sinal;
		int linha = 0;
		int coluna = 0;
		
		while(!ganhou){
			if (jogada % 2 != 0){//Jogador 01
				System.out.println("Jogador 01. Escolha linha e coluna."
						+ " entre 1 e 3: ");
				sinal = 'X';
				
			}
			else {
				System.out.println("Jogador 02. Escolha linha e coluna."
						+ " entre 1 e 3: ");
				sinal = 'O';
			}
			//keep logic
			
			boolean linhaValida = false;
			
			while (!linhaValida){
				System.out.println("Informe linha. 1, 2 ou 3: ");
				linha = input.nextInt();
				
				if (linha >= 1 && linha <= 3){
					linhaValida = true;
				}
				else {
					System.out.println("Valor inválido");
				}
				
			}
			
			boolean colunaValida = false;
			
			while (!colunaValida){
				System.out.println("Informe coluna. 1, 2 ou 3: ");
				coluna = input.nextInt();
				
				if (coluna >= 1 && coluna <= 3){
					colunaValida = true;
				}
				else {
					System.out.println("Valor inválido");
				}
			}
			
			linha--;
			coluna--;
			
			if (velha[linha][coluna] == 'X' || velha[linha][coluna] == 'O'){
				System.out.println("Posição ocupada");
			}
			else {
				velha[linha][coluna] = sinal;
				jogada++;
			}
			
			//Imprimindo Tabuleiro
			
			for (int i = 0; i < velha.length; i++){
				for (int j = 0; j < velha[i].length; j++){
					System.out.print(velha[i][j] + " | ");	
				}
				System.out.println();
			}
			
			//Verificar se há ganhador
			
			if ((velha[0][0] == 'X' && velha[0][1] == 'X' && velha[0][2] == 'X') 
					|| (velha[1][0] == 'X' && velha[1][1] == 'X' && velha[1][2] == 'X')
					|| (velha[2][0] == 'X' && velha[2][1] == 'X' && velha[2][2] == 'X')
					|| (velha[0][0] == 'X' && velha[1][0] == 'X' && velha[2][0] == 'X')
					|| (velha[0][1] == 'X' && velha[1][1] == 'X' && velha[2][1] == 'X')
					|| (velha[0][2] == 'X' && velha[1][2] == 'X' && velha[2][2] == 'X')
					|| (velha[0][0] == 'X' && velha[1][1] == 'X' && velha[2][2] == 'X')
					|| (velha[0][2] == 'X' && velha[1][1] == 'X' && velha[0][2] == 'X')){
				ganhou = true;
				System.out.println("Parabéns! Jogador 1 ganhou!");
				
			}
			else if ((velha[0][0] == 'O' && velha[0][1] == 'O' && velha[0][2] == 'O') 
					|| (velha[1][0] == 'O' && velha[1][1] == 'O' && velha[1][2] == 'O')
					|| (velha[2][0] == 'O' && velha[2][1] == 'O' && velha[2][2] == 'O')
					|| (velha[0][0] == 'O' && velha[1][0] == 'O' && velha[2][0] == 'O')
					|| (velha[0][1] == 'O' && velha[1][1] == 'O' && velha[2][1] == 'O')
					|| (velha[0][2] == 'O' && velha[1][2] == 'O' && velha[2][2] == 'O')
					|| (velha[0][0] == 'O' && velha[1][1] == 'O' && velha[2][2] == 'O')
					|| (velha[0][2] == 'O' && velha[1][1] == 'O' && velha[0][2] == 'O')){
				ganhou = true;
				
				
			}
			else if (jogada > 9){
				ganhou = true;
				System.out.println("Impate");
			}
			
		}

	}

}
