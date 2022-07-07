package roman.lesson_10.day_4;

public class KelvinConverter implements TemperatureConverter{
    @Override
    public double converter(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
