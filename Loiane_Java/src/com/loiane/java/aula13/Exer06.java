package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		double area, raio;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Informe o RAIO do circulo: ");
		raio = input.nextDouble ();
		
		//area = 3.14 * (raio * raio);
		area = Math.PI * Math.pow (raio, 2);
		
		System.out.println ("A AREA do circulo é: " + area);

	}

}
