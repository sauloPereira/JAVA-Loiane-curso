package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Fatorial de: ");
		int num = input.nextInt();
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		
		for (int i = num; i > 1; i--){
			fatorial *= i;
			System.out.print(i + " . ");
			
		}
		System.out.print("1 = " + fatorial);

	}

}
