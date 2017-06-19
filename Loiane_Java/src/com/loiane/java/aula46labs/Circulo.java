package com.loiane.java.aula46labs;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		//raio * raio * 3.14
		return Math.pow(raio, 2) * Math.PI;
	}

}
