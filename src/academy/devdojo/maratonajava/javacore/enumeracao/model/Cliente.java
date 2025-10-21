package academy.devdojo.maratonajava.javacore.enumeracao.model;

public class Cliente {

    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    private String nome;

    public Cliente(TipoCliente tipoCliente, TipoPagamento tipoPagamento, String nome) {
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.nome = nome;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
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
                "tipoCliente=" + tipoCliente.NOMERELATORIO +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                ", nome='" + nome + '\'' +
                '}';
    }
}
