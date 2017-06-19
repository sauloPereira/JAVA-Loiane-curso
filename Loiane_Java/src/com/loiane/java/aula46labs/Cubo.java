package com.loiane.java.aula46labs;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		
		return (lado * lado) * 6;
		
	}

	@Override
	public double calcularVolume() {
		
		return Math.pow(lado, 3);
	}
	
}
