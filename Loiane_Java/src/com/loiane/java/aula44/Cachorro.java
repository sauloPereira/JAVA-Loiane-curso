package com.loiane.java.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

	private String raca;
	private String tamanho;
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public void emitirSon() {
	
		
	}
	@Override
	public void amamentar() {
		
		
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void chamarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	
}
