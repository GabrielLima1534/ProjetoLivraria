package Livraria;

public class Main {

	public static void main(String[] args) {
		
	Biblioteca biblioteca = new Biblioteca();
	
//	Professor 1 = new Professor();
//	Professor 2 = new Professor();
//	Professor 3 = new Professor();
	
	Usuario u = new Aluno(1, "Gabriel", "gabriel@gmail.com");
//	Aluno 2 = new Aluno();
//	Aluno 3 = new Aluno();
	
	biblioteca.adicionarUsuario(u);
	
	Livro l = new Livro("1","dom casmurro", "Machado de Assis");
//	Livro 2 = new Livro();
//	Livro 3 = new Livro();
	
	biblioteca.adicionarLivro(l);
	
	biblioteca.emprestarLivro(1,"1");


	
	}

}
