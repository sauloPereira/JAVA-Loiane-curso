package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("informe o número para saber se e PAR ou IMPAR: ");
		int num = input.nextInt();
		
		if  (num % 2 == 0){
			System.out.println (num + " PAR");
		}
		else {
			System.out.println (num + " IMPAR");
		}

	}

}
