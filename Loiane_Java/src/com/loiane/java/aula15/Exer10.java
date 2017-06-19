package com.loiane.java.aula15;
import java.util.Scanner;

public class Exer10 {
	
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		
		String turno;
		
		System.out.print ("Informe seu turno (M - matutino, V - vespertino ou N - noturno): ");
		turno = input.next();
		
		switch (turno){
			case "m":
			case "M": System.out.println ("Bom Dia!"); break;
			case "v":
			case "V": System.out.println ("Boa Tarde!"); break;
			case "n":
			case "N": System.out.println ("Boa Noite!"); break;
			default: System.out.println ("Valor Inválido!!!");
		}
		
		
	}
	
}
