package BaseConverter;

import java.util.Locale;
import java.util.Arrays;

public class classbaseconverter {
    private Locale locale;

    public classbaseconverter(Locale locale) {
        this.locale = locale;
    }

    public double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    
    public Locale getLocale() {
    	return locale;
    }

    // Фабричный метод для создания экземпляра BaseConverter с учетом локали
    public static classbaseconverter createWithDefaultLocale() {
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        String[] fahrenheitCountries = {"BS", "US", "BZ", "KY", "PW"};
        if (Arrays.asList(fahrenheitCountries).contains(country)) {
            return new classbaseconverter(locale);
        } else {
            return new classbaseconverter(Locale.US); 
            // использовать США как локаль по умолчанию
        }
    }
}
