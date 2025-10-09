package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Pedro", 19);

        funcionario.setSalarios(new double[]{2000, 900, 3200});

        double result = funcionario.mediaSalarial();

        System.out.println(funcionario.toString());
    }
}
