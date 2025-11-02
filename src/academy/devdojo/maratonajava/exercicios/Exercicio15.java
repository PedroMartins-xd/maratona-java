package academy.devdojo.maratonajava.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela
        quantos anos, meses e dias essa pessoa ja viveu. Leve em
        consideração o ano com 365 dias e o mês com 30 dias.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o ano em que você nasceu:");
        int anoNascimento = in.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int calcularAnos = anoAtual - anoNascimento;
        int calcularMes = calcularAnos * 12;
        int calcularDias = calcularAnos * 365;

        System.out.println("Você viveu " + calcularAnos + " anos, " + calcularMes +
                " meses, " + calcularDias + " dias.");
    }
}
