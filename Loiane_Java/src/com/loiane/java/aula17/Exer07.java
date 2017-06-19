package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++){
			System.out.print ("Digite um nuúmero: ");
			num = input.nextInt();
			
			if (num > maior){
				maior = num;
			}
			
		}
		
		System.out.println ("O maior número é: " + maior);

	}

}
