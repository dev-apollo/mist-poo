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

    public void exibirProdutos(){
        if(!produtos.isEmpty()){
            for (Produto produto : produtos) {
                System.out.println(produto.getNome()+" - "+produto.getTipoDeProduto()+" - "+produto.getPreco());
            }
        }else{
            System.out.println("O seu acervo está vazio.");
        }
    }

    public void adicionarProduto(Produto produto){
        for (Produto p : produtos) {
            if (p.equals(produto)) {
                System.out.println("O produto já existe.");
                return;
            }
        }
        if(produto.getPreco() < 0){
            System.out.println("O preço do produto não pode ser negativo.");
            return;
        }
        System.out.println(produto.getNome()+" foi adicionado ao MIST!");
        this.produtos.add(produto);
    }

    public void removerProduto(String nome){
        for(Produto p : produtos){
            if(p.getNome().equals(nome)){
                this.produtos.remove(p);
                System.out.println("Produto removido!");
                return;
            }
        }
        System.out.println("Produto não foi encontrado.");
    }
}
