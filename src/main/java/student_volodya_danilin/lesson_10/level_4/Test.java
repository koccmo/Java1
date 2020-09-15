package student_volodya_danilin.lesson_10.level_4;

import java.text.DecimalFormat;

class Test {

    public static void main(String[] args) {

        double celsiusTemperature = 100;
        double kelvinTemperature;
        double fahrenheitTemperature;

        DecimalFormat df = new DecimalFormat("#.##");

        KelvinConverter kelvin = new KelvinConverter();
        kelvinTemperature = kelvin.convert(celsiusTemperature);

        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        fahrenheitTemperature = fahrenheit.convert(celsiusTemperature);

        System.out.println("Celsius : " + celsiusTemperature);
        System.out.println("Kelvin : " + df.format(kelvinTemperature));
        System.out.println("Fahrenheit : " + df.format(fahrenheitTemperature));

        System.out.println();

        if (celsiusTemperature + 273.15 == kelvinTemperature) {
            System.out.println("Kelvin test OK");
        }
        else {
            System.out.println("Kelvin test FAIL");
        }

        if (1.8 * celsiusTemperature + 32 == fahrenheitTemperature) {
            System.out.println("Fahrenheit test OK");
        }
        else {
            System.out.println("Fahrenheit test FAIL");
        }
    }

}
