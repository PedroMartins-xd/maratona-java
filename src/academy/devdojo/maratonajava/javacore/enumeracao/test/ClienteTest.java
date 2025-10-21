package academy.devdojo.maratonajava.javacore.enumeracao.test;

import academy.devdojo.maratonajava.javacore.enumeracao.model.Cliente;
import academy.devdojo.maratonajava.javacore.enumeracao.model.TipoCliente;
import academy.devdojo.maratonajava.javacore.enumeracao.model.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(TipoCliente.PESSOA_FISICA,
                TipoPagamento.DEBITO ,"Pedro");
        Cliente cliente2 = new Cliente(TipoCliente.PESSOA_JURIDICA,
                TipoPagamento.CREDITO,"Isabella");

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Juridica");
        System.out.println(tipoCliente2);
    }
}
