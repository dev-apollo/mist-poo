package classes.utilitarios;

import classes.usuarios.Cliente;
import classes.usuarios.Desenvolvedor;
import classes.usuarios.Usuario;

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
        System.out.println("O que deseja fazer agora?\n[1] - Visualizar biblioteca\n[2] - Adicionar produto à biblioteca\n[3] - Remover produto da biblioteca\n[4] - Avaliar produto da biblioteca\n[0] - Sair");
    }

    private void exibirMenuDesenvolvedor(){
        System.out.println("O que deseja fazer agora?\n[1] - Visualizar acervo\n[2] - Adicionar produto ao acervo\n[3] - Remover produto do acervo\n[4] - Editar produto do acervo\n[0] - Sair");
    }

    public void receberOpcao(Usuario usuario, int opcao){
        if(usuario instanceof Cliente) {
            Cliente cliente = (Cliente) usuario;
            this.receberOpcaoCliente(cliente, opcao);
        }else if(usuario instanceof Desenvolvedor) {
            Desenvolvedor desenvolvedor = (Desenvolvedor) usuario;
            this.receberOpcaoDesenvolvedor(desenvolvedor, opcao);
        }else{
            System.out.println("Erro ao receber opção.");
        }
    }

    private void receberOpcaoCliente(Cliente cliente, int opcao){
        switch (opcao) {
            case 0:
                break;
            case 1:
                cliente.visualizarBiblioteca();
                break;
            case 2:
                //adicionarProduto
                break;
            case 3:
                //removerProduto
                break;
            case 4:
                //avaliarProduto
                break;
            default:
                break;
        }
    } 

    private void receberOpcaoDesenvolvedor(Desenvolvedor desenvolvedor, int opcao){
        switch (opcao) {
            case 0:
                break;
            case 1:
                desenvolvedor.visualizarAcervo();
                break;
            case 2:
                //adicionarProduto
                break;
            case 3:
                //removerProduto
                break;
            case 4:
                //avaliarProduto
                break;
            default:
                break;
        }
    } 
}

