package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite o numero correspondente ao dia da semana (1 - 7): ");
		int dia = input.nextInt();
		
		switch (dia){
			case 1: System.out.println (" Domingo"); break;
			case 2: System.out.println (" Segunda"); break;
			case 3: System.out.println (" Ter�a"); break;
			case 4: System.out.println (" Quarta"); break;
			case 5: System.out.println (" Quinta"); break;
			case 6: System.out.println (" Sexta"); break;
			case 7: System.out.println (" S�bado"); break;
			default : System.out.println (" Invalido!");
			
		}

	}

}
