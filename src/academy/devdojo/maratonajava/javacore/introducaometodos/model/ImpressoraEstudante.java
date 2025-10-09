package academy.devdojo.maratonajava.javacore.introducaometodos.model;

public class ImpressoraEstudante {

    public void imprimir(Estudante estudante) {
        System.out.println("--------------------");
        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());
    }
}
