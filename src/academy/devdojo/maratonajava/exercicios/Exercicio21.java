package academy.devdojo.maratonajava.exercicios;

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {
        /*
         Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

         Random → mais flexível (bom pra jogos, simulações, sorteios).
         Math.random() → ótimo pra casos simples.
         */

        Random random = new Random();

        int numAleatorio = random.nextInt(101);
        // int numAleatorio = (int) (Math.random() * 101);

        System.out.println(numAleatorio);
    }
}
