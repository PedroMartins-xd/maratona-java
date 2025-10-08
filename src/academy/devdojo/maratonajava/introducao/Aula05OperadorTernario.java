package academy.devdojo.maratonajava.introducao;

public class Aula05OperadorTernario {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "EU vou doar 500 pro devdojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes";

        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        // (condicao) ? verdadeiro : false
    }
}
