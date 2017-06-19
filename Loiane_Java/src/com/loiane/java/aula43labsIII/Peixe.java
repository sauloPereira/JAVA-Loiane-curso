package com.loiane.java.aula43labsIII;

public class Peixe extends Animal {
	
	private String caracteristica;
	
	
	public Peixe() {
		super();
		this.setNumPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzento");
		this.caracteristica = "Barbatanas e cauda";
		
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristica: " + caracteristica;
		
		return s;
	}
	
}
