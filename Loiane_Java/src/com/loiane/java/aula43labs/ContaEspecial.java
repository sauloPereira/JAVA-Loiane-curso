package com.loiane.java.aula43labs;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	private boolean isEspecial;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isEspecial() {
		return isEspecial;
	}

	public void setEspecial(boolean isEspecial) {
		this.isEspecial = isEspecial;
	}

	@Override
	public boolean sacar(double qntSaque) {
		double saldoComLimite = this.getSaldo() + limite;
		if ((saldoComLimite - qntSaque) >= 0){
			this.setSaldo(this.getSaldo() - qntSaque);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String s = " Conta Especial [ ";
		s = "Limite Especial: R$ " + limite;
		s = super.toString();
		s = " ]";
		return s;
	}
	
	
}
