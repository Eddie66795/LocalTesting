package Locale;

import java.util.Locale;

public class LocaleMain {

    public LocaleMain() {
        println("LocaleMain: Start");
        local1();
        println("LocaleMain: End");
    }

    // Create a generic English-speaking locale.
    public void local1() {
        Locale locale = new Locale("en");
        println(locale.getDisplayCountry());
    }

    // Create an English-speaking, Canadian locale.
    public void local2() {
        Locale locale = new Locale("en", "CA");
        println(locale.getDisplayCountry());
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
