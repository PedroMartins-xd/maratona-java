package academy.devdojo.maratonajava.javacore.modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.modificadorfinal.model.Carro;
import academy.devdojo.maratonajava.javacore.modificadorfinal.model.Ferrari;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Pedro");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Spyder");
        ferrari.imprime();
    }
}
