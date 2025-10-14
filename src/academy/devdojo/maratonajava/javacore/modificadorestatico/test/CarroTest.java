package academy.devdojo.maratonajava.javacore.modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.modificadorestatico.model.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro("Porsche 911", 310);
        Carro carro2 = new Carro("BMW M3", 320);
        Carro carro3 = new Carro("Golf GTI", 260);

        Carro.setVelocidadeLimite(180);

        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
