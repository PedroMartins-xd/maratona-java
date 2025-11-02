package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que calcule a quantidade de litros de combustível gastos
        em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer
        ao usuário o tempo que será gasto na viagem a sua velocidade média,
        distância percorrida e a quantidade de litros utilizados para fazer a viagem.

        Fórmula: distância = tempo x velocidade.
        litros usados = distância / 12.

        extra: calcular valor gasto em dinheiro na viagem
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o tempo (em horas) da viagem: ");
        double tempo = in.nextDouble();

        System.out.print("Digite a velocidade média (km/h): ");
        double velocidadeMedia = in.nextDouble();

        System.out.print("Digite o valor do combustível (R$ por litro): ");
        double precoCombustivel = in.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12;
        double valorGasto = precoCombustivel * litrosUsados;

        System.out.println("\n========== RESUMO DA VIAGEM ============");
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Tempo de viagem: %.2f h%n", tempo);
        System.out.printf("Velocidade média: %.2f km/h%n", velocidadeMedia);
        System.out.printf("Litros de combustível usados: %.2f L%n", litrosUsados);
        System.out.printf("Valor gasto: R$ %.2f%n", valorGasto);
    }
}
