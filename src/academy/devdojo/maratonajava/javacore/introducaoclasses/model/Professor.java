package academy.devdojo.maratonajava.javacore.introducaoclasses.model;

public class Professor {

    public String nome;
    public int idade;
    public char sexo;

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
