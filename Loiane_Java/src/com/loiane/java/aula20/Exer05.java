package com.loiane.java.aula20;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][8];
		boolean sair = false;
		byte opcao;
		
		while (!sair){
			System.out.println("Digite 1 para add compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Didgite 0 para sair.");
			
			opcao = input.nextByte();
			
			if (opcao == 1){// add compromisso
				
				int mes = 0;
				boolean mesValido = false;
				
				while (!mesValido){
					System.out.println("Informe o mês:");
					mes = input.nextInt();
					
					if (mes > 0 && mes <= 12){
						mesValido = true;
					}
					else {
						System.out.println("Mês Inválido");
					}
				}
				
				int dia = 0;
				boolean diaValido = false;
				
				while (!diaValido){
					System.out.println("Informe o dia do mês:");
					dia = input.nextInt();
					
					if (dia > 0 && dia <= 31){
						diaValido = true;
					}
					else {
						System.out.println("Dia Inválido");
					}
				}
				
				int hora = 0;
				boolean horaValida = false;
				
				while (!horaValida){
					System.out.println("Informe a hora:");
					hora = input.nextInt();
					
					if (hora >= 0 && hora <= 8){
						horaValida = true;
					}
					else {
						System.out.println("Hora Inválida");
					}
				}
				
				mes--;
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[mes][dia][hora] = input.next();
				
			}
			else if (opcao == 2){// Verificar compromisso
				
				int mes = 0;
				boolean mesValido = false;
				
				while (!mesValido){
					System.out.println("Informe o mês:");
					mes = input.nextInt();
					
					if (mes > 0 && mes <= 12){
						mesValido = true;
					}
					else {
						System.out.println("Mês Inválido");
					}
				}
				
				int dia = 0;
				boolean diaValido = false;
				
				while (!diaValido){
					System.out.println("Informe o dia do mês:");
					dia = input.nextInt();
					
					if (dia > 0 && dia <= 31){
						diaValido = true;
					}
					else {
						System.out.println("Dia Inválido");
					}
				}
				
				int hora = 0;
				boolean horaValida = false;
				
				while (!horaValida){
					System.out.println("Informe a hora:");
					hora = input.nextInt();
					
					if (hora > 0 && hora <= 8){
						horaValida = true;
					}
					else {
						System.out.println("Hora Inválida");
					}
				}
				
				mes--;
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[mes][dia][hora]);
				
			}
			else if (opcao == 0){
				sair = true;
			}
			else {
				System.out.println("Inválido");
			}	
		}
	}
}
