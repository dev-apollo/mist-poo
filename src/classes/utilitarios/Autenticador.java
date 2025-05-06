package classes.utilitarios;

import java.util.List;
import classes.usuarios.Usuario;

public class Autenticador {
    public Usuario logar(List<Usuario> usuarios, String email, String senha){
        for (Usuario u : usuarios) {
            if(u.getEmail().equals(email) && u.getSenha().equals(senha)){
                return u;
            }
        }
        return null;
    }
}
