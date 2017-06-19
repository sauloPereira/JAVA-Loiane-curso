package com.loiane.java.aula36;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o nome da agenda");
		String nome = input.nextLine();
		
		Agenda agenda = new Agenda(nome);//ou
		//Agenda agenda = new Agenda();
		//agenda.setNome(nome);
		ContatoAgenda[] contatos = new ContatoAgenda[3];
		System.out.println("Informe 3 contatos:");
		for (int i = 0; i < contatos.length; i++){
			ContatoAgenda c = new ContatoAgenda();
			
			System.out.println("Informe o nome:");
			nome = input.nextLine();
			c.setNome(nome);
			
			System.out.println("Informe o telefone:");
			String telefone = input.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Informe o email:");
			String email = input.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		
		if (agenda != null){
			System.out.println(agenda.obterInfo());
		}
		
	}

}
