package Livraria;

// A classe Livro implementa a interface Emprestavel
public class Livro implements Emprestavel {

    // Atributos privados do livro
    private String codigo;     // Código único do livro (ex: "1", "A5", etc.)
    private String titulo;     // Título do livro (ex: "Dom Casmurro")
    private String autor;      // Nome do autor
    private Status status;     // Status do livro: DISPONIVEL ou EMPRESTADO

    // Construtor que recebe código, título e autor
    public Livro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status.DISPONIVEL;  // Quando o livro é criado, ele está disponível
    }

    // Construtor vazio (pode ser usado se for preencher depois)
    public Livro() {
        super(); // Chama o construtor da superclasse (Object)
    }

    // Métodos getters e setters — permitem acessar e modificar os atributos

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Método que marca o livro como emprestado
    public void emprestar() {
        status = Status.EMPRESTADO;
    }

    // Método que marca o livro como disponível novamente
    public void devolver() {
        status = Status.DISPONIVEL;
    }

    // Método herdado da interface Emprestavel (não está implementado ainda)
    @Override
    public void emprestar(Usuario u) {
        // Ainda não implementado — pode ser usado para lógica mais complexa futuramente
    }

    // Método que retorna uma representação textual do livro (útil para imprimir na tela)
    @Override
    public String toString() {
        return "Livro [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", status=" + status + "]";
    }

}
