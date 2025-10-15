package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei com sim ou não");

        String pergunta = in.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÂO");
        }
    }
}
