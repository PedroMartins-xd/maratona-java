package academy.devdojo.maratonajava.exercicios;

public class Exercicio18 {
    public static void main(String[] args) {
        /*
        Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m
        e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na
        tela em quantos anos serão necessários para que Sara seja maior que Francisco.
         */

        double francisco = 1.5;
        double sara = 1.1;
        int anos = 0;

        do {
            francisco += 0.02;
            sara += 0.03;
            anos++;
        } while (francisco > sara);

        System.out.printf("Vai levar %d anos para que Sara fique maior que Francisco.%n", anos);
        System.out.printf("Altura final de Sara: %.2f m%n", sara);
        System.out.printf("Altura final de Francisco: %.2f m%n", francisco);
    }
}
