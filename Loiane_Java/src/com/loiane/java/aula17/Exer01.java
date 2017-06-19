package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		boolean valida = false;
		
		do {
			System.out.print ("Informe nota entre 0 - 10: ");
			double nota = input.nextInt ();
			valida = true;
			if (nota >= 0 && nota <= 10){
				System.out.println ("Sua nota: " + nota);
			}
			else {
				valida = false;
				System.out.println (" nota Inválida!");
			}
		}
		while (!valida);

	}

}
