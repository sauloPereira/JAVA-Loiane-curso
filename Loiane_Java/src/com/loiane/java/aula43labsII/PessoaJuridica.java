package com.loiane.java.aula43labsII;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public double calcularImposto() {
		
		return this.getRendaBruta() * 0.1;
		//Outra forma
		//(this.getRendaBruta() / 100) * 10;
	}
	
	@Override
	public String toString() {
		String s = "*** Pessoa Júridica ***\n";
		s += super.toString();
		s += " | CNPJ: " + cnpj;
		s += " | Imposto a ser pago: R$ " + calcularImposto();
		
		return s;
	}
	
}
