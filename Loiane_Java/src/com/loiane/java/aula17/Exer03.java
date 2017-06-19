package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String nome;
		String sexo;
		String estCivil;
		int idade = 0;
		double salario = 0;
		boolean valido = false;
		
		do {
			System.out.print ("Digite nome: ");
			nome = input.next();
			
			if (nome.length() >= 3){
				valido = true;
			}
			else {
				System.out.println ("Nome deve ter mais de 3 caracteres...");
			}
		}
		while (!valido);
		
		valido = false;
		
		do {
			System.out.print ("Informe idade: ");
			idade = input.nextInt();
			if (idade <= 150){
				valido = true;
			}
			else {
				System.out.println ("Idade Inv�lida!");
			}
		}
		while (!valido);
		
		valido = false;
		
		do{
			System.out.print ("Informe S�lario: R$ ");
			salario = input.nextDouble();
			if (salario > 0){
				valido = true;
			}
			else {
				System.out.println ("S�lario Inv�lido!!");
			}
		}
		while (!valido);
		
		valido = false;
			
		do{
			System.out.print ("Informe sexo (F) - Feminino ou"
					+ " (M) - Masculino: ");
			sexo = input.next();
			if (sexo.equalsIgnoreCase("f") || 
					sexo.equalsIgnoreCase("m")){
				valido = true;
			}
			else {
				System.out.println ("Sexo Inv�lido!");
			}
		}
		while (!valido);
		
		valido = false;
		
		do {
			System.out.print ("Informe estado c�vil (S) solteiro/"
					+ "(C) casado/ (V) viuvo/ (D) desquitado: ");
			estCivil = input.next();
			if (estCivil.equalsIgnoreCase("s") || 
					estCivil.equalsIgnoreCase("c") ||
					estCivil.equalsIgnoreCase("v") ||
					estCivil.equalsIgnoreCase("d")){
				valido = true;
			}
			else {
				System.out.println("Estado C�vl Inv�lido!");
			}
		}
		while (!valido);
		
		System.out.println("Informa��es Coletadas:");
		System.out.println("Nome        : " + nome);
		System.out.println("Idade       : " + idade);
		System.out.println("Sal�rio     : R$ " + salario);
		System.out.println("Sexo        : " + sexo);
		System.out.println("Estado C�vil: " + estCivil);

	}

}
