package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 5", 2000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------------------------");

        Produto produto2 = new Tomate("Tomate Rei", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("---------------------------------");
    }
}
