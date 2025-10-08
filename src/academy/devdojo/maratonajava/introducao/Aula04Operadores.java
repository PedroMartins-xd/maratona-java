package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero1 * numero2);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMaiorQueVinte);

        // &&(and) ||(or) !(not)
        int idade = 35;
        float salrio = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salrio >= 4500;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salrio >= 3600;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente >= valorPlaystation
                || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println(isPlaystationCompravel);

        // = += -= *= /= %=
    }
}
