package Livraria;

// Define a classe Professor como uma subclasse (filha) da classe abstrata Usuario
public class Professor extends Usuario {

    // Construtor vazio (sem parâmetros)
    // Permite criar um Professor e definir os dados depois usando setters
	public Professor(){
	}

	// Construtor com parâmetros: define id, nome e email na criação
	public Professor(int id, String nome, String email) {
		// Chama o construtor da superclasse (Usuario) para inicializar os atributos herdados
		super(id, nome, email);
	}
	
	// Implementação obrigatória do método abstrato da classe Usuario
	// Aqui está dizendo que o professor pode emprestar até 5 livros
	public int getLimiteEmprestimos() {
		return 5;
	}

}
