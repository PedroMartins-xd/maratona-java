package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
        As informações fornecidas serão: valor da hora aula, número de aulas
        lecionadas no mês e percentual de desconto do INSS. Imprima na tela
        o salário líquido final.
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula: ");
        double valorHoraAula = in.nextDouble();

        System.out.print("Digite o número de aulas lecionadas no mês: ");
        int aulas = in.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentualINSS = in.nextDouble();

        double salarioBruto = valorHoraAula * aulas;
        double descontoINSS = salarioBruto * (percentualINSS / 100);
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", descontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        in.close();
    }
}
