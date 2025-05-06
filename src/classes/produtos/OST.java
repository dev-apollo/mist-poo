package classes.produtos;

public class OST extends Produto {
    private Jogo jogo;
    public OST(String nome, String descricao, double preco, Jogo jogo){
        super(nome, descricao, preco);
        this.jogo = jogo;
    }
}
