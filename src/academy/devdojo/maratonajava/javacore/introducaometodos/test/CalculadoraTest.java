package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultSoma = calculadora.somaDoisNumeros(20, 10);
        int resultSubtracao = calculadora.subtrairDoisNumeros(30, 10);
        int resultMultiplicacao = calculadora.multiplicaDoisNumeros(10, 5);
        int resultDivisao = calculadora.divisaoDoisNumeros(10, 5);

        System.out.println(resultSoma);
        System.out.println(resultSubtracao);
        System.out.println(resultMultiplicacao);
        System.out.println(resultDivisao);
    }
}
