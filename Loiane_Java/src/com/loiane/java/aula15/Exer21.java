package com.loiane.java.aula15;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double precoGa = 2.5;
		double precoAl = 1.9;
		double total = 0;
		double totalDesc = 0;
		int desconto = 0;
		
		
		System.out.print("Informe A - álcool e G - gasolina: ");
		String combustivel = input.next();
		
		System.out.print ("Informe a quantidade de Litros: ");
		double quantidade = input.nextDouble();
		
		if (combustivel.equalsIgnoreCase("a")){
			if (quantidade <= 20){
				desconto = 3;
				System.out.println ("Percentual de desconto: 3%");
			}
			else {
				desconto = 5;
				System.out.println ("Percentual de desconto: 5%");
			}
			
			total = precoAl * quantidade; 
			
		}
		else if (combustivel.equalsIgnoreCase("g")){
			if (quantidade <= 20){
				desconto = 4;
				System.out.println ("Percentual de desconto: 4%");
			}
			else {
				desconto = 6;
				System.out.println ("Percentual de desconto: 6%");
			}
			
			total = precoGa * quantidade;
			
		}
		else if ((combustivel != "a") || (combustivel != "g")){
		System.out.println ("Invalído!");
		}
		
		totalDesc = (total / 100) * desconto;
		System.out.println ("Total desconto: R$ " + totalDesc);
		
		double precoAPagar = total - totalDesc;
		System.out.println ("Valor a ser pago: R$ " + precoAPagar);
		
		
	}

}
