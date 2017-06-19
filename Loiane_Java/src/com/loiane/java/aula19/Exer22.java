package com.loiane.java.aula19;

import java.util.Scanner;
//pode ser modificador para sorteios.
public class Exer22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		int qnt0 = 0;
		int qnt1 = 0;
		
		for (int i = 0; i < a.length; i++){
			a[i] = (int) Math.round(Math.random() * 1);
			
			if (a[i] == 0){
				qnt0++;
			}
			else {
				qnt1++;
			}
		}
		//10 - 100%
		//qnt - x
		//x = (qnt * 100) / 10
		double porc0 = (qnt0 * 100) / a.length;
		double porc1 = 100 - porc0;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
			
		}
		System.out.print("\nPercentual de 0 = " + porc0);
		System.out.print("\nPercentual de 1 = " + porc1);

	}

}
