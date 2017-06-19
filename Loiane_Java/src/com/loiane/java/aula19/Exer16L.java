package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer16L {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		int somaMenor = 0, somaMaior = 0;
		int igual = 0, qnt = 0;
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		
		for (int i = 0; i < a.length; i++){
			if (a[i] == 15){
				igual++;
			}
			else if (a[i] < 15){
				somaMenor += a[i];
			}
			else {
				qnt++;
				somaMaior += a[i];
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("Qnt números == 15: " + igual);
		System.out.println("Soma dos menores que 15: " + somaMenor);
		System.out.println("Média números maiores que 15: " + (somaMaior / qnt));
	}

}
