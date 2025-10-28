package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o valor de um produto e determine o
        valor que deve ser pago, conforme a escolha da forma de pagamento
        pelo comprador e imprima na tela o valor final do produto a ser pago.
        Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

        Tabela de Código de Condições de Pagamento

        1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
        2 - À Vista no cartão de crédito, recebe 10% de desconto
        3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
        4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
        */

        Scanner in = new Scanner(System.in);

        final double PIX = 0.15;
        final double CREDITO = 0.10;
        final double PARCELADO_3X_MAIS = 0.10;

        double valor = 2500.5;
        int opcao;

        do {
            System.out.println("\nProduto: Corrente de Ouro - R$ " + valor);
            System.out.println("""
                1 - À Vista em Dinheiro ou Pix (15% de desconto)
                2 - À Vista no Cartão de Crédito (10% de desconto)
                3 - Parcelado em 2x (sem juros)
                4 - Parcelado em 3x ou mais (juros de 10%)
                5 - Sair
                """);

            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();

            double soma;

            switch (opcao) {
                case 1 -> {
                    soma = valor - (valor * PIX);
                    System.out.printf("Valor final com desconto: R$ %.2f%n", soma);
                }
                case 2 -> {
                    soma = valor - (valor * CREDITO);
                    System.out.printf("Valor final com desconto: R$ %.2f%n", soma);
                }
                case 3 -> {
                    soma = valor;
                    System.out.printf("Valor total: R$ %.2f (2x de R$ %.2f)%n",
                            soma, valor / 2);
                }
                case 4 -> {
                    System.out.println("Quantas parcelas (minímo 3) ?");
                    int parcelas = in.nextInt();
                    if (parcelas < 3) {
                        System.out.println("Número de parcelas inválido para esta" +
                                " opção (deve ser >= 3).");
                    } else {
                        double somaComJuros = valor + (valor * PARCELADO_3X_MAIS);
                        System.out.printf("Valor total com juros (10%%): R$ %.2f%n", somaComJuros);
                        System.out.printf("Parcelado em %dx de R$ %.2f%n", parcelas, somaComJuros / parcelas);
                    }
                }
                case 5 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        in.close();
    }
}
