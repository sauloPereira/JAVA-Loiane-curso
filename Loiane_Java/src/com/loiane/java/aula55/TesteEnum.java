package com.loiane.java.aula55;

import com.loiane.java.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (int i = 0; i < dias.length; i++){
			System.out.println(dias[i]);
		}
		// for melhorado
		for (DiaSemana d : DiaSemana.values()){
			//System.out.println(d.values()); local memoria
			System.out.println(d);
		}
		
	}

}