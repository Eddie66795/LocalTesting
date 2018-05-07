import java.util.Locale;

public class Main {

    /*  There are 3 types of constructors for the Locals:
         1. Locale(String language)
         2. Locale(String language, String country)
         3. Locale(String language, String country, String variant)
    */
    public Main() {
        local1();
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
        new Main();
    }
}
