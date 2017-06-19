package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double hora, quantidade, salarioBruto, ir = 0, inss, fgts, sindicato, salario, descontos;
		
		System.out.print ("Valor da hora de trabalho: R$ ");
		hora = input.nextDouble();
		
		System.out.print ("Quantidade de horas no mês: ");
		quantidade = input.nextDouble();
		
		
		salarioBruto = (hora * quantidade);
		System.out.println ("Salario Bruto     : R$ " + salarioBruto);
		
		sindicato = salarioBruto * 3 / 100;
		System.out.println ("Sindicato (3%)    : R$ " + sindicato + " D");
		
		if (salarioBruto <= 900){
			ir = 0;
			System.out.println ("IR                : (Isento)");
		}
		else if (salarioBruto > 900 && salarioBruto <= 1500){
			ir = salarioBruto * 5 / 100;
			System.out.println ("IR (5%)           : R$ " + ir + " D");
		}
		else if (salarioBruto > 1500 && salarioBruto <= 2500){
			ir = salarioBruto * 10 / 100;
			System.out.println ("IR (10%)          : R$ " + ir + " D");
		}
		else if (salarioBruto > 2500){
			ir = salarioBruto * 20 / 100;
			System.out.println ("IR (20%)          : R$ " + ir + " D");
		}
		
		inss = salarioBruto * 10 / 100;
		System.out.println ("INSS (10%)        : R$ " + inss + " D");
		
		fgts = salarioBruto * 11 / 100;
		System.out.println ("FGTS (11%)        : R$ " + fgts);
		

		descontos = ir + inss + sindicato;
		System.out.println ("Total de Descontos: R$ " + descontos + " D");
		
		salario = salarioBruto + descontos;
		System.out.println ("Salário Liquido   : R$ " + salario);


	}

}
