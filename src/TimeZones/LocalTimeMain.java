package TimeZones;

import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import Locale.LocaleMain;
import java.time.*;
import java.util.*;

public class LocalTimeMain {

    private String language = "en";
    private String countryCode = "ZA";
    private Locale locale;
    private LocaleMain localeClass;

    public static void main(String[] args) {
        new LocalTimeMain();
    }

    public LocalTimeMain() {
        localeClass = new LocaleMain();
        localeClass.getLocaleByLanguageAndCountryCode(language, countryCode);
        locale = localeClass.getLocale();
        try {
            testFormatting();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testFormatting() {
        String timeInSa = "2018-05-10T17:36:08Z";
        Instant instant = Instant.parse(timeInSa);

        Locale locale1 = new Locale("sw", "KE");
        Calendar calendar = new GregorianCalendar(locale1);
        String[] countryCodes = Locale.getISOCountries();
        for (String countryCode : countryCodes) {
            Locale obj = new Locale("", countryCode);
            System.out.println("Country Code = " + obj.getCountry()
                    + ", Country Name = " + obj.getDisplayCountry());
        }
        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        ZonedDateTime zonedDateTime =  ZonedDateTime.ofInstant(instant, zoneId);
    }


    public String applyNumberFormatting(Object inputAmount, int currencyPrecision, String format) {
        BigDecimal result = null;
        if( inputAmount != null ) {
            if( inputAmount instanceof BigDecimal ) {
                result = (BigDecimal) inputAmount;
            } else if( inputAmount instanceof String) {
                result = new BigDecimal( (String) inputAmount);
            } else if( inputAmount instanceof BigInteger) {
                result = new BigDecimal( (BigInteger) inputAmount );
            } else if( inputAmount instanceof Number ) {
                result = new BigDecimal( ((Number)inputAmount).doubleValue() );
            } else {
                throw new ClassCastException("Not possible to coerce: " + inputAmount);
            }
        }

        result = result.divide(new BigDecimal(Math.pow(10, currencyPrecision)));
        return NumberFormat.getCurrencyInstance(getLocale()).format(result);
    }

    public String format(final ZonedDateTime zonedDateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, getLocale());
        return zonedDateTime.format(formatter);
    }

    public Locale getLocale() {
        return locale;
    }

    public double addCurrencyPrecision(double inputAmount, int currencyPrecision) {
        return inputAmount / Math.pow(10,  currencyPrecision);
    }

    public String addCurrencySymbol(double inputAmount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(getLocale());
        return currencyFormatter.format(inputAmount);
    }

    public String applyFormatting(int inputAmount, String currencyCode, int currencyPrecision) {
        double value = addCurrencyPrecision(inputAmount, currencyPrecision);
        return addCurrencySymbol(value);
    }
}
