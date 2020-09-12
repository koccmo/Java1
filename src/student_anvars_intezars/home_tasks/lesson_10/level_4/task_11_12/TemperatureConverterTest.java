package student_anvars_intezars.home_tasks.lesson_10.level_4.task_11_12;

import student_dmitrijs_jasvins.lesson_10.day_4.Celsius;

class TemperatureConverterTest {

    public static void main(String[] args) {

        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.kelvinConverterTest();
        temperatureConverterTest.kelvinConverterNegativeTest();
        temperatureConverterTest.fahrenheitConverterTest();
        temperatureConverterTest.fahrenheitConverterNegativeTest();
    }

    void kelvinConverterTest() {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        double celsiusTemperature = celsiusConverter.convert(32.3);
        KelvinConverter kelvinConverter = new KelvinConverter();
        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);
        if (kelvinTemperature == 305.45) {
            System.out.println("Test for Kelvin converter = OK");
            System.out.println();
        } else {
            System.out.println("Test for Kelvin converter = FAIL");
        }
    }

    void kelvinConverterNegativeTest() {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        double celsiusTemperature = celsiusConverter.convert(32.3);
        KelvinConverter kelvinConverter = new KelvinConverter();
        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);
        if (kelvinTemperature == 305.46) {
            System.out.println("Test for Kelvin converter = OK");
        } else {
            System.out.println("Test for Kelvin converter = FAIL");
            System.out.println("Temperature after converter should be 305.45");
            System.out.println();
        }
    }

    void fahrenheitConverterTest() {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        double celsiusTemperature = celsiusConverter.convert(27.0);
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);
        if (fahrenheitTemperature == 80.6) {
            System.out.println("Test for Fahrenheit converter = OK");
            System.out.println();
        } else {
            System.out.println("Test for Fahrenheit converter = FAIL");
        }
    }

    void fahrenheitConverterNegativeTest() {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        double celsiusTemperature = celsiusConverter.convert(27.0);
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);
        if (fahrenheitTemperature == 80.7) {
            System.out.println("Test for Fahrenheit converter = OK");
        } else {
            System.out.println("Test for Fahrenheit converter = FAIL");
            System.out.println("Temperature after converter should be 80.6");
        }
    }
}
