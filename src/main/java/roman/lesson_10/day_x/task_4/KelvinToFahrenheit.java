package roman.lesson_10.day_x.task_4;

public class KelvinToFahrenheit implements TemperatureConverter{
    @Override
    public double convert(double kelvinTemperature) {
        return Math.round(1.8 * (kelvinTemperature - 273.15) + 32);
    }
}
