package academy.devdojo.maratonajava.javacore.exception.exception.test;

import academy.devdojo.maratonajava.javacore.exception.exception.model.Funcionario;
import academy.devdojo.maratonajava.javacore.exception.exception.model.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.exception.exception.model.Pessoa;

public class SobrescritaComExcpetionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
