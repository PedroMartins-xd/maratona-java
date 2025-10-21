package academy.devdojo.maratonajava.javacore.enumeracao.model;

public class Cliente {

    private TipoCliente tipoCliente;
    private String nome;

    public Cliente(TipoCliente tipoCliente, String nome) {
        this.tipoCliente = tipoCliente;
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoCliente=" + tipoCliente +
                ", nome='" + nome + '\'' +
                '}';
    }
}
