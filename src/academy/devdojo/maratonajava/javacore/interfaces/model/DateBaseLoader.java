package academy.devdojo.maratonajava.javacore.interfaces.model;

public class DateBaseLoader implements DataLoader, DataRemover {

    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
}
