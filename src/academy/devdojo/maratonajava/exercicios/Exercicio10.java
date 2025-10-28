package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia três notas obtidas por um aluno,
        e imprima na tela a média das notas.
         */

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        double soma = 0;

        // Faz com que o codigo fique mais escalavel
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota:%n", i + 1);
            notas[i] = sc.nextDouble();
            soma += notas[i]; // acumula a soma
        }

        final double CALCULO_MEDIA = soma / notas.length;
        // final double CALCULO_MEDIA = (notas[0] + notas[1] + notas[2]) / notas.length;

        System.out.printf("\nA média de notas do aluno é: %.2f", CALCULO_MEDIA);
    }
}
