package com.loiane.java.aula43labsIII;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Zoo ***");
		
		Animal animal1 = new Animal();
		animal1.setNome("Camelo");
		animal1.setComprimento("150");
		//animal1.setNumPatas(4);
		animal1.setCor("Amarelo");
		animal1.setAmbiente("Terra");
		animal1.setVelocidade(2);

		
		Peixe animal2 = new Peixe();
		animal2.setNome("Tubarão");
		animal2.setComprimento("300");
		animal2.setVelocidade(1.5);
		
		
		Mamifero animal3 = new Mamifero();
		animal3.setNome("Urso-do-Canadá");
		animal3.setComprimento("180");
		//animal3.setNumPatas(4);
		animal3.setCor("Vermelho");
		animal3.setAmbiente("Terra");
		animal3.setVelocidade(0.5);
		
		
		Animal[] animal = new Animal[3];
		animal[0] = animal1;
		animal[1] = animal2;
		animal[2] = animal3;
		
		for (Animal a : animal)
		System.out.println(a);
		
	}

}
