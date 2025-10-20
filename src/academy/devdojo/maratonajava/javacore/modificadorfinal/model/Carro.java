package academy.devdojo.maratonajava.javacore.modificadorfinal.model;

public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    // A referencia que essa variavel COMPRADOR
    // tem para esse objeto nunca podera ser alterada

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime() {
        // esse metodo nunca poderá ser sobrescrito
        System.out.println(this.nome);
    }
}
