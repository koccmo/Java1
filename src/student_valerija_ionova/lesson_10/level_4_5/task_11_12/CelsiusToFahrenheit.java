package student_valerija_ionova.lesson_10.level_4_5.task_11_12;

class CelsiusToFahrenheit implements ConvertTemperature{


    @Override
    public double convert(double temperatureInCelsius) {
        return temperatureInCelsius * 1.8 + 32;
    }
}
