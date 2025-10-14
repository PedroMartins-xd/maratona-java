package academy.devdojo.maratonajava.javacore.modificadorestatico.model;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadedMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadedMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadedMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadedMaxima(double velocidadedMaxima) {
        this.velocidadeMaxima = velocidadedMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void imprime() {
        System.out.println("---------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("velocidade limite: " + Carro.velocidadeLimite);
    }
}
