package com.loiane.java.aula33;

public class JogoVelha {
	
	private char[][] velha;
	private int jogada;
	
	public JogoVelha() {
		velha = new char[3][3];
		jogada = 1;
	}

	public JogoVelha(char[][] velha, int jogada) {
		this.velha = velha;
		this.jogada = jogada;
	}

	public char[][] getVelha() {
		return velha;
	}

	public void setVelha(char[][] velha) {
		this.velha = velha;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
	public boolean validarJogada(int linha, int coluna, char sinal){
		if (velha[linha][coluna] == sinal || velha[linha][coluna] == 'O'){
			return false;
		}
		else {
			velha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	public void imprimirTabuleiro(){
		for (int i = 0; i < velha.length; i++){
			for (int j = 0; j < velha[i].length; j++){
				System.out.print(velha[i][j] + " | ");	
			}
			System.out.println();
		}
		
	}
	
	public boolean verificarGanhador(char sinal){
		if ((velha[0][0] == sinal && velha[0][1] == sinal && velha[0][2] == sinal) 
				|| (velha[1][0] == sinal && velha[1][1] == sinal && velha[1][2] == sinal)
				|| (velha[2][0] == sinal && velha[2][1] == sinal && velha[2][2] == sinal)
				|| (velha[0][0] == sinal && velha[1][0] == sinal && velha[2][0] == sinal)
				|| (velha[0][1] == sinal && velha[1][1] == sinal && velha[2][1] == sinal)
				|| (velha[0][2] == sinal && velha[1][2] == sinal && velha[2][2] == sinal)
				|| (velha[0][0] == sinal && velha[1][1] == sinal && velha[2][2] == sinal)
				|| (velha[2][0] == sinal && velha[1][1] == sinal && velha[0][2] == sinal)){
			return true;
			
		}
		return false;
		
	}
	
	public boolean vezJogador1(){
		if (jogada % 2 != 0){
			return true;
		}
		return false;
		
	}

}
