package com.loiane.java.aula17;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Lojas Tabajara");
		
		boolean sair = false;
		String continuarCompra, output;
		int qntProdutos;
		double total;
		
		do {
			System.out.print("Deseja informar uma nova compra? S/N: ");
			continuarCompra = input.next();
			
			if (continuarCompra.equalsIgnoreCase("s")){
				output = "Lojas Tabajara\n";
				
				System.out.print("Digite a quantidade de produtos da compra: ");
				qntProdutos = input.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= qntProdutos; i ++){
					System.out.print("Informe o pre�o " + i + " : - R$ ");
					double valor = input.nextDouble();
					
					total += valor;
					
					output = i + " Produto(s): - R$ " + total + "\n";
					//System.out.println("Produto " + i + " : - R$ " + valor);
				}
				
				output += "Total: - R$ " + total;
				System.out.println(output);
				
				System.out.print("Valor Pago: - R$ ");
				double vlrPago = input.nextDouble();
				
				double troco = vlrPago - total;
				System.out.println("Troco     : - R$ " + troco);
				
			}
			else {
				sair = true;
			}
			
		}
		while (!sair);
		
	}

}
