package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000'''
        // boolean false
        // string null

        String[] nomes = new String[3];
        nomes[0] = "Pedro";
        nomes[1] = "Ana";
        nomes[2] = "Claudio";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
