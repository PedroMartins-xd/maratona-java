package academy.devdojo.maratonajava.javacore.string.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Pedro Rodrigo"; // String immutable
        nome.concat(" Martins");
        nome = nome.substring(0, 3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Pedro Rodrigo");
        sb.append(" Martins").append(" da Silva");
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
