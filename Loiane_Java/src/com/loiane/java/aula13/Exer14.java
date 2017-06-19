package com.loiane.java.aula13;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		double tamanhoMB, velocidadeMbps, tempo;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Tamanho do arquivo em MB: "); // 1Mb = 1048576 bytes ou (* 1024) para chegar em KB
		tamanhoMB = input.nextDouble();
		
		System.out.print ("Velocidade do link Mbps: ");
		velocidadeMbps = input.nextDouble();
		
		tamanhoMB = tamanhoMB * 1024;
		//System.out.println ("Kb: " + tamanhoMB);
		
		velocidadeMbps = velocidadeMbps * 10;
		//System.out.println ( velocidadeMbps);
		
		tempo = (tamanhoMB / velocidadeMbps);
		System.out.println ("Tempo aproximado do download: " + tempo / 60 + " min");
		

	}

}
