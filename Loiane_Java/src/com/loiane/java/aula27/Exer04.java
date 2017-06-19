package com.loiane.java.aula27;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		JogoVelha jogo = new JogoVelha();
		
		System.out.println("Jogador 01 - X");
		System.out.println("Jogador 02 - O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0;
		int coluna = 0;
		
		while(!ganhou){
			if (jogo.vezJogador1()){
				System.out.println("Jogador 01. Escolha linha e coluna."
						+ " entre 1 e 3: ");
				sinal = 'X';
				
			}
			else {
				System.out.println("Jogador 02. Escolha linha e coluna."
						+ " entre 1 e 3: ");
				sinal = 'O';
			}	
			linha = valor("Linha", input);
			coluna = valor("Coluna", input);
			
			if (!jogo.validarJogada(linha, coluna, sinal)){
				System.out.println("Posição ocupada");
			}
			
			jogo.imprimirTabuleiro();
			
			if (jogo.verificarGanhador('X')){
				ganhou = true;
				System.out.println("Parabéns! Jogador 1 ganhou!");
			}
			else if (jogo.verificarGanhador('O')){
				ganhou = true;
				System.out.println("Parabéns! Jogador 2 ganhou!");
			}
			else if (jogo.jogada > 9){
				ganhou = true;
				System.out.println("Impate");
			}
		}
	}
	
	static int valor(String tipoValor, Scanner input){
		int valor = 0;
		boolean valorValida = false;
		
		while (!valorValida){
			System.out.println("Informe " +tipoValor+ " 1, 2 ou 3: ");
			valor = input.nextInt();
			
			if (valor >= 1 && valor <= 3){
				valorValida = true;
			}
			else {
				System.out.println("Valor inválido");
			}
			
		}
		valor--;
		return valor;
		
	}

}
