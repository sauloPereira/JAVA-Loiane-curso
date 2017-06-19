package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		double farenheit, celsius;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Informe a temperatura em Celsius: ");
		celsius = input.nextDouble();
		
		farenheit = celsius * 9/5 + 32;
		System.out.println ("Em Farenheit: " + farenheit + "ºF");
		
	}

}
