package roman.lesson_10.day_4;

public class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double converter(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }
}
