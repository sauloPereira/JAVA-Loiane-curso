package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA < popB){
			
			popA += (popA * 3) / 100;
			popB += (popB * 1.5) / 100;
			cont++;
			
		}
		
		System.out.println ("População A: " + popA);
		System.out.println ("População B: " + popB);
		System.out.println ("Qtd de Anos: " + cont);

	}
 
}
