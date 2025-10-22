package academy.devdojo.maratonajava.javacore.interfaces.test;

import academy.devdojo.maratonajava.javacore.interfaces.model.DataLoader;
import academy.devdojo.maratonajava.javacore.interfaces.model.DateBaseLoader;
import academy.devdojo.maratonajava.javacore.interfaces.model.FileLoader;

public class DateLoaderTest {
    public static void main(String[] args) {

        DateBaseLoader dateBaseLoader = new DateBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dateBaseLoader.load();
        fileLoader.load();

        dateBaseLoader.remove();
        fileLoader.remove();

        dateBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
    }
}
