package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.model.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Vitor Roque");
        Jogador jogador2 = new Jogador("Flaco Lopes");
        Time time = new Time("Palmeiras");

        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("======== Jogadores =========");
        jogador.imprime();

        System.out.println("======== Time =========");
        time.imprime();
    }
}
