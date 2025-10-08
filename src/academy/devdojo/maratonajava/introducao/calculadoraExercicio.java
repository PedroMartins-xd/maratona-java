package academy.devdojo.maratonajava.introducao;

public class calculadoraExercicio {

    /*
    Desafio: criar uma calculadora que valida se um numero é primo ou não,
    retornar true se for, false se não

    Desafio2: Criar uma calculadora que recebe uma lista/array,
    retorna a lista x2
     */

    public boolean isPrimo (int num) {
        for (int i = 0; i <= num; i++) {
            if (num % i == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
