package br.edu.fescfafic.biblioteca.Model;
import br.edu.fescfafic.biblioteca.Model.Livro;
import java.util.Arrays;
import java.util.UUID;

public class Usuario {
    public String nome;
    public UUID id;
    public String email;
    public Livro[] livrosEmPosse = new Livro[5];
    public int qtdLivros = 0;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.id = UUID.randomUUID();
    }

    public void exibirInfo(){
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("\nE-mail: %s", this.email);
        System.out.printf("\nQuantidade de livros em posse: %s", qtdLivros);
    }
}
