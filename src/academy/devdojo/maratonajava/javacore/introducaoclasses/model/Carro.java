package academy.devdojo.maratonajava.javacore.introducaoclasses.model;

public class Carro {

    private String nome;
    private String modelo;
    private int ano;

    public Carro(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
