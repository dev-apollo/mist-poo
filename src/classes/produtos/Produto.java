package classes.produtos;

import java.util.ArrayList;
import java.util.List;

import classes.Avaliacao;
import classes.usuarios.Cliente;
import classes.usuarios.Desenvolvedor;
import enums.TipoDeProduto;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private Desenvolvedor desenvolvedor;
    private TipoDeProduto tipoDeProduto;
    private List<Avaliacao> avaliacoes;

    public Produto(String nome, String descricao, double preco, Desenvolvedor desenvolvedor, TipoDeProduto tipoDeProduto){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.desenvolvedor = desenvolvedor;
        this.tipoDeProduto = tipoDeProduto;
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

    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }
    
    public TipoDeProduto getTipoDeProduto() {
        return tipoDeProduto;
    }
}
