package com.loiane.java.aula46labs;

public class Teste {

	public static void main(String[] args) {

		Quadrado fig1 = new Quadrado();
		fig1.setLado(2);
		fig1.setNome("Quadrado");
		
		Circulo fig2 = new Circulo();
		fig2.setRaio(2);
		fig2.setNome("Circulo");
		
		Triangulo fig3 = new Triangulo();
		fig3.setBase(3);
		fig3.setAltura(2);
		fig3.setNome("Triangulo");
		
		Cubo fig4 = new Cubo();
		fig4.setLado(3);
		fig4.setNome("Cubo");
		
		Cilindro fig5 = new Cilindro();
		fig5.setAltura(3);;
		fig5.setRaio(2);
		fig5.setNome("Cilindro");

		Piramide fig6 = new Piramide();
		fig6.setAltura(3);
		fig6.setApotema(4);
		fig6.setArestaBase(2);
		fig6.setNumPoliBase(4);
		fig6.setBase(fig1);
		fig6.setNome("Piramide");
		
		//Colocando no Array
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = fig1;
		figuras[1] = fig2;
		figuras[2] = fig3;
		figuras[3] = fig4;
		figuras[4] = fig5;
		figuras[5] = fig6;
		
		for (FiguraGeometrica f : figuras){
			System.out.println("----------------");
			System.out.println(f.getNome());
			
			if (f instanceof Figura2D){
				Figura2D f2D = (Figura2D) f; //Downcasting
				System.out.println(f2D.calcularArea());
			}
			if (f instanceof Figura3D){
				Figura3D f3D = (Figura3D) f; //Downcasting
				System.out.println(f3D.calcularArea());
				System.out.println(f3D.calcularVolume());
			}
			
			
		}

	}

}
