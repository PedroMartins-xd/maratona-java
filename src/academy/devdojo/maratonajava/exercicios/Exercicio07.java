package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores booleanos
         (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor booleano");
        boolean a = sc.nextBoolean();

        System.out.println("Digite outro valor booleano");
        boolean b = sc.nextBoolean();

        System.out.println(a == b);
    }
}
