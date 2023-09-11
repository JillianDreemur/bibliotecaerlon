package br.edu.fescfafic.biblioteca.Main;
import br.edu.fescfafic.biblioteca.Model.Usuario;
import br.edu.fescfafic.biblioteca.Model.Livro;
import br.edu.fescfafic.biblioteca.Model.Biblioteca;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "Erlon",
                "erlon@gmail.com"
            );

//        usuario.exibirInfo();

        Livro livro = new Livro(
                "Admiravel Mundo Novo",
                "Aldous Huxley",
                "d8a9sd7as98d",
                LocalDate.of(1932, 5, 12),
                10
            );

        Livro livro2 = new Livro(
                "Neuromancer",
                "William Gibson",
                "d4a5sd46as5d4",
                LocalDate.of(2015, 5, 15),
                10
            );

//        livro.exibirInfo();
//        livro2.exibirInfo();

        Biblioteca biblioteca = new Biblioteca(
                "Corujao",
                "Rua dos bobos"
            );

        biblioteca.cadastrarLivro(livro);
        biblioteca.cadastrarLivro(livro2);

        //testando cadastro
//        for(int i=0; i < biblioteca.quantidadeDeLivros; i++) {
//            System.out.print(biblioteca.acervo[i].titulo);
//        }

//        System.out.println(biblioteca.buscarPorTitulo("xuxa", 0));
//        System.out.println(biblioteca.buscarPorTitulo("Neuromancer", 0));

//        System.out.println(biblioteca.buscarPorAutor("mopises"));
//        System.out.println(biblioteca.buscarPorAutor("William Gibson"));

        System.out.println(livro.quantidadeEstoque);
        biblioteca.emprestarLivro(livro);

        System.out.println(livro.quantidadeEstoque);
        biblioteca.devolverLivro(livro);
        System.out.println(livro.quantidadeEstoque);
//
//        biblioteca.emprestarLivro("ju");
    }
}