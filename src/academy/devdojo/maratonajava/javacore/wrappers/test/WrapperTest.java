package academy.devdojo.maratonajava.javacore.wrappers.test;

public class WrapperTest {
    public static void main(String[] args) {
        int intP = 1;
        char charP = 'P';
        boolean booleanP = true;

        // Agora sao Classes nao primitivos
        Integer intM = 1;  // autoboxing
        Character charM = 'P';
        Boolean booleanM = true;

        int i = intM; // unboxing
        Integer intW = Integer.parseInt("2");

        System.out.println("===============================");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
