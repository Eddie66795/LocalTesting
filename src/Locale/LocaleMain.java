package Locale;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class LocaleMain {

    public LocaleMain() {
        println("LocaleMain: Start");
        boolean test = isValidLocale("test");
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

    //Pass in the required Local and see if it is contained in the list of supported Locals
    boolean isValidLocale(String value) {
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            if (value.equals(locale.toString())) {
                return true;
            }
        }
        return false;
    }

    // Create an English-speaking, Canadian locale.
    public void local2() {
        Locale locale = new Locale("en", "CA");
        String localCountryCode = locale.getDisplayCountry();

        // Get the current time in Hong Kong
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(localCountryCode));
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
