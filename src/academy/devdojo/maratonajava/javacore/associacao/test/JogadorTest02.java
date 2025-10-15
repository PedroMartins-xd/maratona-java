package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Fenomeno");
        Time time = new Time("Seleçao Brasileira");

        jogador.setTime(time);

        jogador.imprime();
    }
}
