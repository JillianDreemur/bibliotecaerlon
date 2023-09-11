package br.edu.fescfafic.biblioteca.Model;

public class Biblioteca {
    public String nome;
    public String endereco;
    public Livro[] acervo = new Livro[100];
    public int quantidadeDeLivros = 0;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void cadastrarLivro(Livro livro) {
        if (buscarPorTitulo(livro.titulo) == null) {
            if (quantidadeDeLivros < acervo.length) {
                this.acervo[this.quantidadeDeLivros] = livro;
                this.quantidadeDeLivros++;
                System.out.print("\nCadastro concluído com sucesso.");
            } else {
                System.out.print("Desculpe, mas nosso acervo está cheio; " +
                        "não podemos permitir que você cadastre outro livro.");
            }
        } else {
            System.out.print("Desculpe, mas esse livro já foi cadastrado.");
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        for (int i = 0; i < quantidadeDeLivros; i++) {
            if (this.acervo[i].titulo.equalsIgnoreCase(titulo)) {
                return this.acervo[i];
            }
        }
        return null;
    }

    public Livro buscarPorAutor(String autor) {
        for (int i = 0; i < quantidadeDeLivros; i++) {
            if (this.acervo[i].autor.equalsIgnoreCase(autor)) {
                return this.acervo[i];
            }
        }
        return null;
    }

    public void emprestarLivro(Livro livro) {
        if (!verificarDisponibilidade(livro)) {
            System.out.print("Desculpe, esse livro não existe.");
        } else {
            if (livro.quantidadeEstoque < 1) {
                System.out.print("Desculpe mas não existem " +
                        "livros a serem emprestados");
            } else {
                livro.quantidadeEstoque--;
            }
        }
    }

    public void devolverLivro(Livro livro) {
        if (buscarPorTitulo(livro.titulo) == null) {
            System.out.print("Desculpe, esse livro não existe.");
        } else {
            if (quantidadeDeLivros < 0) {
                System.out.print("Desculpe mas não existem " +
                        "livros a serem devolvidos.");
            } else {
                livro.quantidadeEstoque++;
            }
        }
    }

    private boolean verificarDisponibilidade(Livro livro) {
        Livro livroAcervo = buscarPorTitulo(livro.titulo);
        if (livroAcervo == null || livroAcervo.quantidadeEstoque < 1) {
            return false;
        }
        return true;
    }

}





