package com.loiane.java.aula49;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Informe um numero decimal: ");
		try {
			double num = LerNumero();
			System.out.println("Você digitou: " + num);
		} catch (Exception e) {
			System.out.println("Entrada invalida");
			e.printStackTrace();
		}

	}
//  throws é utilizado na assinatura do metodo.
	public static double LerNumero() throws Exception {
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		
		return num;
		
	}
	
}
