package BaseConverter;
import java.util.Locale;

public class baseconverter {
    public static void main(String[] args) {
        // Создаем экземпляр BaseConverter с указанием локали
        classbaseconverter converter = new classbaseconverter(Locale.US);

        // Пример конвертации из градусов Цельсия в Кельвины и Фаренгейты
        double celsiusTemperature = 25.0;
        double kelvinTemperature = converter.convertCelsiusToKelvin(celsiusTemperature);
        double fahrenheitTemperature = converter.convertCelsiusToFahrenheit(celsiusTemperature);

        System.out.println(celsiusTemperature + " градусов Цельсия = " + kelvinTemperature + " Кельвин");
        System.out.println(celsiusTemperature + " градусов Цельсия = " + fahrenheitTemperature + " градусов Фаренгейта");

        // Создание экземпляра BaseConverter с использованием фабричного метода
        classbaseconverter converterWithDefaultLocale = classbaseconverter.createWithDefaultLocale();

        // Вывод локали, использованной по умолчанию
        System.out.println("Локаль по умолчанию: " + converterWithDefaultLocale.getLocale());
    }
}
