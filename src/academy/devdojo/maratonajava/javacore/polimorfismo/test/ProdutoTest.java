package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {

        Computador computador = new Computador("Mac m4", 8000);
        Tomate tomate = new Tomate("Tomatão", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 4000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
