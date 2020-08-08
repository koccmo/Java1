package student_valerija_ionova.lesson_10.level_x.super_task_4;

class CelsiusToKelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return Math.round(celsiusTemperature + 273.15);
    }
}