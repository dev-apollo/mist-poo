package classes;

import java.util.ArrayList;
import java.util.List;

import classes.produtos.Produto;
import classes.usuarios.Desenvolvedor;
import interfaces.ControleDeProdutos;

public class Acervo implements ControleDeProdutos{
    private Desenvolvedor dono;
    private List<Produto> produtos;

    public Acervo(Desenvolvedor dono){
        this.dono = dono;
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }

    public void editarProduto(Produto produto, Produto informacoesAtualizadas){
        produto.editarInformacoes(informacoesAtualizadas);
    }
}
