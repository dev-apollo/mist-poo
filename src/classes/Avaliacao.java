package classes;

import classes.usuarios.Cliente;

public class Avaliacao {
    private Cliente avaliador;
    private int nota;

    public Avaliacao(Cliente avaliador, int nota){
        this.avaliador = avaliador;
        this.nota = nota;
    }
}
