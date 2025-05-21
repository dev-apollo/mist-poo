package classes.utilitarios;
import java.util.Scanner;

import classes.Loja;
import classes.produtos.Produto;
import classes.usuarios.Cliente;
import classes.usuarios.Desenvolvedor;
import classes.usuarios.Usuario;
import enums.TipoDeProduto;

public class Menu {
    public void exibirMenu(Usuario usuario){
        if(usuario instanceof Cliente) {
            this.exibirMenuCliente();
        }else if(usuario instanceof Desenvolvedor) {
            this.exibirMenuDesenvolvedor();
        }else{
            System.out.println("Erro ao exibir menu.");
        }
    }

    private void exibirMenuCliente(){
        System.out.println("O que deseja fazer agora?\n[1] - Visualizar biblioteca\n[2] - Adicionar produto à biblioteca\n[3] - Remover produto da biblioteca\n[4] - Exibir produtos da loja\n[0] - Sair");
    }

    private void exibirMenuDesenvolvedor(){
        System.out.println("O que deseja fazer agora?\n[1] - Visualizar acervo\n[2] - Adicionar produto ao acervo\n[3] - Remover produto do acervo\n[0] - Sair");
    }

    public void receberOpcao(Usuario usuario, int opcao, Scanner scanner, Loja loja){
        if(usuario instanceof Cliente) {
            Cliente cliente = (Cliente) usuario;
            this.receberOpcaoCliente(cliente, opcao, scanner, loja);
        }else if(usuario instanceof Desenvolvedor) {
            Desenvolvedor desenvolvedor = (Desenvolvedor) usuario;
            this.receberOpcaoDesenvolvedor(desenvolvedor, opcao, scanner, loja);
        }else{
            System.out.println("Erro ao receber opção.");
        }
    }

    private void receberOpcaoCliente(Cliente cliente, int opcao, Scanner scanner, Loja loja){
        String nome;
        switch (opcao) {
            case 0:
                break;
            case 1:
                cliente.visualizarBiblioteca();
                break;
            case 2:
                System.out.println("Insira o nome do produto:");
                nome = scanner.nextLine();
                int opcao2 = 0;
                for (Produto p : loja.getProdutos()) {
                    if(p.getNome().equals(nome)){
                        if(p.getPreco() > 0){
                            do{ 
                                System.out.println("O produto custa: R$"+p.getPreco()+". Efetuar compra?\n[1] - Sim\n[2] - Não");
                                opcao2 = scanner.nextInt();
                            }while(opcao2 < 1 || opcao2 > 2);
                            if(opcao2 == 1){
                                cliente.adicionarProduto(p);
                            }else{
                                System.out.println("Compra cancelada.");
                            }
                            return;
                        }else{
                            cliente.adicionarProduto(p);
                            return;
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Insira o nome do produto:");
                nome = scanner.nextLine();
                cliente.removerProduto(nome);
                break;
            case 4:
                loja.exibirProdutos();
                break;
            default:
                break;
        }
    } 

    private void receberOpcaoDesenvolvedor(Desenvolvedor desenvolvedor, int opcao, Scanner scanner, Loja loja){
        String nome;
        switch (opcao) {
            case 0:
                break;
            case 1:
                desenvolvedor.visualizarAcervo();
                break;
            case 2:
                System.out.println("Insira o nome do produto:");
                nome = scanner.nextLine();
                System.out.println("Insira uma descrição para o produto:");
                String descricao = scanner.nextLine();
                System.out.println("Insira  preço do produto:");
                double preco = scanner.nextDouble();
                int opcao2 = 0;
                do{
                    System.out.println("[1] - Jogo\n[2] - DLC\n[3] - OST\nEscolha o tipo do produto:");
                    opcao2 = scanner.nextInt();
                }while(opcao2 < 1 || opcao2 > 3);
                TipoDeProduto tipoDeProduto = null;
                switch (opcao2) {
                    case 1:
                        tipoDeProduto = TipoDeProduto.Jogo;
                        break;
                    case 2:
                        tipoDeProduto = TipoDeProduto.DLC;
                        break;
                    case 3:
                        tipoDeProduto = TipoDeProduto.OST;
                        break;
                }
                Produto produto = new Produto(nome, descricao, preco, desenvolvedor, tipoDeProduto);
                desenvolvedor.adicionarProduto(produto);
                loja.adicionarProduto(produto);
                break;
            case 3:
                System.out.println("Insira o nome do produto:");
                nome = scanner.nextLine();
                desenvolvedor.removerProduto(nome);
                break;
            default:
                break;
        }
    } 
}

