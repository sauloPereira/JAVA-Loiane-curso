package com.loiane.java.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int[] a = new int[10];
		float[] b = new float[a.length];
		double[] c = new double[a.length];
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		for (int i = 0; i < b.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor B:");
			b[i] = input.nextInt();
			
			c[i] = a[i] / b[i];
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor C = ");
		for (int i = 0; i < c.length; i++){
			System.out.print(df.format(c[i]) + " ");
		}
		System.out.println();
	}

}
