package com.loiane.java.aula48;

public class MultiplosCatch {
// como capturar varias exception
	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++){
			try {
				System.out.println(numeros[i] + " / " + denominador[i] + " = " 
						+ (numeros[i]/denominador[i]));
			}
			catch (ArithmeticException exception){
				System.out.println("Erro ao dividir por 0");
			}
			catch (ArrayIndexOutOfBoundsException exception){
				System.out.println("Erro posi��o do array inexistente");
			}
			
		}

	}

}
