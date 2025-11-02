package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia três valores que representam os três lados de
        um triângulo e verifique se são válidos, determine se o triângulo é
        equilátero, isósceles ou escaleno.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        double a = in.nextDouble();

        System.out.println("Digite o segundo lado:");
        double b = in.nextDouble();

        System.out.println("Digite o terceiro lado:");
        double c = in.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triangulo Equilátero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Triangulo Escaleno");
            } else {
                System.out.println("Triangulo Isóceles");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }

        in.close();
    }
}
