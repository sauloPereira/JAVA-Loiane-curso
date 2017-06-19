package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int num = input.nextInt();
		
		int inicio, fim, result = 0;
		boolean valido = true;
		
		do {
			System.out.print("Comecar por: ");
			inicio = input.nextInt();
			
			System.out.print("Terminar em: ");
			fim = input.nextInt();
			
			if (inicio <= fim) {
				
				System.out.print("\n");
				System.out.println("Vou montar a tabuada de " + num +
						" começando em " + inicio + " e terminando em " + fim + ": ");
				
				valido = true;
				for (int i = inicio; i <= fim; i++){
					result = num * i;
					
					System.out.println(num + " x " + i + " = " + result);
				}
			}
		}
		while (!valido);
			
			if (fim < inicio){
				System.out.println("Inválido - Valor final menor que inicial");
			}

	}

}
