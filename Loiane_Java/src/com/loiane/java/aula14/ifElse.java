package com.loiane.java.aula14;
import java.util.Scanner;


public class ifElse {

	public static void main(String[] args) {
		
		double valor;
		
		Scanner input = new Scanner (System.in);
		
		/*barato <= 10
		 * 10 < valor < 15 - pedir desconto
		 * 15 <= valor 17 - pesquisar mais
		 * >= 17 - muito caro
		 */
		
		System.out.print ("Valor: R$ ");
		valor = input.nextDouble();
		
		if (valor <= 10){
			System.out.println ("Está barato!");			
		}
		else if (valor > 10 && valor < 15){
			System.out.println ("Pedir desconto!");
		}
		else if (valor >= 15 && valor < 17){
			System.out.println ("Need more search!");
		}
		else {// valor >= 17
			System.out.println ("MUITO CARO!");
		}

	}

}
