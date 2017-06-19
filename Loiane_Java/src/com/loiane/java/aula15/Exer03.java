package com.loiane.java.aula15;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		String sexo;
		
		System.out.print ("Digite F ou M para determinar sexo: ");
		sexo = input.next();
		
		if (sexo.equalsIgnoreCase("f")){
			System.out.println (sexo + " - Feminino");
		}
		else if (sexo.equalsIgnoreCase("m")){
			System.out.println (sexo + " - Masculino");
		}
		else {
			System.out.println (sexo + " - Null!");
		}
		
	}

}
