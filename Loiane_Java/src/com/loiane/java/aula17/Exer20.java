package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe a quantidade de pessoas: ");
		int n = input.nextInt();
		
		int idade;
		int soma = 0;
		
		for (int i = 0; i < n; i++){
			System.out.println("Entre com idade " + (i+1) +": ");
			idade = input.nextInt();
			
			soma += idade;
		}
		
		double media = soma / n;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		if (media <= 25){
			System.out.println("Turma jovem");
		}
		else if ((media > 25) && (media <= 60)){
			System.out.println("Turma adulta");
		}
		else if (media > 60){
			System.out.println("Turma idosa");
		}
	}
}
