package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Informe os valores:");
		int a = input.nextInt();
		
		if (a == 0){
			System.out.println ("Equação invalida! (a = 0)");
		}
		else {
			int b = input.nextInt();
			int c = input.nextInt();
		
			//Calculo do Delta (b*b -4*a*c)
			double delta = Math.pow (b, 2) - (4 * a * c);
			if (delta < 0){
				System.out.println ("Delta Negativo! Não possui raizes reais.");
				
			}
			else if (delta >= 0){
				System.out.println ("Delta = " + delta);
				
				//Calculo das variaveis (x = -b +- raiz de delta)/2*a
				double x1 = ((-b) + Math.sqrt (delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt (delta)) / (2 * a);
				
				System.out.println ("x1 = " + x1);
				System.out.println ("x2 = " + x2);
				
				if (delta == 0){
					System.out.println ("A equação só tem uma raiz real.  " + delta);
					
				}
				else if (delta > 0){
					System.out.println ("A equação tem duas raizes reais.  " + delta);
					
				}
				
			}
			
		}

	}

}
