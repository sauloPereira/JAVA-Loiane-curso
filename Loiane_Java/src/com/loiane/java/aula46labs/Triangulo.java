package com.loiane.java.aula46labs;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
	
	private int base;
	private int altura;
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		
		return (altura * base) / 2;
	}

}