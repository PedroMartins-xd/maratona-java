package academy.devdojo.maratonajava.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
            Faça um algoritmo que leia três valores inteiros diferentes
            e imprima na tela os valores em ordem decrescente.
        */

        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        System.out.println("Digite o primeiro valor: ");
        valores[0] = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        valores[1] = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        valores[2] = sc.nextInt();

        if (valores[0] == valores[1] && valores[1] == valores[2]) {
            System.out.println("Os números são iguais");
        } else {
            Arrays.sort(valores); // ordena em ordem crescente

            System.out.println("\nOrdem decrescente: ");
            for (int i = valores.length -1; i >= 0; i--) {
                System.out.println(valores[i]);
            }
        }

        sc.close();
    }
}
