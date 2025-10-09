package academy.devdojo.maratonajava.javacore.introducaometodos.model;

import java.util.Arrays;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salarios=" + Arrays.toString(salarios) +
                ", mediaSalarial=" + mediaSalarial() +
                '}';
    }

    public double mediaSalarial() {
        double media = 0;
        if (this.salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        }
        return media;
    }   
}
