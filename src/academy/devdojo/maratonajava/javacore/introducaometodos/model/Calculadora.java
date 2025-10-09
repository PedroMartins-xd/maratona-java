package academy.devdojo.maratonajava.javacore.introducaometodos.model;

public class Calculadora {

    public int somaDoisNumeros(int a, int b) {
        return a + b;
    }

    public int subtrairDoisNumeros(int a, int b) {
        return a - b;
    }

    public int multiplicaDoisNumeros(int a, int b) {
        return a * b;
    }

    public int divisaoDoisNumeros(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a / b;
    }

    /*
    public void divisaoDoisNumeros(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Não existe divisão por zero");
            return; funciona como se fosse um brake
        }
        System.out.println(a / b);
    }
     */

    public void alteraDoisNumeros(int numero, int numero2) {
        numero = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros: ");
        System.out.println("Num: " + numero);
        System.out.println("Num2: " + numero2);
    }
}