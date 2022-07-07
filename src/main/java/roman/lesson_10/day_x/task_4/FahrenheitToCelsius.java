package roman.lesson_10.day_x.task_4;

public class FahrenheitToCelsius implements TemperatureConverter{
    @Override
    public double convert(double temperature) {
        return (temperature - 32) / 1.8;
    }
}
