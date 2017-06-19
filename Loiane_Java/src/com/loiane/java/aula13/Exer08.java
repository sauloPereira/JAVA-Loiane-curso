package com.loiane.java.aula13;
import java.util.Scanner;


public class Exer08 {
	
	public static void main (String[]Args){
		
		double hora, horasPorDia, salario;
		int diasPorSemanas, semanas;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Qual o valor da Hora trabalhada: ");
		hora = input.nextDouble();
		
		System.out.print ("Informe a quantidade de horas por dia: ");
		horasPorDia = input.nextDouble();
		
		System.out.print ("Informe a quantidade de dias por semana: ");
		diasPorSemanas = input.nextInt();
		
		System.out.print ("Quantidade de semanas: ");
		semanas = input.nextInt();
		
		salario = hora * horasPorDia * diasPorSemanas * semanas;
		System.out.println ("Valor do salário: R$ " + salario);
		
		
	}

}
