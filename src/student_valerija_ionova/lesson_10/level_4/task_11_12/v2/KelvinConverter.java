package student_valerija_ionova.lesson_10.level_4.task_11_12.v2;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}