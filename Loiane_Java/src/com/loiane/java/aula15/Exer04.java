package com.loiane.java.aula15;
import java.util.Scanner;

public class Exer04 {
	
	public static void main (String[]args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Digite uma letra: ");
		String letra = input.next();
		
		if (letra.length() > 1){
			System.out.println (letra + " - Invalido!!!");
		}
		else {
			switch (letra){
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
				case "A":
				case "E":
				case "I":
				case "O":
				case "U":System.out.println (letra + " - Vogal..."); break;
				case "b":
				case "B":
				case "c":
				case "C":
				case "d":
				case "D":
				case "f":
				case "F":
				case "g":
				case "G":
				case "h":
				case "H":
				case "j":
				case "J":
				case "k":
				case "K":
				case "l":
				case "L":
				case "m":
				case "M":
				case "n":
				case "N":
				case "p":
				case "P":
				case "q":
				case "Q":
				case "r":
				case "R":
				case "s":
				case "S":
				case "t":
				case "T":
				case "v":
				case "V":
				case "w":
				case "W":
				case "x":
				case "X":
				case "y":
				case "Y":
				case "z":
				case "Z":
				case "ç":
				case "Ç": System.out.println (letra + " - Consoante!"); break;
				default: System.out.println (letra + " - Invalido!!!");
		
			}
		
		}
		
	}
	
}
