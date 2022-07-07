package roman.lesson_10.day_x.task_4;

public class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double temperature) {
        return Math.round(temperature);
    }
}
