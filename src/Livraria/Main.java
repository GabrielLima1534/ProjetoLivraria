package Livraria;

public class Main {

	public static void main(String[] args) {
		
		// Cria a biblioteca onde os livros e usuários serão gerenciados
		Biblioteca biblioteca = new Biblioteca();

		// Cria um professor com ID 3
		Usuario P1 = new Professor(3, "Mario", "mariosgames@gmail.com");

		// Adiciona o professor na lista de usuários da biblioteca
		biblioteca.adicionarUsuario(P1);

		// Cria dois alunos com ID 1 e 2
		Usuario Aluno1 = new Aluno(1, "Gabriel", "gabriel@gmail.com");
		Usuario Aluno2 = new Aluno(2, "João", "Joao@gmail.com");

		// Adiciona os alunos na lista de usuários da biblioteca
		biblioteca.adicionarUsuario(Aluno1);
		biblioteca.adicionarUsuario(Aluno2);

		// Cria quatro livros com códigos únicos
		Livro A = new Livro("1", "Dom Casmurro", "Machado de Assis");
		Livro B = new Livro("2", "Harry Potter", "J.K. Rowling");
		Livro C = new Livro("3", "Mangá Naruto", "Masashi Kishimoto");
		Livro D = new Livro("4", "Mangá One Piece", "Eiichiro Oda");

		// Adiciona os livros à biblioteca
		biblioteca.adicionarLivro(A);
		biblioteca.adicionarLivro(B);
		biblioteca.adicionarLivro(C);
		biblioteca.adicionarLivro(D);

		// 🟢 Gabriel (ID 1) pega o livro "Dom Casmurro" (código "1") — deve funcionar
		biblioteca.emprestarLivro(1, "1");

		// 🔴 Professor Mario (ID 3) tenta pegar o mesmo livro "1" — deve falhar (já está emprestado)
		biblioteca.emprestarLivro(3, "1");

		// 🟢 Gabriel pega o livro "Harry Potter" (código "2") — ainda dentro do limite
		biblioteca.emprestarLivro(1, "2");

		// 🔴 Gabriel tenta pegar "Mangá Naruto" (código "3") — deve falhar (limite de 2 atingido)
		biblioteca.emprestarLivro(1, "3");

		// 🔴 Gabriel tenta pegar outro livro "One Piece" — também falha pelo limite
		biblioteca.emprestarLivro(1, "4");

		// DICA: você pode adicionar devolução aqui para testar depois:
		// biblioteca.devolverLivro(Aluno1, "1");
		// biblioteca.emprestarLivro(1, "3"); // Depois da devolução, esse passaria

	}
}
