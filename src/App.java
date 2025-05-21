import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Loja;
import classes.produtos.Produto;
import classes.usuarios.Cliente;
import classes.usuarios.Desenvolvedor;
import classes.usuarios.Usuario;
import classes.utilitarios.Autenticador;
import classes.utilitarios.Menu;
import enums.TipoDeProduto;

public class App {
    public static void main(String[] args) throws Exception {
        //Utilitários
        Autenticador autenticador = new Autenticador();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        Loja l1 = new Loja();

        Cliente c1 = new Cliente("Apollo", "apollo@email.com","ap123");
        Desenvolvedor d1 = new Desenvolvedor("Devolver Digital", "devolver@email.com","dev123");
        Desenvolvedor d2 = new Desenvolvedor("Behemoth", "behemoth@email.com","beh123");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(c1);
        usuarios.add(d1);
        usuarios.add(d2);

        Produto p1 = new Produto("Enter the Gungeon", "Pow pow pow", 29.90, d1, TipoDeProduto.Jogo);
        Produto p2 = new Produto("Enter the Gungeon OST", "Pow pow pow (de forma harmonica)", 0, d1, TipoDeProduto.OST);
        Produto p3 = new Produto("Castle Crashers Demo", "Altas aventuras demonstrativas", 0, d2, TipoDeProduto.Jogo);

        d1.adicionarProduto(p1);
        d1.adicionarProduto(p2);
        d2.adicionarProduto(p3);

        l1.adicionarProduto(p1);
        l1.adicionarProduto(p2);
        l1.adicionarProduto(p3);

        Usuario u1 = null;

        while (u1 == null) {
            System.out.println("Insira o seu email:");
            String email = scanner.nextLine();
            System.out.println("Insira a sua senha:");
            String senha = scanner.nextLine(); 

            u1 = autenticador.logar(usuarios, email, senha);
            if(u1 != null){
                System.out.println("Login efetuado com sucesso.");
            }else{
                System.out.println("Email ou senha inválida.");
            }
        }
        System.out.println("Seja bem-vindo, "+u1.getNome()+"!");
        int opcao = 1;
        while(opcao != 0){
            menu.exibirMenu(u1);
            opcao = scanner.nextInt();
            scanner.nextLine();
            menu.receberOpcao(u1, opcao, scanner, l1);
        };
        System.out.println("Saindo...");
        scanner.close();
    }
}
 