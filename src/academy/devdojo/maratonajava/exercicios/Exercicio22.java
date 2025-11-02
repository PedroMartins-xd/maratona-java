package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores inteiros A e B,
        imprima na tela o quociente e o resto da divisão inteira entre eles.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int a = in.nextInt();

        System.out.println("Digite outro valor inteiro:");
        int b = in.nextInt();

        int quociente = a / b;
        int resto = a % b;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

        in.close();
    }
}
