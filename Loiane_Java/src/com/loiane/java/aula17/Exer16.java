package com.loiane.java.aula17;

public class Exer16 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int prox = 0;
	
		System.out.println(num1);
		System.out.println(num2);
		
		while (prox < 500){
			prox = num1 + num2;
			num1 = num2;
			num2 = prox;
			
			System.out.println(prox);
			
		}

	}

}
