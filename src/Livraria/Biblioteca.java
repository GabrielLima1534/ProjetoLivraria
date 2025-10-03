package Livraria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Lista com todos os livros disponíveis na biblioteca
    private List<Livro> listaLivros = new ArrayList<>();

    // Lista com todos os usuários cadastrados (alunos, professores, etc.)
    private List<Usuario> listaUsuario = new ArrayList<>();

    // Lista com todos os empréstimos ativos (livros que estão com alguém)
    private List<Emprestimo> listaEmprestados = new ArrayList<>();

    // Adiciona um livro na lista da biblioteca
    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    // Adiciona um usuário (aluno, professor...) na lista
    public void adicionarUsuario(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    // Busca um usuário pelo ID (por exemplo, 1, 2, 3...)
    public Usuario buscarIdUsuario(int id) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getId() == id) {
                return usuario; // Retorna o usuário se encontrar
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Busca um livro pelo código (por exemplo: "1", "A1", etc.)
    public Livro buscarIdLivro(String id) {
        for (Livro livro : listaLivros) {
            if (livro.getCodigo().equals(id)) {
                return livro; // Retorna o livro se encontrar
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Faz o empréstimo de um livro para um usuário
    public void emprestarLivro(int usuarioId, String codigoLivro) {
        // Busca o usuário e o livro pelo ID e código
        Usuario user = buscarIdUsuario(usuarioId);
        Livro liv = buscarIdLivro(codigoLivro);

        // Verifica se usuário e livro existem
        if (user != null && liv != null) {

            // 🛑 Verifica se o livro já está emprestado para alguém
            for (Emprestimo emp : listaEmprestados) {
                if (emp.getLivro().getCodigo().equals(codigoLivro)) {
                    System.out.println("Este livro já está emprestado.");
                    return; // Sai do método e não empresta
                }
            }

            // ✅ Conta quantos livros o usuário já pegou
            int cont = 0;
            for (Emprestimo emp : listaEmprestados) {
                if (emp.getUsuario().getId() == usuarioId) {
                    cont++; // Conta empréstimos do mesmo usuário
                }
            }

            // Se o usuário ainda não atingiu o limite de empréstimos...
            if (cont < user.getLimiteEmprestimos()) {
                // Cria o empréstimo e adiciona na lista
                Emprestimo emprestimo = new Emprestimo(liv, user);
                listaEmprestados.add(emprestimo);
                System.out.println("Livro emprestado com sucesso");
            } else {
                // Se já atingiu o limite...
                System.out.println("Limite de empréstimos atingido");
            }

        } else {
            // Se usuário ou livro não forem encontrados
            System.out.println("Usuário ou livro não encontrado");
        }
    }

    // Faz a devolução de um livro por parte do usuário
    public void devolverLivro(Usuario u, String codigoLivro) {
        Emprestimo encontrado = null;

        // Procura o empréstimo correspondente ao usuário e livro
        for (Emprestimo emp : listaEmprestados) {
            if (emp.getUsuario().getId() == u.getId() &&
                emp.getLivro().getCodigo().equals(codigoLivro)) {
                encontrado = emp;
                break; // Para de procurar assim que encontra
            }
        }

        // Se encontrou o empréstimo, remove da lista
        if (encontrado != null) {
            listaEmprestados.remove(encontrado);
            System.out.println("Livro devolvido com sucesso.");
        } else {
            // Se não encontrou
            System.out.println("Empréstimo não encontrado.");
        }
    }
}
