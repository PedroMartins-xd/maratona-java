package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima
        // na tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double A = sc.nextDouble();

        System.out.println("Digite outro numero: ");
        double B = sc.nextDouble();

        System.out.println("Digite outro numero: ");
        double C = sc.nextDouble();

        double soma = A + B;

        if (soma > C) {
            System.out.println("A soma de A e B é de: " + soma);
        } else {
            System.out.println("A soma dos numeros A e B não são maior que C");
        }

        sc.close();
    }
}
