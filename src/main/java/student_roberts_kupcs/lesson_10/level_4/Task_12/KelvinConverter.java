package student_roberts_kupcs.lesson_10.level_4.Task_12;

class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
