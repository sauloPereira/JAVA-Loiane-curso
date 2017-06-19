package com.loiane.java.aula43labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	
	public ContaPoupanca() {}

	public int getDiaRendimento() {
		return diaRendimento;
	}
	
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
		
	}
	
	@Override
	public String toString() {
		String s = "Conta Poupança  [ ";
		s += "Dia de Rendimento: " + diaRendimento + " ";
		s += super.toString();
		s += " ]";
		return s;
		
	}
	
	public boolean calcularNovoSaldo(double taxaRendPoupanca){
		//Para pegar data atual 
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
			//saldo += saldo * taxaRendPoupanca;
			//Forma correta da declaração anterior.
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendPoupanca));
			
			return true;
		}
		return false;
		
	}
	
}
