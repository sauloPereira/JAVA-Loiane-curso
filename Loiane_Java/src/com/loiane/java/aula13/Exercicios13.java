package com.loiane.java.aula13;

import java.util.Scanner;

public class Exercicios13 {

	public static void main(String[] args) {
		
		int numero, numero2;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite um n�mero: ");
		numero = input.nextInt();
		
		System.out.println ("O n�mero informado foi: " + numero);
		
		System.out.print ("Digite outro n�mero: ");
		numero2 = input.nextInt();
		
		System.out.println ("O n�mero informado foi: " + numero2);
		
		System.out.println ("A soma dos n�meros = " + (numero + numero2));
		
		
	}

}
