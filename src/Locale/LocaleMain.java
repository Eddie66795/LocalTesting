package Locale;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class LocaleMain {

    public LocaleMain() {
        println("LocaleMain: Start");
        local2();
        println("LocaleMain: End");
    }

    void getLocalList() {
        Locale[] localeList = NumberFormat.getAvailableLocales();
        println("Test: " + localeList.length);
        for (Locale g: localeList) {
            System.out.println(g);
        }
    }

    // Create a generic English-speaking locale.
    public void local1() {
        Locale locale = new Locale("en");
        println(locale.getDisplayCountry());
    }

    // Create an English-speaking, Canadian locale.
    public void local2() {
        Locale locale = new Locale("en", "CA");
        String test = locale.getDisplayCountry();

        // Get the current time in Hong Kong
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("Hongkong"));
        int hour12 = cal.get(Calendar.HOUR); // 0..11
        int minutes = cal.get(Calendar.MINUTE); // 0..59
        int seconds = cal.get(Calendar.SECOND); // 0..59
        boolean am = cal.get(Calendar.AM_PM) == Calendar.AM;

        println(hour12);
        println(minutes);
        println(seconds);
        if(am) {
            println("AM");
        } else {
            println("PM");
        }
    }

    // Create a very specific English-speaking, U.S. locale
    // for Silicon Valley.
    public void local3() {
        Locale locale = new Locale("en", "US", "SiliconValley");
        println(locale.getDisplayCountry());
    }

    public void println(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new LocaleMain();
    }
}
