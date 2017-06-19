package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		boolean valida = true;
		double resultado = 0;
		
		System.out.println ("Informe dois n�meros: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println ("Escolha uma opera��o matem�tica: ");
		System.out.println ("(+) - Soma  (-) - Subtra��o  (*) - Multiplica��o  (/) - Divis�o");
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
			default: System.out.println ("---Inv�lido!---"); valida = false;
				
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
