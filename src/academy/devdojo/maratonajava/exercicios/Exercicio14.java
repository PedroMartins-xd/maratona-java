package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba um valor A e B, e troque o valor de A por B
        e o valor de B por A e imprima na tela os valores.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double a = sc.nextDouble();

        System.out.println("Digite um outro valor:");
        double b = sc.nextDouble();

        double c = a;
        a = b;
        b = c;

        System.out.println("\nApós a troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}
