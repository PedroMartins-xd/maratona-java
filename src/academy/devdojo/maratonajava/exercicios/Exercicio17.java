package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a
        temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
        Fórmula: C = (5 * ( F-32) / 9)
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Fahrenheit:");
        double f = in.nextDouble();

        double c = (5 * (f - 32) / 9);

        System.out.printf("%nTemperatura em Fahrenheit: %.2f°F%n", f);
        System.out.printf("Temperatura em Celsius: %.2f°C%n", c);

        in.close();
    }
}
