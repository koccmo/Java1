package student_valerija_ionova.lesson_10.level_4.task_11_12.v1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CelsiusToFahrenheit implements ConvertTemperature{


    @Override
    public double convert(double temperatureInCelsius) {
        return temperatureInCelsius * 1.8 + 32;
    }
}
