package Livraria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livro> listaLivros = new ArrayList();

	private List<Usuario> listaUsuario = new ArrayList();

	public void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
	}

	public void adicionarUsuario(Usuario usuario) {
		listaUsuario.add(usuario);

	}

	public Usuario buscarIdUsuario(int u) {

		for (Usuario usuario : listaUsuario) {
			if (usuario.getId() == u) {
				return usuario;
			} else {
				return usuario = null;
			}

		}
		return null;
	}

	public Livro buscarIdLivro(String id) {

		for (Livro livro : listaLivros) {

			if (livro.getCodigo().equals(id)) {
				return livro;
			} else {
				return livro = null;
			}
		}
		return null;
	}

	public void emprestarLivro(int usuario, String codigo) {
		Usuario user = buscarIdUsuario(usuario);

		Livro liv = buscarIdLivro(codigo);
		
		if (user != null && liv != null) {
			
			Emprestimo emprestimo = new Emprestimo(liv, user);
			
			System.out.println("Livro emprestado com sucesso");
			
		} else {
			System.out.println("Revise os dados ");
		}

		

	}

	public void devolverLivro(Usuario u, String codigo) {

	}

}
