package roman.lesson_10.day_x.task_4;

public class TemperatureConverterTest {
    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();

        test.celsiusConverterTest();
        test.celsiusToFahrenheitTest();
        test.celsiusToKelvinTest();
        test.fahrenheitConverter();
        test.fahrenheitToCelsius();
        test.fahrenheitToKelvin();
        test.kelvinConverter();
        test.kelvinToCelsius();
        test.kelvinToFahrenheit();


    }
    Context context = new Context();

    public void celsiusConverterTest() {
        context.setTemperatureConverter(new CelsiusConverter());
        double celsiusResult = context.executeStrategy(25);
        checkResult(celsiusResult == 25.00, "Celsius converter");
    }

    public void celsiusToFahrenheitTest() {
        context.setTemperatureConverter(new CelsiusToFahrenheit());
        double celsiusToFahrenheit = context.executeStrategy(25);
        checkResult(celsiusToFahrenheit == 77, "Celsius to Fahrenheit");
    }

    public void celsiusToKelvinTest() {
        context.setTemperatureConverter(new CelsiusToKelvin());
        double celsiusToKelvin = context.executeStrategy(25);
        checkResult(celsiusToKelvin == 298.15, "Celsius to Kelvin");
    }

    public void fahrenheitConverter() {
        context.setTemperatureConverter(new FahrenheitConverter());
        double fahrenheitConverter = context.executeStrategy(77.1);
        checkResult(fahrenheitConverter == 77.0, "Fahrenheit Converter");
    }

    public void fahrenheitToCelsius() {
        context.setTemperatureConverter(new FahrenheitToCelsius());
        double fahrenheitToCelsius = context.executeStrategy(77);
        checkResult(fahrenheitToCelsius == 25.0, "Fahrenheit to Celsius");
    }

    public void fahrenheitToKelvin() {
        context.setTemperatureConverter(new FahrenheitToKelvin());
        double fahrenheitToKelvin = context.executeStrategy(77);
        checkResult(fahrenheitToKelvin == 298.15, "Fahrenheit to Kelvin");
    }

    public void kelvinConverter() {
        context.setTemperatureConverter(new KelvinConverter());
        double kelvinConverter = context.executeStrategy(298.15);
        checkResult(kelvinConverter == 298.0, "Kelvin converter");
    }

    public void kelvinToCelsius() {
        context.setTemperatureConverter(new KelvinToCelsius());
        double kelvinToCelsius = context.executeStrategy(298.15);
        checkResult(kelvinToCelsius == 25, "Kelvin to Celsius");
    }

    public void kelvinToFahrenheit() {
        context.setTemperatureConverter(new KelvinToFahrenheit());
        double kelvinToFahrenheit = context.executeStrategy(298.15);
        checkResult(kelvinToFahrenheit == 77, "Kelvin to Fahrenheit");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
