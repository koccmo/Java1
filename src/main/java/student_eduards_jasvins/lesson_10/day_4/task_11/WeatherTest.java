package student_eduards_jasvins.lesson_10.day_4.task_11;

class WeatherTest {

    public static void main(String[] args) {
        WeatherTest test = new WeatherTest();
        test.celsiusToKelvin();
        test.celsiusToFahrenheit();
    }

    void celsiusToKelvin() {
        WeatherKelvin kelvin = new WeatherKelvin();

        if (kelvin.convert(55) == 328.15) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }

    void celsiusToFahrenheit() {
        WeatherFahrenheit fahrenheit = new WeatherFahrenheit();

        if (fahrenheit.convert(2) == 35.6) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }
}
