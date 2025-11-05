package academy.devdojo.maratonajava.javacore.exception.runtime.test;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Unchecked -> nao precisa fazer validação para compilar(desenvolvedor errou)
        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
