package student_dmitrijs_jasvins.lesson_10.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TemperatureConvertDemo {
    public static void main(String[] args) {
        Celsius celsius = new Celsius();

       double temperatureCelsius = celsius.convert(20);
        System.out.println(temperatureCelsius);

        Fahrenheit fahrenheit = new Fahrenheit();
        double temperatureFahrenheit = fahrenheit.convert(20);
        System.out.println(temperatureFahrenheit);

        Kelvin kelvin = new Kelvin();
        double temperatureKelvin = kelvin.convert(20);
        System.out.println(temperatureKelvin);

    }
}
