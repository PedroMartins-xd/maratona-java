package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela
        o nome da pessoa e se ela é maior ou menor de idade.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.next();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Nome: " + nome);

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }

        sc.close();
    }
}
