package Locale;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class LocaleMain {

    public String countryLanguage;
    public String countryName;
    public Locale locale;


    public void getLocaleByLanguageAndCountryCode(String language, String countryCode) {
        if(!language.isEmpty() && !countryCode.isEmpty()) {
            locale = new Locale(language, countryCode);
            countryLanguage = locale.getDisplayLanguage();
            countryName = locale.getDisplayCountry();

        }
    }

    public Locale getLocale() {
        return locale;
    }

    public String getCountryName(){
        return countryName;
    }

    public String getLanguage() {
       return countryLanguage;
    }

    public Locale getLocaleByCountryCode(String countryCode) {
        if(!countryCode.isEmpty()) {
            return new Locale(countryCode);
        }
        return null;
    }

    //Pass in the required Local and see if it is contained in the list of supported Locals
    public boolean isValidLocale(String country) {
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            if (country.equals(locale.toString())) {
                return true;
            }
        }
        return false;
    }

    public void println(Object x) {
        System.out.println(x);
    }

}
