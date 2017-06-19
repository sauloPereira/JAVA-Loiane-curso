package com.loiane.java.aula42;

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
		//this.curso = curso;
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
	/*public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: ";
		s += this.getEndereco();
		
		return s;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do Aluno: ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	*/
}
