package com.loiane.java.aula15;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Digite um numero para o dia da semana de 1 - 7: ");
		int dia = input.nextInt();
		
		switch (dia) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Ter�a"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("S�bado"); break;
			default: System.out.println("N�o � valido!"); 
		}
		
		switch (dia) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: System.out.println ("Dias Ute�s!"); break;
			case 1:
			case 7: System.out.println ("Fim de semana!"); break;
			default: System.out.println ("Null");
		
		}

	}

}
