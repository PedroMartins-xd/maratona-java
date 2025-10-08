package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.model.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro gol = new Carro("Gol", "Volkswagen", 2002);
        Carro uno  = new Carro("Uno", "Fiat", 2000);

        System.out.println(gol.toString());
        System.out.println(uno.toString());
    }
}
