package com.loiane.java.aula24;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {

		LivroBiblioteca livro = new LivroBiblioteca();
		livro.nome = "O Silmarillion";
		livro.autor = "J. R. R. Tolkien";
		livro.qntPaginas = 480;
		livro.anoLancamento = 1917;
		livro.isbn = "9788578271268";
		
		livro.emprestado = true;
		livro.emprestadoA = "Loiane";
		livro.dataEntrega = new Date();
		
		System.out.println(livro.nome);
		System.out.println(livro.emprestado);
		System.out.println(livro.emprestadoA);
		System.out.println(livro.dataEntrega);

	}

}
