package academy.devdojo.maratonajava.javacore.enumeracao.model;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String NOMERELATORIO;

    TipoCliente(int VALOR, String NOMERELATORIO) {
        this.VALOR = VALOR;
        this.NOMERELATORIO = NOMERELATORIO;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.NOMERELATORIO.equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return  null;
    }
}
