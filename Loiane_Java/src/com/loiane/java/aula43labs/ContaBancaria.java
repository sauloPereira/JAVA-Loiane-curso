package com.loiane.java.aula43labs;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double qntSaque){
		if (saldo >= qntSaque){
			saldo -= qntSaque;
			
			return true;
		}
		
		return false;
	}
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
 
	}
	
	@Override
	public String toString() {
		String s = "Conta Bancaria  [ ";
		s += "Nome Cliente: " + nomeCliente;
		s += "| Numero da Conta: " + numConta;
		s += "| Saldo R$ : " + saldo;
		s += " ]";
		return s;
	}

}
