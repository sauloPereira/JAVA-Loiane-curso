package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double salario, reajuste, novoSalario;
		
		System.out.print ("Informe sálario atual: R$ ");
		salario = input.nextDouble();
		
		if (salario <= 280){
			reajuste = salario * 20 / 100;
			novoSalario = reajuste + salario;
			System.out.println ("Seu salario R$ " + salario + 
					" terá 20% de aumento R$ " + reajuste + " Salario atual R$ " + novoSalario);
		}
		else if (salario > 280 && salario <= 700){
			reajuste = salario * 15 / 100;
			novoSalario = reajuste + salario;
			System.out.println ("Seu salario R$ " + salario + 
					" terá 15% de aumento R$ " + reajuste + " Salario atual R$ " + novoSalario);
		}
		else if (salario > 700 && salario <= 1500){
			reajuste = salario * 10 / 100;
			novoSalario = reajuste + salario;
			System.out.println ("Seu salario R$ " + salario + 
					" terá 10% de aumento R$ " + reajuste + " Salario atual R$ " + novoSalario);
		}
		else if (salario > 1500){
			reajuste = salario * 5 / 100;
			novoSalario = reajuste + salario;
			System.out.println ("Seu salario R$ " + salario + 
					" terá 5% de aumento R$ " + reajuste + " Salario atual R$ " + novoSalario);
		}
		
	}

}
