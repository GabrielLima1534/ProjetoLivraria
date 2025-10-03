package Livraria;

// Declara uma interface chamada Emprestavel
public interface Emprestavel {
	
	// Método que deve ser implementado por qualquer classe que "possa ser emprestada"
	// Recebe um objeto Usuario como parâmetro
	public void emprestar(Usuario u);

	// Método para devolver o item emprestado (não recebe nada)
	public void devolver();

}
