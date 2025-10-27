package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba um número inteiro e imprima
        na tela o seu antecessor e o seu sucessor.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();

        System.out.println("Antecessor do numero " + num + " é: " + (num - 1));
        System.out.println("sucessor do numero " + num + " é: " + (num + 1));

        sc.close();
    }
}
