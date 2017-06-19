package com.loiane.java.aula13;
import java.util.Scanner;


public class Exer12 {

	public static void main(String[] args) {
		
		double altura, peso;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Informe Altura: ");
		altura = input.nextDouble();
		
		peso = (72.7 * altura) - 58;
		System.out.println ("Peso ideal: " + peso);

	}

}
