package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Pedro"; // String constant pool
        String nome2 = "Pedro";
        nome = nome.concat(" Rodrigo");

        System.out.println(nome);
        System.out.println(nome == nome2); // nome += " Rodrigo"

        String nome3 = new String("Pedro");

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
