package student_eduards_jasvins.lesson_10.day_4.task_12;

class TempConverterTest {
    public static void main(String[] args) {
        TempConverterTest test = new TempConverterTest();
        test.convertCelsiusToKelvin();
        test.convertCelsiusToFahrenheit();
    }

    void convertCelsiusToKelvin() {
        KelvinConverter kelvinConverter = new KelvinConverter();

        if (kelvinConverter.convert(3) == 276.15) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }

    void convertCelsiusToFahrenheit() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

        if (fahrenheitConverter.convert(88) == 190.4) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }
}
