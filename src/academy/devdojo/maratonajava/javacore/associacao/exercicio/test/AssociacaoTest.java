package academy.devdojo.maratonajava.javacore.associacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.associacao.exercicio.model.Aluno;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.model.Local;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.model.Professor;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.model.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        Local local = new Local("Avenida Europa, 251");
        Aluno aluno = new Aluno("Pedro", 19);
        Professor professor = new Professor("Cristovão", "Java");

        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece",
                alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
