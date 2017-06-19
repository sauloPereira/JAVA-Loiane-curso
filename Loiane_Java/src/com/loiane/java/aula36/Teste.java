package com.loiane.java.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//criar objecto endereco
		//Relacionamento tem -um endereço
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNum("n/a");
		end.setComplemento("-");
		end.setCidade("Kings landing");
		end.setEstado("Westeros");
		end.setCep("99999-99");
		//setando a classe endereço
		contato.setEndereco(end);
		//Relacionamento tem - um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("85");
		telefone.setNumero("9999-9999");
		//setando a classe telefone
		//contato.setTelefone(telefone);
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("85");
		telefone2.setNumero("8888-9999");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		//Nesta forma imprime apenas o endereço de memoria
		//System.out.println(contato.getEndereco());
		
		//Nesta forma pode se ter erro excption pelos metodos nullos
		//System.out.println(contato.getEndereco().getCidade());
		if (contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getCidade());
		}
		/*Com o uso do "&&" as duas condições tem que ser true.
		if (contato != null && contato.getTelefone() != null){
			System.out.println(contato.getTelefone().getDdd() + " "
					+ contato.getTelefone().getNumero());
		}
		*/
		if (contato != null && contato.getTelefones() != null){
			for (Telefone t : contato.getTelefones()){
				System.out.println(t.getDdd() + " " + t.getNumero());
				
			}
			
		}

	}

}
