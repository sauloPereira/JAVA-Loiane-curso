package com.loiane.java.aula36;

public class Aluno {
	
	private String nome;
	private String matricula;
	private int notas[];
	
	public Aluno() {}

	public Aluno(String nome, String matricula, int[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public String obterInfo(){
		String info = "\nNome aluno: " +nome+ " ;";
		info += "Matricula: " +matricula+ " ;";
		info += "Notas: ";
		
		int soma = 0;
		for (int nota : notas){
			soma += nota;
			info += nota + "  ";
			
		}
		double media = soma / 4;
		info += "\n" + "Media: " + media + "  -  ";
		
		if (media >= 7){
			info += "Aprovado";
		}
		else {
			info += "Reprovado";
		}
		
		return info;
	}
	
	public double obterMedia(){
		int soma = 0;
		for (int nota : notas){
			soma += nota;
		}
		
		return soma / 4;
		
	}
}
