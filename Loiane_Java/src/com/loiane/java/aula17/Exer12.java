package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int result = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		
		System.out.print("Informe o número: ");
		int num = input.nextInt();
		
		System.out.print("Tabuada de: " + num + "\n");
				
		for (int i = 1; i <= 10; i++){
			result = num + i;
			result2 = num - i;
			result3 = num * i;
			result4 = num / i;
			System.out.println (num + " + " + i + " = " + result);
			System.out.println (num + " - " + i + " = " + result2);
			System.out.println (num + " x " + i + " = " + result3);
			System.out.println (num + " / " + i + " = " + result4);
		}
		

	}

}
