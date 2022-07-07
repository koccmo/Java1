package roman.lesson_10.day_x.task_4;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        Context context = new Context();


        context.setTemperatureConverter(new CelsiusConverter());
        double celsiusResult = context.executeStrategy(25);
        System.out.println("Temperature in celsius = " + celsiusResult);

        context.setTemperatureConverter(new CelsiusToFahrenheit());
        double celsiusToFahrenheit = context.executeStrategy(celsiusResult);
        System.out.println("Temperature in fahrenheit from celsius = " + celsiusToFahrenheit);

        context.setTemperatureConverter(new FahrenheitToKelvin());
        double fahrenheitToKelvin = context.executeStrategy(celsiusToFahrenheit);
        System.out.println("Temperature in kelvin from fahrenheit = " + fahrenheitToKelvin);

        context.setTemperatureConverter(new KelvinToCelsius());
        double kelvinToCelsius = context.executeStrategy(fahrenheitToKelvin);
        System.out.println("Temperature in celsius from kelvin = " + kelvinToCelsius);

        context.setTemperatureConverter(new CelsiusToKelvin());
        double celsiusToKelvin = context.executeStrategy(kelvinToCelsius);
        System.out.println("Temperature in kelvin from celsius = " + celsiusToKelvin);

        context.setTemperatureConverter(new KelvinToFahrenheit());
        double kelvinToFahrenheit = context.executeStrategy(celsiusToKelvin);
        System.out.println("Temperature in fahrenheit from kelvin = " + kelvinToFahrenheit);

        context.setTemperatureConverter(new FahrenheitToCelsius());
        double fahrenheitToCelsius = context.executeStrategy(kelvinToFahrenheit);
        System.out.println("Temperature in celsius from fahrenheit = " + fahrenheitToCelsius);





    }
}
