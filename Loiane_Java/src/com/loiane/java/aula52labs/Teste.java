package com.loiane.java.aula52labs;

import java.util.Scanner;
//IMCOMPLETO
public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while (opcao != 3){
			opcao = obterOpcaoMenu(input);
			
			if (opcao == 1){
				consultarContato(input, agenda);
			}
			else if (opcao == 2){
				addContato(input, agenda);
			}
			else if (opcao == 3){
				System.exit(0);//somente usado emprojetos desktop
			}
		}

	}
	
	public static void consultarContato(Scanner input, Agenda agenda){
		String nomeContato = lerInformacaoString(input, "Informe o nome do contato para consulta: \n");
		try {
			if (agenda.consultarContato(nomeContato) >= 0){
				System.out.println("Contato existe");
				
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void addContato(Scanner input, Agenda agenda){
		try {
			System.out.println("Adicionar Contato");
			String nome = lerInformacaoString(input, "Nome: ");
			String tel = lerInformacaoString(input, "\nTelefone: ");
			String email = lerInformacaoString(input, "\nE-mail: ");
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(tel);
			contato.setEmail(email);
			
			System.out.println("Contato a ser criado: ");
			System.out.println(contato);
			
				agenda.adicionarContato(contato);
		} 
		catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			System.out.println("Contatos da Agenda");
			System.out.println(agenda);
		}

	}
	
	public static String lerInformacaoString(Scanner input, String msg){
		System.out.println(msg);
		String entrada = input.nextLine();
		
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner input){
		boolean entradaValida = false;
		int opcao = 3;
		
		while (!entradaValida){
			System.out.println("Digite a op��o desejada:");
			System.out.println("1 - Consultar Contato");
			System.out.println("2 - Add Contato");
			System.out.println("3 - sair");
			
			try {
				String entrada = input.nextLine();
				opcao = Integer.parseInt(entrada);//Convertendo String em int
				
				if (opcao == 1 || opcao == 2 || opcao == 3){
					entradaValida = true;
					
				}
				else {
					throw new Exception("Entrada invalida");
				}
				
			}
			catch (Exception e){
				System.out.println("Entrada invalida, digite novamente\n");
			}
		}
		return opcao;
	}

}