package com.loiane.java.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 0;
		int max = 10;
		
		while (i < max){
			i++;
			System.out.println ("Valor i: " + i);
		}
		
		do{
			i++;
			System.out.println ("Valor i: " + i);
		}
		while (i < 15);
		
		System.out.println ("Valor i: " + i);

	}

}
