package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 5", 2000);

        Tomate tomate = new Tomate("Tomate Rei", 20);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
