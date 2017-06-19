package com.loiane.java.aula34;

public class Calculadora {
	
	public static int soma(int num1, int num2){
		return num1 + num2;
	}
	public static int subtracao(int num1, int num2){
		return num1 - num2;
	}
	public static int multiplica(int num1, int num2){
		return num1 * num2;
	}
	public static int divide(int num1, int num2){
		return num1 / num2;
	}
	public static double potencia(int num1, int num2){
		//return Math.pow(num1, num2);
		int total = num1;
		for (int i = 1; i < num2; i++){
			total = num1;
		}
		return total;
	}
	public static int fatorial(int num){
		if (num == 0){
			return 1;
		}
		int total = 1;
		for (int i = num; i >= 1; i--){
			total *= i;
		}
		return total;
	}
}	