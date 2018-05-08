package TimeZones;


import Locale.LocaleMain;

import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LocalTimeMain {

    //Get the timeZone in the given country

    private String countryCode = "KE";
    private String language = "SW";

    public static void main(String[] args) {
        new LocalTimeMain();
    }

    public LocalTimeMain() {
        LocaleMain localeClass = new LocaleMain();
        localeClass.getLocaleByLanguageAndCountryCode(language, countryCode);

        Locale testLocale = localeClass.getLocale();

//        GregorianCalendar cal = GregorianCalendar
        println(testLocale.getDisplayCountry());

    }

    public GregorianCalendar GregorianCalendar(String country) {
        return new GregorianCalendar(TimeZone.getTimeZone(country));
    }

    //        // Get the current time in Hong Kong
//
//        Locale test_local = new Locale("en", "US", "SiliconValley");
//        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("Hong kong"));
//
//        println("Country: " + locale.getCountry());
//        println("getDisplayName: " + locale.getDisplayName());
//        println("getDisplayName: " + locale.getDisplayName());
//
//        int hour12 = cal.get(Calendar.HOUR); // 0..11
//        int minutes = cal.get(Calendar.MINUTE); // 0..59
//        int seconds = cal.get(Calendar.SECOND); // 0..59
//        boolean am = cal.get(Calendar.AM_PM) == Calendar.AM;

    public void println(Object x) {
        System.out.println(x);
    }

}
