package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime("Akudama Drive", "TV", 12,
                "Ação");

        Anime anime2 = new Anime("Death Note", "TV", 23);

        System.out.println(anime.toString());
        System.out.println(anime2.toString());
    }
}
