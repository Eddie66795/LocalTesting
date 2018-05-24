package Locale;

import java.text.NumberFormat;
import java.util.Locale;

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

    public String displayName() {
       return locale.getDisplayName();
    }

    public String getLanguage() {
       return countryLanguage;
    }

    public void localBuilder(String language, String region) {
        locale = new Locale.Builder().setLanguage(language).setRegion(region).build();
    }

    /**
     * Usage: NumberFormat.format(number) where number can be any valid numerical value
     *
     * @param inputLocal
     * @return NumberFormat based on the local (global) or a specific one requested in the param
     */
    public NumberFormat getNumberFormat(Locale inputLocal) {
        //TODO: We need to validate the inputLocal passed in
        if(inputLocal.equals(null)) {
            return NumberFormat.getInstance(locale);
        } else {
            return NumberFormat.getInstance(inputLocal);
        }
    }


    public Locale getLocaleByCountryCode(String countryCode) {
        if(!countryCode.isEmpty()) {
            return new Locale(countryCode);
        }
        return null;
    }


    //Pass in the required Local and see if it is contained in the list of supported Locals
    public boolean isValidLocale(Locale locale) {
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale iterate : locales) {
            if (locale.equals(locale.toString())) {
                return true;
            }
        }
        return false;
    }

    public void println(Object x) {
        System.out.println(x);
    }

}
