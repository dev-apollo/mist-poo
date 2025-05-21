package interfaces;

import classes.produtos.Produto;

public interface ControleDeProdutos {
    public void exibirProdutos();
    public void adicionarProduto(Produto produto);
    public void removerProduto(String nome);
}
