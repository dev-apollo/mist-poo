package classes.usuarios;

import classes.Acervo;
import classes.produtos.Produto;

public class Desenvolvedor extends Usuario{
    private Acervo acervo;
    
    public Desenvolvedor(String nome, String email, String senha){
        super(nome, email, senha);
        this.acervo = new Acervo(this);
    }
    public void visualizarAcervo(){
        acervo.exibirProdutos();
    }

    public void adicionarProduto(Produto produto){
        this.acervo.adicionarProduto(produto);;
    }

    public void removerProduto(Produto produto){
        this.acervo.removerProduto(produto);;
    }

    public void editarProduto(Produto produto, Produto informacoesAtualizadas){
        this.acervo.editarProduto(produto, informacoesAtualizadas);
    }
}
