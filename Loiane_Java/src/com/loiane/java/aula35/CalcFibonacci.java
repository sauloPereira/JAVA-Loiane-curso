package com.loiane.java.aula35;

public class CalcFibonacci {
	
	public static int fibonacci(int num){
		if (num < 2){
			return 1;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
