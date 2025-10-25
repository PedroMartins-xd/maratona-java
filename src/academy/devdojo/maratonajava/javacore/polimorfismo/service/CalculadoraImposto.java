package academy.devdojo.maratonajava.javacore.polimorfismo.service;

import academy.devdojo.maratonajava.javacore.polimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Tomate;

public class CalculadoraImposto {

    /*
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relátorio de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador " + computador.getNome());
        System.out.println("Valor: R$" + computador.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relátorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do tomate " + tomate.getNome());
        System.out.println("Valor: R$" + tomate.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
    }
     */

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

        if (produto instanceof Tomate) {
            //Tomate tomate = (Tomate) produto;
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
