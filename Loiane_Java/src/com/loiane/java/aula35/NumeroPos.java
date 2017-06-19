package com.loiane.java.aula35;

public class NumeroPos {
	
	public static int somatorio(int num){
		
		for (int i = 1; i < num; i++){
			System.out.println(i);
		}
		return num;
	}
	
	public static int Numeros(int num){
		if (num == 1){
			return 1;
		}
		return num + Numeros(num - 1);
	}
	
}