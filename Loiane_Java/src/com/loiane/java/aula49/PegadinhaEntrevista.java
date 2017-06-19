package com.loiane.java.aula49;

public class PegadinhaEntrevista {
// o System.exit(0); - cancela a execu��o do finally
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
				System.exit(0);
			}
			catch (ArrayIndexOutOfBoundsException exception){
				System.out.println("Erro posi��o do array inexistente");
				System.exit(0);
			}
			finally {
				System.out.println("Sempre impressom ap�s try ou catch");
			}
			
		}

	}

}
