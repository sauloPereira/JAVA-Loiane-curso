package com.loiane.java.aula15;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite 1º número: ");
		int num1 = input.nextInt();
		
		System.out.print ("Digite 2º número: ");
		int num2 = input.nextInt();
		
		if (num1 > num2){
			System.out.println (num1);
		}
		else {
			System.out.println (num2);
		}

	}

}
