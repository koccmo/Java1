package student_jaroslav_brutan.lesson_10.day_4;

public class FahrenheitConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature){
        return 1.8 * celsiusTemperature + 32;
    }
}
