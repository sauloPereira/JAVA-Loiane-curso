package com.loiane.java.aula43labsII;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if (renda <= 1400){
			return 0;
		}
		if (renda > 1400 && renda <= 2100){
			return (renda * 0.1) - 100;
		}
		if (renda > 2100 && renda <= 2800){
			return (renda * 0.15) - 270;
		}
		if (renda > 2800 && renda <= 3600){
			return (renda * 0.25) - 500;
		}
		// if > 3600
		return (renda * 0.30) - 700;
	}
	
	@Override
	public String toString() {
		String s = "*** Pessoa F�sica ***\n";
		s += super.toString();
		s += " | CPF: " + cpf;
		s += " | Imposto a ser pago: R$ " + calcularImposto();
		
		return s;
	}
	
}
