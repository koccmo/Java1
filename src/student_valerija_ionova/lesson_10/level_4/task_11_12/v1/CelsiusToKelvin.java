package student_valerija_ionova.lesson_10.level_4.task_11_12.v1;

class CelsiusToKelvin implements ConvertTemperature{


    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}
