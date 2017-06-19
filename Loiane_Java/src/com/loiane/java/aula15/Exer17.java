package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite o ano: ");
		int ano = input.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println (ano + "  Ano Bissesto");
	
		} 
		else {
			System.out.println (ano + "  Ano Comun...");
			
		}

	}

}
