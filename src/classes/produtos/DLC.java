package classes.produtos;

public class DLC extends Produto {
    private Jogo jogo;
    public DLC(String nome, String descricao, double preco, Jogo jogo){
        super(nome, descricao, preco);
        this.jogo = jogo;
    }
}
