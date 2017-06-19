package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe as temperaturas: ");
		int qntTemperatura = input.nextInt();
		
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for (int i = 1; i <= qntTemperatura; i++){
			System.out.print("Informe temperatura " + i + ": ");
			double temp = input.nextDouble();
			
			soma += temp;
			
			if (temp > maior) {
				maior = temp;
			}
			if (temp < menor){
				menor = temp;
			}
		}
		System.out.print("M�dia: " + (soma/qntTemperatura) + "\n");
		System.out.print("Menor Temperatura: " + menor + "\n");
		System.out.print("Maior Temperatura: " + maior);

	}

}