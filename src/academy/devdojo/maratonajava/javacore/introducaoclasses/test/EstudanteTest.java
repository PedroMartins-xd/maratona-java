package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.model.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante("Pedro", 19, 'M');
        estudante.setIdade(20);

        System.out.println(estudante.toString());
    }
}
