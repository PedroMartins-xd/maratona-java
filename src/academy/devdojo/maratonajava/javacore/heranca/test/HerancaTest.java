package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.model.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.model.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.model.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro Rodrigo");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Isabella");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------------");
        funcionario.imprime();
    }
}
