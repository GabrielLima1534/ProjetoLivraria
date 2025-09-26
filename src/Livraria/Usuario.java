package Livraria;

abstract class Usuario {
	
	public int id;
	public String nome;
	public String email;
	
	public abstract int getLimiteEmprestimos();

}
