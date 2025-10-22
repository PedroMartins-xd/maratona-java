package academy.devdojo.maratonajava.javacore.interfaces.model;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    // uma forma de adicionar um metodo sem que ele quebre os codigos
    default void checkPermission() {
        System.out.println("Fazendo chacagem de permissões");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
