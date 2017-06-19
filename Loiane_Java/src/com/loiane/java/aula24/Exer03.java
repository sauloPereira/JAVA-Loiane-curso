package com.loiane.java.aula24;

public class Exer03 {

	public static void main(String[] args) {

		LivroLivraria livro = new LivroLivraria();
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.qntPaginas = 402;
		livro.anoLancamento = 2015;
		livro.isbn = "1784390453";
		livro.preco = 63.39;
		
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.qntPaginas);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.isbn);
		System.out.println(livro.preco);

	}

}
