package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		double valorHora, horasMes, salarioBruto, impostoRenda, inss, sindicato,
		descontos, salarioLiquido;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Valor da hora: R$ ");
		valorHora = input.nextDouble();
		
		System.out.print ("Numero de horas no mês: "); //Ex: 176
		horasMes = input.nextDouble();
		
		salarioBruto = valorHora * horasMes;
		System.out.println ("Sálario Bruto: R$ " + salarioBruto);
		
		impostoRenda = salarioBruto * 11 / 100;
		//System.out.println ("Valor de IR: R$ " + impostoRenda);
		
		inss = salarioBruto * 8 / 100;
		System.out.println ("Valor de INSS R$ " + inss + "D");
		
		sindicato = salarioBruto * 5 / 100;
		System.out.println ("Valor de sindicato R$ " + sindicato + "D");
		
		descontos = (impostoRenda + inss + sindicato);
		System.out.println ("Total de descontos: R$ " + descontos + "D");
		
		salarioLiquido = salarioBruto - descontos;
		System.out.println ("Sálario Liquido: R$ " + salarioLiquido);
		
		
	}

}
