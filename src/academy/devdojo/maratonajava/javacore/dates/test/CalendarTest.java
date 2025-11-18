package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        // Classe Date e Calendar sao usadas em sistemas legados
        // Sistemas modernos usam java.time

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2); // add sempre vira o dia/mes/ano
        c.roll(Calendar.HOUR, 20); // roll volta contar no mesmo dia

        Date date = c.getTime();

        System.out.println(date);
    }
}
