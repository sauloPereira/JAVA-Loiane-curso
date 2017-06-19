package com.loiane.java.aula52labs;

public class Agenda {
	
	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[5];
		
		
	}
	
	public boolean adicionarContato(Contato c) throws AgendaCheiaException{
		//Verificando se agenda esta cheia e posi��es
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++){
			if (contatos[i] == null){
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if (cheia){
			//Lan�ar uma exception
			throw new AgendaCheiaException();
			
		}
		
		return false;
	}
	
	public int consultarContato(String nome) throws ContatoNaoExisteException{
		
		for (int i = 0; i < contatos.length; i++){
			if (contatos[i] != null){
				if (contatos[i].getNome().equalsIgnoreCase(nome)){
					
					return i;
				}
			}
		}
		//lan�ar exception contato n�o existe
		throw new ContatoNaoExisteException(nome);
		
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos){
			if (c != null) {
				s += c.toString() + "\n";
			
			}
		}
		return s;
	}

}