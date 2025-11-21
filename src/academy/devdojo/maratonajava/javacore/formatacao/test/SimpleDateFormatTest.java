package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {

        // String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Amsterdam 18 de November de 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
