package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.repository.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        Repositorio repositorio2 = new RepositorioArquivo();
        repositorio2.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Brooly");
        System.out.println(list);
    }
}
