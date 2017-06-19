package com.loiane.java.aula33;

public class Lampada {
	
	private String modelo;
	private String tensao;
	private String tipoLuz;
	private String cor;
	private int potencia;
	private int garatiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	//Construtor vazio
	//por convenção JAVA atributos / construtores / metodos
	public Lampada() {
		
	}
	//Construtor com atributos
	public Lampada(String modelo, String tensao, String tipoLuz, String cor, int potencia, int garatiaMeses,
			String[] tipos, boolean tipoAbajur, boolean ligada) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.tipoLuz = tipoLuz;
		this.cor = cor;
		this.potencia = potencia;
		this.garatiaMeses = garatiaMeses;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}



	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getGaratiaMeses() {
		return garatiaMeses;
	}
	public void setGaratiaMeses(int garatiaMeses) {
		this.garatiaMeses = garatiaMeses;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public void ligar(){
		setLigada(true);
	}
	public void desligar(){
		setLigada(false);
	}
	public void mudarEstado(){
		if (isLigada()){
			desligar();
			//System.out.println("Lampada ligada.");
		}
		else {
			ligar();
			//System.out.println("Lampada desligada.");
		}
	}
	public void mostrarEstado(){
		if (isLigada()){
			System.out.println("Lampada ligada.");
		}
		else {
			System.out.println("Lampada desligada.");
	
		}
	}

}
