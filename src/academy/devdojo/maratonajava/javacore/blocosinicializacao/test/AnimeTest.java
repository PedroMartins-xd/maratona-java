package academy.devdojo.maratonajava.javacore.blocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosinicializacao.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
