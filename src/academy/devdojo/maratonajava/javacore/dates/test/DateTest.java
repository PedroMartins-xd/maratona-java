package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1763391237319L); // long 100000
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);
    }
}
