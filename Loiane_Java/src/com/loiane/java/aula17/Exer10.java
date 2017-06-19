package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer10 {
	// imcompleto O número 1º teve ser menor que o segundo
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Informe 1º número: ");
		int num1 = input.nextInt();
		
		System.out.print ("Informe 2º número: ");
		int num2 = input.nextInt();
		
		if (num1 > num2){
			for (int i = num1; i >= num2; i--){
				System.out.println(i);
			}
		}
		
		else {
			for (int i = num1; i <= num2; i++){
				System.out.println (i);
			}
		}
		
	}

}
