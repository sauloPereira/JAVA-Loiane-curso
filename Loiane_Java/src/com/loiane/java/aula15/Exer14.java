package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double nota1, nota2, media;
		
		System.out.print ("Informe 1º nota: ");
		nota1 = input.nextDouble();
		
		System.out.print ("Informe 2º nota: ");
		nota2 = input.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 9){
			System.out.println ("1º nota: " + nota1 + "   2º nota: " + nota2 + "   Média Geral : " + media + " .Conceito de Aproveitamento : A");
			System.out.println (" Aprovado!");
		}
		else if (media < 9 && media >= 7.5){
			System.out.println ("1º nota: " + nota1 + "   2º nota: " + nota2 + "   Média Geral : " + media + " ,Conceito de Aproveitamento : B");
			System.out.println (" Aprovado!");
		}
		else if (media < 7.5 && media >= 6){
			System.out.println ("1º nota: " + nota1 + "   2º nota: " + nota2 + "   Média Geral : " + media + " ,Conceito de Aproveitamento : C");
			System.out.println (" Aprovado!");
		}
		else if (media < 6 && media >= 4){
			System.out.println ("1º nota: " + nota1 + "   2º nota: " + nota2 + "   Média Geral : " + media + " ,Conceito de Aproveitamento : D");
			System.out.println (" Reprovado!");
		}
		else if (media < 4){
			System.out.println ("1º nota: " + nota1 + "   2º nota: " + nota2 + "   Média Geral : " + media + " ,Conceito de Aproveitamento : E");
			System.out.println (" Reprovado!");
		}
		
	}

}
