package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule
        a média das nota obtidas, imprima na tela o nome do aluno e
        se o aluno foi aprovado ou reprovado. Para o aluno ser
        considerado aprovado sua média final deve ser maior ou igual a 7.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.next();

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota:%n", i + 1);
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        final double CALCULO_MEDIA = soma / notas.length;

        if (CALCULO_MEDIA < 6) {
            System.out.println("Nome: " + nome + " foi reprovado");
        } else if (CALCULO_MEDIA >= 6 && CALCULO_MEDIA < 7) {
            System.out.println("Nome: " + nome + " está de recuperação");
        } else {
            System.out.println("Nome: " + nome + " foi aprovado");
        }

        System.out.println("Nota final: " + CALCULO_MEDIA);
    }
}
