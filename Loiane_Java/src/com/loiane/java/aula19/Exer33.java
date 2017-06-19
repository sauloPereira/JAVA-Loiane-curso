package com.loiane.java.aula19;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int[] a = new int[10];
		boolean primo;
		String msg = "";
		
		for (int i = 0; i < a.length; i++){
			System.out.println("Entre com o valor da posição " + (i+1) + " Vetor A:");
			a[i] = input.nextInt();
		}
		
		for (int i = 0; i < a.length; i++){
			primo = true;
			for (int j = 2; j < a.length; j++){
				if (a[i] % 2 == 0){
					primo = false;
					break;
				}
			}
			
			if (primo){
				msg = " - Primo";
			}
			else {
				msg = " - Não é primo";
			}
			
			System.out.println(a[i] + msg);
		}
		
	}

}
