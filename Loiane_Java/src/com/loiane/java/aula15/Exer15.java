package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double lado1, lado2, lado3;
		
		System.out.println ("Informe os lados: ");
		lado1 = input.nextDouble();
		lado2 = input.nextDouble();
		lado3 = input.nextDouble();
		
		
		if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado3 + lado2) > lado1)){
			System.out.println ("Lados Válidos!!!");
		
			if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2){
				System.out.println (" Triângulo Equilatéro!");
				
			}
			else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
				System.out.println (" Triângulo Escaleno!");
				
			}
			else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
				System.out.println (" Triângulo Isósceles!");
				
			}
			

		}
		
		else {
			System.out.println ("Não é Triângulo!!!");
			
		}
		
	}

}
