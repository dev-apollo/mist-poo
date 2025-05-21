package classes;

import java.util.ArrayList;
import java.util.List;

import classes.produtos.Produto;

public class Loja {
    List<Produto> produtos;
    public Loja(){
        this.produtos = new ArrayList<Produto>();
    }

    public void exibirProdutos(){        
        for (Produto produto : produtos) {
            System.out.println(produto.getNome()+" - "+produto.getPreco()+" - "+produto.getTipoDeProduto()+" - "+produto.getDesenvolvedor().getNome());
        }
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
}
