package classes.produtos;

import classes.usuarios.Desenvolvedor;
import enums.TipoDeProduto;

public class Jogo extends Produto {
    public Jogo(String nome, String descricao, double preco, Desenvolvedor desenvolvedor){
        super(nome, descricao, preco, desenvolvedor, TipoDeProduto.Jogo);
    }
}
