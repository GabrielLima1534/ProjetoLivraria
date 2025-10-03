package Livraria;

// Define a classe como abstrata (não pode ser instanciada diretamente)
abstract class Usuario {

    // Atributos comuns a todos os tipos de usuários
    public int id;         // Identificador único do usuário (ex: 1, 2, 3)
    public String nome;    // Nome do usuário
    public String email;   // Email do usuário

    // Construtor padrão (vazio) — útil se for preencher os dados depois
    public Usuario() {
    }

    // Construtor com parâmetros — inicializa os dados do usuário direto na criação
    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Métodos getter e setter para acessar/modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método abstrato — todas as subclasses (Aluno, Professor) são obrigadas a implementar
    public abstract int getLimiteEmprestimos();

    // Método para retornar os dados do usuário como uma string (útil para impressão)
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }
}
