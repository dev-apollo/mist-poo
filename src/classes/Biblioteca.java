package classes;
import java.util.List;

import classes.produtos.Produto;
import classes.usuarios.Cliente;
import interfaces.ControleDeProdutos;

import java.util.ArrayList;

public class Biblioteca implements ControleDeProdutos{
    private Cliente dono;
    private List<Produto> produtos;

    public Biblioteca(Cliente dono){
        this.dono = dono;
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }

    public void avaliarProduto(Produto produto, int avaliacao){
        produto.adicionarAvaliacao(dono, avaliacao);
    }
}
