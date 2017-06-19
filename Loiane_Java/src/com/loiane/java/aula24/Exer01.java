package com.loiane.java.aula24;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garatiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		//atribuição para arrays
		//Arrays são objetos por isso precisasse alocar espaço na memoria
		//para começar a usa-los
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lâmpiões";
		
	}

}
