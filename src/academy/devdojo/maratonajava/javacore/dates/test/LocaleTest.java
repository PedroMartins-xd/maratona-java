package academy.devdojo.maratonajava.javacore.dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {

        // pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italy: " + df.format(calendar.getTime()));
        System.out.println("Switzerland: " + df2.format(calendar.getTime()));
        System.out.println("india: " + df3.format(calendar.getTime()));
        System.out.println("Japan: " + df4.format(calendar.getTime()));
        System.out.println("Netherlands: " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeItaly.getDisplayLanguage(localeJapao));
    }
}
