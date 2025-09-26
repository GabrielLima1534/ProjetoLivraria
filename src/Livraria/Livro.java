package Livraria;

public class Livro {
	
	private int codigo;
	private String titulo;
	private String autor;
	private Status status;
	public Livro(int codigo, String titulo, String autor, Status status) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
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
	
	public void emprestar() {
		status = status.EMPRESTADO;
	}
	
	public void devolver() {
	    status = Status.DISPONIVEL;
	}
	
	
	
	
}