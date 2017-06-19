package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer09 {
	
	public static void main (String [] args){
		
		double farenheit, celsius;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Informe a temperatura Fº: ");
		farenheit = input.nextDouble();
		
		celsius = (5 * (farenheit - 32)/9);
		System.out.print ("Em Celsius: " + celsius + "ºC");
		
	}
	
}
