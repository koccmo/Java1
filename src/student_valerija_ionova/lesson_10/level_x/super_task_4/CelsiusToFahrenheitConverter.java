package student_valerija_ionova.lesson_10.level_x.super_task_4;

class CelsiusToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return Math.round(1.8 * celsiusTemperature + 32);
    }
}