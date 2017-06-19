package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer07 {
	
	public static void main (String [] args){
		
		double base, altura, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Informe o valor do 1º lado: ");
		base = input.nextDouble();
		
		System.out.println ("Informe o valor do 2] lado: ");
		altura = input.nextDouble();
		
		/* Area = lado * lado
		 * 
		 * area = Math.pow (lado, 2);
		 */
		area = base * altura;
		System.out.println ("A AREA do quadrado é: " + area);
		System.out.println ("A AREA do quadrado 2X: " + (area * 2));
		
	}
	

}
