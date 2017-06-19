package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número para saber seus primos antecessores: ");
		int num = input.nextInt();
		
		boolean primo;
		
		for (int i = 1; i <= num; i++){
			primo = true;
			
			for (int j = 2; j < i; j++){
				if (i % j == 0) {
					primo = false;
				}
				
			}
			if (primo) {
				System.out.println(i);
			}
			
		}

	}

}
