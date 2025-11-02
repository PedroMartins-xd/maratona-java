package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: (Tabuada de 1 a 10)");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + (num * i));
        }

        in.close();
    }
}
