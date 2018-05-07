import java.util.Locale;

public class Main {

    /*  There are 3 types of constructors for the Locals:
         1. Locale(String language)
         2. Locale(String language, String country)
         3. Locale(String language, String country, String variant)
    */
    public Main() {
        local1();
        // local2();
        // local3();
    }

    // Create a generic English-speaking locale.
    public void local1() {
        Locale locale = new Locale("en");
        String country_code = locale.getDisplayCountry();
        println("test");
        println(country_code);
    }

    // Create an English-speaking, Canadian locale.
    public void local2() {
        Locale locale2 = new Locale("en", "CA");
    }

    // Create a very specific English-speaking, U.S. locale
    // for Silicon Valley.
    public void local3() {
        Locale locale3 = new Locale("en", "US", "SiliconValley");
    }

    public void println(Object x) {
        System.out.println(x);
    }



    public static void main(String[] args) {
        new Main();
    }
}
