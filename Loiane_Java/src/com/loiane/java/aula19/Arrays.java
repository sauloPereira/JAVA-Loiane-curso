package com.loiane.java.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 33.1;
		// Para 365 dia do ano seria 365 variaveis a declarar.
		
		//Iniciando ARRAY.
		//declarando
		double[] temp = new double[365];
		//Acessando arrays
		temp[0] = 31.3;
		temp[1] = 32;
		temp[2] = 33.7;
		temp[3] = 33.1;
		
		//Imprimindo
		System.out.println("O valor da temperatura do dia 3 é: " + temp[2]);

		//Para saber o tamanho de espacos do array.
		System.out.println("O tamanho do array: " + temp.length);
		
		//Para saber os valores do array(endereco na memoria)
		System.out.println("Valores do array: " + temp);
		
		// Para saber os valores no array
		for (int i = 0; i <= temp.length; i++){
			System.out.println("O valor da temperatura no " + (i+1) + "º dia: " + temp[i]);
			
		}
		
		//FOR MELHORADO
		for (double tp : temp){
			System.out.println(tp);
		}
		
	}

}
