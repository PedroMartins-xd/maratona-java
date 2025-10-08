package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, boolean, byte, long

        int idade = (int) 10000000000L;
        long numeroGrande = 2000000;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D; // casting
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        var nome2 = "Pedro Rodrigo";

        String nome = "Pedro";

        System.out.println(idade);
        System.out.println(verdadeiro);
        System.out.println(nome);
    }
}
