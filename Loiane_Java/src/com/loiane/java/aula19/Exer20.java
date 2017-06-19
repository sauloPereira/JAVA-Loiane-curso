package com.loiane.java.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] a = new double[20];
		double cotacao;
		
		System.out.print("Informe a cotação do U$ ");
		cotacao = input.nextDouble();
		
		for (int i = 0; i < a.length; i++){
			a[i] = cotacao * (i+1);
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor A : ");
		for (int i = 0; i < a.length; i++){
			System.out.print(df.format(a[i]) + " - ");
		}
		System.out.println();

	}

}
