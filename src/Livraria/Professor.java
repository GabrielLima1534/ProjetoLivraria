package Livraria;

public class Professor extends Usuario {
	
	public Professor(){
		
	}
	
	public Professor(int id, String nome, String email) {
		super(id, nome, email);
	}
	
	

	public int getLimiteEmprestimos() {
		return 5;
	}

}
