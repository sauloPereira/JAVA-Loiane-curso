package com.loiane.java.aula13;

import java.util.Scanner;

public class Exercicios13 {

	public static void main(String[] args) {
		
		int numero, numero2;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite um número: ");
		numero = input.nextInt();
		
		System.out.println ("O número informado foi: " + numero);
		
		System.out.print ("Digite outro número: ");
		numero2 = input.nextInt();
		
		System.out.println ("O número informado foi: " + numero2);
		
		System.out.println ("A soma dos números = " + (numero + numero2));
		
		
	}

}
