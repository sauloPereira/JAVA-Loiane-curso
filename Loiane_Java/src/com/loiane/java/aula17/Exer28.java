package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero para saber se o mesmo � primo: ");
		int num = input.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				System.out.println("N�o � Primo - divisivel por: "  + i);
				primo = false;
			}
			
		}
		if (primo){
			System.out.println("N�mero primo");
		}

	}

}
