package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer14 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num = 0, valorPar = 0, valorImpar = 0;
		boolean par;
		
		for (int i = 1; i <= 10; i++){
			System.out.print("Informe " + i + "� n�meros: ");
			num = input.nextInt();
		

			if (num % 2 == 0){
				System.out.println("Par: " + num);
				par = true;
				
				valorPar++;
				
				valorPar += num;
				//System.out.println("Soma dos pares: " + valorPar);
			}
			else {
				par = false;
				System.out.println("Impar: " + num);
				
				valorImpar++;
				
				valorImpar += num;
				//System.out.println("Soma dos impares: " + valorImpar);
			}
				
		}
		
		System.out.println("Soma dos pares: " + valorPar);
		
		System.out.println("Soma dos impares: " + valorImpar);
		
	}

}
