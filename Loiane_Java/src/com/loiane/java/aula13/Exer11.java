package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		int numero1, numero2, produto;
		double real, soma, aoCubo;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite n�mero inteiro: ");
		numero1 = input.nextInt();
		
		System.out.print ("Digite mais um n�mero inteiro: ");
		numero2 = input.nextInt();
		
		System.out.print ("Digite um numero Real: ");
		real = input.nextDouble();
		
		produto = (2 * numero1) / (numero2 / 2);
		System.out.println ("O dobro do 1� dividido pela metade do 2�: " + produto);
		
		soma = 3 * numero1 + real;
		System.out.println ("O triplo do 1� somado com o 3�: " + soma);
		
		aoCubo = real * real * real;
		System.out.println ("O 3� ao cubo: " + aoCubo);

	}

}
