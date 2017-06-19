package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		boolean log = false;
		
		do{
			System.out.println ("Digite nome de usuario:");
			String usuario = input.next();
				
			System.out.println ("Digite senha:");
			String senha = input.next();
			
			if (usuario.equalsIgnoreCase(senha)){
				log = false;
				System.out.println ("Usuario igual a senha, Invalido!!!:");
				
			}
			else {
				log = true;
				System.out.println ("Logado");
			}
		
		}
		while (!log);
	}

}
