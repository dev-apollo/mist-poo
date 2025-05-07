package classes.produtos;

import classes.usuarios.Desenvolvedor;
import enums.TipoDeProduto;

public class OST extends Produto {
    private Jogo jogo;
    public OST(String nome, String descricao, double preco, Jogo jogo, Desenvolvedor desenvolvedor){
        super(nome, descricao, preco, desenvolvedor, TipoDeProduto.OST);
        this.jogo = jogo;
    }
}
