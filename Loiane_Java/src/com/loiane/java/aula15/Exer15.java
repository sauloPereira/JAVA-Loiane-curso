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
			System.out.println ("Lados V�lidos!!!");
		
			if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2){
				System.out.println (" Tri�ngulo Equilat�ro!");
				
			}
			else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
				System.out.println (" Tri�ngulo Escaleno!");
				
			}
			else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
				System.out.println (" Tri�ngulo Is�sceles!");
				
			}
			

		}
		
		else {
			System.out.println ("N�o � Tri�ngulo!!!");
			
		}
		
	}

}
