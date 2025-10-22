package academy.devdojo.maratonajava.javacore.classeabstrata.test;

import academy.devdojo.maratonajava.javacore.classeabstrata.model.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classeabstrata.model.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Flaco", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 10000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
        gerente.imprime();
    }
}
