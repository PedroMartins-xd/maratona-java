package academy.devdojo.maratonajava.javacore.exception.exception.model;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    /*
    1 - Pode nao lançar nenhuma exceçao
    2 - Pode lançar uma ou todas as excoçoes
    3 - Pode adicionar qualquer exceçao do tipo unchecked
    4 - Nao pode adicionar exceçoes mais genericas ou do tipo checked
    5 - Nao pode adicionar nenhuma exceçao do tipo checked que nao foi declarado no
        metodo original
     */
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionario");
    }
}
