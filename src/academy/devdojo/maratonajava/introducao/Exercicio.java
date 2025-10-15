package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua idade: ");
        // O java so coleta dados de string
        String idadeUsuario = sc.next();

        int idade;

        try {
            // Estou convertendo para inteiro
            idade = Integer.parseInt(idadeUsuario);
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida. Use apenas números.");
            sc.close();
            return;
        }

        System.out.println("Ola, " + nome + "! Você tem " + idade + " anos.");

        sc.close();

        return;
    }
}
