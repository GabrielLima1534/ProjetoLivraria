package Livraria;

public class Aluno extends Usuario {
	
	
	public Aluno() {
		
	}
	
	public Aluno(int id, String nome, String email) {
		super(id, nome, email);
	}

	public int getLimiteEmprestimos () {
		return 2;
	}

	
	


}
