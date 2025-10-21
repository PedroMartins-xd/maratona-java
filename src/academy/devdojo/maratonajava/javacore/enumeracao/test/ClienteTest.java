package academy.devdojo.maratonajava.javacore.enumeracao.test;

import academy.devdojo.maratonajava.javacore.enumeracao.model.Cliente;
import academy.devdojo.maratonajava.javacore.enumeracao.model.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(TipoCliente.PESSOA_FISICA, "Pedro");
        Cliente cliente2 = new Cliente(TipoCliente.PESSOA_JURIDICA, "Isabella");
        Cliente cliente3 = new Cliente(TipoCliente.PESSOA_FISICA, "Shake");
        Cliente cliente4 = new Cliente(TipoCliente.PESSOA_JURIDICA, "Clarinha");

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
