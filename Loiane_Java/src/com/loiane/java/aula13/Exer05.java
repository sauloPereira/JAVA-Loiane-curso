package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		double centimetros, metros;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Metros: ");
		metros = input.nextDouble();
		
		centimetros = metros * 100;
		System.out.println ("Valor em centimetros: " + centimetros);
		
	}

}
