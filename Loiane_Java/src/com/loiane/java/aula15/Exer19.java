package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		boolean valida = true;
		double resultado = 0;
		
		System.out.println ("Informe dois números: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println ("Escolha uma operação matemática: ");
		System.out.println ("(+) - Soma  (-) - Subtração  (*) - Multiplicação  (/) - Divisão");
		String operac = input.next();
		
		switch (operac){
			case "+": resultado = num1 + num2;
				System.out.println (num1 + " + " + num2 + " = " + resultado); break;
			case "-": resultado = num1 - num2;
				System.out.println (num1 + " - " + num2 + " = " + resultado); break;
			case "*": resultado = num1 * num2;
				System.out.println (num1 + " * " + num2 + " = " + resultado); break;
			case "/": resultado = num1 / num2;
				System.out.println (num1 + " / " + num2 + " = " + resultado); break;
			default: System.out.println ("---Inválido!---"); valida = false;
				
		}
		
		if (valida){
			System.out.println ("Resultado : " + resultado);
		
			if (resultado % 2 == 0){
				System.out.println ("PAR");
			}
			else {
				System.out.println ("IMPAR");
			}
			
			if (resultado > 0){
				System.out.println ("Positivo");
			}
			else if (resultado < 0){
				System.out.println ("Negativo");
			}
			else {
				System.out.println ("Nulo");
			}
			
		}	
		
	}

}
