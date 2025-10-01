package Livraria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<Livro>  listaLivros = new ArrayList();
	
	public void adicionarLivro(Livro I) { 
		listaLivros.add(I);
	}
	
	public void emprestarLivro(Usuario u, String codigo) {
		Emprestimo emprestimo = new Emprestimo();
		
	}
	
	public void devolverLivro(Usuario u, String codigo) {
		
	}

}
