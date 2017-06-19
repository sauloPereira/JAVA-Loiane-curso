package com.loiane.java.aula15;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double valor;
		
		System.out.print ("Digite um valor: ");
		valor = input.nextDouble();
		
		if (valor > 0){
			System.out.println ("Valor positivo!: " + valor);
		}
		else if (valor < 0) {
			System.out.println ("Valor negativo!: " + valor);
		}
		else {
			System.out.println ("Valor nulo!: " + valor);
		}

	}

}
