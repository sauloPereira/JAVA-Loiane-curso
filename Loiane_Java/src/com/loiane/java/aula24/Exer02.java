package com.loiane.java.aula24;

public class Exer02 {

	public static void main(String[] args) {

		Livro livro = new Livro();
		livro.nome = "O Silmarillion";
		livro.autor = "J. R. R. Tolkien";
		livro.qntPaginas = 480;
		livro.anoLancamento = 1917;
		livro.isbn = "9788578271268";
		
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.qntPaginas);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.isbn);
		
		
	}

}
