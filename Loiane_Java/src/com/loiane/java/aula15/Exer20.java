package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int cont = 0;

		System.out.println ("Responda S - sim e N - n�o:");
		System.out.println ("Telefonou pra v�tima?");
		String resp1  = input.next();
		
		System.out.println ("Esteve no local do crime?");
		String resp2  = input.next();
		
		System.out.println ("Mora perto da v�tima?");
		String resp3  = input.next();
		
		System.out.println ("Devia para v�tima?");
		String resp4  = input.next();
		
		System.out.println ("J� trabalhou com a v�tima?");
		String resp5  = input.next();
		
		
		
		if (resp1.equalsIgnoreCase("S")){
			cont++;
		
		}
		if (resp2.equalsIgnoreCase("S")){
			cont++;
		
		}
		if (resp3.equalsIgnoreCase("S")){
			cont++;
		
		}
		if (resp4.equalsIgnoreCase("S")){
			cont++;
		
		}
		if (resp5.equalsIgnoreCase("S")){
			cont++;
		
		}
		
		
		if (cont == 2){
			System.out.println ("Suspeito");
		}
		if ((cont == 3) || (cont == 4)) {
			System.out.println ("C�mplice");
		}
		if (cont == 5){
			System.out.println ("Assassino!");
		}
		if (cont < 2){
			System.out.println ("Inocente!");
		}
		
		
		
	}

}
