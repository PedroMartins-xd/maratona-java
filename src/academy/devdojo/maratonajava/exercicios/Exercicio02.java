package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo para receber um número qualquer e imprimir na
        tela se o número é par ou ímpar, positivo ou negativo.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = sc.nextDouble();

        if (num >= 0) {
            System.out.println("O numero: " + num + " é POSITIVO");
        } else {
            System.out.println("O numero: " + num + " é NEGATIVO");
        }

        if (num % 2 == 0) {
            System.out.println("O numero: " + num + " é PAR");
        } else {
            System.out.println("O numero: " + num + " é IMPAR");
        }

        sc.close();
    }
}
