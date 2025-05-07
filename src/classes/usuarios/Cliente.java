package classes.usuarios;

import classes.Biblioteca;
import classes.produtos.Produto;

public class Cliente extends Usuario{
    private Biblioteca biblioteca;

    public Cliente(String nome, String email, String senha){
        super(nome, email, senha);
        this.biblioteca = new Biblioteca(this);
    }

    public void visualizarBiblioteca(){
        System.out.println("Biblioteca de "+this.getNome()+":");
        biblioteca.exibirProdutos();
    }

    public void adicionarProduto(Produto produto) {
        this.biblioteca.adicionarProduto(produto);
    }

    public void removerProduto(Produto produto) {
        this.biblioteca.removerProduto(produto);
    }

    public void avaliarProduto(Produto produto, int avaliacao) {
        this.biblioteca.avaliarProduto(produto, avaliacao);
    }
}
