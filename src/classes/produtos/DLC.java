package classes.produtos;

import classes.usuarios.Desenvolvedor;
import enums.TipoDeProduto;

public class DLC extends Produto {
    private Jogo jogo;
    public DLC(String nome, String descricao, double preco, Jogo jogo, Desenvolvedor desenvolvedor){
        super(nome, descricao, preco, desenvolvedor, TipoDeProduto.DLC);
        this.jogo = jogo;
    }
}
