package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o valor do salário mínimo e o valor do salário
        de um usuário, calcule quantos salários mínimos esse
        usuário ganha e imprima na tela o resultado.
        (Base para o Salário mínimo R$ 1.293,20).
         */

        Scanner sc = new Scanner(System.in);

        final double SALARIO_MINIMO = 1293.20;

        System.out.println("Digite seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double resultado = salarioUsuario / SALARIO_MINIMO;
        // double formatado = Math.floor(resultado);

        System.out.printf("Você ganha aproximadamente %.0f salário(s) mínimo(s).%n", resultado);

        sc.close();
    }
}
