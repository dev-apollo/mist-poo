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

    public void exibirProdutos(){
        if(!produtos.isEmpty()){
            for (Produto produto : produtos) {
                System.out.println(produto.getNome()+" - "+produto.getTipoDeProduto()+" - "+produto.getDesenvolvedor().getNome());
            }
        }else{
            System.out.println("A sua biblioteca está vazia.");
        }
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(String nome){        
        for(Produto p : produtos){
            if(p.getNome().equals(nome)){
                if(p.getPreco() > 0){
                    System.out.println("Não é possível remover jogos pagos.");
                    return;
                }
                this.produtos.remove(p);
                System.out.println("Produto removido!");
                return;
            }
        }
        System.out.println("Produto não foi encontrado.");
    }
}
