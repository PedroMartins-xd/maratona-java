package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.model.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante.setNome("Pedro");
        estudante.setIdade(19);
        estudante.setSexo('M');

        estudante2.setNome("Isabella");
        estudante2.setIdade(17);
        estudante2.setSexo('F');

        impressoraEstudante.imprimir(estudante);
        impressoraEstudante.imprimir(estudante2);

        System.out.println(estudante.toString());
        System.out.println(estudante2.toString());
    }
}
