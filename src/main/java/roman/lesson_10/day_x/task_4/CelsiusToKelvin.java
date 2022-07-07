package roman.lesson_10.day_x.task_4;

public class CelsiusToKelvin implements TemperatureConverter{
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}
