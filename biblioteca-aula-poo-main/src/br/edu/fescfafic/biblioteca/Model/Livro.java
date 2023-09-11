package br.edu.fescfafic.biblioteca.Model;
import java.time.LocalDate;

public class Livro {
    public String titulo;
    public String autor;
    public String isbn;
    public LocalDate anoDePublicacao;
    public int quantidadeEstoque;

    public Livro(String titulo, String autor, String isbn,
                 LocalDate ano, int qntEstoque){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoDePublicacao = ano;
        this.quantidadeEstoque = qntEstoque;
    }

    public void exibirInfo(){
        System.out.printf("\nTitulo: %s", this.titulo);
        System.out.printf("\nAutor: %s", this.autor);
        System.out.printf("\nISBN: %s", this.isbn);
        System.out.printf("\nAno: %s", this.anoDePublicacao);
        System.out.printf("\nQuantidade Disponivel: %d", this.quantidadeEstoque);
    }
}
