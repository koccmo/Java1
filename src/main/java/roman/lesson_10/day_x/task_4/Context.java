package roman.lesson_10.day_x.task_4;

public class Context {
    private TemperatureConverter temperatureConverter;

    public void setTemperatureConverter (TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    public double executeStrategy(double temperature) {
        return temperatureConverter.convert(temperature);
    }
}
