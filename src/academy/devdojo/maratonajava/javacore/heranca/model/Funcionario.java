package academy.devdojo.maratonajava.javacore.heranca.model;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void relatorioDePagamento() {
        System.out.println("Eu " + this.nome +
                " recebi o salário de R$" + this.salario);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
}
