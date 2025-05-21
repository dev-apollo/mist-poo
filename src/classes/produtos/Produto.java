package classes.produtos;

import classes.usuarios.Desenvolvedor;
import enums.TipoDeProduto;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private Desenvolvedor desenvolvedor;
    private TipoDeProduto tipoDeProduto;

    public Produto(String nome, String descricao, double preco, Desenvolvedor desenvolvedor, TipoDeProduto tipoDeProduto){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.desenvolvedor = desenvolvedor;
        this.tipoDeProduto = tipoDeProduto;
    }

    @Override
    public boolean equals(Object o){
        Produto produto = (Produto) o;
        if(this.nome.equals(produto.getNome()) && this.tipoDeProduto.equals(produto.getTipoDeProduto()) && this.desenvolvedor.equals(produto.getDesenvolvedor())) return true;
        else return false;
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
