package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia um valor qualquer e
        imprima na tela com um reajuste de 5%.
         */

        Scanner sc = new Scanner(System.in);

        final double PORCENTAGEM_REAJUSTE = 0.05;

        System.out.println("Digite um valor: ");
        double num = sc.nextDouble();

        double reajuste = num * PORCENTAGEM_REAJUSTE;
        double resultado = num + reajuste;

        System.out.println(reajuste);
        System.out.println(resultado);

        sc.close();
    }
}