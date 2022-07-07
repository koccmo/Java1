package roman.lesson_10.day_x.task_4;

public class KelvinToCelsius implements TemperatureConverter{
    @Override
    public double convert(double kelvinTemperature) {
        return Math.round(kelvinTemperature - 273.15);
    }
}
