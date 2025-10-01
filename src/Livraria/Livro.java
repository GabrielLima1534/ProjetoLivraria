package Livraria;

public class Livro implements Emprestavel  {
	
	private String codigo;
	private String titulo;
	private String autor;
	private Status status;
	public Livro(String codigo, String titulo, String autor, Status status) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
		
		
	}
	public Livro() {
		super();
	}
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
	
	public void emprestar() {
		status = status.EMPRESTADO;
	}
	
	public void devolver() {
	    status = Status.DISPONIVEL;
	}
	@Override
	public void emprestar(Usuario u) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}