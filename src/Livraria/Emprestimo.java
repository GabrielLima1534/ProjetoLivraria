package Livraria;

// Importa bibliotecas para trabalhar com datas
import java.time.LocalDate;
import java.util.Date; // ❌ Este import está desnecessário porque você só está usando LocalDate

public class Emprestimo {

	// Declara os atributos do empréstimo
	private Livro livro;                    // O livro emprestado
	private Usuario usuario;                // O usuário que fez o empréstimo
	private LocalDate dataEmprestimo;       // Data do empréstimo
	private LocalDate dataDevolucao;        // Data da devolução (pode começar como null)

	// Construtor que já recebe o livro e o usuário
	public Emprestimo(Livro livro, Usuario usuario) {
		this.livro = livro;                // Define o livro
		this.usuario = usuario;            // Define o usuário
		this.dataEmprestimo = LocalDate.now(); // Define a data atual como data do empréstimo
		// ❌ Aqui seria bom também alterar o status do livro para EMPRESTADO
		// Por exemplo: livro.emprestar();
	}

	// Construtor padrão vazio
	public Emprestimo() {
		super(); // Chama o construtor da superclasse (Object) — opcional aqui
	}

	// Getters e setters dos atributos
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	// Método toString que retorna todos os dados do empréstimo como texto
	@Override
	public String toString() {
		return "Emprestimo [livro=" + livro + ", usuario=" + usuario + ", dataEmprestimo=" + dataEmprestimo
				+ ", dataDevolucao=" + dataDevolucao + "]";
	}
}
