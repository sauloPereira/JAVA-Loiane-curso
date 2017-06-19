package com.loiane.java.aula34;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num; 
		
		do {
			System.out.println("Informe numero positivo:");
			num = input.nextInt();
			
			if (num < 0){
				System.out.println("Inválido");
			}
		}
		while (num < 0);
		
		System.out.println(Calculadora.fatorial(num));
	}

}
