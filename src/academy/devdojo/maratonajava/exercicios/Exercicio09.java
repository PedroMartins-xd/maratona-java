package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
        leia o seu peso e sua altura e imprima na tela sua condição
        de acordo com a tabela abaixo:

        Fórmula do IMC = peso / (altura) ²

        Tabela Condições IMC
        Abaixo de 18,5   | Abaixo do peso
        Entre 18,6 e 24,9 | Peso ideal (parabéns)
        Entre 25,0 e 29,9 | Levemente acima do peso
        Entre 30,0 e 34,9 | Obesidade grau I
        Entre 35,0 e 39,9 | Obesidade grau II (severa)
        Maior ou igual a 40 | Obesidade grau III (mórbida)
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura M");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso em Kg");
        double peso = sc.nextDouble();

        final double FORMULA_IMC = peso / (altura * altura);
        double resultado = FORMULA_IMC;

        if (resultado <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (resultado >= 18.6 && resultado <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (resultado >= 25 && resultado <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (resultado >= 30 && resultado <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (resultado >= 35 && resultado <= 34.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }

        sc.close();
    }
}
