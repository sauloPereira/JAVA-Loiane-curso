package com.loiane.java.aula43;

import java.util.Arrays;

public class Aluno /*extends Pessoa*/ {
	
	private String curso;
	private double[] notas;
	
	public void verificarAcesso(){
	
		//this.nomeVisibilidade = " ";
		
	}
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String cpf) {
		super();
		//this.setNome(nome);
		
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	
	public double calcularMedia(){
		return 0;
	}
	
	public double verificarAprovado(){
		return 0;	
	}
	// Agora pode ser acessado os atributos da outra classe.
	public void metodoQualquer(){
		//super.setCpf("99999999900");
		
		//this.setCpf("99999999955");
	}
	
	//Mudando comportamento do metodo do Polimorfismo
	//Override Sobreposiçaõ.
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: ";
	//	s += this.getEndereco();
		
		return s;
	}
	/*
	public String toString (){
		String s = curso + "\n";
		for (double nota : notas){
			s += nota + " ";
		}
		return s;
	}
	*/

	@Override
	public String toString() {
		return "Aluno [curso=" + curso +
				", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso.equalsIgnoreCase(other.getCurso())){
			return true;
		}
		return false;
		/*if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
		*/
		
	}
	
	
}
