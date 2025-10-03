package Livraria;

// A classe Aluno herda da classe Usuario
public class Aluno extends Usuario {

    // Construtor vazio (usado caso você queira instanciar o objeto sem passar dados)
    public Aluno() {
        // Não faz nada diretamente, mas o Java chama o construtor vazio da superclasse (Usuario)
    }

    // Construtor com parâmetros: ID, nome e email
    public Aluno(int id, String nome, String email) {
        // Chama o construtor da superclasse Usuario, passando os dados do aluno
        super(id, nome, email);
    }

    // Método sobrescrito que define o limite de empréstimos para alunos
    public int getLimiteEmprestimos () {
        return 2; // Alunos só podem pegar até 2 livros
    }
}
