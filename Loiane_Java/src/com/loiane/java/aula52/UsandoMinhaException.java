package com.loiane.java.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0, 2, 4};
		
		for (int i = 0; i < numeros.length; i++){
			try {
				if (numeros[i] % 2 != 0){
					//Lan�ar minha exception
					//throw new Exception("N�mero �mpar, divis�o n�o exata");
					throw new DivisaoNaoExata(numeros[i], denominador[i]);
					
				}
				
				System.out.println(numeros[i] + " / " + denominador[i] + " = " 
						+ (numeros[i]/denominador[i]));
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata exception){
				System.out.println("Ocorreu um erro");
				exception.printStackTrace();
				
			}
			/* este catch referente ao throw new
			catch (Exception exception){
				System.out.println("Ocorreu um erro");
				System.out.println(exception.getMessage());
				
			}*/
			
		}	

	}

}
