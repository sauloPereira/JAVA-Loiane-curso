package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		 int nota1, nota2, nota3, nota4, media;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println ("Digite notas bimestrais: ");
		 nota1 = input.nextInt();
		 nota2 = input.nextInt();
		 nota3 = input.nextInt();
		 nota4 = input.nextInt();
		 
		 media = (nota1 + nota2 + nota3 + nota4)/4;
		 System.out.print ("Sua média é: " + media);

	}

}
