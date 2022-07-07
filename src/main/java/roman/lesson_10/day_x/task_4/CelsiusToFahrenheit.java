package roman.lesson_10.day_x.task_4;

public class CelsiusToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return 1.8 * temperature + 32;
    }
}
