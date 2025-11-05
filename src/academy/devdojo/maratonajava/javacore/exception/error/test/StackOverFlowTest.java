package academy.devdojo.maratonajava.javacore.exception.error.test;

public class StackOverFlowTest {
    public static void main(String[] args) {

        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
