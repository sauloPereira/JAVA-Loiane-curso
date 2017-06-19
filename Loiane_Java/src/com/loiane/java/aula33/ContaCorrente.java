package com.loiane.java.aula33;

public class ContaCorrente {
	
	private String num;
	private String agencia;
	private boolean especial;
	private double saldo;
	private double limiteEspecial;
	private double saldoAtual;
	
	public ContaCorrente() {}

	public ContaCorrente(String num, String agencia, boolean especial,
			double saldo, double limiteEspecial,double saldoAtual) {
		this.num = num;
		this.agencia = agencia;
		this.especial = especial;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
		this.saldoAtual = saldoAtual;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	
	public boolean fazerSaque(double qntSacar){
		if (getSaldo() >= qntSacar){
			saldo -= qntSacar;
			return true;
		}
		else {
			if (isEspecial()){
				double limite = limiteEspecial + saldo;
				if (limite >= qntSacar){
					saldo -= qntSacar;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		
	}
	public void depositar(double valorDepositado){
		saldo += valorDepositado;
		
	}
	
	public void consultarSaldo(){
		System.out.println("Saldo Atual R$ " + saldo);
	}
	
	public boolean VerificarChequeEspecial(){
		return saldo < 0;
	}

}
