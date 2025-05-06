package classes.produtos;

import java.util.ArrayList;
import java.util.List;

import classes.Avaliacao;
import classes.usuarios.Cliente;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private List<Avaliacao> avaliacoes;

    public Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.avaliacoes = new ArrayList<Avaliacao>();
    }

    public void adicionarAvaliacao(Cliente avaliador, int avaliacao){
        Avaliacao novaAvaliacao = new Avaliacao(avaliador, avaliacao);
        this.avaliacoes.add(novaAvaliacao);
    }

    public void editarInformacoes(Produto produtoAtualizado){
        this.nome = produtoAtualizado.nome;
        this.descricao = produtoAtualizado.descricao;
        this.preco = produtoAtualizado.preco;
    }
}
