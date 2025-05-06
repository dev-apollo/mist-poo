import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.usuarios.Cliente;
import classes.usuarios.Desenvolvedor;
import classes.usuarios.Usuario;
import classes.utilitarios.Autenticador;

public class App {
    public static void main(String[] args) throws Exception {
        Autenticador autenticador = new Autenticador();
        Scanner scanner = new Scanner(System.in);

        // Logins para a 1ª Entrega
        Cliente c1 = new Cliente("Apollo", "apollo@email.com","ap123");
        Desenvolvedor d1 = new Desenvolvedor("Devolver Digital", "devolver@email.com","dev123");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(c1);
        usuarios.add(d1);

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
        scanner.close();
    }
}
 