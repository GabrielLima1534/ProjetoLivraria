package Livraria;

public class Main {

	public static void main(String[] args) {
		
	Biblioteca biblioteca = new Biblioteca();
	
    Usuario P1 = new Professor(3, "Mario", "mariosgames@gmail.com");
//	Professor 2 = new Professor();
//	Professor 3 = new Professor();
    
    biblioteca.adicionarUsuario(P1);
	
	Usuario Aluno1 = new Aluno(1, "Gabriel", "gabriel@gmail.com");
	Usuario Aluno2 = new Aluno(2, "João", "Joao@gmail.com");
//	Aluno 3 = new Aluno();
	
	biblioteca.adicionarUsuario(Aluno1);
	biblioteca.adicionarUsuario(Aluno2);
	
	Livro A = new Livro("1","dom casmurro", "Machado de Assis");
	Livro B = new Livro("2", "Harry Potter", "j.k rolling");
    Livro C = new Livro("3", "Mangá Naruto", "Masashi Kishimoto");
	Livro D = new Livro("4", "Mangá One Piece", "Eiichiro Oda");
	biblioteca.adicionarLivro(A);
	biblioteca.adicionarLivro(B);
	
	biblioteca.emprestarLivro(1,"1");
	biblioteca.emprestarLivro(3, );


	
	}

}
