package BaseConverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Locale;

public class baseconverterTest {

    @Test
    public void testConvertCelsiusToKelvin() {
        classbaseconverter converter = new classbaseconverter(Locale.US); // задаем локаль для теста
        double result = converter.convertCelsiusToKelvin(0);
        assertEquals(273.15, result, 0.001); // сравниваем результат с ожидаемым значением c погрешностью 0.001
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
    	classbaseconverter converter = new classbaseconverter(Locale.US); // задаем локаль для теста
        double result = converter.convertCelsiusToFahrenheit(0);
        assertEquals(32, result, 0.001); // сравниваем результат с ожидаемым значением c погрешностью 0.001
    }

    @Test
    public void testCreateWithDefaultLocale() {
    	classbaseconverter converter = classbaseconverter.createWithDefaultLocale();
        assertNotNull(converter); // удостоверяемся, что метод createWithDefaultLocale() возвращает не null
    }
}
