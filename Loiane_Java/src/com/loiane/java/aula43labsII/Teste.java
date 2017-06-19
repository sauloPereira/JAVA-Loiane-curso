package com.loiane.java.aula43labsII;

public class Teste {
// Site para gerar cpf e cnpj "cpf generator"
	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("João Lucas");
		p1.setCpf("00700403234");
		p1.setRendaBruta(500);
		
		System.out.println(p1);
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("João Blablabla");
		p2.setCpf("00700409877");
		p2.setRendaBruta(2000);
		
		System.out.println(p2);
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("João Louca r.");
		p3.setCpf("00700403266");
		p3.setRendaBruta(3601);
		
		System.out.println(p3);
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Brenda");
		pj1.setCnpj("00700400000");
		pj1.setRendaBruta(5000);
		
		System.out.println(pj1);
		
		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setNome("Brenda Karolyne");
		pj2.setCnpj("0077777777");
		pj2.setRendaBruta(30000);
		
		System.out.println(pj2);
		
		PessoaFisica p4 = new PessoaFisica();
		p4.setNome("Brenda Karolyne");
		p4.setCpf("00400403266");
		p4.setRendaBruta(2800);
		
		System.out.println(p4);
		
		//Forma melhorada de output (saida)
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = pj1;
		contribuintes[4] = pj2;
		contribuintes[5] = p4;
		
		for (Contribuinte c : contribuintes){
			System.out.println(c);
		}

	}

}
