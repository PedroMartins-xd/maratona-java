package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.model.Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Claudemir";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println(professor.toString());
    }
}
