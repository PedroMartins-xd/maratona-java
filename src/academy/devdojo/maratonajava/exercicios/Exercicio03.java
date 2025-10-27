package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores inteiros A e B, se os valores de
        A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B. Ao final de qualquer um dos
        cálculos deve-se atribuir o resultado a uma variável C e
        imprimir seu valor na tela.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double a = sc.nextDouble();

        System.out.println("Digite outro número: ");
        double b = sc.nextDouble();

        double c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println(c);

        sc.close();
    }
}
